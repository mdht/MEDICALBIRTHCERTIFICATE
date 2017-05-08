/**
 * Copyright: NEHTA 2014
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 */

package org.eclipse.mdht.api.schematron.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.mdht.api.GenerateAPIAction;
import org.eclipse.mdht.api.schematron.CDAOCL2XPathHandler;
import org.eclipse.mdht.transformation.ocl.OCLTransformation;
import org.eclipse.mdht.transformation.ocl2xpath.OCL2XPathTransformationForUML;
import org.eclipse.mdht.uml.cda.core.util.CDACommonUtils;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;

/**
 * Action to generate schematron files for the selected UML model
 */
public class GenerateSchematronAction extends GenerateAPIAction {

	private File xpathResources;

	protected File templates;


	protected String getTargetLanguage() {
		return "Schematron";
	}

	protected String getEntityMimeType() {
		return "text/xml";
	}

	protected File genfolder(File modelFolder) {
		return new File(modelFolder, "genschematron");
	}

	/**
	 * @return
	 */
	protected String getRootFileExtension() {
		return ".sch";
	}

	protected String getPlugin() {
		return "org.eclipse.mdht.api.schematron";
	}
	

	String errorMessageTemplate;
	String xpathResourceRowTemplate;
	String summaryRowTemplate;
	String fileNameTemplate;
	String entIdTemplate;
	String patternIdTemplate;

	Map<String, EntityResources> resourcesOfEntity = new HashMap<String, EntityResources>();
	List<String> summaryRows = new ArrayList<String>();
	Collection<String> patternIDs = new ArrayList<String>();
	StringBuilder contextasserts = new StringBuilder();
	StringBuilder schematronPreludium = new StringBuilder();
	StringBuilder schematron = new StringBuilder();

	private IProgressMonitor monitor;

	/**
	 * Generates the .sch file and the .ent files
	 * 
	 * @param pack
	 * @param monitor
	 * @throws Exception
	 */
	protected void genAPICode(final Package pack, IProgressMonitor monitor) throws Exception {
		monitor = new SubProgressMonitor(monitor, 80);
		monitor.beginTask("", classes.size());
		this.monitor = monitor;
		
		resolvePathmapsInResourceURIs();
		
		xpathResources = new File(genfolder, "xpath");
		if (xpathResources.exists() && xpathResources.listFiles() != null) {
			for (File file : xpathResources.listFiles())
				file.delete();
		}

		schematronPreludium.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n");
		schematronPreludium.append("<!DOCTYPE schema [\n");
		schematron.append("<schema xmlns=\"http://www.ascc.net/xml/schematron\" xmlns:cda=\"urn:hl7-org:v3\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n");
		schematron.append("<title>Schematron schema for validating conformance to " + pack.getName().toUpperCase() + " documents</title>\n");
		schematron.append("<ns prefix=\"cda\" uri=\"urn:hl7-org:v3\"/>\n");
		schematron.append("<ns prefix=\"xsi\" uri=\"http://www.w3.org/2001/XMLSchema-instance\"/>\n\n");
		schematron.append("<ns prefix=\"ext\" uri=\"http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0\"/>\n\n");

		 errorMessageTemplate = getStereotype(pack, "errorMessageTemplate");
		 xpathResourceRowTemplate = getStereotype(pack, "xpathResourceRowTemplate");
		 summaryRowTemplate = getStereotype(pack, "summaryRowTemplate");
		 fileNameTemplate = getStereotype(pack, "fileNameTemplate");
		 entIdTemplate = getStereotype(pack, "entIdTemplate");
		 patternIdTemplate = getStereotype(pack, "patternIdTemplate");

		StringBuilder summary = new StringBuilder("<table border=\"1\">\n" + summaryRowTemplate.replace("{", "").replace("}", ""));

		recurseModel();
		writeAllEntities();

		monitor.subTask("Write " + summaryFile.getName());
		Collections.sort(summaryRows);
		summary.append(StringUtils.join(summaryRows, ""));
		summary.append("</table>\n");
		printMetaData(pack, "", "<br>", "<br>", summary);
		CDACommonUtils.stringToFile(summary.toString(), summaryFile);

		String allContextsId = "allcontexts_mdht";
		StringBuilder pattern = new StringBuilder();
		pattern.append("<pattern id=\"" + allContextsId + "\" see=\"#" + allContextsId + "\" name=\"" + allContextsId + "\">\n");
		pattern.append("		<!--tests all rules-->\n");
		pattern.append("	<rule context=\"/cda:ClinicalDocument\">\n");
		pattern.append(contextasserts);
		pattern.append("	</rule>\n");
		pattern.append("</pattern>\n");
		pattern.append("\n");
		writeEntity(schematronPreludium, schematron, pattern.toString(), "allcontexts", "allcontexts");

		schematron.append("<phase id = \"errors\">\n\n");
		for (String id : patternIDs) {
			schematron.append("	<active pattern = \"" + id + "\"/>\n");
		}
		schematron.append("\n</phase>\n\n\n");
		schematron.append("<phase id = \"rules\">\n\n");
		schematron.append("	<active pattern = \"" + allContextsId + "\"/>\n");
		schematron.append("\n</phase>\n\n\n");
		schematron.append("</schema>\n");
		schematronPreludium.append("]>\n\n");
		File schFile = new File(genfolder, umlFile.getName().substring(0, umlFile.getName().indexOf(".")) + getRootFileExtension());
		CDACommonUtils.stringToFile(schematronPreludium.toString() + schematron.toString(), schFile);
		monitor.done();
	}

	protected void recursePropertyPaths(Class clazz) throws IOException {
		boolean firstProcessed = processedClasses.add(clazz);

		if (!firstProcessed && CDACommonUtils.getMainSection(clazz) != -1 && umlClinicalDocuments.size() >= 2) {
			return;
		}

		super.recursePropertyPaths(clazz);

		if (firstProcessed) {
			monitor.worked(1);
			monitor.subTask(CDACommonUtils.getUmlContext(clazz));
		} else {
			monitor.subTask(CDACommonUtils.getUmlContext(clazz)
					+ " (duplicate)");
		}
		if (monitor.isCanceled()) {
			throw new RuntimeException("Canceled by user");
		}

		if (clazz.getName() == null || "".equals(clazz.getName().trim())) {
			return;
		}

		for (final Constraint constraint : CDACommonUtils.getAllRules(clazz)) {
			NamedElement element = getConstrainedElement(constraint);
			if (element == null)
				continue;
			try {
				if (getPDFSection(clazz, element).contains("ii.ii"))
					if (getPDFSection(clazz, element).contains("?"))
						if (getPDFSection(clazz, element).contains("?"))
							continue;
				if (getPDFSection(clazz, element).contains("null"))
					continue;
				String analysis = CDACommonUtils.withoutTags(resolve(errorMessageTemplate, clazz, element, constraint).replace("\n", "\n\t\t"));
				String xPathTest = resolve("{xpath-test}", clazz, element, constraint);
				String fileName = toValidFileName(resolve(fileNameTemplate, clazz, element, constraint));
				EntityResources entity = resourcesOfEntity.get(fileName);
				if (entity == null) {
					String entId = toValidFileName(resolve(entIdTemplate, clazz, element, constraint));
					String patternId = toValidPatternName(resolve(patternIdTemplate, clazz, element, constraint));
					resourcesOfEntity.put(fileName, entity = new EntityResources(fileName, entId, patternId, xpathResourceRowTemplate));
					entity.context = clazz;
				}

				StringBuilder rule = new StringBuilder();
				rule.append("\t\t<!--\n");
				rule.append("\t\t\t" + "UML path: " + CDACommonUtils.getUmlContext(clazz) + "\n");
				rule.append("\t\t\t" + "UML root path: " + CDACommonUtils.getUmlContext(clazz, false) + "\n");
				rule.append("\t\t\t" + "UML qualified name: " + clazz.getQualifiedName() + "\n");
				rule.append("\t\t-->\n");
				rule.append("	<rule context=\"" + escapeAttributeValue(getCdaContext(clazz, true)) + "\">\n");	
				
				StringBuilder asserts;
				int index=entity.rules.indexOf(rule.toString());
				if (index == -1) {
					entity.rules.add(rule.toString());
					entity.asserts.add(asserts=new StringBuilder());
				} else {
					asserts=entity.asserts.get(index);
				}

				asserts.append("\t\t<!--\n");
				asserts.append("\t\t\t" + "OCL: " + resolve("{ocl-constraint}", clazz, element, constraint) + "\n");
				asserts.append("\t\t\t" + "Constraint name: " + getConstraintName(constraint) + "\n");
				asserts.append("\t\t-->\n");
				asserts.append("	<assert test=\"" + escapeAttributeValue(xPathTest) + "\">" + StringEscapeUtils.escapeHtml(analysis) + "	</assert>\n");
				this.removeTabAndNewline = true;
				entity.xpathResource.append(resolve(xpathResourceRowTemplate, clazz, element, constraint, entity));
				this.removeTabAndNewline = false;
				summaryRows.add(resolve(summaryRowTemplate, clazz, element, constraint, entity));
				contextasserts.append("	<assert test=\"" + escapeAttributeValue(getCdaContext(clazz, true)) + "\">Cannot find context " + getCdaContext(clazz, true) + "</assert>\n");

			} catch (Exception e) {
				CDACommonUtils.addStatus(statuses, IStatus.ERROR, getPlugin(), 17, mentionSection("Could not transform OCL constraint \"" + constraint.getName() + "\": " + e.getMessage(), clazz, element), e, constraint);
			}

		}
	}

	private void writeAllEntities() throws IOException {
		for (EntityResources entity : resourcesOfEntity.values()) {
			Class clazz = entity.context;
			boolean alreadyContained = patternIDs.contains(entity.patternId);
			if (patternIDs.contains(entity.patternId))
				continue;
			patternIDs.add(entity.patternId);
			StringBuilder pattern = new StringBuilder();
			pattern.append("<!-- " + clazz.getName() + (CDACommonUtils.getTemplateId(clazz) != null ? ": " + CDACommonUtils.getTemplateId(clazz) : "") + " -->\n\n");
			pattern.append("<pattern id=\"" + entity.patternId + "\" see=\"#" + entity.patternId + "\" name=\"" + entity.patternId + "\">\n");
			for (String rule:entity.rules) {
				pattern.append(rule);
				pattern.append(entity.asserts.get(entity.rules.indexOf(rule)));
				pattern.append("	</rule>\n");
			}
			pattern.append("</pattern>\n");
			pattern.append("\n");
			writeEntity(schematronPreludium, schematron, pattern.toString(), entity.entId, entity.fileName + (alreadyContained ? "ALREADYTCONTAINRD" : ""));
			CDACommonUtils.stringToFile(entity.xpathResource.toString(), getCSVFile(entity.fileName));

		}
	}

	protected void writeEntity(StringBuilder schematronPreludium, StringBuilder schematron, String content, String entId, String fileName) throws IOException {
		boolean useEntities = !Boolean.getBoolean("SCHEMATRON_INLINE_ENTITIES");
		if (useEntities) {
			creator.writeFile(content, getEntityFile(fileName));
			schematronPreludium.append("<!ENTITY " + entId + " SYSTEM 'templates/" + fileName + ".ent'>\n");
			schematron.append("	&" + entId + ";\n");
		} else {
			schematron.append(content);
		}

	}

	protected File getEntityFile(String filename) {
		return new File(new File(genfolder, "templates"), filename + ".ent");
	}

	protected String toValidFileName(String filename) {
		filename = filename.replace(".", "_").replace(" ", ""); // cosmetics
		filename = filename.replaceAll("[:\\\\/*\"?|<>']", ""); // remove invalid characters
		return filename;
	}

	// creates a valid Schematron pattern name that hopefully conforms to
	// http://www.w3.org/TR/xmlschema-2/#cvc-pattern-valid
	protected String toValidPatternName(String patternname) {
		patternname = patternname.replace(".", "_").replace(" ", ""); // cosmetics
		patternname = patternname.replaceAll("[:\\\\/*\"?|<>'\\(\\)]", ""); // remove invalid characters
		return patternname;
	}
	
	protected OCLTransformation<Package, Classifier, ?, Property, ?, ?, ?, ?, ?, ?, ?, ?> createTrafo(final ResourceSet resourceSet) {
		return new OCL2XPathTransformationForUML(resourceSet, new CDAOCL2XPathHandler<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject>());
	}

	protected String removeRedundancy(String fullXPath, String templateId, String root) {
		String predicateStart = "[" + templateId + "/" + root + " = ";
		String endsWith = "]/" + templateId;
		int i = fullXPath.lastIndexOf(predicateStart);
		if (i != -1 && fullXPath.endsWith(endsWith) && fullXPath.lastIndexOf("[") == i) {
			fullXPath = fullXPath.substring(0, i) + "/" + templateId + "[" + root + " = " + fullXPath.substring(i + predicateStart.length(), fullXPath.length() - endsWith.length()) + "]";
		}
		return fullXPath;
	}

	protected String getFullXPath(Class clazz, NamedElement element) {
		String fullXPath = super.getFullXPath(clazz, element);
		fullXPath = removeRedundancy(fullXPath, "cda:templateId", "@root");
		fullXPath = removeRedundancy(fullXPath, "cda:code", "@code");
		if ("/cda:ClinicalDocument/cda:templateId".equals(fullXPath) && CDACommonUtils.getTemplateId(clazz) != null) {
			fullXPath += "[@root = \"" + CDACommonUtils.getTemplateId(clazz) + "\"]";
		}
		return fullXPath;
	}

	protected String resolve(String template, Class clazz, NamedElement element, final Constraint constraint, EntityResources entity) {
		this.template = template;
		if (needResolve("{entity-file-anchor}", entity))
			resolve(getAnchor(getEntityFile(entity.fileName), entity.fileName, getEntityMimeType()));
		if (needResolve("{csv-file-anchor}", entity))
			resolve(getAnchor(getCSVFile(entity.fileName), "csv", "text/tab-separated-values"));
		return resolve(this.template, clazz, element, constraint);
	}

	private File getCSVFile(String filename) {
		return new File(xpathResources, filename + ".csv");
	}

}

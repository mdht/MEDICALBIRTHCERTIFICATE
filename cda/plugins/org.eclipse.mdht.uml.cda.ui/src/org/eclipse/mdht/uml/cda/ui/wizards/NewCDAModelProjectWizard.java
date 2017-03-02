/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - initial API and implementation
 *     IBM Corporation - fixed issue related to project manifests (artf2756)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.mdht.uml.cda.core.profile.CDATemplate;
import org.eclipse.mdht.uml.cda.core.profile.CodegenSupport;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil.FindResourcesByNameVisitor;
import org.eclipse.mdht.uml.cda.ui.internal.Activator;
import org.eclipse.mdht.uml.cda.ui.internal.Logger;
import org.eclipse.mdht.uml.cda.ui.util.CDAUIUtil;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.osgi.framework.Bundle;

public class NewCDAModelProjectWizard extends CDAWizard {

	protected NewCDAModelPage newCDATemplatePage;

	private boolean checkForSpaces() {
		Bundle bundle = Platform.getBundle(org.eclipse.mdht.uml.cda.ui.internal.Activator.PLUGIN_ID);

		URL url = bundle.getEntry("/");

		if (url.getPath().indexOf(" ") >= 0) {
			return true;
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IWorkspaceRoot root = workspace.getRoot();

		IPath rootPath = root.getLocation();
		if (rootPath.toOSString().indexOf(" ") >= 0) {
			return true;
		}

		return false;
	}

	@Override
	public void addPages() {

		loadCDAModels();

		if (cdaDocuments.isEmpty()) {
			MessageDialog.openWarning(
				getShell(), "MDHT CDA Project Wizard Exception",
				"Unable to create CDA Project, No Available CDA Documents in Workspace!");
			return;
		}

		if (checkForSpaces()) {
			MessageDialog.openWarning(
				getShell(), "MDHT CDA Project Wizard Exception",
				"Unable to create CDA Project, Unable to support Spaces ' ' within installation or workspace location");
			return;
		}

		newCDATemplatePage = new NewCDAModelPage("MDHT CDA Model", "Eclipse Modeling Project ", null, cdaDocuments);
		newCDATemplatePage.setDescription("Creates the CDA Model");
		newCDATemplatePage.setMessage("Use to create CDA Implementation Guide Model Project");
		addPage(newCDATemplatePage);
	}

	@Override
	public boolean performFinish() {

		try {

			ProgressMonitorDialog pd = new ProgressMonitorDialog(getShell());

			IWorkspace workspace = ResourcesPlugin.getWorkspace();

			IWorkspaceRoot root = workspace.getRoot();

			final String modelName = newCDATemplatePage.getModelName().toLowerCase();

			modelProject = root.getProject(
				String.format("%s.%s.model", newCDATemplatePage.getBasePackage(), modelName));
			generatedProject = root.getProject(String.format("%s.%s", newCDATemplatePage.getBasePackage(), modelName));
			docProject = root.getProject(String.format("%s.%s.doc", newCDATemplatePage.getBasePackage(), modelName));

			pd.run(false, false, new IRunnableWithProgress() {

				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

					monitor.beginTask("Creating Projects", 9);

					try {
						modelProject.create(monitor);

						modelProject.open(monitor);

						generatedProject.create(monitor);

						generatedProject.open(monitor);

						docProject.create(monitor);

						docProject.open(monitor);

						// Use pde internal functionality to create plugin

						IProjectProvider generatedProjectProvider = new IProjectProvider() {

							public IProject getProject() {

								return generatedProject;
							}

							public String getProjectName() {

								return generatedProject.getName();
							}

							public IPath getLocationPath() {

								return generatedProject.getFullPath();
							}

						};

						getContainer().run(
							false, true,
							new NewProjectCreationOperation(fPluginData, generatedProjectProvider, contentWizard));

						IProjectProvider docProjectProvider = new IProjectProvider() {

							public IProject getProject() {

								return docProject;
							}

							public String getProjectName() {

								return docProject.getName();
							}

							public IPath getLocationPath() {

								return docProject.getFullPath();
							}

						};

						getContainer().run(
							false, true,
							new NewProjectCreationOperation(fPluginData, docProjectProvider, contentWizard));

						monitor.worked(1);

						monitor.setTaskName("Create Manifest for Generated Project");
						createGeneratedProjectManifest(
							generatedProject, newCDATemplatePage.getBasePackage(), modelName);
						monitor.worked(1);

						monitor.setTaskName("Create Manifest for Doc Project");
						createDocumentProjectManifest(docProject, newCDATemplatePage.getBasePackage(), modelName);
						monitor.worked(1);

						monitor.setTaskName("Create css");
						createFolder(docProject, "css");

						monitor.setTaskName("Create dita");
						createFolder(docProject, "dita");

						createDocProject(docProject, modelName);

						createPluginProperties(docProject, modelName);
						updateBuildProperties(docProject);
						createDitaProperties(docProject, newCDATemplatePage.getBasePackage(), modelName);

						monitor.setTaskName("Create UML Model");
						createFolder(modelProject, "model");

						createUMLModel(
							modelProject, newCDATemplatePage.getNamespaceURI(), newCDATemplatePage.getBasePackage(),
							modelName);
						monitor.worked(1);

						monitor.setTaskName("Create Model Plugin");
						createModelPlugin(modelProject, modelName);

						monitor.setTaskName("Create Manifest for Model Project");
						createModelProjectManifest(modelProject, newCDATemplatePage.getBasePackage(), modelName);
						monitor.worked(1);

						monitor.setTaskName("Create Transformation XML");
						createTransformation(generatedProject, modelName);
						monitor.worked(1);

						monitor.setTaskName("Add Properties");
						createPluginProperties(generatedProject, modelName);
						updateBuildProperties(generatedProject);

						monitor.setTaskName("Run MDHT Transformation");
						org.eclipse.mdht.uml.cda.ui.builder.CDABuilder.runTransformation(generatedProject, monitor);
						monitor.worked(1);

						monitor.setTaskName("Create GenModel");
						org.eclipse.mdht.uml.cda.ui.builder.CDABuilder.createGenModel(generatedProject, monitor);
						monitor.worked(1);

						monitor.setTaskName("Run MDHT Transformation");
						org.eclipse.mdht.uml.cda.ui.builder.CDABuilder.runTransformation(generatedProject, monitor);
						monitor.worked(1);

						monitor.setTaskName("Generate");
						org.eclipse.mdht.uml.cda.ui.builder.CDABuilder.runGenerate(false, generatedProject, monitor);
						monitor.worked(1);
						generatedProject.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);

						monitor.setTaskName("Toggle Build Nature");
						org.eclipse.mdht.uml.cda.ui.builder.ToggleNatureAction.toggleNature(generatedProject);
						org.eclipse.mdht.uml.cda.ui.builder.ToggleNatureAction.toggleNature(docProject);
						monitor.worked(1);

						setupWorkspace(modelProject, modelName);

					} catch (Exception exception) {
						monitor.setCanceled(true);

						Logger.logException(exception);

						throw new InvocationTargetException(exception);

					}

				}
			});

			docProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			modelProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			generatedProject.refreshLocal(IResource.DEPTH_INFINITE, null);

		} catch (InvocationTargetException exception) {

			Logger.logException(exception);

			Status status = new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, 0, exception.getCause().getLocalizedMessage(),
				exception.getCause());

			ErrorDialog.openError(
				getShell(), "MDHT CDA Project Wizard Exception", "Unable to create new CDA Project", status);

			// try {
			// docProject.delete(true, null);
			// modelProject.delete(true, null);
			// generatedProject.delete(true, null);
			// } catch (CoreException coreException) {
			// Logger.logException(coreException);
			// }

		} catch (InterruptedException interruptedException) {
			Logger.logException(interruptedException);
		} catch (CoreException coreException) {
			Logger.logException(coreException);
		}

		return true;
	}

	protected void setupWorkspace(IProject modelProject, String modelName) throws Exception {
		IWorkbench workbench = PlatformUI.getWorkbench();
		final IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
		activePage.closeEditors(activePage.getEditorReferences(), true);

		IFileStore fileStore = EFS.getLocalFileSystem().getStore(
			modelProject.getFolder("model").getFile(modelName + ".uml").getLocation());
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		IDE.openEditorOnFileStore(page, fileStore);

	}

	private void copyDocResources(Bundle bundle, String sourcepath, IProject project) throws Exception {

		Enumeration<java.net.URL> entries = bundle.findEntries(sourcepath, "*", true);
		while (entries.hasMoreElements()) {
			URL next = entries.nextElement();
			// small hack to not copy over model folder to doc project
			// @TODO modify resource folder in ui
			if (next.getPath().contains("model")) {
				continue;
			}
			IPath spath = new Path(next.getPath());
			IPath tpath = new Path(next.getPath().replace("/resources", ""));
			String[] segments = tpath.segments();

			IFolder f = null;
			for (int ctr = 0; ctr < segments.length - 1; ctr++) {
				if (f == null) {
					f = project.getFolder(tpath.segments()[ctr]);
				} else {
					f = f.getFolder(tpath.segments()[ctr]);
				}

				if (!f.exists()) {
					f.create(false, true, null);
				}
			}
			try {

				InputStream stream = FileLocator.openStream(bundle, spath, false);
				IFile file = project.getFile(tpath);
				file.create(stream, true, null);
			} catch (Exception exception) {
				// exception.printStackTrace();
				// catch to just continue at this point
			}
		}
	}

	void createDocProject(IProject project, String modelName) throws Exception {

		Bundle bundle = Platform.getBundle(org.eclipse.mdht.uml.cda.ui.internal.Activator.PLUGIN_ID);

		copyDocResources(bundle, "resources", project);

		IProjectDescription description;

		description = project.getDescription();
		String[] newNatures = new String[0];
		description.setNatureIds(newNatures);
		project.setDescription(description, null);

		IFolder srcFolder = project.getFolder("src");

		if (srcFolder.exists()) {

			srcFolder.delete(true, null);

		}

		IFolder binFolder = project.getFolder("bin");

		if (binFolder.exists()) {

			binFolder.delete(true, null);

		}

	}

	private Package cloneModel(IProject project, ResourceSet resourceSet, Map<String, String> options,
			String sourcePathName, String clonePath, String packageName) throws IOException {

		URI cloneModelURI = URI.createPlatformPluginURI(sourcePathName, false);

		Package sourcePackage = (Package) EcoreUtil.getObjectByType(
			resourceSet.getResource(cloneModelURI, true).getContents(), UMLPackage.eINSTANCE.getPackageableElement());

		Package clonedPackage = EcoreUtil.copy(sourcePackage);

		clonedPackage.setName(packageName);

		IPath cloneFilePath = new Path(clonePath);

		IFile file = CDAUIUtil.getBundleRelativeFile(project, cloneFilePath);

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		String cdaUMLPath = myWorkspaceRoot.getLocation().toOSString() + file.getFullPath().toOSString();

		URI targetModelURI = URI.createFileURI(cdaUMLPath);

		Resource umlResource = UML22UMLResource.Factory.INSTANCE.createResource(targetModelURI);

		umlResource.getContents().add(clonedPackage);

		umlResource.save(options);

		return clonedPackage;
	}

	private final String TEMPLATEURI = String.format("%s/resources/model/%s", Activator.PLUGIN_ID, "example.uml");

	private final String VOCABURI = String.format("%s/resources/model/%s", Activator.PLUGIN_ID, "example-vocab.uml");

	void createUMLModel(IProject project, String namespaceURI, String basePackage, String modelName) throws Exception {

		ResourceSet resourceSet = new ResourceSetImpl();

		org.eclipse.mdht.uml.common.UmlPlugin.computeModelPathMapExtensions();

		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

		Map<String, String> options = new HashMap<String, String>();

		Package templatePackage = cloneModel(
			project, resourceSet, options, TEMPLATEURI, String.format("model/%s.uml", modelName.toLowerCase()),
			modelName.toLowerCase());

		Package vocabPackage = cloneModel(
			project, resourceSet, options, VOCABURI, String.format("model/%s-vocab.uml", modelName.toLowerCase()),
			String.format("%s-vocab", modelName.toLowerCase()));

		CodegenSupport codegenSupport = (CodegenSupport) templatePackage.applyStereotype(
			templatePackage.getApplicableStereotype("CDA::CodegenSupport"));

		codegenSupport.setBase_Namespace(templatePackage);

		codegenSupport.setBasePackage(basePackage);

		codegenSupport.setNsURI(namespaceURI);

		codegenSupport.setNsPrefix(newCDATemplatePage.getNsPrefix()); // modelName.toLowerCase());

		codegenSupport.setPackageName(modelName.toLowerCase());

		codegenSupport.setPrefix(newCDATemplatePage.getPrefix()); // modelName.substring(0, 1).toUpperCase() + modelName.substring(1));

		Class cdaClass = templatePackage.createOwnedClass(newCDATemplatePage.getCDADocumentName(), false);

		CDATemplate template = (CDATemplate) cdaClass.applyStereotype(
			cdaClass.getApplicableStereotype("CDA::CDATemplate"));

		template.setBase_Class(cdaClass);

		template.setTemplateId(newCDATemplatePage.getTemplateId());

		template.setAssigningAuthorityName(newCDATemplatePage.getTemplateAssigningAuthority());

		Type t = cdaDocuments.get(newCDATemplatePage.getCDADocument());

		if (t instanceof Class) {
			Class documentClass = (Class) t;
			cdaClass.createGeneralization(documentClass);
			Package documentPackage = documentClass.getNearestPackage();
			EcoreUtil.resolveAll(documentPackage);
			templatePackage.createPackageImport(documentClass.getNearestPackage());
		}

		templatePackage.createPackageImport(vocabPackage);

		templatePackage.eResource().save(options);

	}

	void createTransformation(IProject project, String modelName) throws Exception {

		FindResourcesByNameVisitor visitor = new FindResourcesByNameVisitor("transform-common.xml");

		IWorkspace iw = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();

		iw.getRoot().accept(visitor);

		// Default transform file location to cda
		String transformCommonProject = "org.eclipse.mdht.uml.cda";
		// Search for it in the case of an extension
		if (!visitor.getResources().isEmpty() && visitor.getResources().size() == 1) {
			transformCommonProject = visitor.getResources().get(0).getProject().getName();
		}

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("<?eclipse version=\"3.0\"?>");
		writer.println("<project name=\"CDA Model Transformation\"  basedir=\".\" default=\"all\">");

		writer.println(
			"<eclipse.convertPath resourcePath=\"" + transformCommonProject + "\" property=\"cdaPluginPath\"/>");
		writer.println("<property name=\"modelName\" value=\"" + modelName.toLowerCase() + "\"/>");
		writer.println("<macrodef name=\"convertEcorePaths\">");
		writer.println("<attribute name=\"filePath\"/>");
		writer.println("<sequential>");

		// writer.println("<mapping source=\"pathmap://" + modelName.toUpperCase() + "_MODEL///\" target=\"model/\">");

		writer.println(
			"<replace file=\"@{filePath}\" token=\"pathmap://" + modelName.toUpperCase() + "_MODEL///" + modelName +
					".uml\" value=\"" + modelName + "_Ecore.uml\"/>");

		for (String cdaPackage : cdaPackages.keySet()) {

			Package aPackage = cdaPackages.get(cdaPackage);

			if (!"cda".equals(cdaPackage)) {

				FindResourcesByNameVisitor ecoreModel = new FindResourcesByNameVisitor(cdaPackage + "_Ecore.uml");

				iw.getRoot().accept(ecoreModel);

				if (aPackage.eResource() != null && aPackage.eResource().getURI() != null &&
						ecoreModel.getResources().size() == 1) {

					writer.println(
						"<replace file=\"@{filePath}\" token=\"" + aPackage.eResource().getURI() + "\" value=\"" +
								"../.." + ecoreModel.getResources().get(0).getFullPath().toFile() + "\"/> ");
				}

				if (cdaPackages.get(cdaPackage).eResource() != null) {
					for (Resource controlledResource : org.eclipse.mdht.uml.common.util.UMLUtil.getControlledResources(
						cdaPackages.get(cdaPackage).eResource())) {

						if (controlledResource != null && controlledResource.getURI() != null &&
								ecoreModel.getResources().size() == 1) {

							writer.println(
								"<replace file=\"@{filePath}\" token=\"" + controlledResource.getURI() + "\" value=\"" +
										"../.." + ecoreModel.getResources().get(0).getFullPath().toFile() + "\"/> ");
						}

					}
				}

			}
		}

		writer.println("</sequential>");
		writer.println("</macrodef>");

		writer.println("<import file=\"${cdaPluginPath}/transform-common.xml\"/>");
		writer.println("</project>");

		writer.flush();

		swriter.close();

		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

		createFile(project, "transform.xml", is);

	}

	/*
	 * Model plugin is to leverage the URI mapping
	 */
	void createModelPlugin(IProject project, String modelName) throws Exception {

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<?eclipse version=\"3.0\"?>");
		writer.println("<plugin>");
		writer.println("<extension point=\"org.eclipse.emf.ecore.uri_mapping\">");
		writer.println("<mapping source=\"pathmap://" + modelName.toUpperCase() + "_MODEL/\" target=\"model/\">");
		writer.println("</mapping>");
		writer.println("</extension>");
		writer.println("</plugin>");
		writer.flush();
		swriter.close();
		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));
		createFile(project, "plugin.xml", is);
	}

	void createDitaProperties(IProject project, String basePackage, String modelName) throws Exception {

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("basePackage = " + basePackage);
		writer.println("projectName = " + modelName);
		writer.println("modelName = " + modelName);
		writer.flush();

		swriter.close();

		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

		createFile(project, "dita.properties", is);

	}

	void createPluginProperties(IProject project, String modelName) throws Exception {

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("pluginName = " + modelName + " Model");
		writer.println("providerName = Provider Name Here");

		writer.flush();

		swriter.close();

		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

		createFile(project, "plugin.properties", is);

	}

	void updateBuildProperties(IProject project) throws Exception {

		StringWriter swriter = new StringWriter();
		PrintWriter writer = new PrintWriter(swriter);
		writer.println("source.. = src/");
		writer.println("output.. = bin/");
		if (project.equals(docProject)) {
			writer.println("bin.includes = META-INF/,\\");
		} else {
			writer.println("bin.includes = plugin.xml,\\");
			writer.println("               META-INF/,\\");
		}
		writer.println("               .,\\");
		writer.println("               plugin.properties");
		writer.flush();
		swriter.close();
		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));
		IPath path = new Path("build.properties");
		IFile file = CDAUIUtil.getBundleRelativeFile(project, path);
		file.setContents(is, true, false, null);

	}

	void createGeneratedProjectManifest(IProject project, String basePackage, String modelName) throws Exception {

		IFile manfiestFile = cdaDocumentsManifest.get(newCDATemplatePage.getCDADocument());
		InputStream input = new FileInputStream(manfiestFile.getRawLocation().toOSString());
		Manifest projectManifest = new Manifest(input);
		Attributes attributes = projectManifest.getMainAttributes();
		IFile manifest = CDAUIUtil.getManifest(project);
		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);
		writer.println("Bundle-Name: %pluginName");
		writer.println(String.format("Bundle-SymbolicName: %s;singleton:=true", project.getName()));
		writer.println("Bundle-ActivationPolicy: lazy");
		writer.println(
			String.format(
				"Bundle-Activator: %s.%s.%sPlugin$Implementation", basePackage, modelName,
				modelName.substring(0, 1).toUpperCase() + modelName.substring(1)));
		writer.println("Bundle-ClassPath: .");
		writer.println("Bundle-Vendor: %providerName");
		writer.println("Bundle-Localization: plugin");

		String requiredBundles = attributes.getValue("Require-Bundle");
		String sourceBundle = attributes.getValue("Bundle-SymbolicName");
		String rb[] = requiredBundles.split(",");
		String sb[] = sourceBundle.split(";");

		for (int index = 0; index < rb.length; index++) {
			if (index == 0) {
				writer.print("Require-Bundle: " + rb[index]);
			} else {

				if (index > 0) {
					writer.println(",");
					writer.print(" " + rb[index]);
				}
			}

		}
		if (sb.length > 0) {
			writer.println(",");
			writer.println(" " + sb[0] + ";visibility:=reexport");
		}
		writer.println(String.format("Export-Package: %s.%s,", basePackage, modelName));
		writer.println(String.format(" %s.%s.impl,", basePackage, modelName));
		writer.println(String.format(" %s.%s.operations,", basePackage, modelName));
		writer.println(String.format(" %s.%s.util", basePackage, modelName));
		writer.flush();
		swriter.close();
		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));
		manifest.appendContents(is, true, false, null);
	}

	void createDocumentProjectManifest(IProject project, String basePackage, String modelName) throws Exception {
		IFile manifest = CDAUIUtil.getManifest(project);
		StringWriter swriter = new StringWriter();
		PrintWriter writer = new PrintWriter(swriter);
		writer.println("Bundle-Name: Document Bundle " + modelName);
		writer.println(String.format("Bundle-SymbolicName: %s;singleton:=true", project.getName()));
		writer.flush();
		swriter.close();
		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));
		manifest.appendContents(is, true, false, null);
	}

	void createModelProjectManifest(IProject project, String basePackage, String modelName) throws Exception {
		IFile manifest = CDAUIUtil.getManifest(project);
		StringWriter swriter = new StringWriter();
		PrintWriter writer = new PrintWriter(swriter);
		writer.println("Bundle-Name: Model Bundle " + modelName);
		writer.println(String.format("Bundle-SymbolicName: %s;singleton:=true", project.getName()));
		writer.flush();
		swriter.close();
		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));
		createFolder(project, "META-INF");
		createFile(project, manifest.getProjectRelativePath().toString(), is);
	}
}

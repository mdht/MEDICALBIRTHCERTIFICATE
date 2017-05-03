/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Entry;
import org.eclipse.mdht.uml.cda.InfrastructureRootTypeId;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Patient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.RecordTarget;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.eclipse.mdht.uml.hl7.datatypes.TS;

public class Main {

	public static void testSDTCDischargeDispositionCodes() throws Exception {
		ClinicalDocument doc = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		doc.addSection(section);
		Encounter encounter = CDAFactory.eINSTANCE.createEncounter();

		encounter.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("1", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("2", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("3", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("4", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("5", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("6", "1"));

		encounter.setPriorityCode(DatatypesFactory.eINSTANCE.createCE());
		section.addEncounter(encounter);

		// saveData("foobar.xml", doc);
		CDAUtil.save(doc, new FileOutputStream("samples/sdtcdischargedispositioncodes.xml"));

		// ClinicalDocument clinicalDocument = loadData("foobar.xml");

		ClinicalDocument clinicalDocument = CDAUtil.load(
			new FileInputStream("samples/sdtcdischargedispositioncodes.xml"));

		for (Section s : clinicalDocument.getSections()) {

			for (Entry e : s.getEntries()) {

				if (e.getEncounter() != null) {

					for (CE ce : e.getEncounter().getSDTCDischargeDispositionCodes()) {
						System.out.println("Test Codes " + ce.getCode());
					}

				}

			}

		}

		CDAUtil.save(clinicalDocument, new FileOutputStream("samples/sdtcdischargedispositioncodes2.xml"));
	}

	public static void main(String[] args) throws Exception {
		ClinicalDocument doc = CDAFactory.eINSTANCE.createClinicalDocument();

		InfrastructureRootTypeId typeId = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
		typeId.setExtension("POCD_HD000040");
		doc.setTypeId(typeId);

		II id = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.4", "c266");
		doc.setId(id);

		II templateId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.27.1776");
		doc.getTemplateIds().add(templateId);

		CE code = DatatypesFactory.eINSTANCE.createCE("11488-4", "2.16.840.1.113883.6.1", "LOINC", "Consultation note");
		doc.setCode(code);

		ST title = DatatypesFactory.eINSTANCE.createST("Good Health Clinic Consultation Note");
		doc.setTitle(title);

		TS effectiveTime = DatatypesFactory.eINSTANCE.createTS("20000407");
		doc.setEffectiveTime(effectiveTime);

		CE confidentialityCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confidentialityCode);

		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		doc.getRecordTargets().add(recordTarget);

		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		recordTarget.setPatientRole(patientRole);

		Patient patient = CDAFactory.eINSTANCE.createPatient();
		patientRole.setPatient(patient);

		PN name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Henry").addFamily("Levin").addSuffix("the 7th");
		patient.getNames().add(name);

		CE administrativeGenderCode = DatatypesFactory.eINSTANCE.createCE("M", "2.16.840.1.113883.5.1");
		patient.setAdministrativeGenderCode(administrativeGenderCode);

		TS birthTime = DatatypesFactory.eINSTANCE.createTS("19320924");
		patient.setBirthTime(birthTime);

		Organization providerOrganization = CDAFactory.eINSTANCE.createOrganization();
		providerOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5"));
		patientRole.setProviderOrganization(providerOrganization);

		Author author = CDAFactory.eINSTANCE.createAuthor();
		author.setTime(DatatypesFactory.eINSTANCE.createTS("2000040714"));
		doc.getAuthors().add(author);

		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5", "KP00017"));
		author.setAssignedAuthor(assignedAuthor);

		Person assignedPerson = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(assignedPerson);

		name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Bob").addFamily("Dolin").addSuffix("MD");
		assignedPerson.getNames().add(name);

		Section section = CDAFactory.eINSTANCE.createSection();
		Encounter encounter = CDAFactory.eINSTANCE.createEncounter();

		encounter.setPriorityCode(DatatypesFactory.eINSTANCE.createCE("code", "system"));
		encounter.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("low", "high"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("code", "system"));
		encounter.addAct(CDAFactory.eINSTANCE.createAct());

		section.addEncounter(encounter);
		doc.addSection(section);

		System.out.println("***** Constructed example *****");
		CDAUtil.save(doc, System.out);
		System.out.println();

		// create a validation result object to collect diagnostics produced during validation
		ValidationResult result = new ValidationResult();
		ClinicalDocument clinicalDocument = CDAUtil.load(new FileInputStream("samples/SampleCDADocument.xml"), result);

		System.out.println("\n***** Reserialization of sample *****");
		System.out.println(clinicalDocument);
		CDAUtil.save(clinicalDocument, System.out);
		System.out.println();

		System.out.println("\n***** Sample validation results *****");
		for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
			System.out.println("ERROR: " + diagnostic.getMessage());
		}
		for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
			System.out.println("WARNING: " + diagnostic.getMessage());
		}

		System.out.println(
			"Number of Schema Validation Diagnostics: " + result.getSchemaValidationDiagnostics().size());
		System.out.println("Number of EMF Resource Diagnostics: " + result.getEMFResourceDiagnostics().size());
		System.out.println("Number of EMF Validation Diagnostics: " + result.getEMFValidationDiagnostics().size());
		System.out.println("Number of Total Diagnostics: " + result.getAllDiagnostics().size());

		if (!result.hasErrors()) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}

		testSDTCDischargeDispositionCodes();

	}
}

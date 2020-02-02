/*******************************************************************************
 * Copyright (c) 2018 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.handlers;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.eclipse.core.resources.IFile;
import org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.DocumentMetadata;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Entry;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch;

class ProcessSectionSwitch extends ConsolSwitch<Boolean> {

	private String splitOption;

	private Query query;

	private SXSSFWorkbook wb;

	private DocumentMetadata documentMetadata;

	private PatientRole patientRole;

	private ServiceEvent serviceEvent;

	private List<Encounter> encounters;

	private IFile file;

	private GenerateCDADataHandler currentHandler;

	/**
	 * @param splitOption
	 * @param query
	 * @param wb
	 * @param documentMetadata
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param file
	 */
	public ProcessSectionSwitch(String splitOption, Query query, SXSSFWorkbook wb, DocumentMetadata documentMetadata,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters, IFile file,
			GenerateCDADataHandler currentHandler) {
		super();
		this.splitOption = splitOption;
		this.query = query;
		this.wb = wb;
		this.documentMetadata = documentMetadata;
		this.patientRole = patientRole;
		this.serviceEvent = serviceEvent;
		this.encounters = encounters;
		this.file = file;
		this.currentHandler = currentHandler;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseFunctionalStatusSection(org.openhealthtools.mdht.uml.cda.consol.
	 * FunctionalStatusSection)
	 */
	@Override
	public Boolean caseFunctionalStatusSection(FunctionalStatusSection section) {

		processClinicalStatements(section);

		for (AssessmentScaleObservation observation : section.getAssessmentScaleObservations()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getAssessmentScaleObservation().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getAssessmentScaleObservation()), splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		for (NumberOfPressureUlcersObservation observation : section.getNumberOfPressureUlcersObservations()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(
								ConsolPackage.eINSTANCE.getNumberOfPressureUlcersObservation().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getNumberOfPressureUlcersObservation()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		for (CognitiveStatusProblemObservation observation : section.getCognitiveStatusProblemObservations()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(
								ConsolPackage.eINSTANCE.getCognitiveStatusProblemObservation().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getCognitiveStatusProblemObservation()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation, false);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		for (CognitiveStatusResultOrganizer organizer : section.getCognitiveStatusResultOrganizers()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(
								ConsolPackage.eINSTANCE.getCognitiveStatusResultOrganizer().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getCognitiveStatusResultOrganizer()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createProcedureHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, organizer, encounters);
			offset = SpreadsheetSerializer.serializeOrganizer(row, offset, organizer, false, true);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, organizer.getSection(), file.getName());

		}

		for (FunctionalStatusProblemObservation observation : section.getFunctionalStatusProblemObservations()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(
								ConsolPackage.eINSTANCE.getFunctionalStatusProblemObservation().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getFunctionalStatusProblemObservation()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation, false);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		for (FunctionalStatusResultObservation observation : section.getFunctionalStatusResultObservations()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(
								ConsolPackage.eINSTANCE.getFunctionalStatusResultObservation().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getFunctionalStatusResultObservation()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		for (FunctionalStatusResultOrganizer organizer : section.getFunctionalStatusResultOrganizers()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(
								ConsolPackage.eINSTANCE.getFunctionalStatusResultOrganizer().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getFunctionalStatusResultOrganizer()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createProcedureHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, organizer, encounters);
			offset = SpreadsheetSerializer.serializeOrganizer(row, offset, organizer, false, true);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, organizer.getSection(), file.getName());

		}

		for (HighestPressureUlcerStage observation : section.getHighestPressureUlcerStages()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getHighestPressureUlcerStage().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getHighestPressureUlcerStage()), splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		for (NonMedicinalSupplyActivity supply : section.getNonMedicinalSupplyActivities()) {

			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getNonMedicinalSupplyActivity().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getNonMedicinalSupplyActivity()), splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSubstanceAdministrationHeader(
					row1, row2, offset, "Plan Of Care Activity Substance Administration");
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, supply, encounters);
			offset = SpreadsheetSerializer.serializeSupply(row, offset, supply);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, supply.getSection(), file.getName());

		}

		for (PressureUlcerObservation observation : section.getPressureUlcerObservations()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getPressureUlcerObservation().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getPressureUlcerObservation()), splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseInterventionsSection(org.openhealthtools.mdht.uml.cda.consol.InterventionsSection)
	 */
	@Override
	public Boolean caseInterventionsSection2(InterventionsSection2 section) {

		processClinicalStatements(section);

		for (PlannedInterventionAct act : section.getPlannedInterventionActs()) {

			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getPlannedInterventionAct().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getPlannedInterventionAct()), splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createProcedureHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, act, encounters);
			offset = SpreadsheetSerializer.serializeProcedureActivityAct(row, offset, act);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, act.getSection(), file.getName());

		}

		for (HandoffCommunicationParticipants act : section.getHandoffCommunications()) {

			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(
								ConsolPackage.eINSTANCE.getHandoffCommunicationParticipants().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getHandoffCommunicationParticipants()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createProcedureHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, act, encounters);
			offset = SpreadsheetSerializer.serializeProcedureActivityAct(row, offset, act);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, act.getSection(), file.getName());

		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseHealthConcernsSection(org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection)
	 */
	@Override
	public Boolean caseHealthConcernsSection(HealthConcernsSection section) {

		processClinicalStatements(section);

		for (HealthConcernAct act : section.getHealthConcernActs()) {

			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getHealthConcernAct().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getHealthConcernAct()), splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createProcedureHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, act, encounters);
			offset = SpreadsheetSerializer.serializeProcedureActivityAct(row, offset, act);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, act.getSection(), file.getName());

		}

		for (HealthStatusObservation2 observation : section.getHealthStatusObservation2s()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getHealthStatusObservation2().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getPlanOfCareActivityObservation()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		return Boolean.TRUE;
	}

	private void processClinicalStatements(Section section) {

		String sheetIndex = currentHandler.getSheet(
			section.getClinicalDocument().eClass(), String.valueOf(section.eClass().getClassifierID()),
			GenerateCDADataHandler.sheetName(section.eClass()), splitOption);

		Sheet sheet = wb.getSheet(sheetIndex);

		if (section.getEntries().isEmpty()) {

			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null; // sheet.createRow(0);
				Row row2 = sheet.createRow(0);

				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createClinicalStatmentHeader(row1, row2, offset);

			}

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, (Act) null, encounters);
			offset += 11;
			// offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, (Act) null);
			offset = SpreadsheetSerializer.serializeSectionAndFileName(row, offset, section, file.getName());
			offset = SpreadsheetSerializer.serializeStrucDocText(row, offset, section.getText());

		}

		for (Entry entry : section.getEntries()) {

			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null; // sheet.createRow(0);
				Row row2 = sheet.createRow(0);

				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createClinicalStatmentHeader(row1, row2, offset);
			}

			if (entry.getAct() != null) {

				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, entry.getAct(), encounters);
				offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, entry.getAct());
				SpreadsheetSerializer.serializeSectionAndFileName(
					row, offset, entry.getAct().getSection(), file.getName());
			}

			if (entry.getObservation() != null) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, entry.getObservation(), encounters);
				offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, entry.getObservation());
				SpreadsheetSerializer.serializeSectionAndFileName(
					row, offset, entry.getObservation().getSection(), file.getName());
			}

			if (entry.getProcedure() != null) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, entry.getProcedure(), encounters);
				offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, entry.getProcedure());
				SpreadsheetSerializer.serializeSectionAndFileName(
					row, offset, entry.getProcedure().getSection(), file.getName());
			}

			if (entry.getOrganizer() != null) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, entry.getOrganizer(), encounters);
				offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, entry.getOrganizer());
				SpreadsheetSerializer.serializeSectionAndFileName(
					row, offset, entry.getOrganizer().getSection(), file.getName());
			}

		}

		if (currentHandler.shouldCountSection(section)) {
			currentHandler.getSectionHash(
				section.getClinicalDocument().eClass().getClassifierID(), sheetIndex, splitOption).add(file);

		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#casePlanOfCareSection(org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection)
	 */
	@Override
	public Boolean casePlanOfCareSection(PlanOfCareSection section) {

		processClinicalStatements(section);

		for (PlanOfCareActivityAct act : section.getPlanOfCareActivityActs()) {

			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getPlanOfCareActivityAct().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getPlanOfCareActivityAct()), splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createProcedureHeader(row1, row2, offset);

			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, act, encounters);
			offset = SpreadsheetSerializer.serializeProcedureActivityAct(row, offset, act);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, act.getSection(), file.getName());

		}
		for (PlanOfCareActivityEncounter encounter : section.getPlanOfCareActivityEncounters()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getPlanOfCareActivityEncounter().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getPlanOfCareActivityEncounter()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createEncounterHeader(row1, row2, offset);
				// emptySectionOffset.put(sheet, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter, MatchEncounterBy.BYID);
			offset = SpreadsheetSerializer.serializeEncounter(row, offset, encounter);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, encounter.getSection(), file.getName());
		}
		for (PlanOfCareActivityObservation observation : section.getPlanOfCareActivityObservations()) {
			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(
								ConsolPackage.eINSTANCE.getPlanOfCareActivityObservation().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getPlanOfCareActivityObservation()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createPlanOfCareActivityObservationHeader(row1, row2, offset);
				// emptySectionOffset.put(sheet, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), file.getName());
		}

		for (PlanOfCareActivityProcedure act : section.getPlanOfCareActivityProcedures()) {

			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getPlanOfCareActivityProcedure().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getPlanOfCareActivityProcedure()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createEncounterHeader(row1, row2, offset);
				// emptySectionOffset.put(sheet, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, act, encounters);
			offset = SpreadsheetSerializer.serializeProcedureActivityProcedure(row, offset, act);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, act.getSection(), file.getName());

		}

		for (PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration : section.getPlanOfCareActivitySubstanceAdministrations()) {

			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." + String.valueOf(
						ConsolPackage.eINSTANCE.getPlanOfCareActivitySubstanceAdministration().getClassifierID())),
				GenerateCDADataHandler.sheetName(
					ConsolPackage.eINSTANCE.getPlanOfCareActivitySubstanceAdministration()),
				splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSubstanceAdministrationHeader(
					row1, row2, offset, "Plan Of Care Activity Substance Administration");
				// emptySectionOffset.put(sheet, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(
				row, offset, planOfCareActivitySubstanceAdministration, encounters);
			offset = SpreadsheetSerializer.serializeSubstanceAdministration(
				row, offset, planOfCareActivitySubstanceAdministration);
			SpreadsheetSerializer.serializeSectionAndFileName(
				row, offset, planOfCareActivitySubstanceAdministration.getSection(), file.getName());
		}

		for (PlanOfCareActivitySupply supply : section.getPlanOfCareActivitySupplies()) {

			String sheetIndex = currentHandler.getSheet(
				section.getClinicalDocument().eClass(),
				String.valueOf(
					section.eClass().getClassifierID() + "." +
							String.valueOf(ConsolPackage.eINSTANCE.getPlanOfCareActivitySupply().getClassifierID())),
				GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getPlanOfCareActivitySupply()), splitOption);
			Sheet sheet = wb.getSheet(sheetIndex);
			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null;
				Row row2 = sheet.createRow(0);
				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createSubstanceAdministrationHeader(
					row1, row2, offset, "Plan Of Care Activity Substance Administration");
				// emptySectionOffset.put(sheet, offset);
			}
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, supply, encounters);
			offset = SpreadsheetSerializer.serializeSupply(row, offset, supply);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, supply.getSection(), file.getName());

		}
		if (section instanceof PlanOfTreatmentSection2) {
			for (NutritionRecommendation nutritionRecommendation : ((PlanOfTreatmentSection2) section).getNutritionRecommendations()) {

				String sheetIndex = currentHandler.getSheet(
					section.getClinicalDocument().eClass(),
					String.valueOf(
						section.eClass().getClassifierID() + "." +
								String.valueOf(ConsolPackage.eINSTANCE.getNutritionRecommendation().getClassifierID())),
					GenerateCDADataHandler.sheetName(ConsolPackage.eINSTANCE.getNutritionRecommendation()),
					splitOption);
				Sheet sheet = wb.getSheet(sheetIndex);
				if (sheet.getPhysicalNumberOfRows() == 0) {
					Row row1 = null;
					Row row2 = sheet.createRow(0);
					int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
					offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
					offset = SheetHeaderUtil.createSubstanceAdministrationHeader(
						row1, row2, offset, "Plan Of Care Activity Substance Administration");
					// emptySectionOffset.put(sheet, offset);
				}
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = SpreadsheetSerializer.serializePatient(row, 0, this.documentMetadata, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, nutritionRecommendation, encounters);
				offset = serializeNutritionRecommendation(row, offset, nutritionRecommendation);
				SpreadsheetSerializer.serializeSectionAndFileName(
					row, offset, nutritionRecommendation.getSection(), file.getName());

			}
		}

		return Boolean.TRUE;
	}

	/**
	 * @param row
	 * @param offset
	 * @param nutritionRecommendation
	 * @return
	 */
	private int serializeNutritionRecommendation(Row row, int offset, NutritionRecommendation nutritionRecommendation) {
		return offset;
	}

	/*
	 * // * (non-Javadoc)
	 * // *
	 * // * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#casePlanOfTreatmentSection2(org.openhealthtools.mdht.uml.cda.consol.
	 * // * PlanOfTreatmentSection2)
	 * //
	 */
	// @Override
	// public Boolean casePlanOfTreatmentSection2(PlanOfTreatmentSection2 section) {
	//
	// section.getConsolInstruction2s();
	// section.getConsolPlannedAct2s();
	// section.getConsolPlannedEncounter2s();
	// section.getConsolPlannedMedicationActivity2s();
	// section.getConsolPlannedObservation2s();
	// section.getConsolPlannedProcedure2s();
	// section.getConsolPlannedSupply2s();
	// section.getNutritionRecommendations();
	//
	// return super.casePlanOfTreatmentSection2(section);
	// }

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseSection(org.eclipse.mdht.uml.cda.Section)
	 */
	@Override
	public Boolean caseSection(Section section) {

		String sheetIndex = currentHandler.getSheet(
			section.getClinicalDocument().eClass(), String.valueOf(section.eClass().getClassifierID()),
			GenerateCDADataHandler.sheetName(section.eClass()), splitOption);
		if (!(section instanceof EncountersSectionEntriesOptional)) {
			SectionSwitch sectionSwitch = new SectionSwitch(
				query, wb.getSheet(sheetIndex), documentMetadata, patientRole, serviceEvent, encounters,
				file.getName());
			sectionSwitch.doSwitch(section);
			try {
				wb.getSheet(sheetIndex).flushRows();
			} catch (IOException e) {

			}
		}
		if (currentHandler.shouldCountSection(section)) {
			currentHandler.getSectionHash(
				section.getClinicalDocument().eClass().getClassifierID(), sheetIndex, splitOption).add(file);

		}
		return Boolean.TRUE;
	}

}

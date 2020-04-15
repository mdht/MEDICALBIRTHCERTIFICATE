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

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.DocumentMetadata;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch;

class SectionSwitch extends ConsolSwitch<Boolean> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseHospitalAdmissionMedicationsSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.
	 * consol.HospitalAdmissionMedicationsSectionEntriesOptional)
	 */
	@Override
	public Boolean caseHospitalAdmissionMedicationsSectionEntriesOptional(
			HospitalAdmissionMedicationsSectionEntriesOptional section) {

		if (section.getAdmissionMedications() != null && !section.getAdmissionMedications().isEmpty()) {

			for (AdmissionMedication admissionMedication : section.getAdmissionMedications()) {
				SpreadsheetSerializer.appendToSubstanceAdministrationSheet(
					query, sheet, documentMetadata, patientRole, serviceEvent, encounters,
					admissionMedication.getMedicationActivities(), fileName);
			}
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseHospitalDischargeDiagnosisSection(org.openhealthtools.mdht.uml.cda.consol.
	 * HospitalDischargeDiagnosisSection)
	 */
	@Override
	public Boolean caseHospitalDischargeDiagnosisSection(HospitalDischargeDiagnosisSection section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);
			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProblemObservationHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getHospitalDischargeDiagnosis() != null &&
				!section.getHospitalDischargeDiagnosis().getProblemObservations().isEmpty()) {
			appendToProblemsSheet2(
				query, sheet, patientRole, serviceEvent,
				section.getHospitalDischargeDiagnosis().getProblemObservations(), encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseComplicationsSection(org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection)
	 */
	@Override
	public Boolean caseComplicationsSection(ComplicationsSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProblemObservationHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getProblemObservations() != null && !section.getProblemObservations().isEmpty()) {

			appendToProblemsSheet2(
				query, sheet, patientRole, serviceEvent, section.getProblemObservations(), encounters, fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	private static HashMap<Sheet, Integer> emptySectionOffset = new HashMap<Sheet, Integer>();

	private DocumentMetadata documentMetadata;

	private List<Encounter> encounters = null;

	private String fileName = null;

	private PatientRole patientRole = null;

	private Query query = null;

	private ServiceEvent serviceEvent = null;

	private Sheet sheet = null;

	public SectionSwitch(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware, PatientRole patientRole,
			ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {
		super();
		this.query = query;
		this.sheet = sheet;
		this.documentMetadata = organizationAndSoftware;
		this.patientRole = patientRole;
		this.serviceEvent = serviceEvent;
		this.encounters = encounters;
		this.fileName = fileName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseProcedureIndicationsSection(org.openhealthtools.mdht.uml.cda.consol.
	 * ProcedureIndicationsSection)
	 */
	@Override
	public Boolean caseProcedureIndicationsSection(ProcedureIndicationsSection section) {

		section.getIndications();
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getIndications() != null && !section.getIndications().isEmpty()) {

			appendIndicationSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getIndications(), encounters,
				fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#casePostprocedureDiagnosisSection(org.openhealthtools.mdht.uml.cda.consol.
	 * PostprocedureDiagnosisSection)
	 */
	@Override
	public Boolean casePostprocedureDiagnosisSection(PostprocedureDiagnosisSection section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);
			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProblemObservationHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getPostprocedureDiagnosis() != null &&
				!section.getPostprocedureDiagnosis().getProblemObservations().isEmpty()) {
			appendToProblemsSheet2(
				query, sheet, patientRole, serviceEvent, section.getPostprocedureDiagnosis().getProblemObservations(),
				encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#casePreoperativeDiagnosisSection(org.openhealthtools.mdht.uml.cda.consol.
	 * PreoperativeDiagnosisSection)
	 */
	@Override
	public Boolean casePreoperativeDiagnosisSection(PreoperativeDiagnosisSection section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);
			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProblemObservationHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getPreoperativeDiagnosis() != null &&
				!section.getPreoperativeDiagnosis().getProblemObservations().isEmpty()) {
			appendToProblemsSheet2(
				query, sheet, patientRole, serviceEvent, section.getPreoperativeDiagnosis().getProblemObservations(),
				encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseProcedureFindingsSection(org.openhealthtools.mdht.uml.cda.consol.
	 * ProcedureFindingsSection)
	 */
	@Override
	public Boolean caseProcedureFindingsSection(ProcedureFindingsSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProblemObservationHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getProblemObservations() != null && !section.getProblemObservations().isEmpty()) {

			appendToProblemsSheet2(
				query, sheet, patientRole, serviceEvent, section.getProblemObservations(), encounters, fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseAdvanceDirectivesSection(org.openhealthtools.mdht.uml.cda.consol.
	 * AdvanceDirectivesSection)
	 */
	@Override
	public Boolean caseAdvanceDirectivesSectionEntriesOptional(AdvanceDirectivesSectionEntriesOptional section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProblemHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);

		}
		if (section.getAdvanceDirectiveObservations() != null && !section.getAdvanceDirectiveObservations().isEmpty()) {

			appendToAdvancedDirectivesSheet(
				query, sheet, patientRole, serviceEvent, section.getAdvanceDirectiveObservations(), encounters,
				fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#casePayersSection(org.openhealthtools.mdht.uml.cda.consol.PayersSection)
	 */
	@Override
	public Boolean casePayersSection(PayersSection section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createAllergyHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getCoverageActivities() != null && !section.getCoverageActivities().isEmpty()) {
			appendToCoverageActivitiesSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getCoverageActivities(), encounters,
				fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseAssessmentSection(org.openhealthtools.mdht.uml.cda.consol.AssessmentSection)
	 */
	// @Override
	// public Boolean caseAssessmentSection(AssessmentSection section) {
	// if (sheet.getPhysicalNumberOfRows() == 0) {
	// Row row1 = null; // sheet.createRow(0);
	// Row row2 = sheet.createRow(0);
	// int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
	// offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
	// // offset = SheetHeaderUtil.createSubstanceAdministrationHeader(row1, row2, offset, "Discharged Medications");
	// emptySectionOffset.put(sheet, offset);
	// }
	//
	// if (section.getText() != null) {
	// appendNarrative(
	// query, sheet, documentMetadata, patientRole, serviceEvent, encounters, section.getText(), fileName);
	// } else {
	// appendEmptySection(query, sheet, section, fileName);
	// }
	// return Boolean.TRUE;
	// }

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseInstructionsSection(org.openhealthtools.mdht.uml.cda.consol.InstructionsSection)
	 */
	@Override
	public Boolean caseInstructionsSection(InstructionsSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createInstructionsHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getInstructionss() != null && !section.getInstructionss().isEmpty()) {
			appendToInstructionSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getInstructionss(), encounters,
				fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseHealthStatusEvaluationsAndOutcomesSection(org.openhealthtools.mdht.uml.cda.consol.
	 * HealthStatusEvaluationsAndOutcomesSection)
	 */
	@Override
	public Boolean caseHealthStatusEvaluationsAndOutcomesSection(HealthStatusEvaluationsAndOutcomesSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createAllergyHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getOutcomeObservations() != null && !section.getOutcomeObservations().isEmpty()) {
			appendToOutcomeObservationSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getOutcomeObservations(), encounters,
				fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseAllergiesSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * AllergiesSectionEntriesOptional)
	 */
	@Override
	public Boolean caseAllergiesSectionEntriesOptional(AllergiesSectionEntriesOptional section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createAllergyHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}
		if (section.getAllergyProblemActs() != null && !section.getAllergyProblemActs().isEmpty()) {
			appendToAllergiesSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getAllergyProblemActs(), encounters,
				fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseFamilyHistorySection(org.openhealthtools.mdht.uml.cda.consol.
	 * FamilyHistorySection)
	 */
	@Override
	public Boolean caseFamilyHistorySection(FamilyHistorySection section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createFamilyHistoryHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getOrganizers() != null && !section.getOrganizers().isEmpty()) {
			appendToFamilyHistorySheet(
				query, sheet, patientRole, serviceEvent, section.getOrganizers(), encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseGoalsSection(org.openhealthtools.mdht.uml.cda.consol.GoalsSection)
	 */
	@Override
	public Boolean caseGoalsSection(GoalsSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createGoalsSectionHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getGoalObservations() != null && !section.getGoalObservations().isEmpty()) {
			appendToGoalSheet(
				query, sheet, patientRole, serviceEvent, section.getGoalObservations(), encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseHistoryOfPastIllnessSection(org.openhealthtools.mdht.uml.cda.consol.
	 * HistoryOfPastIllnessSection)
	 */
	@Override
	public Boolean caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProblemObservationHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getProblemObservations() != null && !section.getProblemObservations().isEmpty()) {

			appendToProblemsSheet2(
				query, sheet, patientRole, serviceEvent, section.getProblemObservations(), encounters, fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseImmunizationsSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * ImmunizationsSectionEntriesOptional)
	 */
	@Override
	public Boolean caseImmunizationsSectionEntriesOptional(ImmunizationsSectionEntriesOptional section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createSubstanceAdministrationHeader(row1, row2, offset, "Immunization");
			emptySectionOffset.put(sheet, offset);
		}
		if (section.getImmunizationActivities() != null && !section.getImmunizationActivities().isEmpty()) {

			SpreadsheetSerializer.appendToSubstanceAdministrationSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, encounters,
				section.getImmunizationActivities(), fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseMedicationsAdministeredSection(org.openhealthtools.mdht.uml.cda.consol.
	 * MedicationsAdministeredSection)
	 */
	@Override
	public Boolean caseMedicationsAdministeredSection(MedicationsAdministeredSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);
			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createSubstanceAdministrationHeader(row1, row2, offset, "Medications");
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getMedicationActivities() != null && !section.getMedicationActivities().isEmpty()) {
			SpreadsheetSerializer.appendToSubstanceAdministrationSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, encounters,
				section.getMedicationActivities(), fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseMedicationsSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * MedicationsSectionEntriesOptional)
	 */
	@Override
	public Boolean caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);
			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createSubstanceAdministrationHeader(row1, row2, offset, "Medications");
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getMedicationActivities() != null && !section.getMedicationActivities().isEmpty()) {
			SpreadsheetSerializer.appendToSubstanceAdministrationSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, encounters,
				section.getMedicationActivities(), fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProblemHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);

		}
		if (section.getProblemConcerns() != null && !section.getProblemConcerns().isEmpty()) {

			appendToProblemsSheet(
				query, sheet, patientRole, serviceEvent, section.getProblemConcerns(), encounters, fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseProceduresSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * ProceduresSectionEntriesOptional)
	 */
	@Override
	public Boolean caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProcedureHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}
		if (section.getProcedureActivityActs() != null && !section.getProcedureActivityActs().isEmpty()) {

			appendActToProcedureSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getProcedureActivityActs(),
				encounters, fileName);

		}

		if (section.getProcedureActivityObservations() != null &&
				!section.getProcedureActivityObservations().isEmpty()) {

			appendObservationToProcedureSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getProcedureActivityObservations(),
				encounters, fileName);

		}

		if (section.getProcedureActivityProcedures() != null && !section.getProcedureActivityProcedures().isEmpty()) {

			SpreadsheetSerializer.appendProcedureToProcedureSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getProcedures(), encounters,
				fileName);

		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseResultsSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * ResultsSectionEntriesOptional)
	 */
	@Override
	public Boolean caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional section) {

		EList<ResultOrganizer> resultOrganizers = new BasicEList<ResultOrganizer>();

		for (Organizer organizer : section.getOrganizers()) {
			if (organizer instanceof ResultOrganizer) {
				resultOrganizers.add((ResultOrganizer) organizer);
			}
		}

		if (!resultOrganizers.isEmpty()) {

			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null; // sheet.createRow(0);
				Row row2 = sheet.createRow(0);

				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createResultsHeader(row1, row2, offset);
				emptySectionOffset.put(sheet, offset);
			}

			SpreadsheetSerializer.appendToResultsSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, resultOrganizers, encounters, fileName);

		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseSocialHistorySection(org.openhealthtools.mdht.uml.cda.consol.
	 * SocialHistorySection)
	 */
	@Override
	public Boolean caseSocialHistorySection(SocialHistorySection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createSocialHistoryHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getObservations() != null && !section.getObservations().isEmpty()) {
			appendObservationsToSocialHistorySheet(
				query, sheet, patientRole, serviceEvent, section.getObservations(), encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	@Override
	public Boolean caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional section) {
		if (section.getVitalSignsOrganizers() != null && !section.getVitalSignsOrganizers().isEmpty()) {

			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null; // sheet.createRow(0);
				Row row2 = sheet.createRow(0);

				int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
				offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
				offset = SheetHeaderUtil.createVitalSignsHeader(row1, row2, offset);
				emptySectionOffset.put(sheet, offset);
			}

			SpreadsheetSerializer.appendToVitalSignsSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getOrganizers(), encounters,
				fileName);
			return Boolean.TRUE;

		}
		return Boolean.TRUE;
	}

	/*
	 * org.openhealthtools.mdht.uml.cda.consol.impl.ChiefComplaintAndReasonForVisitSectionImpl
	 * org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentSectionImpl
	 * org.openhealthtools.mdht.uml.cda.consol.impl.ReasonForReferralSection2Impl
	 * org.openhealthtools.mdht.uml.cda.consol.impl.DischargeMedicationsSection2Impl
	 * org.openhealthtools.mdht.uml.cda.consol.impl.DischargeMedicationsSection2Impl
	 * org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentSectionImpl
	 * org.openhealthtools.mdht.uml.cda.consol.impl.ReasonForReferralSection2Impl
	 */

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseChiefComplaintSection(org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection)
	 */
	// @Override
	// public Boolean caseChiefComplaintSection(ChiefComplaintSection section) {
	// if (sheet.getPhysicalNumberOfRows() == 0) {
	// Row row1 = null; // sheet.createRow(0);
	// Row row2 = sheet.createRow(0);
	// int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
	// offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
	// // offset = SheetHeaderUtil.createSubstanceAdministrationHeader(row1, row2, offset, "Discharged Medications");
	// emptySectionOffset.put(sheet, offset);
	// }
	//
	// if (section.getText() != null) {
	// appendNarrative(
	// query, sheet, documentMetadata, patientRole, serviceEvent, encounters, section.getText(), fileName);
	// } else {
	// appendEmptySection(query, sheet, section, fileName);
	// }
	// return Boolean.TRUE;
	//
	// }

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseDischargeMedicationsSectionEntriesOptional2(org.openhealthtools.mdht.uml.cda.consol.
	 * DischargeMedicationsSectionEntriesOptional2)
	 */
	@Override
	public Boolean caseDischargeMedicationsSectionEntriesOptional2(
			DischargeMedicationsSectionEntriesOptional2 section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);
			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createClinicalStatmentHeader(row1, row2, offset);
			// offset = SheetHeaderUtil.createSubstanceAdministrationHeader(row1, row2, offset, "Discharged Medications");
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getDischargeMedications() != null && !section.getDischargeMedications().isEmpty()) {
			appendToDischargeMedications(
				query, sheet, documentMetadata, patientRole, serviceEvent, encounters,
				section.getDischargeMedications(), fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}
		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseReasonForReferralSection(org.openhealthtools.mdht.uml.cda.consol.
	 * ReasonForReferralSection)
	 */
	// @Override
	// public Boolean caseReasonForReferralSection(ReasonForReferralSection section) {
	//
	// if (sheet.getPhysicalNumberOfRows() == 0) {
	// Row row1 = null; // sheet.createRow(0);
	// Row row2 = sheet.createRow(0);
	// int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
	// offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
	// offset = SheetHeaderUtil.createNarrativeHeader(row1, row2, offset);
	// // offset = SheetHeaderUtil.createSubstanceAdministrationHeader(row1, row2, offset, "Discharged Medications");
	// emptySectionOffset.put(sheet, offset);
	// }
	//
	// if (section.getText() != null) {
	// appendNarrative(
	// query, sheet, documentMetadata, patientRole, serviceEvent, encounters, section.getText(), fileName);
	// } else {
	// appendEmptySection(query, sheet, section, fileName);
	// }
	// return Boolean.TRUE;
	// }

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseChiefComplaintAndReasonForVisitSection(org.openhealthtools.mdht.uml.cda.consol.
	 * ChiefComplaintAndReasonForVisitSection)
	 */
	@Override
	public Boolean caseChiefComplaintAndReasonForVisitSection(ChiefComplaintAndReasonForVisitSection object) {
		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		Section section = (Section) object;
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);
			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createNarrativeHeader(row1, row2, offset);
			// offset = SheetHeaderUtil.createSubstanceAdministrationHeader(row1, row2, offset, "Discharged Medications");
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getText() != null) {
			appendNarrative(
				query, sheet, documentMetadata, patientRole, serviceEvent, encounters, section.getText(), fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}
		return Boolean.TRUE;

	}

	private void appendActToProcedureSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, EList<ProcedureActivityAct> eList,
			List<Encounter> encounters, String fileName) {

		for (Act sa : eList) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeProcedureActivityAct(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}
	}

	private void appendEmptySection(Query query2, Sheet sheet2, Section section, String fileName2) {

		Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);

		row.createCell(offset++).setCellValue("NO ENCOUNTER");
		row.createCell(offset++).setCellValue("NO ENTRIES");
		SpreadsheetSerializer.serializeSectionAndFileName(row, emptySectionOffset.get(sheet2) - 3, section, fileName);
	}

	private void appendObservationsToSocialHistorySheet(Query query2, Sheet sheet2, PatientRole patientRole2,
			ServiceEvent serviceEvent2, EList<Observation> observations, List<Encounter> encounters2,
			String fileName2) {

		for (Observation sa : observations) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeObservation(row, offset, sa, false);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	private void appendToAdvancedDirectivesSheet(Query query2, Sheet sheet2, PatientRole patientRole2,
			ServiceEvent serviceEvent2, EList<AdvanceDirectiveObservation> advanceDirectiveObservations,
			List<Encounter> encounters2, String fileName2) {
		for (AdvanceDirectiveObservation ado : advanceDirectiveObservations) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, ado, encounters);

			offset = org.eclipse.mdht.cda.xml.ui.handlers.SpreadsheetSerializer.serializeClinicalStatement(
				row, offset, ado);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, ado.getSection(), fileName);

		}

	}

	private void appendToFamilyHistorySheet(Query query2, Sheet sheet2, PatientRole patientRole2,
			ServiceEvent serviceEvent2, List<Organizer> observations, List<Encounter> encounters2, String fileName2) {

		for (Organizer organizer : observations) {

			for (Observation observation : organizer.getObservations()) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
				offset = SpreadsheetSerializer.serializeOrganizer(row, offset, organizer, false, true);
				offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
				SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
			}

		}

	}

	private void appendToGoalSheet(Query query2, Sheet sheet2, PatientRole patientRole2, ServiceEvent serviceEvent2,
			EList<? extends Observation> observations, List<Encounter> encounters2, String fileName2) {

		for (Observation observation : observations) {
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
		}
	}

	private void appendToProblemsSheet(Query query2, Sheet sheet2, PatientRole patientRole2, ServiceEvent serviceEvent2,
			EList<ProblemConcernAct> problemConcerns, List<Encounter> encounters2, String fileName2) {

		for (ProblemConcernAct sa : problemConcerns) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeProblemConcernAct(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	private void appendToProblemsSheet2(Query query2, Sheet sheet2, PatientRole patientRole2,
			ServiceEvent serviceEvent2, EList<ProblemObservation> problemObservations, List<Encounter> encounters2,
			String fileName2) {

		for (ProblemObservation sa : problemObservations) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeProblemObservationClinicalStatement(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 * @return
	 */

	private int serializeProblemConcernAct(Row row, int offset, ProblemConcernAct problemConcernAct) {
		StringBuffer sb = new StringBuffer();

		for (II ii : problemConcernAct.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(problemConcernAct.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(problemConcernAct.getEffectiveTime()));

		offset = SpreadsheetSerializer.appendCode(
			row, offset, problemConcernAct.getSection(), problemConcernAct.getCode(), problemConcernAct.getText());

		for (ProblemObservation problemObservation : problemConcernAct.getProblemObservations()) {
			offset = SpreadsheetSerializer.serializeProblemObservationClinicalStatement(
				row, offset, problemObservation);
			break;
		}

		return offset;
	}

	static void appendToAllergiesSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent,
			List<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sas, List<Encounter> encounters,
			String fileName) {

		for (AllergyProblemAct sa : sas) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeAllergyProblemAct(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeAllergyProblemAct(Row row, int offset, AllergyProblemAct allergyProblemAct) {

		StringBuffer sb = new StringBuffer();

		for (II ii : allergyProblemAct.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		if (allergyProblemAct.getStatusCode() != null &&
				!StringUtils.isEmpty(allergyProblemAct.getStatusCode().getCode())) {
			row.createCell(offset++).setCellValue(allergyProblemAct.getStatusCode().getCode());
		} else {
			row.createCell(offset++).setCellValue("Missing Status");
		}

		// if (!allergyProblemAct.getAllergyObservations().isEmpty()) {

		for (AllergyObservation allergyObservation : allergyProblemAct.getAllergyObservations()) {

			Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(allergyObservation.getEffectiveTime()));
			if (d != null) {
				row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
				row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(allergyObservation.getEffectiveTime()));
			} else {
				row.createCell(offset++).setCellValue("");
				row.createCell(offset++).setCellValue("");
			}

			CD cd = null;
			for (ANY any : allergyObservation.getValues()) {
				if (any instanceof CD) {
					cd = (CD) any;
				}

			}

			row.createCell(offset++).setCellValue(Boolean.TRUE.equals(allergyObservation.getNegationInd()));

			offset = SpreadsheetSerializer.appendCode(
				row, offset, allergyProblemAct.getSection(), cd, allergyObservation.getText());

			CD material = null;

			try {
				material = allergyObservation.getParticipants().get(
					0).getParticipantRole().getPlayingEntity().getCode();
			} catch (RuntimeException re) {

			}

			offset = SpreadsheetSerializer.appendCode(row, offset, allergyProblemAct.getSection(), material, null);

			SeverityObservation severity = null;

			if (!allergyObservation.getConsolReactionObservations().isEmpty()) {
				for (ReactionObservation ro : allergyObservation.getConsolReactionObservations()) {

					CD reactionCode = null;

					for (ANY any : ro.getValues()) {
						if (any instanceof CD) {
							reactionCode = (CD) any;
						}
					}
					offset = SpreadsheetSerializer.appendCode(
						row, offset, allergyProblemAct.getSection(), reactionCode, ro.getText());

					if (ro.getSeverityObservation() != null) {
						severity = ro.getSeverityObservation();
					}
					break;
				}
			} else {
				offset = SpreadsheetSerializer.appendCode(row, offset, allergyProblemAct.getSection(), null, null);
			}

			severity = (severity != null
					? severity
					: allergyObservation.getConsolSeverityObservation());
			if (severity != null) {
				CD severityCode = null;
				for (ANY any : severity.getValues()) {
					if (any instanceof CD) {
						severityCode = (CD) any;
					}
				}
				offset = SpreadsheetSerializer.appendCode(
					row, offset, allergyProblemAct.getSection(), severityCode, severity.getText());
			} else {
				// tick up offset becuase appendcode will not populate the text column
				offset++;
				offset = SpreadsheetSerializer.appendCode(row, offset, allergyProblemAct.getSection(), null, null);
			}
			offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, allergyObservation.getAuthors());

			break;
		}

		return offset;

	}

	static void appendObservationToProcedureSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent,
			EList<ProcedureActivityObservation> procedureActivityObservations, List<Encounter> encounters,
			String fileName) {

		for (ProcedureActivityObservation sa : procedureActivityObservations) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeProcedureActivityObservation(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}
	}

	private void appendToOutcomeObservationSheet(Query query2, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, EList<OutcomeObservation> outcomeObservations,
			List<Encounter> encounters, String fileName2) {
		for (OutcomeObservation sa : outcomeObservations) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	private void appendIndicationSheet(Query query2, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, EList<Indication> indications,
			List<Encounter> encounters, String fileName2) {
		for (Indication sa : indications) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	private void appendToInstructionSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent2, EList<Instructions> instructionss,
			List<Encounter> encounters, String fileName2) {

		for (Instructions sa : instructionss) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	private void appendToCoverageActivitiesSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent2, EList<CoverageActivity> coverageActivities,
			List<Encounter> encounters, String fileName2) {

		for (CoverageActivity sa : coverageActivities) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param documentMetadata2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param encounters2
	 * @param dischargeMedications
	 * @param fileName2
	 */
	private void appendToDischargeMedications(Query query2, Sheet sheet2, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole2, ServiceEvent serviceEvent2, List<Encounter> encounters2,
			EList<DischargeMedication> dischargeMedications, String fileName2) {
		for (DischargeMedication sa : dischargeMedications) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeClinicalStatement(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}
	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param documentMetadata2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param encounters2
	 * @param text
	 * @param fileName2
	 */
	private void appendNarrative(Query query2, Sheet sheet2, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole2, ServiceEvent serviceEvent2, List<Encounter> encounters2, StrucDocText text,
			String fileName2) {
		int offset = 0;

		Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

		offset = SpreadsheetSerializer.serializeNoEnounterID(row, offset);

		// offset = SpreadsheetSerializer.serializeStrucDocText(row, offset, text);

		SpreadsheetSerializer.serializeSectionAndFileName(row, offset, (Section) text.eContainer(), fileName);

	}

}

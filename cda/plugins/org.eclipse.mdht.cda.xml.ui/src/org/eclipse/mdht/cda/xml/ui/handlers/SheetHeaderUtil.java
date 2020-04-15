/*******************************************************************************
 *
 * Copyright (c) 2018 michaelcgood
 * https://github.com/michaelcgood/HTML-to-Apache-POI-RichTextString/blob/master/LICENSE.
  *
 * Contributors:
 *     michaelcgood - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.handlers;

import org.apache.poi.ss.usermodel.Row;

/**
 * @author seanmuir
 *
 */
public class SheetHeaderUtil {

	static boolean hideColumns = false;

	static int createAllergyHeader(Row row1, Row row2, int offset) {
		// All Des Verify Date Event Type Reaction Severity Source
		// int firstColumn = offset;
		// undo to go back to two rows for headers // undo to go back to two rows for headers row1.createCell(firstColumn).setCellValue("Allergy");
		row2.createCell(offset++).setCellValue("Allergy ID");
		row2.createCell(offset++).setCellValue("Status");
		row2.createCell(offset++).setCellValue("Verify Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("No Known Flag");
		offset = addCodeHeader(row2, offset, "Allergy ");
		offset = addCodeHeader(row2, offset, "Substance ");
		offset = addCodeHeader(row2, offset, "Reaction ");
		offset = addCodeHeader(row2, offset, "Severity ");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);
		// undo to go back to two rows for headers // undo to go back to two rows for headers row1.getSheet().addMergedRegion(new CellRangeAddress(0,
		// 0, firstColumn, offset));

		return offset;
	}

	static int createDemographicsHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Name");
		row2.createCell(offset++).setCellValue("Address");
		offset = addCodeHeader(row2, offset, "Race");
		offset = addCodeHeader(row2, offset, "Ethnicity");
		offset = addCodeHeader(row2, offset, "Gender");
		offset = addCodeHeader(row2, offset, "Marital Status");
		offset = addCodeHeader(row2, offset, "Langauge");
		row2.createCell(offset++).setCellValue("Telephone");
		return offset;
	}

	/**
	 * @TODO
	 * 		Added different columns and location for headers - make this user specified
	 * @param row2
	 * @param offset
	 * @return
	 */
	static int createDocumentMedadataHeadder(Row row2, int offset) {
		return createDocumentMedadataHeadder(row2, offset, true);
	}

	static int createDocumentMedadataHeadder(Row row2, int offset, boolean fileName) {
		if (fileName) {
			row2.createCell(offset++).setCellValue("File Name");
			row2.createCell(offset++).setCellValue("Document ID");
		}
		row2.createCell(offset++).setCellValue("CDA Specification");
		row2.createCell(offset++).setCellValue("CDA Document Type");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Software");
		row2.createCell(offset++).setCellValue("Document Date");
		row2.createCell(offset++).setCellValue("PCP Name");
		row2.createCell(offset++).setCellValue("PCP Address");
		return offset;
	}

	static int createEncounterHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Encounter");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);

		return offset;
	}

	static int createEncounterIDHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Encounter ID");
		row2.createCell(offset++).setCellValue("Encounter Match");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);

		return offset;
	}

	static int createPatientHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Record");
		row2.createCell(offset++).setCellValue("File Name");
		row2.createCell(offset++).setCellValue("Document ID");
		row2.createCell(offset++).setCellValue("Patient ID");
		if (!GenerateCDADataHandler.omitDOB) {
			row2.createCell(offset++).setCellValue("Complete ID");
			row2.createCell(offset++).setCellValue("Patient Name");
			if (!"Documents".equals(row2.getSheet().getSheetName())) {
				row2.getSheet().setColumnHidden(offset - 1, hideColumns);
			}
			row2.createCell(offset++).setCellValue("DOB");
		}
		offset = createDocumentMedadataHeadder(row2, offset, false);
		return offset;
	}

	static int createPatientHeader2(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Recipient Name");
		row2.createCell(offset++).setCellValue("Recipient Organization");
		row2.createCell(offset++).setCellValue("Order Id");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;
	}

	static int createProblemHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Problem");
		offset = createProblemObservationHeader(row1, row2, offset);
		return offset;

	}

	static int createProblemObservationHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Problem");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);
		return offset;

	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 */
	static int createProcedureHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Procedure");
		row2.createCell(offset++).setCellValue("Performer");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Section Title");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;

	}

	static int createResultsHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Panel ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Panel");
		offset = addCodeHeader(row2, offset, "Specimen");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Test");
		row2.createCell(offset++).setCellValue("Result");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Range");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	static int createSocialHistoryHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Observation");
		row2.createCell(offset++).setCellValue("Value");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	static int createSubstanceAdministrationHeader(Row row1, Row row2, int offset, String type) {
		row2.createCell(offset++).setCellValue("ID");
		offset = addCodeHeader(row2, offset, type);
		row2.createCell(offset++).setCellValue("Status");
		row2.createCell(offset++).setCellValue("Quantity");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Expiration");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Prescription");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	// static void appendToSubstanceAdministrationSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
	// PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {
	//
	// // Because we were getting class cast exception - copy results to EList
	// EList<SubstanceAdministration> elist = new BasicEList<SubstanceAdministration>();
	//
	// elist.addAll(query.getEObjects(org.openhealthtools.mdht.uml.cda.consol.MedicationActivity.class));
	//
	// appendToSubstanceAdministrationSheet(
	// query, sheet, organizationAndSoftware, patientRole, serviceEvent, encounters, elist, fileName);
	//
	// }

	static int addCodeHeader(Row row1, int offset, String prefix) {
		row1.createCell(offset++).setCellValue(prefix + " Text");
		row1.createCell(offset++).setCellValue(prefix + " Display Name");
		row1.createCell(offset++).setCellValue(prefix + " Code");
		row1.getSheet().setColumnHidden(offset - 1, hideColumns);
		row1.createCell(offset++).setCellValue(prefix + " Code System");
		row1.getSheet().setColumnHidden(offset - 1, hideColumns);
		row1.createCell(offset++).setCellValue(prefix + " Code System Name");
		row1.getSheet().setColumnHidden(offset - 1, hideColumns);
		row1.createCell(offset++).setCellValue(prefix + " Location");
		row1.getSheet().setColumnHidden(offset - 1, hideColumns);
		return offset;
	}

	// static int addCodeHeader2(Row row1, int offset, String prefix) {
	// row1.createCell(offset++).setCellValue(prefix + " Text");
	// row1.createCell(offset++).setCellValue("Code");
	// row1.getSheet().setColumnHidden(offset - 1, hideColumns);
	// row1.createCell(offset++).setCellValue("Code System");
	// row1.getSheet().setColumnHidden(offset - 1, hideColumns);
	// row1.createCell(offset++).setCellValue("Code System Name");
	// row1.getSheet().setColumnHidden(offset - 1, hideColumns);
	// row1.createCell(offset++).setCellValue("Location");
	// row1.getSheet().setColumnHidden(offset - 1, hideColumns);
	// return offset;
	// }

	static int addSectionHeader(Row row1, int offset) {
		row1.createCell(offset++).setCellValue("Section Title");
		row1.createCell(offset++).setCellValue("File Name");
		row1.createCell(offset++).setCellValue("Narrative");

		return offset;
	}

	public static int createCarePlanHeader(Row row1, Row row2, int offset) {

		row2.createCell(offset++).setCellValue("Panel ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Panel");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Vital Sign ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Vital Sign");
		row2.createCell(offset++).setCellValue("Result");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Range");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addSectionHeader(row2, offset);
		return offset;

	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 * @return
	 */
	public static int createClinicalStatmentHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Code");
		row2.createCell(offset++).setCellValue("Performer");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Section Title");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;
	}

	public static int createFamilyHistoryHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Organizer ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Description");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Observation ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Value");
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	public static int createGoalsSectionHeader(Row row1, Row row2, int offset) {
		// row2.createCell(offset++).setCellValue("Organizer ID");
		// row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Description");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Observation ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Value");
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 */
	public static int createVitalSignsHeader(Row row1, Row row2, int offset) {

		row2.createCell(offset++).setCellValue("Panel ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Panel");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Vital Sign ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Vital Sign");
		row2.createCell(offset++).setCellValue("Result");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Range");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addSectionHeader(row2, offset);
		return offset;

	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 * @return
	 */
	public static int createPlanOfCareActivityObservationHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Observation");
		row2.createCell(offset++).setCellValue("Value");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		row2.createCell(offset++).setCellValue("Range");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 * @return
	 */
	public static int createInstructionsHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		row2.createCell(offset++).setCellValue("Location");
		row2.getSheet().setColumnHidden(offset - 1, hideColumns);
		offset = addCodeHeader(row2, offset, "Code");
		row2.createCell(offset++).setCellValue("Performer");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Section Title");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;
	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 * @return
	 */
	public static int createNarrativeHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Narrative");
		row2.createCell(offset++).setCellValue("Section Title");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;
	}

}

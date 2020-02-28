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

import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.cda.xml.ui.handlers.AnalyzeCDAHandler.CDAAnalaysisInput.CDAMetrics;
import org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.DocumentMetadata;
import org.eclipse.mdht.cda.xml.ui.handlers.html.HTMLToExcel;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Consumable;
import org.eclipse.mdht.uml.cda.DocumentationOf;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.InFulfillmentOf;
import org.eclipse.mdht.uml.cda.InformationRecipient;
import org.eclipse.mdht.uml.cda.LanguageCommunication;
import org.eclipse.mdht.uml.cda.ManufacturedProduct;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Patient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Performer1;
import org.eclipse.mdht.uml.cda.Performer2;
import org.eclipse.mdht.uml.cda.Procedure;
import org.eclipse.mdht.uml.cda.ReferenceRange;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.Specimen;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.cda.Supply;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.ON;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

/**
 * @author seanmuir
 *
 */
public class SpreadsheetSerializer {

	/**
	 * @param query
	 * @param demographicsSheet
	 * @param patientRole
	 * @param ir
	 * @param iffo
	 * @param string
	 */
	public static void appendToDemographicsSheet(Query query, SXSSFSheet sheet, DocumentMetadata documentMetadata,
			PatientRole patientRole) {

		Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		int offset = serializePatient2(row, 0, documentMetadata, patientRole);
		/*
		 * race
		 * gender
		 * patient name
		 * address
		 * dob XXX
		 * phone #
		 * ethnicity
		 * document id XXX
		 * language
		 * phone #
		 */
		serializeSectionAndFileName(row, offset, null, documentMetadata.fileName);

	}

	/**
	 * @param query
	 * @param sheet
	 * @param documentMetadata
	 * @param patientRole
	 * @param serviceEvent
	 * @param organizers
	 * @param encounters
	 * @param fileName
	 */
	public static void appendToEncounterSheet(Query query, Sheet sheet, DocumentMetadata documentMetadata,
			PatientRole patientRole, ServiceEvent serviceEvent, EList<Organizer> organizers, List<Encounter> encounters,
			String fileName) {

		for (Encounter encounter : encounters) {
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = serializePatient(row, 0, documentMetadata, patientRole);
			offset = serializeEncounter(row, offset, encounter);
			offset = serializeSectionAndFileName(row, offset, encounter.getSection(), fileName);
			offset = appendValidation(row, offset, encounter);

		}

	}

	/**
	 * @param row
	 * @param offset
	 * @param text
	 * @return
	 */
	public static int serializeStrucDocText(Row row, int offset, StrucDocText text) {

		if (text != null && !StringUtils.isEmpty(text.getText())) {
			String narrative = text.getText();
			HTMLToExcel hte = new HTMLToExcel();
			RichTextString s = hte.fromHtmlToCellValue(narrative, row.getSheet().getWorkbook());
			row.createCell(offset++).setCellValue(s);
		} else {
			row.createCell(offset++).setCellValue("No Narrative");
		}

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param act
	 * @return
	 */
	public static int serializeClinicalStatement(Row row, int offset, Act act) {
		StringBuffer sb = new StringBuffer();

		for (II ii : act.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(act.getEffectiveTime()));
		if (d != null) {

			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
			row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(act.getEffectiveTime()));
		} else {
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
		}

		offset = SpreadsheetSerializer.appendCode(row, offset, act.getSection(), act.getCode(), act.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : act.getPerformers()) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + CDAValueUtil.getValues(on);
					}
				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = CDAValueUtil.getValues(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);

		row.createCell(offset++).setCellValue(organizationValue);

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param act
	 * @return
	 */
	public static int serializeClinicalStatement(Row row, int offset, Observation observation) {
		StringBuffer sb = new StringBuffer();

		for (II ii : observation.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(observation.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
			row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(observation.getEffectiveTime()));
		} else {
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
		}

		offset = SpreadsheetSerializer.appendCode(
			row, offset, observation.getSection(), observation.getCode(), observation.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : observation.getPerformers()) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + CDAValueUtil.getValues(on);
					}
				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = CDAValueUtil.getValues(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);

		row.createCell(offset++).setCellValue(organizationValue);

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param organizer
	 * @return
	 */
	public static int serializeClinicalStatement(Row row, int offset, Organizer organizer) {
		StringBuffer sb = new StringBuffer();

		for (II ii : organizer.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(organizer.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
			row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(organizer.getEffectiveTime()));
		} else {
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
		}

		offset = SpreadsheetSerializer.appendCode(row, offset, organizer.getSection(), organizer.getCode(), null);

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : organizer.getPerformers()) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + CDAValueUtil.getValues(on);
					}
				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = CDAValueUtil.getValues(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);

		row.createCell(offset++).setCellValue(organizationValue);

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param procedure
	 * @return
	 */
	public static int serializeClinicalStatement(Row row, int offset, Procedure procedure) {
		StringBuffer sb = new StringBuffer();

		for (II ii : procedure.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(procedure.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
			row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(procedure.getEffectiveTime()));
		} else {
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
		}

		offset = SpreadsheetSerializer.appendCode(
			row, offset, procedure.getSection(), procedure.getCode(), procedure.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : procedure.getPerformers()) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + CDAValueUtil.getValues(on);
					}
				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = CDAValueUtil.getValues(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);

		row.createCell(offset++).setCellValue(organizationValue);

		return offset;
	}

	public static int serializeClinicalStatement(Row row, int offset, SubstanceAdministration substanceAdministration) {
		StringBuffer sb = new StringBuffer();

		for (II ii : substanceAdministration.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		String time = "";
		EObject source = null;
		for (SXCM_TS t : substanceAdministration.getEffectiveTimes()) {
			source = t;
			if (!StringUtils.isEmpty(t.getValue())) {
				time = t.getValue();

			}

			if (t instanceof IVL_TS) {

				time = CDAValueUtil.getValueAsString((IVL_TS) t);

			}

		}

		Date d = CDAValueUtil.getDate(time);

		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
			row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(source));
		} else {
			row.createCell(offset++).setCellValue(time);
			row.createCell(offset++).setCellValue("");
		}

		offset = SpreadsheetSerializer.appendCode(
			row, offset, substanceAdministration.getSection(), substanceAdministration.getCode(),
			substanceAdministration.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : substanceAdministration.getPerformers()) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + CDAValueUtil.getValues(on);
					}
				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = CDAValueUtil.getValues(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);

		row.createCell(offset++).setCellValue(organizationValue);

		return offset;
	}

	// private static void appendToCarePlanSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
	// PatientRole patientRole, ServiceEvent serviceEvent, List<Organizer> vitalSignsOrganizers,
	// List<Encounter> encounters, String fileName) {
	//
	// }

	/**
	 * @param row
	 * @param offset
	 * @param observation
	 * @param encounters
	 * @return
	 */
	public static int serializeEnounterID(Row row, int offset, Observation observation, List<Encounter> encounters) {
		for (Encounter encounter : encounters) {
			MatchEncounterBy result = EncounterUtil.matchesEncounter(encounter, observation);
			if (result != MatchEncounterBy.NOMATCH) {
				offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter, result);
				return offset;
			}
		}

		Cell cell = row.createCell(offset++);
		cell = row.createCell(offset++);
		cell.setCellValue(MatchEncounterBy.NOMATCH.getMatch());
		return offset++;
	}

	/**
	 * @param row
	 * @param offset
	 * @param organizer
	 * @param encounters
	 * @return
	 */
	public static int serializeEnounterID(Row row, int offset, Organizer organizer, List<Encounter> encounters) {
		for (Encounter encounter : encounters) {
			MatchEncounterBy result = EncounterUtil.matchesEncounter(encounter, organizer);
			if (result != MatchEncounterBy.NOMATCH) {
				offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter, result);
				return offset;
			}
		}

		Cell cell = row.createCell(offset++);
		cell = row.createCell(offset++);
		cell.setCellValue(MatchEncounterBy.NOMATCH.getMatch());
		return offset++;
	}

	/**
	 * @param row
	 * @param offset
	 * @param procedure
	 * @param encounters
	 * @return
	 */
	public static int serializeEnounterID(Row row, int offset, Procedure procedure, List<Encounter> encounters) {
		for (Encounter encounter : encounters) {
			MatchEncounterBy result = EncounterUtil.matchesEncounter(encounter, procedure);
			if (result != MatchEncounterBy.NOMATCH) {
				offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter, result);
				return offset;
			}
		}

		Cell cell = row.createCell(offset++);
		cell = row.createCell(offset++);
		cell.setCellValue(MatchEncounterBy.NOMATCH.getMatch());
		return offset++;
	}

	/**
	 * @param row
	 * @param offset
	 * @param planOfCareActivitySubstanceAdministration
	 * @param encounters
	 * @return
	 */
	public static int serializeEnounterID(Row row, int offset, SubstanceAdministration substanceAdministration,
			List<Encounter> encounters) {
		for (Encounter encounter : encounters) {
			MatchEncounterBy result = EncounterUtil.matchesEncounter(encounter, substanceAdministration);
			if (result != MatchEncounterBy.NOMATCH) {
				offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter, result);
				return offset;
			}
		}

		Cell cell = row.createCell(offset++);
		cell = row.createCell(offset++);
		cell.setCellValue(MatchEncounterBy.NOMATCH.getMatch());
		return offset++;
	}

	/**
	 * @param row
	 * @param offset
	 * @param supply
	 * @param encounters
	 * @return
	 */
	public static int serializeEnounterID(Row row, int offset, Supply supply, List<Encounter> encounters) {
		for (Encounter encounter : encounters) {
			MatchEncounterBy result = EncounterUtil.matchesEncounter(encounter, supply);
			if (result != MatchEncounterBy.NOMATCH) {
				offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter, result);
				return offset;
			}
		}

		Cell cell = row.createCell(offset++);
		cell = row.createCell(offset++);
		cell.setCellValue(MatchEncounterBy.NOMATCH.getMatch());
		return offset++;
	}

	public static int serializeProblemObservationClinicalStatement(Row row, int offset,
			Observation problemObservation) {
		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		Date d;
		for (II ii : problemObservation.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		// ID
		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivlts = problemObservation.getEffectiveTime();

		if (ivlts != null) {

			if (ivlts.getValue() != null) {
				if (!StringUtils.isEmpty(ivlts.getValue())) {

					d = CDAValueUtil.getDate(ivlts.getValue());

					;

					sb.append(CDAValueUtil.DATE_PRETTY.format(d));
				}

			}
			if (ivlts.getLow() != null) {
				if (!StringUtils.isEmpty(ivlts.getLow().getValue())) {

					d = CDAValueUtil.getDate(ivlts.getLow().getValue());

					;

					sb.append(CDAValueUtil.DATE_PRETTY.format(d));
				}

			}
			if (ivlts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivlts.getHigh().getValue())) {

					d = CDAValueUtil.getDate(ivlts.getHigh().getValue());
					if (sb.length() > 0) {
						sb.append(" - ");
					}
					sb.append(CDAValueUtil.DATE_PRETTY.format(d));
				}
			}
		}

		cell.setCellValue(sb.toString());

		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(ivlts));

		CD problemCode = null;

		for (ANY any : problemObservation.getValues()) {
			if (any instanceof CD) {
				problemCode = (CD) any;
			}
		}
		offset = SpreadsheetSerializer.appendCode(
			row, offset, problemObservation.getSection(), problemCode, problemObservation.getText());

		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, problemObservation.getAuthors());

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param supply
	 * @return
	 */
	public static int serializeSupply(Row row, int offset, Supply supply) {
		StringBuffer sb = new StringBuffer();

		for (II ii : supply.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		offset = SpreadsheetSerializer.appendCode(row, offset, supply.getSection(), supply.getCode(), supply.getText());

		if (supply.getStatusCode() != null && !StringUtils.isEmpty(supply.getStatusCode().getCode())) {
			row.createCell(offset++).setCellValue(supply.getStatusCode().getCode());
		} else {
			row.createCell(offset++).setCellValue("Missing Status");
		}

		EObject source = null;
		String time = "";
		for (SXCM_TS t : supply.getEffectiveTimes()) {
			source = t;
			if (!StringUtils.isEmpty(t.getValue())) {
				time = t.getValue();

			}

			if (t instanceof IVL_TS) {

				time = CDAValueUtil.getValueAsString((IVL_TS) t);

			}

		}

		Date d = CDAValueUtil.getDate(time);

		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
			row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(source));
		} else {
			row.createCell(offset++).setCellValue(time);
			row.createCell(offset++).setCellValue("");
		}

		// row.createCell(offset++).setCellValue(GenerateCDADataHandler.sigSwitch.doSwitch(substanceAdministration));
		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, supply.getAuthors());

		return offset;
	}

	/**
	 * @param query
	 * @param sheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param procedureActivityActs
	 * @param encounters
	 * @param fileName
	 */

	static int appendCode(Row row, int offset, Section setion, CD cd, ED ed) {

		;

		if (cd != null) {
			// If original text is not supplied - see if the ed was supplied
			ED theED = (cd.getOriginalText() != null
					? cd.getOriginalText()
					: ed);

			if (setion != null || ed != null) {
				row.createCell(offset++).setCellValue(CDAValueUtil.getValue(setion, theED));
			} else {
				row.createCell(offset++).setCellValue("");
			}

			// Display Name
			row.createCell(offset++).setCellValue(CDAValueUtil.getValueAsString(setion, cd));
			// Code
			row.createCell(offset++).setCellValue(cd.getCode());
			// Code System
			row.createCell(offset++).setCellValue(cd.getCodeSystem());
			// Code System Name
			row.createCell(offset++).setCellValue(cd.getCodeSystemName());

			// WHERE
			row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(cd));

		} else {
			if (setion != null || ed != null) {
				row.createCell(offset++).setCellValue("");
			}
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");

		}

		return offset;
	}

	/**
	 * @param query
	 * @param sheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param procedureActivityObservations
	 * @param encounters
	 * @param fileName
	 */

	static int appendOrganizationAndAuthor(Row row, int offset, EList<Author> authors) {
		String organization = CDAValueUtil.getValue(authors, GenerateCDADataHandler.PorO.ORGANIZATION);
		String person = CDAValueUtil.getValue(authors, GenerateCDADataHandler.PorO.PERSON);
		row.createCell(offset++).setCellValue(organization);
		row.createCell(offset++).setCellValue(person);
		return offset;
	}

	/**
	 * @param query
	 * @param sheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param procedureActivityProcedures
	 * @param encounters
	 * @param fileName
	 */
	static void appendProcedureToProcedureSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, EList<Procedure> procedureActivityProcedures,
			List<Encounter> encounters, String fileName) {

		for (Procedure sa : procedureActivityProcedures) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeProcedureActivityProcedure(row, offset, sa);

			offset = serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

			offset = appendValidation(row, offset, sa);

		}

	}

	/**
	 * @param wb
	 * @param patientRole
	 * @param encounters
	 */
	static void appendToEncounterSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, List<Encounter> encounters, String fileName) {

		for (Encounter encoutner : encounters) {

			if (encoutner.getEffectiveTime() != null) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
				offset = serializeEncounter(row, offset, encoutner);
				serializeSectionAndFileName(row, offset, encoutner.getSection(), fileName);
				offset = appendValidation(row, offset, encoutner);
			}
		}
	}

	static DocumentMetadata appendToPatientSheet(Query query, Sheet sheet, PatientRole patientRole,
			InformationRecipient ir, InFulfillmentOf iffo, String fileName) {

		DocumentMetadata documentMetadata = new DocumentMetadata();

		ClinicalDocument cd = query.getEObject(ClinicalDocument.class);

		documentMetadata.documentRootID = CDAValueUtil.getAnyValue(null, cd.getId());

		// Date documentDate = null;
		if (cd.getEffectiveTime() != null && !StringUtils.isEmpty(cd.getEffectiveTime().getValue())) {
			documentMetadata.documentDate = CDAValueUtil.getDate(cd.getEffectiveTime().getValue()); // documentDate = DATE_FORMAT12.format(date);
		}

		if (cd instanceof GeneralHeaderConstraints) {
			documentMetadata.documentLibrary = "C-CDA";
			// row.createCell(offset++).setCellValue("C-CDA");
		} else {
			documentMetadata.documentLibrary = "C32";
			// row.createCell(offset++).setCellValue("C32");
		}

		if (cd != null && cd.getCode() != null) {
			documentMetadata.documentType = cd.getCode().getDisplayName();
			// row.createCell(offset++).setCellValue(cd.getCode().getDisplayName());
		} else {
			documentMetadata.documentType = "MISSING";
			// row.createCell(offset++).setCellValue("");
		}

		documentMetadata.fileName = fileName;

		// String documentOrganization = "";
		// String documentSoftware = "";
		if (!cd.getAuthors().isEmpty()) {

			for (Author a : cd.getAuthors()) {
				if (a.getAssignedAuthor() != null) {
					AssignedAuthor aa = a.getAssignedAuthor();
					if (aa.getRepresentedOrganization() != null) {
						for (ON on : aa.getRepresentedOrganization().getNames()) {
							documentMetadata.documentOrganization = CDAValueUtil.getValues(on);
						}
					}

					if (aa.getAssignedAuthoringDevice() != null) {
						if (aa.getAssignedAuthoringDevice().getManufacturerModelName() != null) {
							documentMetadata.documentSoftware = aa.getAssignedAuthoringDevice().getManufacturerModelName().getText();
						}
						if (aa.getAssignedAuthoringDevice().getSoftwareName() != null) {
							documentMetadata.documentSoftware = documentMetadata.documentSoftware + " " +
									aa.getAssignedAuthoringDevice().getSoftwareName().getText();
						}
					}
				}

			}

		}

		// Setup primary care provider
		for (DocumentationOf documentationOf : cd.getDocumentationOfs()) {
			if (documentationOf.getServiceEvent() != null) {
				for (Performer1 performer : documentationOf.getServiceEvent().getPerformers()) {
					if (performer.getFunctionCode() != null &&
							!StringUtils.isEmpty(performer.getFunctionCode().getCode())) {

						if ("PCP".equals(performer.getFunctionCode().getCode())) {
							if (performer.getAssignedEntity() != null) {
								for (AD ad : performer.getAssignedEntity().getAddrs()) {
									documentMetadata.pcpAddress = CDAValueUtil.getValues(ad);
									break;
								}
								if (performer.getAssignedEntity().getAssignedPerson() != null) {
									for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
										documentMetadata.pcpName = CDAValueUtil.getValues(pn);
										break;
									}
								}
							}
						}

					}

				}

			}

		}

		Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);

		String name1 = "";
		String name2 = "";
		if (ir != null && ir.getIntendedRecipient() != null) {
			if (ir.getIntendedRecipient().getInformationRecipient() != null) {
				for (PN pn : ir.getIntendedRecipient().getInformationRecipient().getNames()) {
					name1 = CDAValueUtil.getAnyValue(null, pn);
					break;
				}
				if (ir.getIntendedRecipient() != null && ir.getIntendedRecipient().getReceivedOrganization() != null &&
						ir.getIntendedRecipient().getReceivedOrganization().getNames() != null) {
					for (ON on : ir.getIntendedRecipient().getReceivedOrganization().getNames()) {
						name2 = CDAValueUtil.getAnyValue(null, on);
						break;
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(name1);
		row.createCell(offset++).setCellValue(name2);

		String orderId = "";
		if (iffo != null && iffo.getOrder() != null) {
			for (II ii : iffo.getOrder().getIds()) {
				orderId = CDAValueUtil.getAnyValue(null, ii);
			}

		}

		row.createCell(offset++).setCellValue(orderId);

		SpreadsheetSerializer.serializeSectionAndFileName(row, offset, null, fileName);

		return documentMetadata;
	}

	static void appendToResultsSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<? extends Organizer> results,
			List<Encounter> encounters, String fileName) {
		for (Organizer sa : results) {
			for (Observation resultObservation : sa.getObservations()) {
				int offset = 0;
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				offset = serializePatient(row, offset, organizationAndSoftware, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);
				offset = serializeOrganizer(row, offset, sa, true, false);
				offset = serializeObservation(row, offset, resultObservation);
				offset = serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
				offset = appendValidation(row, offset, sa);
			}
		}
	}

	/**
	 * @param wb
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param fileName
	 */
	static void appendToSubstanceAdministrationSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters,
			List<? extends SubstanceAdministration> sas, String fileName) {
		for (SubstanceAdministration sa : sas) {
			int offset = 0;
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			offset = serializePatient(row, offset, organizationAndSoftware, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);
			offset = serializeSubstanceAdministration(row, offset, sa);
			offset = serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			offset = appendValidation(row, offset, sa);
		}
	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param vitalSignsOrganizers
	 * @param encounters2
	 * @param fileName2
	 */
	static void appendToVitalSignsSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Organizer> vitalSignsOrganizers,
			List<Encounter> encounters, String fileName) {

		for (Organizer organizer : vitalSignsOrganizers) {

			for (Observation observation : organizer.getObservations()) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, organizer, encounters);
				offset = serializeOrganizer(row, offset, organizer, false, false);
				offset = serializeObservation(row, offset, observation);
				serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
				offset = appendValidation(row, offset, observation);
			}

		}
	}

	static void handleDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		switch (diagnostic.getSeverity()) {
			case Diagnostic.ERROR:
				handler.handleError(diagnostic);
				break;
			case Diagnostic.WARNING:
				handler.handleWarning(diagnostic);
				break;
			case Diagnostic.INFO:
				handler.handleInfo(diagnostic);
				break;
		}
	}

	static void processDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		Queue<Diagnostic> queue = new LinkedList<Diagnostic>();
		queue.add(diagnostic); // root
		while (!queue.isEmpty()) {
			Diagnostic d = queue.remove();
			if (GenerateCDADataHandler.shouldHandle(d)) {
				handleDiagnostic(d, handler); // visit
			}
			for (Diagnostic childDiagnostic : d.getChildren()) { // process successors
				queue.add(childDiagnostic);
			}
		}
	}

	static int serializeDianostic(Row row, int offset, Diagnostic diagnostic) {

		ValidationResult vr = new ValidationResult();

		StringBuffer sb = new StringBuffer();

		if (diagnostic.getChildren().size() > 0) {
			SpreadsheetSerializer.processDiagnostic(diagnostic, vr);
		}

		sb = new StringBuffer();

		for (Diagnostic dq : vr.getErrorDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}
		row.createCell(offset++).setCellValue(sb.toString());
		sb = new StringBuffer();
		for (Diagnostic dq : vr.getWarningDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}

		for (Diagnostic dq : vr.getInfoDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}

		row.createCell(offset++).setCellValue(sb.toString());

		return offset;
	}

	static int serializeDocumentMetadata(Row row, int offset, DocumentMetadata documentMetadata) {
		return serializeDocumentMetadata(row, offset, documentMetadata, true);
	}

	static int serializeDocumentMetadata(Row row, int offset, DocumentMetadata documentMetadata, boolean filename) {

		Cell cell = null;

		if (filename) {
			cell = row.createCell(offset++);
			cell.setCellValue(documentMetadata.fileName);

			cell = row.createCell(offset++);
			cell.setCellValue(documentMetadata.documentRootID);
		}

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentLibrary);

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentType);

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentOrganization);

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentSoftware);

		if (documentMetadata.documentDate != null) {
			cell = row.createCell(offset++);
			cell.setCellStyle(CDAValueUtil.getDocumentDateStyle(row.getSheet()));
			cell.setCellValue(documentMetadata.documentDate);
		} else {
			row.createCell(offset++);
		}

		if (documentMetadata.pcpName != null) {
			cell = row.createCell(offset++);
			cell.setCellValue(documentMetadata.pcpName);
		} else {
			row.createCell(offset++);
		}

		if (documentMetadata.pcpAddress != null) {
			cell = row.createCell(offset++);
			cell.setCellValue(documentMetadata.pcpAddress);
		} else {
			row.createCell(offset++);
		}

		return offset;
	}

	static int serializeEncounter(Row row, int offset, Encounter encounter) {

		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : encounter.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivlts = encounter.getEffectiveTime();

		if (ivlts != null) {

			if (ivlts.getValue() != null) {
				if (!StringUtils.isEmpty(ivlts.getValue())) {

					Date d = CDAValueUtil.getDate(ivlts.getValue());
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					}
				}

			}
			if (ivlts.getLow() != null) {
				if (!StringUtils.isEmpty(ivlts.getLow().getValue())) {
					Date d = CDAValueUtil.getDate(ivlts.getLow().getValue());
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					} else {
						sb.append(ivlts.getLow().getValue());
					}

				}

			}
			if (ivlts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivlts.getHigh().getValue())) {

					Date d = CDAValueUtil.getDate(ivlts.getHigh().getValue());
					if (sb.length() > 0) {
						sb.append(" - ");
					}
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					} else {
						sb.append(ivlts.getHigh().getValue());
					}
				}
			}
		}

		cell.setCellValue(sb.toString());

		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(ivlts));

		offset = SpreadsheetSerializer.appendCode(
			row, offset, encounter.getSection(), encounter.getCode(), encounter.getText());

		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, encounter.getAuthors());

		return offset;

	}

	static int serializeEncounterID(Row row, int offset, Encounter encounter, MatchEncounterBy result) {

		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : encounter.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);
		cell.setCellValue(result.getMatch());

		return offset;

	}

	static int serializeEnounterID(Row row, int offset, Act act, List<Encounter> encounters) {
		for (Encounter encounter : encounters) {
			MatchEncounterBy result = EncounterUtil.matchesEncounter(encounter, act);
			if (result != MatchEncounterBy.NOMATCH) {
				offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter, result);
				return offset;
			}
		}

		Cell cell = row.createCell(offset++);
		cell = row.createCell(offset++);
		cell.setCellValue(MatchEncounterBy.NOMATCH.getMatch());
		return offset++;
	}

	static int serializeObservation(Row row, int offset, Observation resultObservation) {
		return serializeObservation(row, offset, resultObservation, true);
	}

	/**
	 * @param row
	 * @param offset
	 * @param resultObservation
	 * @return
	 */
	static int serializeObservation(Row row, int offset, Observation resultObservation, boolean referenceRange) {

		/*
		 *
		 * row2.createCell(offset++).setCellValue("ID");
		 * row2.createCell(offset++).setCellValue("Test");
		 * row2.createCell(offset++).setCellValue("Description");
		 * row2.createCell(offset++).setCellValue("Result");
		 * // undo to go back to two rows for headers row1.getSheet().addMergedRegion(new CellRangeAddress(0, 0, secondColumn, offset));
		 * row2.createCell(offset++).setCellValue("Range");
		 *
		 */
		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : resultObservation.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		// ID
		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivlts = resultObservation.getEffectiveTime();

		if (ivlts != null) {

			if (ivlts.getValue() != null) {
				if (!StringUtils.isEmpty(ivlts.getValue())) {

					Date d = CDAValueUtil.getDate(ivlts.getValue());
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					}
				}

			}
			if (ivlts.getLow() != null) {
				if (!StringUtils.isEmpty(ivlts.getLow().getValue())) {

					Date d = CDAValueUtil.getDate(ivlts.getLow().getValue());
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					}
				}

			}
			if (ivlts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
					Date d = CDAValueUtil.getDate(ivlts.getHigh().getValue());
					if (sb.length() > 0) {
						sb.append(" - ");
					}
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					}
				}
			}
		}

		// Date
		cell.setCellValue(sb.toString());

		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(ivlts));

		offset = SpreadsheetSerializer.appendCode(
			row, offset, resultObservation.getSection(), resultObservation.getCode(), resultObservation.getText());

		String value = "";
		String valueLocation = "";
		for (ANY any : resultObservation.getValues()) {
			value = CDAValueUtil.getAnyValue(resultObservation.getSection(), any);
			valueLocation = CDAUtil.getDomainPath(any);
		}
		if (value.length() < 1000) {
			row.createCell(offset++).setCellValue(value);
		} else {
			row.createCell(offset++).setCellValue(value.substring(0, 1000));
		}

		row.createCell(offset++).setCellValue(valueLocation);

		String referenceRangeValue = "";
		ANY anyRangeValue = null;
		for (ReferenceRange rr : resultObservation.getReferenceRanges()) {

			if (rr.getObservationRange() != null && rr.getObservationRange().getValue() != null) {
				anyRangeValue = rr.getObservationRange().getValue();
				referenceRangeValue = CDAValueUtil.getAnyValue(
					resultObservation.getSection(), rr.getObservationRange().getValue());
			}

		}

		if (referenceRange) {
			row.createCell(offset++).setCellValue(referenceRangeValue);
			row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(anyRangeValue));

		}

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param serializeSpecimen
	 * @param sa
	 * @return
	 */
	static int serializeOrganizer(Row row, int offset, Organizer resultOrganizer, boolean serializeSpecimen,
			boolean serializeSubject) {

		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : resultOrganizer.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		// ID
		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivlts = resultOrganizer.getEffectiveTime();

		if (ivlts != null) {

			if (ivlts.getValue() != null) {
				if (!StringUtils.isEmpty(ivlts.getValue())) {
					Date d = CDAValueUtil.getDate(ivlts.getValue());
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					}
				}

			}
			if (ivlts.getLow() != null) {
				if (!StringUtils.isEmpty(ivlts.getLow().getValue())) {
					Date d = CDAValueUtil.getDate(ivlts.getLow().getValue());
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					}
				}

			}
			if (ivlts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
					Date d = CDAValueUtil.getDate(ivlts.getHigh().getValue());
					if (sb.length() > 0) {
						sb.append(" - ");
					}
					if (d != null) {
						sb.append(CDAValueUtil.DATE_PRETTY.format(d));
					}
				}
			}
		}

		cell.setCellValue(sb.toString());
		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(ivlts));

		offset = SpreadsheetSerializer.appendCode(
			row, offset, resultOrganizer.getSection(), resultOrganizer.getCode(), null);

		if (serializeSubject) {

			if (resultOrganizer.getSubject() != null && resultOrganizer.getSubject().getRelatedSubject() != null) {
				offset = SpreadsheetSerializer.appendCode(
					row, offset, resultOrganizer.getSection(),
					resultOrganizer.getSubject().getRelatedSubject().getCode(), null);
			} else {
				offset = SpreadsheetSerializer.appendCode(row, offset, resultOrganizer.getSection(), null, null);
			}
			// resultOrganizer.getSubject().get

		}
		// row.createCell(offset++).setCellValue(
		// getValueAsString(resultOrganizer.getSection(), resultOrganizer.getCode()));
		// place holder encounter description
		// row.createCell(offset++).setCellValue(getValue(resultOrganizer.getSection(), ));

		if (serializeSpecimen) {
			CD specimenCode = null;
			for (Specimen specimen : resultOrganizer.getSpecimens()) {

				if (specimen.getSpecimenRole() != null &&
						specimen.getSpecimenRole().getSpecimenPlayingEntity() != null) {
					specimenCode = specimen.getSpecimenRole().getSpecimenPlayingEntity().getCode();

					break;
				}

			}

			offset = SpreadsheetSerializer.appendCode(row, offset, resultOrganizer.getSection(), specimenCode, null);
		}
		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, resultOrganizer.getAuthors());
		return offset;
	}

	static int serializePatient(Row row, int offset, DocumentMetadata documentMetadata, PatientRole patientRole) {

		Cell cell = row.createCell(offset++);
		cell.setCellValue(row.getRowNum() - 1);

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.fileName);

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentRootID);

		cell = row.createCell(offset++);
		StringBuffer sb = new StringBuffer();
		if (patientRole != null) {
			for (II ii : patientRole.getIds()) {
				if (!"2.16.840.1.113883.4.1".equals(ii.getRoot())) {
					sb.append(CDAValueUtil.getKey2(ii));
					break;
				}
			}
		}
		cell.setCellValue(sb.toString());
		if (!GenerateCDADataHandler.omitDOB) {
			offset = SpreadsheetSerializer.serializePatientDOB(
				row, offset, patientRole, (patientRole != null
						? patientRole.getPatient()
						: null));
		}
		;

		if (documentMetadata != null) {
			offset = SpreadsheetSerializer.serializeDocumentMetadata(row, offset, documentMetadata, false);
		}
		return offset;
	}

	static int serializePatient(Row row, int offset, PatientRole patientRole) {
		return serializePatient(row, offset, null, patientRole);
	}

	/*
	 * race xx
	 * gender xx
	 * patient name
	 * address
	 * dob XXX
	 * phone #
	 * ethnicity
	 * document id XXX
	 * language
	 * phone #
	 */
	static int serializePatient2(Row row, int offset, DocumentMetadata documentMetadata, PatientRole patientRole) {

		offset = serializePatient(row, offset, documentMetadata, patientRole);

		if (patientRole != null) {
			if (patientRole.getPatient() != null) {

				Cell cell = row.createCell(offset++);
				if (!patientRole.getPatient().getNames().isEmpty()) {
					cell.setCellValue(CDAValueUtil.getValues(patientRole.getPatient().getNames().get(0)));
				}

				cell = row.createCell(offset++);
				if (!patientRole.getAddrs().isEmpty()) {
					cell.setCellValue(CDAValueUtil.getValues(patientRole.getAddrs().get(0)));
				}

				if (patientRole.getPatient().getRaceCode() != null) {
					offset = SpreadsheetSerializer.appendCode(
						row, offset, null, patientRole.getPatient().getRaceCode(), null);
				}

				if (patientRole.getPatient().getEthnicGroupCode() != null) {
					offset = SpreadsheetSerializer.appendCode(
						row, offset, null, patientRole.getPatient().getEthnicGroupCode(), null);
				}

				if (patientRole.getPatient().getAdministrativeGenderCode() != null) {
					offset = SpreadsheetSerializer.appendCode(
						row, offset, null, patientRole.getPatient().getAdministrativeGenderCode(), null);
				}

				if (patientRole.getPatient().getMaritalStatusCode() != null) {
					offset = SpreadsheetSerializer.appendCode(
						row, offset, null, patientRole.getPatient().getMaritalStatusCode(), null);
				}

				if (!patientRole.getPatient().getLanguageCommunications().isEmpty()) {
					LanguageCommunication preferredLanguage = null;
					for (LanguageCommunication lc : patientRole.getPatient().getLanguageCommunications()) {
						if (preferredLanguage == null && lc.getLanguageCode() != null) {
							// get one first one with code as default
							preferredLanguage = lc;
						}
						if (lc.getLanguageCode() != null && lc.getPreferenceInd() != null &&
								lc.getPreferenceInd().getValue()) {
							preferredLanguage = lc;
							// found preferred
							break;
						}
					}
					if (preferredLanguage != null && preferredLanguage.getLanguageCode() != null) {
						offset = SpreadsheetSerializer.appendCode(
							row, offset, null, preferredLanguage.getLanguageCode(), null);
					}
				}

				cell = row.createCell(offset++);
				if (!patientRole.getTelecoms().isEmpty()) {
					cell.setCellValue(CDAValueUtil.getValueAsString(patientRole.getTelecoms().get(0)));
				} else {
					cell.setCellValue("");
				}
			}

		}
		return offset;
	}

	static int serializePatientDOB(Row row, int offset, PatientRole patientRole, Patient patient) {

		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();

		if (patientRole != null) {
			for (II ii : patientRole.getIds()) {
				if (!"2.16.840.1.113883.4.1".equals(ii.getRoot())) {
					sb.append(CDAValueUtil.getKey3(ii));
				}
			}
		}
		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);
		if (patient != null && patient.getNames() != null && !patient.getNames().isEmpty()) {
			cell.setCellValue(CDAValueUtil.getValues(patient.getNames().get(0)));
		}

		cell = row.createCell(offset++);

		if (patient != null && patient.getBirthTime() != null) {

			Date d = CDAValueUtil.getDate(patient.getBirthTime().getValue());
			if (d != null) {
				cell.setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
			} else {
				cell.setCellValue(patient.getBirthTime().getValue());
			}
		}

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeProcedureActivityAct(Row row, int offset, Act procedureActivityAct) {
		StringBuffer sb = new StringBuffer();

		for (II ii : procedureActivityAct.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(procedureActivityAct.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(procedureActivityAct.getEffectiveTime()));

		offset = SpreadsheetSerializer.appendCode(
			row, offset, procedureActivityAct.getSection(), procedureActivityAct.getCode(),
			procedureActivityAct.getText());

		offset = appendProcedurePerformaerAndOrganization(row, offset, procedureActivityAct.getPerformers());
		return offset;
	}

	static int appendProcedurePerformaerAndOrganization(Row row, int offset, EList<Performer2> performers) {
		String organizationValue = "";
		String organizationValueLocation = "";
		String personValue = "";
		String personValueLocation = "";
		for (Performer2 performer : performers) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + CDAValueUtil.getValues(on);
						organizationValueLocation = CDAUtil.getDomainPath(on);
					}

				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = CDAValueUtil.getValues(pn);
						personValueLocation = CDAUtil.getDomainPath(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);
		row.createCell(offset++).setCellValue(personValueLocation);

		row.createCell(offset++).setCellValue(organizationValue);
		row.createCell(offset++).setCellValue(organizationValueLocation);

		return offset;

	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeProcedureActivityObservation(Row row, int offset, Observation procedureActivityObservation) {

		StringBuffer sb = new StringBuffer();
		for (II ii : procedureActivityObservation.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(procedureActivityObservation.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(procedureActivityObservation.getEffectiveTime()));

		offset = SpreadsheetSerializer.appendCode(
			row, offset, procedureActivityObservation.getSection(), procedureActivityObservation.getCode(),
			procedureActivityObservation.getText());

		offset = appendProcedurePerformaerAndOrganization(row, offset, procedureActivityObservation.getPerformers());

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeProcedureActivityProcedure(Row row, int offset, Procedure procedureActivityProcedure) {
		StringBuffer sb = new StringBuffer();
		for (II ii : procedureActivityProcedure.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(procedureActivityProcedure.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(procedureActivityProcedure.getEffectiveTime()));

		offset = SpreadsheetSerializer.appendCode(
			row, offset, procedureActivityProcedure.getSection(), procedureActivityProcedure.getCode(),
			procedureActivityProcedure.getText());

		offset = appendProcedurePerformaerAndOrganization(row, offset, procedureActivityProcedure.getPerformers());

		return offset;
	}

	static void serializeSA(String prefix, SubstanceAdministration substanceAdministration, Sheet sheet,
			int rownumber) {

		Row row = sheet.createRow(rownumber);

		Cell cell = row.createCell(0);

		cell.setCellValue(prefix);

		StringBuffer sb = new StringBuffer();

		for (II ii : substanceAdministration.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(1).setCellValue(sb.toString());

		sb = new StringBuffer();
		substanceAdministration.getEffectiveTimes();

		if (substanceAdministration.getConsumable() != null) {
			Consumable consumable = substanceAdministration.getConsumable();

			if (consumable.getManufacturedProduct() != null) {
				ManufacturedProduct manufacturedProduct = consumable.getManufacturedProduct();

				if (manufacturedProduct.getManufacturedMaterial() != null &&
						manufacturedProduct.getManufacturedMaterial().getName() != null) {
					sb.append(manufacturedProduct.getManufacturedMaterial().getName().getText());
				}
			}
		}
		row.createCell(2).setCellValue(sb.toString());

		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(substanceAdministration);

		ValidationResult vr = new ValidationResult();

		if (diagnostic.getChildren().size() > 0) {
			SpreadsheetSerializer.processDiagnostic(diagnostic, vr);
		}

		sb = new StringBuffer();

		for (Diagnostic dq : vr.getErrorDiagnostics()) {

			sb.append(dq.getMessage()).append("\r");

		}
		row.createCell(3).setCellValue(sb.toString());
		sb = new StringBuffer();
		for (Diagnostic dq : vr.getWarningDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}
		row.createCell(3).setCellValue(sb.toString());
		sb = new StringBuffer();
		for (Diagnostic dq : vr.getInfoDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}
		row.createCell(3).setCellValue(sb.toString());

	}

	/**
	 * @param row
	 * @param offset
	 * @param section
	 * @param encoutner
	 */
	static int serializeSectionAndFileName(Row row, int offset, Section section, String fileName) {

		String narrativeText = "";

		if (section != null) {
			if (section.getTitle() != null) {
				row.createCell(offset++).setCellValue(section.getTitle().getText());
			}

			try {
				if (section.getEntries() == null || section.getEntries().size() == 0) {
					ByteArrayOutputStream fa = new ByteArrayOutputStream();
					;
					Section s = CDAFactory.eINSTANCE.createSection();
					s.setText(EcoreUtil.copy(section.getText()));
					if (section.getText() != null) {
						CDAUtil.saveSnippet(EcoreUtil.copy(section.getText()), fa);
						narrativeText = CDAValueUtil.getNarrativeText(fa.toString());
					} else {
						narrativeText = "Missing Text";
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// else {
		// row.createCell(offset++).setCellValue("");
		// }
		Cell cell = row.createCell(offset++);
		cell.setCellValue(fileName);

		if (!StringUtils.isEmpty(narrativeText)) {
			row.createCell(offset++).setCellValue(narrativeText);
		}
		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param serviceEvent
	 * @return
	 */
	static int serializeServiceEvent(Row row, int offset, ServiceEvent serviceEvent) {
		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : serviceEvent.getIds()) {
			sb.append(CDAValueUtil.getKey(ii));
		}

		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivlts = serviceEvent.getEffectiveTime();
		if (ivlts != null) {
			boolean hasLow = false;
			if (ivlts.getLow() != null) {
				if (!StringUtils.isEmpty(ivlts.getLow().getValue())) {
					sb.append(ivlts.getLow().getValue());
					hasLow = true;
				}

			}
			if (ivlts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
					if (hasLow) {
						sb.append(" - ");
					}
					sb.append(ivlts.getHigh().getValue());
				}
			}
		}

		cell.setCellValue(sb.toString());

		sb = new StringBuffer();
		if (serviceEvent.getCode() != null) {

			if (!StringUtils.isEmpty(serviceEvent.getCode().getDisplayName())) {
				sb.append(serviceEvent.getCode().getDisplayName());
			} else if (serviceEvent.getCode().getOriginalText() != null &&
					!StringUtils.isEmpty(serviceEvent.getCode().getOriginalText().getText())) {
				sb.append(serviceEvent.getCode().getOriginalText().getText());
			} else if (!StringUtils.isEmpty(serviceEvent.getCode().getCode())) {
				sb.append(serviceEvent.getCode().getCode());
			}

		}

		row.createCell(offset++).setCellValue(sb.toString());
		// place holder encounter description
		row.createCell(offset++).setCellValue("DOCUMENT SERVICE EVENT");

		return offset;

	}

	static int serializeSubstanceAdministration(Row row, int offset, SubstanceAdministration substanceAdministration) {

		StringBuffer sb = new StringBuffer();

		for (II ii : substanceAdministration.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();
		substanceAdministration.getEffectiveTimes();

		boolean hasCode = false;
		if (substanceAdministration.getConsumable() != null) {
			Consumable consumable = substanceAdministration.getConsumable();

			if (consumable.getManufacturedProduct() != null) {
				ManufacturedProduct manufacturedProduct = consumable.getManufacturedProduct();

				if (manufacturedProduct.getManufacturedMaterial() != null) {

					if (manufacturedProduct.getManufacturedMaterial().getCode() != null) {

						offset = SpreadsheetSerializer.appendCode(
							row, offset, substanceAdministration.getSection(),
							manufacturedProduct.getManufacturedMaterial().getCode(), substanceAdministration.getText());
						hasCode = true;

					}

				}

			}

		}

		if (!hasCode) {
			offset = SpreadsheetSerializer.appendCode(
				row, offset, substanceAdministration.getSection(), null, substanceAdministration.getText());
		}

		if (substanceAdministration.getStatusCode() != null &&
				!StringUtils.isEmpty(substanceAdministration.getStatusCode().getCode())) {
			row.createCell(offset++).setCellValue(substanceAdministration.getStatusCode().getCode());
		} else {
			row.createCell(offset++).setCellValue("Missing Status");
		}

		row.createCell(offset++).setCellValue(CDAValueUtil.getValue(substanceAdministration.getDoseQuantity()));
		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(substanceAdministration.getDoseQuantity()));

		String time = "";
		EObject source = null;
		for (SXCM_TS t : substanceAdministration.getEffectiveTimes()) {
			source = t;
			if (!StringUtils.isEmpty(t.getValue())) {
				time = t.getValue();
			}

			if (t instanceof IVL_TS) {

				time = CDAValueUtil.getValueAsString((IVL_TS) t);

			}

		}

		Date d = CDAValueUtil.getDate(time);

		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue(time);
		}

		row.createCell(offset++).setCellValue(CDAUtil.getDomainPath(source));

		row.createCell(offset++).setCellValue(GenerateCDADataHandler.sigSwitch.doSwitch(substanceAdministration));

		row.createCell(offset++).setCellValue(
			GenerateCDADataHandler.sigLocationSwitch.doSwitch(substanceAdministration));

		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, substanceAdministration.getAuthors());

		return offset;

	}

	/**
	 * @param row
	 * @param offset
	 * @return
	 */
	public static int serializeNoEnounterID(Row row, int offset) {
		Cell cell = row.createCell(offset++);
		cell = row.createCell(offset++);
		cell.setCellValue(MatchEncounterBy.NOMATCH.getMatch());
		return offset;
	}

	public static int appendValidation(Row row, int offset, EObject target) {

		if (!GenerateCDADataHandler.omitValidation) {

			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(target);

			ValidationResult vr = new ValidationResult();

			if (diagnostic.getChildren().size() > 0) {
				processDiagnostic(diagnostic, vr);
			}

			StringBuffer sb = new StringBuffer();

			for (Diagnostic dq : vr.getErrorDiagnostics()) {

				sb.append(dq.getMessage()).append("\r");

			}
			row.createCell(offset++).setCellValue(sb.toString());
		}

		return offset;
	}

	/**
	 * @param query
	 * @param metricsSheet
	 * @param documentMetadata
	 * @param patientRole
	 * @param metrics
	 * @param name
	 */
	public static void appendToMetricsSheet(Query query, SXSSFSheet metricsSheet, DocumentMetadata documentMetadata,
			PatientRole patientRole, CDAMetrics metrics, String name) {

		Row row = metricsSheet.createRow(metricsSheet.getPhysicalNumberOfRows());

		int offset = serializePatient2(row, 0, documentMetadata, patientRole);
		/*
		 * race
		 * gender
		 * patient name
		 * address
		 * dob XXX
		 * phone #
		 * ethnicity
		 * document id XXX
		 * language
		 * phone #
		 */
		serializeSectionAndFileName(row, offset, null, documentMetadata.fileName);

		for (String key : metrics.codedMetrics.keySet()) {

			metrics.codedMetrics.get(key);

			Cell cell = row.createCell(offset++);

			cell.setCellValue(metrics.codedMetrics.get(key));

			// int offset = serializePatient(row, 0, documentMetadata, patientRole);
			// offset = serializeEncounter(row, offset, encounter);
			// offset = serializeSectionAndFileName(row, offset, encounter.getSection(), fileName);
			// offset = appendValidation(row, offset, encounter);

		}
		// TODO Auto-generated method stub

	}

}

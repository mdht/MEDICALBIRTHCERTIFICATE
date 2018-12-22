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
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.DocumentMetadata;
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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;

/**
 * @author seanmuir
 *
 */
public class SpreadsheetSerializer {

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

		String time = "";
		for (SXCM_TS t : substanceAdministration.getEffectiveTimes()) {

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

		row.createCell(offset++).setCellValue(GenerateCDADataHandler.sigSwitch.doSwitch(substanceAdministration));
		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, substanceAdministration.getAuthors());

		return offset;

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
			} else {
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
				offset = SpreadsheetSerializer.appendCode(row, offset, allergyProblemAct.getSection(), null, null);
			}
			offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, allergyObservation.getAuthors());

			break;
		}

		return offset;

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
			cell.setCellValue(CDAValueUtil.getValues(documentMetadata.pcpName));
		} else {
			row.createCell(offset++);
		}

		if (documentMetadata.pcpAddress != null) {
			cell = row.createCell(offset++);
			cell.setCellValue(CDAValueUtil.getValues(documentMetadata.pcpAddress));
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
						System.out.println("invalid date");
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

		offset = SpreadsheetSerializer.appendCode(
			row, offset, encounter.getSection(), encounter.getCode(), encounter.getText());

		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, encounter.getAuthors());

		return offset;

	}

	static int serializeEnounterID(Row row, int offset, Act act, List<Encounter> encounters) {
		for (Encounter encounter : encounters) {
			MatchEncounterBy result = SpreadsheetSerializer.matchesEncounter(encounter, act);
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

		offset = SpreadsheetSerializer.appendCode(
			row, offset, resultObservation.getSection(), resultObservation.getCode(), resultObservation.getText());

		String value = "";
		for (ANY any : resultObservation.getValues()) {
			value = CDAValueUtil.getAnyValue(resultObservation.getSection(), any);
		}
		if (value.length() < 1000) {
			row.createCell(offset++).setCellValue(value);
		} else {
			row.createCell(offset++).setCellValue(value.substring(0, 1000));
		}

		String referenceRangeValue = "";
		for (ReferenceRange rr : resultObservation.getReferenceRanges()) {

			if (rr.getObservationRange() != null && rr.getObservationRange().getValue() != null) {
				referenceRangeValue = CDAValueUtil.getAnyValue(
					resultObservation.getSection(), rr.getObservationRange().getValue());
			}

		}

		if (referenceRange) {
			row.createCell(offset++).setCellValue(referenceRangeValue);
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

		// DATE
		cell.setCellValue(sb.toString());

		// TYPE

		// asdf;

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

	static int serializePatient(Row row, int offset, PatientRole patientRole) {
		return serializePatient(row, offset, null, patientRole);
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

		offset = SpreadsheetSerializer.appendCode(
			row, offset, procedureActivityAct.getSection(), procedureActivityAct.getCode(),
			procedureActivityAct.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : procedureActivityAct.getPerformers()) {

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
	 * @param sa
	 * @return
	 */
	static int serializeProcedureActivityObservation(Row row, int offset,
			ProcedureActivityObservation procedureActivityObservation) {

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

		offset = SpreadsheetSerializer.appendCode(
			row, offset, procedureActivityObservation.getSection(), procedureActivityObservation.getCode(),
			procedureActivityObservation.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : procedureActivityObservation.getPerformers()) {

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

		offset = SpreadsheetSerializer.appendCode(
			row, offset, procedureActivityProcedure.getSection(), procedureActivityProcedure.getCode(),
			procedureActivityProcedure.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : procedureActivityProcedure.getPerformers()) {

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

	// private static void appendToCarePlanSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
	// PatientRole patientRole, ServiceEvent serviceEvent, List<Organizer> vitalSignsOrganizers,
	// List<Encounter> encounters, String fileName) {
	//
	// }

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
			}

		}
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
	static void appendActToProcedureSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, EList<Act> procedureActivityActs,
			List<Encounter> encounters, String fileName) {

		for (Act sa : procedureActivityActs) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeProcedureActivityAct(row, offset, sa);

			serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}
	}

	static int appendCode(Row row, int offset, Section setion, CD cd, ED ed) {

		if (cd != null) {
			// If original text is not supplied - see if the ed was supplied
			ED theED = (cd.getOriginalText() != null
					? cd.getOriginalText()
					: ed);

			if (setion != null || ed != null) {
				row.createCell(offset++).setCellValue(CDAValueUtil.getValue(setion, theED));
			}
			// Display Name
			row.createCell(offset++).setCellValue(CDAValueUtil.getValueAsString(setion, cd));
			// Code
			row.createCell(offset++).setCellValue(cd.getCode());
			// Code System
			row.createCell(offset++).setCellValue(cd.getCodeSystem());
			// Code System Name
			row.createCell(offset++).setCellValue(cd.getCodeSystemName());
		} else {
			if (setion != null || ed != null) {
				row.createCell(offset++).setCellValue("");
			}
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
	static void appendObservationToProcedureSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent,
			EList<ProcedureActivityObservation> procedureActivityObservations, List<Encounter> encounters,
			String fileName) {

		for (ProcedureActivityObservation sa : procedureActivityObservations) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeProcedureActivityObservation(row, offset, sa);

			serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}
	}

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

			serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	/**
	 * @param query
	 * @param substanceAdministrationsSheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param name
	 */
	static void appendToAllergiesSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {

		List<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sas = query.getEObjects(
			org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct.class);

		appendToAllergiesSheet(
			query, sheet, organizationAndSoftware, patientRole, serviceEvent, sas, encounters, fileName);
	}

	static void appendToAllergiesSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent,
			List<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sas, List<Encounter> encounters,
			String fileName) {

		for (AllergyProblemAct sa : sas) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeAllergyProblemAct(row, offset, sa);

			serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

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
			}
		}
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
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
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
			serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
		}
	}

	static void appendToSubstanceAdministrationSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {

		// Because we were getting class cast exception - copy results to EList
		EList<SubstanceAdministration> elist = new BasicEList<SubstanceAdministration>();

		elist.addAll(query.getEObjects(org.openhealthtools.mdht.uml.cda.consol.MedicationActivity.class));

		appendToSubstanceAdministrationSheet(
			query, sheet, organizationAndSoftware, patientRole, serviceEvent, encounters, elist, fileName);

	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 */
	public static int createVitalSignsHeader(Row row1, Row row2, int offset) {

		row2.createCell(offset++).setCellValue("Panel ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Panel");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Vital Sign ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Vital Sign");
		row2.createCell(offset++).setCellValue("Result");
		row2.createCell(offset++).setCellValue("Range");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		return offset;

	}

	public static int createCarePlanHeader(Row row1, Row row2, int offset) {

		row2.createCell(offset++).setCellValue("Panel ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Panel");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Vital Sign ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Vital Sign");
		row2.createCell(offset++).setCellValue("Result");
		row2.createCell(offset++).setCellValue("Range");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		return offset;

	}

	static int createProblemHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Problem");
		offset = createProblemObservationHeader(row1, row2, offset);
		return offset;

	}

	static int createProblemObservationHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Problem");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		return offset;

	}

	static int createAllergyHeader(Row row1, Row row2, int offset) {
		// All Des Verify Date Event Type Reaction Severity Source
		// int firstColumn = offset;
		// undo to go back to two rows for headers // undo to go back to two rows for headers row1.createCell(firstColumn).setCellValue("Allergy");
		row2.createCell(offset++).setCellValue("Allergy ID");
		row2.createCell(offset++).setCellValue("Status");
		row2.createCell(offset++).setCellValue("Verify Date");
		row2.createCell(offset++).setCellValue("No Known Flag");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Allergy ");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Substance ");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Reaction ");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Severity ");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		// undo to go back to two rows for headers // undo to go back to two rows for headers row1.getSheet().addMergedRegion(new CellRangeAddress(0,
		// 0, firstColumn, offset));

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
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Encounter");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);

		return offset;
	}

	static int createEncounterIDHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Encounter ID");
		row2.createCell(offset++).setCellValue("Encounter Match");
		row2.getSheet().setColumnHidden(offset - 1, true);

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
				row2.getSheet().setColumnHidden(offset - 1, true);
			}
			row2.createCell(offset++).setCellValue("DOB");
		}
		offset = createDocumentMedadataHeadder(row2, offset, false);
		return offset;
	}

	static int createDemographicsHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Name");
		row2.createCell(offset++).setCellValue("Address");
		offset = SpreadsheetSerializer.addCodeHeader2(row2, offset, "Race");
		offset = SpreadsheetSerializer.addCodeHeader2(row2, offset, "Ethnicity");
		offset = SpreadsheetSerializer.addCodeHeader2(row2, offset, "Gender");
		offset = SpreadsheetSerializer.addCodeHeader2(row2, offset, "Marital Status");
		offset = SpreadsheetSerializer.addCodeHeader2(row2, offset, "Langauge");
		offset = SpreadsheetSerializer.addCodeHeader2(row2, offset, "Telephone");
		return offset;
	}

	static int createPatientHeader2(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Recipient Name");
		row2.createCell(offset++).setCellValue("Recipient Organization");
		row2.createCell(offset++).setCellValue("Order Id");
		row2.createCell(offset++).setCellValue("File Name");
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
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Procedure");
		row2.createCell(offset++).setCellValue("Performer");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Section Title");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;

	}

	static int createResultsHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Panel ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Panel");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Specimen");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Test");
		row2.createCell(offset++).setCellValue("Result");
		row2.createCell(offset++).setCellValue("Range");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		return offset;
	}

	static int createSocialHistoryHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Observation");
		row2.createCell(offset++).setCellValue("Value");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		return offset;
	}

	static int createSubstanceAdministrationHeader(Row row1, Row row2, int offset, String type) {
		row2.createCell(offset++).setCellValue("ID");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, type);
		row2.createCell(offset++).setCellValue("Status");
		row2.createCell(offset++).setCellValue("Quantity");
		row2.createCell(offset++).setCellValue("Expiration");
		row2.createCell(offset++).setCellValue("Prescription");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		return offset;
	}

	static int addCodeHeader(Row row1, int offset, String prefix) {
		row1.createCell(offset++).setCellValue(prefix + " Text");
		row1.createCell(offset++).setCellValue("Display Name");
		row1.createCell(offset++).setCellValue("Code");
		row1.getSheet().setColumnHidden(offset - 1, true);
		row1.createCell(offset++).setCellValue("Code System");
		row1.getSheet().setColumnHidden(offset - 1, true);
		row1.createCell(offset++).setCellValue("Code System Name");
		row1.getSheet().setColumnHidden(offset - 1, true);
		return offset;
	}

	static int addCodeHeader2(Row row1, int offset, String prefix) {
		row1.createCell(offset++).setCellValue(prefix + " Text");
		row1.createCell(offset++).setCellValue("Code");
		row1.getSheet().setColumnHidden(offset - 1, true);
		row1.createCell(offset++).setCellValue("Code System");
		row1.getSheet().setColumnHidden(offset - 1, true);
		row1.createCell(offset++).setCellValue("Code System Name");
		row1.getSheet().setColumnHidden(offset - 1, true);
		return offset;
	}

	static int addSectionHeader(Row row1, int offset) {
		row1.createCell(offset++).setCellValue("Section Title");
		row1.createCell(offset++).setCellValue("File Name");
		row1.createCell(offset++).setCellValue("Narrative");

		return offset;
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
									documentMetadata.pcpAddress = ad;
									break;
								}
								if (performer.getAssignedEntity().getAssignedPerson() != null) {
									for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
										documentMetadata.pcpName = pn;
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
		} else {
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
		} else {
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

	public static int serializeClinicalStatement(Row row, int offset, SubstanceAdministration substanceAdministration) {
		StringBuffer sb = new StringBuffer();

		for (II ii : substanceAdministration.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		String time = "";
		for (SXCM_TS t : substanceAdministration.getEffectiveTimes()) {

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

		// Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(substanceAdministration.getEffectiveTimes().get(0)));
		// if (d != null) {
		// row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
		// } else {
		// row.createCell(offset++).setCellValue("");
		// }

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
		} else {
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
		} else {
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

		String time = "";
		for (SXCM_TS t : supply.getEffectiveTimes()) {

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

		// row.createCell(offset++).setCellValue(GenerateCDADataHandler.sigSwitch.doSwitch(substanceAdministration));
		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, supply.getAuthors());

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
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Code");
		row2.createCell(offset++).setCellValue("Performer");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Section Title");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param observation
	 * @param encounters
	 * @return
	 */
	public static int serializeEnounterID(Row row, int offset, Observation observation, List<Encounter> encounters) {
		for (Encounter encounter : encounters) {
			MatchEncounterBy result = SpreadsheetSerializer.matchesEncounter(encounter, observation);
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
			MatchEncounterBy result = SpreadsheetSerializer.matchesEncounter(encounter, procedure);
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
			MatchEncounterBy result = SpreadsheetSerializer.matchesEncounter(encounter, organizer);
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
			MatchEncounterBy result = SpreadsheetSerializer.matchesEncounter(encounter, supply);
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
			MatchEncounterBy result = SpreadsheetSerializer.matchesEncounter(encounter, substanceAdministration);
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
	 *
	 * @TODO Fix with proper date comparison routines
	 * @param encounter
	 * @param date
	 * @return
	 */
	@SuppressWarnings("deprecation")
	static boolean isWithinEncounterDateRate(Encounter encounter, Date date) {

		if (encounter.getEffectiveTime() != null) {
			if (!StringUtils.isEmpty(encounter.getEffectiveTime().getValue())) {

				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getValue());
				if (edate != null) {

					if (edate.compareTo(date) == 0) {
						return true;
					}

					if (edate.getYear() == date.getYear()) {
						if (edate.getMonth() == date.getMonth()) {
							if (edate.getDay() == date.getDay()) {
								return true;
							}
						}
					}
				}
			}

			if (encounter.getEffectiveTime().getLow() != null &&
					!StringUtils.isEmpty(encounter.getEffectiveTime().getLow().getValue())) {
				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getLow().getValue());
				if (edate != null) {
					if (edate.getYear() == date.getYear()) {
						if (edate.getMonth() == date.getMonth()) {
							if (edate.getDay() == date.getDay()) {
								return true;
							}

						}
					}
				}

			}

			if (encounter.getEffectiveTime().getHigh() != null &&
					!StringUtils.isEmpty(encounter.getEffectiveTime().getLow().getValue())) {
				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getHigh().getValue());
				if (edate != null) {
					if (edate != null && date != null) {
						if (edate.getYear() == date.getYear()) {
							if (edate.getMonth() == date.getMonth()) {
								if (edate.getDay() == date.getDay()) {
									return true;
								}

							}
						}
					}
				}
			}
		}

		return false;
	}

	public static MatchEncounterBy matchesEncounter(Encounter encounter, Observation observation) {
		for (II ii : observation.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return MatchEncounterBy.BYID;
				}
			}
		}

		Date observationTime = null;

		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;

		if (observation.getEffectiveTime() != null) {
			IVL_TS ivlts = observation.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : observation.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}

		if (observationTime != null && isWithinEncounterDateRate(encounter, observationTime)) {
			return result;
		}

		return MatchEncounterBy.NOMATCH;

	}

	enum MatchEncounterBy {
		BYID("MatchedUsingID"), BYEFFECTIVETIME("MatchedUsingEffectiveTime"), BYAUTHORID("MatchedUsingAuthor"), NOMATCH(
				"NoMatch");

		private String match;

		public String getMatch() {
			return this.match;
		}

		private MatchEncounterBy(String match) {
			this.match = match;
		}
	}

	static MatchEncounterBy matchesEncounter(Encounter encounter, Act act) {

		for (II ii : act.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return MatchEncounterBy.BYID;
				}
			}
		}

		Date observationTime = null;

		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;

		if (act.getEffectiveTime() != null) {
			IVL_TS ivlts = act.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : act.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}

		if (observationTime != null && isWithinEncounterDateRate(encounter, observationTime)) {
			return result;
		}

		return MatchEncounterBy.NOMATCH;

	}

	/**
	 * @param encounter2
	 * @param organizer
	 * @return
	 */
	static MatchEncounterBy matchesEncounter(Encounter encounter, Organizer organizer) {

		for (II ii : organizer.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return MatchEncounterBy.BYID;
				}
			}
		}

		Date observationTime = null;

		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;

		if (organizer.getEffectiveTime() != null) {
			IVL_TS ivlts = organizer.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : organizer.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}

		if (observationTime != null && isWithinEncounterDateRate(encounter, observationTime)) {
			return result;
		}

		return MatchEncounterBy.NOMATCH;

	}

	static MatchEncounterBy matchesEncounter(Encounter encounter, Procedure procedure) {

		for (II ii : procedure.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return MatchEncounterBy.BYID;
				}
			}
		}

		Date observationTime = null;

		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;
		if (procedure.getEffectiveTime() != null) {
			IVL_TS ivlts = procedure.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : procedure.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}

		if (observationTime != null && isWithinEncounterDateRate(encounter, observationTime)) {
			return result;
		}

		return MatchEncounterBy.NOMATCH;

	}

	static MatchEncounterBy matchesEncounter(Encounter encounter, SubstanceAdministration item) {

		for (Encounter e : item.getEncounters()) {

			for (II ii : e.getIds()) {
				for (II iii : encounter.getIds()) {
					if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
						return MatchEncounterBy.BYID;
					}

				}
			}

		}

		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;
		Date substanceAdminTime = null;

		for (SXCM_TS ts : item.getEffectiveTimes()) {
			if (ts instanceof IVL_TS) {
				IVL_TS ivlts = (IVL_TS) ts;
				if (ivlts.getLow() != null) {
					if (ivlts.getLow().getValue() != null) {
						substanceAdminTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
					}
				}
			} else {
				if (!StringUtils.isEmpty(ts.getValue())) {
					substanceAdminTime = CDAValueUtil.getDate(ts.getValue());
				}
			}

		}

		if (substanceAdminTime == null) {
			for (Author author : item.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					substanceAdminTime = CDAValueUtil.getDate(author.getTime().getValue());
				}
			}
		}

		if (substanceAdminTime != null && isWithinEncounterDateRate(encounter, substanceAdminTime)) {
			return result;

		}
		return MatchEncounterBy.NOMATCH;
	}

	/**
	 * @param encounter
	 * @param supply
	 * @return
	 */
	public static MatchEncounterBy matchesEncounter(Encounter encounter, Supply supply) {
		for (Encounter e : supply.getEncounters()) {

			for (II ii : e.getIds()) {
				for (II iii : encounter.getIds()) {
					if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
						return MatchEncounterBy.BYID;
					}

				}
			}

		}

		Date supplyTime = null;

		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;

		for (SXCM_TS ts : supply.getEffectiveTimes()) {
			if (ts instanceof IVL_TS) {
				IVL_TS ivlts = (IVL_TS) ts;
				if (ivlts.getLow() != null) {
					if (ivlts.getLow().getValue() != null) {
						supplyTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
					}
				}
			} else {
				if (!StringUtils.isEmpty(ts.getValue())) {
					supplyTime = CDAValueUtil.getDate(ts.getValue());
				}
			}

		}

		if (supplyTime == null) {
			for (Author author : supply.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					supplyTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}

		if (supplyTime != null && isWithinEncounterDateRate(encounter, supplyTime)) {
			return result;

		}
		return MatchEncounterBy.NOMATCH;
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

}

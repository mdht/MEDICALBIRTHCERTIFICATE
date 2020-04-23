/*******************************************************************************
 * Copyright (c) 2017 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.tests;

import java.io.FileInputStream;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.IdentityDoc;
import org.eclipse.mdht.uml.cda.Participant1;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;

/**
 * @author seanmuir
 *
 */
public class TestSTDC {

	static void populate(EObject cd, int depth) {
		if (depth++ > 8) {
			return;
		}

		for (EAttribute ea : cd.eClass().getEAllAttributes()) {

			Object value = null;
			EDataType type = (EDataType) ea.getEType();
			if (type instanceof EEnum) {
				value = EcoreUtil.createFromString(type, ((EEnum) type).getEEnumLiteral(0).getLiteral());
			} else {
				EStructuralFeature feature = cd.eClass().getEStructuralFeature(ea.getName());

				if (FeatureMapUtil.isFeatureMap(feature)) {
					// System.out.println(ea);
				} else {

					try {
						value = EcoreUtil.createFromString(type, "Test");
					} catch (Exception e) {
						// System.out.println(ea);
						// System.out.println(type);
					}
				}
			}
			// System.out.println(value);
			if (value != null) {
				// System.out.println(ea);
				// System.out.println(value);
				// cd.eSet(ea, value);

				if (ea.isMany()) {
					List list = (List) cd.eGet(ea);
					list.add(value);
				} else {
					cd.eSet(ea, value);
				}

			}

			// if (value instanceof String && !type.isInstance(value)) {

			//
			// }

		}

		// System.out.println(EcoreUtil.getURI(cd));
		//
		// // if (cd.eClass().) {
		// //
		// // }

		for (EReference ea : cd.eClass().getEAllReferences()) {

			EClassifier ec = ea.getEType();

			// System.out.println(ec);

			if (ec instanceof EClass) {
				EClass ec1 = (EClass) ec;
				if (!ec1.isAbstract()) {
					EObject eo = EcoreUtil.create((EClass) ec);

					if (!"http://www.openhealthtools.org/mdht/uml/hl7/datatypes".equals(ec1.getEPackage().getNsURI())) {
						// System.out.println(ec1.getEPackage().getNsURI());
						populate(eo, depth);
					}

					if (ea.isMany()) {
						List<EObject> list = (List<EObject>) cd.eGet(ea);
						list.add(eo);
					} else {
						cd.eSet(ea, eo);
					}
				} else {

					ST st = DatatypesFactory.eINSTANCE.createST("asdasdfasdf");
					if (ea.isMany()) {
						List<EObject> list = (List<EObject>) cd.eGet(ea);
						list.add(st);
					} else {
						cd.eSet(ea, st);
					}

				}

			}
		}

	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// Patient p = CDAFactory.eINSTANCE.createPatient();
		//
		// p.setEthnicGroupCode(DatatypesFactory.eINSTANCE.createCE("11a", "22"));
		// p.getSDTCEthnicGroupCodes().add(DatatypesFactory.eINSTANCE.createCE("11b", "22"));
		// p.getSDTCEthnicGroupCodes().add(DatatypesFactory.eINSTANCE.createCE("11c", "22"));
		//
		// p.getSDTCEthnicGroupCodes().add(DatatypesFactory.eINSTANCE.createCE("11d", "22"));
		//
		// p.getGuardians().add(CDAFactory.eINSTANCE.createGuardian());
		// p.getGuardians().add(CDAFactory.eINSTANCE.createGuardian());
		// p.getGuardians().add(CDAFactory.eINSTANCE.createGuardian());
		// CDAUtil.saveSnippet(p, System.out);
		//
		// SubjectPerson sp = CDAFactory.eINSTANCE.createSubjectPerson();
		// populate(sp, 4);
		// CDAUtil.saveSnippet(sp, System.out);
		// // sp.setAdministrativeGenderCode(DatatypesFactory.eINSTANCE);
		//
		// AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
		//
		// IdentityDoc idoc = CDAFactory.eINSTANCE.createIdentityDoc();
		// idoc.setSeries(DatatypesFactory.eINSTANCE.createST("setSeries"));
		// idoc.setIssueOrgCode(DatatypesFactory.eINSTANCE.createST("setIssueOrgCode"));
		//
		// idoc.setIdentityCardTypeId(DatatypesFactory.eINSTANCE.createCD("aaaa", "bbb"));
		// idoc.setIssueDate(DatatypesFactory.eINSTANCE.createTS("2020"));
		//
		// idoc.setNumber(DatatypesFactory.eINSTANCE.createST("2020"));
		//
		// idoc.setIssueOrgName(DatatypesFactory.eINSTANCE.createST("setIssueOrgName"));
		//
		// ae.getIdentityDocs().add(idoc);
		//
		// CDAUtil.saveSnippet(ae, System.out);
		// // //
		// // //

		;
		ClinicalDocument clinicalDocument = CDAUtil.load(
			new FileInputStream("Temp/SampleCDADocumentRuMedSertOfBirth.xml"));

		;

		for (Participant1 p1 : clinicalDocument.getParticipants()) {
			System.out.println(p1.getAssociatedEntity().getIds().get(0).getRoot());

			p1.getAssociatedEntity().getIds().get(0).setRoot("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			for (IdentityDoc doc : p1.getAssociatedEntity().getIdentityDocs()) {
				System.out.println(doc.getSeries().getText());

				System.out.println(doc.getIssueDate().getValue());

				// System.out.println(doc.getIdentityCardTypeId().getCode());

				// System.out.println(doc.getIssueDate());

				// System.out.println(doc.getIssueOrgCode().getText());

				// System.out.println(doc.getIssueOrgName().getText());
				// System.out.println("get getSeries");
				// System.out.println(doc.getSeries().getText());
				// System.out.println("get getIssueOrgCode");
				// System.out.println(doc.getIssueOrgCode().getText());
				// doc.setSeries(DatatypesFactory.eINSTANCE.createST("hererere"));
				// System.out.println(doc.getSeries().getText());

			}

		}

		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
		CDAUtil.save(clinicalDocument, System.out);

		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbb");
	}

}

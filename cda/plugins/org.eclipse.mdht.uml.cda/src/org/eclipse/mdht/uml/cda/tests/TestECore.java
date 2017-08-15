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
import java.io.FileOutputStream;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;

/**
 * @author seanmuir
 *
 */
public class TestECore {

	/**
	 * @param args
	 * @throws Exception
	 */

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

	public static void main(String[] args) throws Exception {

		ClinicalDocument cd = CDAFactory.eINSTANCE.createClinicalDocument();
		populate(cd, 0);

		// for (EReference ea : cd.eClass().getEAllReferences()) {
		//
		// EClassifier ec = ea.getEType();
		//
		// System.out.println(ec);
		// if (ec instanceof EClass) {
		// EObject eo = EcoreUtil.create((EClass) ec);
		// if (ea.isMany()) {
		// List<EObject> list = (List<EObject>) cd.eGet(ea);
		// list.add(eo);
		// } else {
		// cd.eSet(ea, eo);
		// }
		// }
		//
		// // if (value instanceof String && !type.isInstance(value)) {
		// System.out.println(ea.getEType());
		// Object value = EcoreUtil.createFromString((EDataType) ea.getEType(), "aaaaa");
		// // cd.eSet(ea, value);
		// // }
		//
		// }

		// CDAUtil.validate(cd);
		CDAUtil.save(cd, new FileOutputStream("aaaa3.xml"));
		ClinicalDocument cd2 = CDAUtil.load(new FileInputStream("aaaa3.xml"));
		ValidationHandler validator = new ValidationHandler() {

			@Override
			public void handleError(Diagnostic diagnostic) {
				// if (!diagnostic.getMessage().contains("org.eclipse.mdht.uml.hl7.datatypes.impl") &&
				// !diagnostic.getMessage().contains("org.eclipse.mdht.uml.cda.impl.")) {
				//
				//
				// }

				if (diagnostic.getMessage().contains("Invalid content was found starting with element")) {
					System.out.println(diagnostic.getMessage());
				}

			}

			@Override
			public void handleWarning(Diagnostic diagnostic) {
				// System.out.println(diagnostic.getMessage());

			}

			@Override
			public void handleInfo(Diagnostic diagnostic) {
				// System.out.println(diagnostic.getMessage());

			}
		};
		CDAUtil.performSchemaValidation(cd2, validator);

	}

}

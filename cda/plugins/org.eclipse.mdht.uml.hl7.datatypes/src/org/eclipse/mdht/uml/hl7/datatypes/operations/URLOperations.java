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
package org.eclipse.mdht.uml.hl7.datatypes.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.eclipse.mdht.uml.hl7.datatypes.URL;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>URL</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.URL#validateURL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URLOperations extends ANYOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateURL(URL, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate URL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateURL(URL, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.isNullFlavorDefined() or self.isDefined('value')) and not(self.isNullFlavorDefined() and self.isDefined('value'))";

	/**
	 * The cached OCL invariant for the '{@link #validateURL(URL, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate URL</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateURL(URL, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal< Constraint > VALIDATE_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal< Constraint >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param url The receiving '<em><b>URL</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateURL(URL url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
		synchronized (EOCL_ENV) {
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.URL);
			try {
				VALIDATE_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(url)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.URL__URL,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateURL", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(url, context) }),
						 new Object [] { url }));
			}
			return false;
		}
		return true;
	}

} // URLOperations

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
import org.eclipse.mdht.uml.hl7.datatypes.TN;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>TN</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.TN#validateInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Invariant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TNOperations extends ENOperations {
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
	protected TNOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInvariant(TN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Invariant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInvariant(TN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.delimiter->isEmpty() and self.family->isEmpty() and self.given->isEmpty() and self.prefix->isEmpty() and self.suffix->isEmpty() and mixed->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateInvariant(TN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Invariant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInvariant(TN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal< Constraint > VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal< Constraint >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tn The receiving '<em><b>TN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInvariant(TN tn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
		synchronized (EOCL_ENV) {
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.TN);
			try {
				VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(tn)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.TN__INVARIANT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateInvariant", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tn, context) }),
						 new Object [] { tn }));
			}
			return false;
		}
		return true;
	}

} // TNOperations

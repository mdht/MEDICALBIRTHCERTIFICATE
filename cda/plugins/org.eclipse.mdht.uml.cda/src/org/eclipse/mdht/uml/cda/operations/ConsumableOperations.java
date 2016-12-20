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
package org.eclipse.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.Consumable;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.eclipse.mdht.uml.hl7.rim.operations.ParticipationOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consumable</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.Consumable#validateTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumableOperations extends ParticipationOperations {
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
	protected ConsumableOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTypeCode(Consumable, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTypeCode(Consumable, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isTypeCodeDefined() implies self.typeCode=vocab::ParticipationType::CSM";

	/**
	 * The cached OCL invariant for the '{@link #validateTypeCode(Consumable, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTypeCode(Consumable, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal< Constraint > VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal< Constraint >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consumable The receiving '<em><b>Consumable</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeCode(Consumable consumable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
		synchronized (EOCL_ENV) {
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDAPackage.Literals.CONSUMABLE);
			try {
				VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumable)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.CONSUMABLE__TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumable, context) }),
						 new Object [] { consumable }));
			}
			return false;
		}
		return true;
	}

} // ConsumableOperations

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
import org.eclipse.mdht.uml.cda.ObservationRange;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.eclipse.mdht.uml.hl7.rim.operations.ActOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Observation Range</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.ObservationRange#validateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationRangeOperations extends ActOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected ObservationRangeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMoodCode(ObservationRange, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMoodCode(ObservationRange, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isMoodCodeDefined() implies self.moodCode=vocab::ActMood::EVNCRT";

	/**
	 * The cached OCL invariant for the '{@link #validateMoodCode(ObservationRange, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMoodCode(ObservationRange, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param observationRange The receiving '<em><b>Observation Range</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMoodCode(ObservationRange observationRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(CDAPackage.Literals.OBSERVATION_RANGE);
				try {
					VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			observationRange)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.OBSERVATION_RANGE__MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validateMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										observationRange, context) }),
						new Object[] { observationRange }));
			}
			return false;
		}
		return true;
	}

} // ObservationRangeOperations

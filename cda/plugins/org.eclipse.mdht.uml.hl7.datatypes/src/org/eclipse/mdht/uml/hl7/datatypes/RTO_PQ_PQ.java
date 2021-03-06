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
package org.eclipse.mdht.uml.hl7.datatypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTO PQ PQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.RTO_PQ_PQ#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.RTO_PQ_PQ#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getRTO_PQ_PQ()
 * @model
 * @generated
 */
public interface RTO_PQ_PQ extends QTY {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' containment reference.
	 * @see #setNumerator(PQ)
	 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getRTO_PQ_PQ_Numerator()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	PQ getNumerator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.RTO_PQ_PQ#getNumerator <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' containment reference.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(PQ value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' containment reference.
	 * @see #setDenominator(PQ)
	 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getRTO_PQ_PQ_Denominator()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	PQ getDenominator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.RTO_PQ_PQ#getDenominator <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' containment reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.denominator.value&lt;&gt;0'"
	 * @generated
	 */
	boolean validateDenominator(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RTO_PQ_PQ

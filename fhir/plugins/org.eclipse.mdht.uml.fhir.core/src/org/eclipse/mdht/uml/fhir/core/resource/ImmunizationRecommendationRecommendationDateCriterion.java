/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Recommendation Date Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationRecommendationRecommendationDateCriterion#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationRecommendationRecommendationDateCriterion#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationRecommendationRecommendationDateCriterion()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Recommendation_DateCriterion'"
 * @generated
 */
public interface ImmunizationRecommendationRecommendationDateCriterion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationRecommendationRecommendationDateCriterion_Code()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationRecommendationRecommendationDateCriterion#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationRecommendationRecommendationDateCriterion_Value()
	 * @model required="true"
	 * @generated
	 */
	DateTime getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationRecommendationRecommendationDateCriterion#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DateTime value);

} // ImmunizationRecommendationRecommendationDateCriterion

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
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimRelated#getClaimIdentifier <em>Claim Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimRelated#getClaimReference <em>Claim Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimRelated#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimRelated#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimRelated()
 * @model extendedMetaData="name='Claim.Related' kind='elementOnly'"
 * @generated
 */
public interface ClaimRelated extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Claim Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Identifier</em>' containment reference.
	 * @see #setClaimIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaimRelated_ClaimIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getClaimIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimRelated#getClaimIdentifier <em>Claim Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Identifier</em>' containment reference.
	 * @see #getClaimIdentifier()
	 * @generated
	 */
	void setClaimIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Claim Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Reference</em>' containment reference.
	 * @see #setClaimReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimRelated_ClaimReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimRelated#getClaimReference <em>Claim Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Reference</em>' containment reference.
	 * @see #getClaimReference()
	 * @generated
	 */
	void setClaimReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example prior or umbrella.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimRelated_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimRelated#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Coding value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaimRelated_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimRelated#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Identifier value);

} // ClaimRelated

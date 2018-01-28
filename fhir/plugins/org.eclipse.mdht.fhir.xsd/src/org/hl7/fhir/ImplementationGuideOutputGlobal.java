/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Output Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImplementationGuideOutputGlobal#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideOutputGlobal#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideOutputGlobal()
 * @model extendedMetaData="name='ImplementationGuideOutput.Global' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideOutputGlobal extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of resource that all instances must conform to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ResourceType)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideOutputGlobal_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideOutputGlobal#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the profile that all instances must conform to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideOutputGlobal_Profile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideOutputGlobal#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Reference value);

} // ImplementationGuideOutputGlobal

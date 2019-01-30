/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Clinicals Contraindication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The clinical particulars - indications, contraindications etc of a medicinal product, including for regulatory purposes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsContraindication#getDisease <em>Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsContraindication#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsContraindication#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsContraindication#getTherapeuticIndication <em>Therapeutic Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsContraindication#getOtherTherapy <em>Other Therapy</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsContraindication#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsContraindication()
 * @model extendedMetaData="name='MedicinalProductClinicals.Contraindication' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductClinicalsContraindication extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Disease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The disease, symptom or procedure for the contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease</em>' containment reference.
	 * @see #setDisease(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsContraindication_Disease()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disease' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDisease();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsContraindication#getDisease <em>Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease</em>' containment reference.
	 * @see #getDisease()
	 * @generated
	 */
	void setDisease(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Disease Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the disease or symptom for the contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Status</em>' containment reference.
	 * @see #setDiseaseStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsContraindication_DiseaseStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiseaseStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsContraindication#getDiseaseStatus <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Status</em>' containment reference.
	 * @see #getDiseaseStatus()
	 * @generated
	 */
	void setDiseaseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Comorbidity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comorbidity (concurrent condition) or coinfection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comorbidity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsContraindication_Comorbidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comorbidity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getComorbidity();

	/**
	 * Returns the value of the '<em><b>Therapeutic Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the use of the medicinal product in relation to other therapies as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Therapeutic Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsContraindication_TherapeuticIndication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='therapeuticIndication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsTherapeuticIndication> getTherapeuticIndication();

	/**
	 * Returns the value of the '<em><b>Other Therapy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsOtherTherapy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the use of the medicinal product in relation to other therapies described as part of the contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Therapy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsContraindication_OtherTherapy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherTherapy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsOtherTherapy> getOtherTherapy();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsPopulation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The population group to which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsContraindication_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsPopulation> getPopulation();

} // MedicinalProductClinicalsContraindication

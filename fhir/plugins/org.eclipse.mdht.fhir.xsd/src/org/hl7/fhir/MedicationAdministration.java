/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getNotGiven <em>Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getReasonNotGiven <em>Reason Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getReasonGiven <em>Reason Given</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration()
 * @model extendedMetaData="name='MedicationAdministration' kind='elementOnly'"
 * @generated
 */
public interface MedicationAdministration extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationAdministrationStatus)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministrationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationAdministrationStatus value);

	/**
	 * Returns the value of the '<em><b>Medication Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #setMedicationCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_MedicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMedicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 */
	void setMedicationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medication Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Reference</em>' containment reference.
	 * @see #setMedicationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_MedicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getMedicationReference <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Reference</em>' containment reference.
	 * @see #getMedicationReference()
	 * @generated
	 */
	void setMedicationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or animal receiving the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information (for example, patient height and weight) that supports the administration of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInformation();

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #setEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_EffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getEffectiveDateTime <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual who was responsible for giving the medication to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition or observation that supports why the medication was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReasonReference();

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The original request, instruction or authority to perform the administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference.
	 * @see #setPrescription(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Prescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescription' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getPrescription <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' containment reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(Reference value);

	/**
	 * Returns the value of the '<em><b>Not Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set this to true if the record is saying that the medication was NOT administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Given</em>' containment reference.
	 * @see #setNotGiven(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_NotGiven()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notGiven' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getNotGiven();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getNotGiven <em>Not Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Given</em>' containment reference.
	 * @see #getNotGiven()
	 * @generated
	 */
	void setNotGiven(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reason Not Given</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code indicating why the administration was not performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Not Given</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_ReasonNotGiven()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonNotGiven' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReasonNotGiven();

	/**
	 * Returns the value of the '<em><b>Reason Given</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code indicating why the medication was given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Given</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_ReasonGiven()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonGiven' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReasonGiven();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device used in administering the medication to the patient.  For example, a particular infusion pump.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDevice();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the medication administration that is not conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference.
	 * @see #setDosage(MedicationAdministrationDosage)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Dosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosage' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministrationDosage getDosage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getDosage <em>Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dosage</em>' containment reference.
	 * @see #getDosage()
	 * @generated
	 */
	void setDosage(MedicationAdministrationDosage value);

	/**
	 * Returns the value of the '<em><b>Event History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of the events of interest that have occurred, such as when the administration was verified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_EventHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEventHistory();

} // MedicationAdministration

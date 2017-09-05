/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Duration;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getStatusHistories <em>Status History</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getEpisodeOfCares <em>Episode Of Care</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getIncomingReferrals <em>Incoming Referral</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getIndications <em>Indication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getAccounts <em>Account</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getLocations <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getPartOf <em>Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter()
 * @model
 * @generated
 */
public interface Encounter extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Status()
	 * @model required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status History</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.EncounterStatusHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status History</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_StatusHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<EncounterStatusHistory> getStatusHistories();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass_(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Class()
	 * @model
	 * @generated
	 */
	Coding getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(Coding value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Type()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Priority()
	 * @model
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Patient()
	 * @model
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Episode Of Care</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.EpisodeOfCare}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Episode Of Care</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episode Of Care</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_EpisodeOfCare()
	 * @model
	 * @generated
	 */
	EList<EpisodeOfCare> getEpisodeOfCares();

	/**
	 * Returns the value of the '<em><b>Incoming Referral</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ReferralRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Referral</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Referral</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_IncomingReferral()
	 * @model
	 * @generated
	 */
	EList<ReferralRequest> getIncomingReferrals();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.EncounterParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Participant()
	 * @model containment="true"
	 * @generated
	 */
	EList<EncounterParticipant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' reference.
	 * @see #setAppointment(Appointment)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Appointment()
	 * @model
	 * @generated
	 */
	Appointment getAppointment();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getAppointment <em>Appointment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Appointment value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Period()
	 * @model
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' reference.
	 * @see #setLength(Duration)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Length()
	 * @model
	 * @generated
	 */
	Duration getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getLength <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Duration value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Reason()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getReasons();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indication</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indication</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Indication()
	 * @model
	 * @generated
	 */
	EList<Resource> getIndications();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Account()
	 * @model
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Hospitalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hospitalization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospitalization</em>' containment reference.
	 * @see #setHospitalization(EncounterHospitalization)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Hospitalization()
	 * @model containment="true"
	 * @generated
	 */
	EncounterHospitalization getHospitalization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getHospitalization <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalization</em>' containment reference.
	 * @see #getHospitalization()
	 * @generated
	 */
	void setHospitalization(EncounterHospitalization value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.EncounterLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<EncounterLocation> getLocations();

	/**
	 * Returns the value of the '<em><b>Service Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider</em>' reference.
	 * @see #setServiceProvider(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_ServiceProvider()
	 * @model
	 * @generated
	 */
	Organization getServiceProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getServiceProvider <em>Service Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider</em>' reference.
	 * @see #getServiceProvider()
	 * @generated
	 */
	void setServiceProvider(Organization value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference.
	 * @see #setPartOf(Encounter)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounter_PartOf()
	 * @model
	 * @generated
	 */
	Encounter getPartOf();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Encounter#getPartOf <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Encounter value);

} // Encounter

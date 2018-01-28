/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ImmunizationEvaluation;
import org.hl7.fhir.ImmunizationEvaluationStatusCodes;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getImmunizationEvent <em>Immunization Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDoseStatusReason <em>Dose Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDoseNumber <em>Dose Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getSeriesDoses <em>Series Doses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationEvaluationImpl extends DomainResourceImpl implements ImmunizationEvaluation {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationEvaluationStatusCodes status;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference authority;

	/**
	 * The cached value of the '{@link #getTargetDisease() <em>Target Disease</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisease()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> targetDisease;

	/**
	 * The cached value of the '{@link #getImmunizationEvent() <em>Immunization Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationEvent()
	 * @generated
	 * @ordered
	 */
	protected Reference immunizationEvent;

	/**
	 * The cached value of the '{@link #getDoseStatus() <em>Dose Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseStatus;

	/**
	 * The cached value of the '{@link #getDoseStatusReason() <em>Dose Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatusReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> doseStatusReason;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String series;

	/**
	 * The cached value of the '{@link #getDoseNumber() <em>Dose Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumber()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt doseNumber;

	/**
	 * The cached value of the '{@link #getSeriesDoses() <em>Series Doses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDoses()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt seriesDoses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationEvaluation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ImmunizationEvaluationStatusCodes newStatus, NotificationChain msgs) {
		ImmunizationEvaluationStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ImmunizationEvaluationStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthority(Reference newAuthority, NotificationChain msgs) {
		Reference oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY, oldAuthority, newAuthority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(Reference newAuthority) {
		if (newAuthority != authority) {
			NotificationChain msgs = null;
			if (authority != null)
				msgs = ((InternalEObject)authority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY, null, msgs);
			if (newAuthority != null)
				msgs = ((InternalEObject)newAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY, null, msgs);
			msgs = basicSetAuthority(newAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY, newAuthority, newAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTargetDisease() {
		if (targetDisease == null) {
			targetDisease = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE);
		}
		return targetDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getImmunizationEvent() {
		return immunizationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationEvent(Reference newImmunizationEvent, NotificationChain msgs) {
		Reference oldImmunizationEvent = immunizationEvent;
		immunizationEvent = newImmunizationEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, oldImmunizationEvent, newImmunizationEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunizationEvent(Reference newImmunizationEvent) {
		if (newImmunizationEvent != immunizationEvent) {
			NotificationChain msgs = null;
			if (immunizationEvent != null)
				msgs = ((InternalEObject)immunizationEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, null, msgs);
			if (newImmunizationEvent != null)
				msgs = ((InternalEObject)newImmunizationEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, null, msgs);
			msgs = basicSetImmunizationEvent(newImmunizationEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, newImmunizationEvent, newImmunizationEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseStatus() {
		return doseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseStatus(CodeableConcept newDoseStatus, NotificationChain msgs) {
		CodeableConcept oldDoseStatus = doseStatus;
		doseStatus = newDoseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, oldDoseStatus, newDoseStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseStatus(CodeableConcept newDoseStatus) {
		if (newDoseStatus != doseStatus) {
			NotificationChain msgs = null;
			if (doseStatus != null)
				msgs = ((InternalEObject)doseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, null, msgs);
			if (newDoseStatus != null)
				msgs = ((InternalEObject)newDoseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, null, msgs);
			msgs = basicSetDoseStatus(newDoseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, newDoseStatus, newDoseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getDoseStatusReason() {
		if (doseStatusReason == null) {
			doseStatusReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON);
		}
		return doseStatusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(org.hl7.fhir.String newSeries, NotificationChain msgs) {
		org.hl7.fhir.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES, oldSeries, newSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(org.hl7.fhir.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDoseNumber() {
		return doseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumber(PositiveInt newDoseNumber, NotificationChain msgs) {
		PositiveInt oldDoseNumber = doseNumber;
		doseNumber = newDoseNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER, oldDoseNumber, newDoseNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseNumber(PositiveInt newDoseNumber) {
		if (newDoseNumber != doseNumber) {
			NotificationChain msgs = null;
			if (doseNumber != null)
				msgs = ((InternalEObject)doseNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER, null, msgs);
			if (newDoseNumber != null)
				msgs = ((InternalEObject)newDoseNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER, null, msgs);
			msgs = basicSetDoseNumber(newDoseNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER, newDoseNumber, newDoseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSeriesDoses() {
		return seriesDoses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDoses(PositiveInt newSeriesDoses, NotificationChain msgs) {
		PositiveInt oldSeriesDoses = seriesDoses;
		seriesDoses = newSeriesDoses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES, oldSeriesDoses, newSeriesDoses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesDoses(PositiveInt newSeriesDoses) {
		if (newSeriesDoses != seriesDoses) {
			NotificationChain msgs = null;
			if (seriesDoses != null)
				msgs = ((InternalEObject)seriesDoses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES, null, msgs);
			if (newSeriesDoses != null)
				msgs = ((InternalEObject)newSeriesDoses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES, null, msgs);
			msgs = basicSetSeriesDoses(newSeriesDoses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES, newSeriesDoses, newSeriesDoses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return basicSetAuthority(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return ((InternalEList<?>)getTargetDisease()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return basicSetImmunizationEvent(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return basicSetDoseStatus(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return ((InternalEList<?>)getDoseStatusReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				return basicSetSeries(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER:
				return basicSetDoseNumber(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES:
				return basicSetSeriesDoses(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				return getStatus();
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return getPatient();
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				return getDate();
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return getAuthority();
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return getTargetDisease();
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return getImmunizationEvent();
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return getDoseStatus();
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return getDoseStatusReason();
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				return getSeries();
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER:
				return getDoseNumber();
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES:
				return getSeriesDoses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				setStatus((ImmunizationEvaluationStatusCodes)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				setAuthority((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				getTargetDisease().clear();
				getTargetDisease().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				setImmunizationEvent((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				setDoseStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				getDoseStatusReason().clear();
				getDoseStatusReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				setSeries((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER:
				setDoseNumber((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES:
				setSeriesDoses((PositiveInt)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				setStatus((ImmunizationEvaluationStatusCodes)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				setAuthority((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				getTargetDisease().clear();
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				setImmunizationEvent((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				setDoseStatus((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				getDoseStatusReason().clear();
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				setSeries((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER:
				setDoseNumber((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES:
				setSeriesDoses((PositiveInt)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				return status != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return patient != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				return date != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return authority != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return targetDisease != null && !targetDisease.isEmpty();
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return immunizationEvent != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return doseStatus != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return doseStatusReason != null && !doseStatusReason.isEmpty();
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return description != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				return series != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER:
				return doseNumber != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES:
				return seriesDoses != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationEvaluationImpl

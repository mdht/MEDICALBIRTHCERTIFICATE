/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.FamilyMemberHistory;
import org.eclipse.mdht.uml.fhir.core.resources.FamilyMemberHistoryCondition;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Member History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getBornx <em>Bornx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getAgex <em>Agex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getEstimatedAge <em>Estimated Age</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getDeceasedx <em>Deceasedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.FamilyMemberHistoryImpl#getConditions <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyMemberHistoryImpl extends DomainResourceImpl implements FamilyMemberHistory {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Code gender;

	/**
	 * The cached value of the '{@link #getBornx() <em>Bornx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBornx()
	 * @generated
	 * @ordered
	 */
	protected DataType bornx;

	/**
	 * The cached value of the '{@link #getAgex() <em>Agex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgex()
	 * @generated
	 * @ordered
	 */
	protected DataType agex;

	/**
	 * The cached value of the '{@link #getEstimatedAge() <em>Estimated Age</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedAge()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean estimatedAge;

	/**
	 * The cached value of the '{@link #getDeceasedx() <em>Deceasedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedx()
	 * @generated
	 * @ordered
	 */
	protected DataType deceasedx;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected Annotation note;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<FamilyMemberHistoryCondition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyMemberHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getFamilyMemberHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String newName) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject)relationship;
			relationship = (CodeableConcept)eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(CodeableConcept newRelationship) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGender() {
		if (gender != null && gender.eIsProxy()) {
			InternalEObject oldGender = (InternalEObject)gender;
			gender = (Code)eResolveProxy(oldGender);
			if (gender != oldGender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__GENDER, oldGender, gender));
			}
		}
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Code newGender) {
		Code oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBornx() {
		if (bornx != null && bornx.eIsProxy()) {
			InternalEObject oldBornx = (InternalEObject)bornx;
			bornx = (DataType)eResolveProxy(oldBornx);
			if (bornx != oldBornx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX, oldBornx, bornx));
			}
		}
		return bornx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBornx() {
		return bornx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBornx(DataType newBornx) {
		DataType oldBornx = bornx;
		bornx = newBornx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX, oldBornx, bornx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAgex() {
		if (agex != null && agex.eIsProxy()) {
			InternalEObject oldAgex = (InternalEObject)agex;
			agex = (DataType)eResolveProxy(oldAgex);
			if (agex != oldAgex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX, oldAgex, agex));
			}
		}
		return agex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetAgex() {
		return agex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgex(DataType newAgex) {
		DataType oldAgex = agex;
		agex = newAgex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX, oldAgex, agex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getEstimatedAge() {
		if (estimatedAge != null && estimatedAge.eIsProxy()) {
			InternalEObject oldEstimatedAge = (InternalEObject)estimatedAge;
			estimatedAge = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldEstimatedAge);
			if (estimatedAge != oldEstimatedAge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, oldEstimatedAge, estimatedAge));
			}
		}
		return estimatedAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetEstimatedAge() {
		return estimatedAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedAge(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newEstimatedAge) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldEstimatedAge = estimatedAge;
		estimatedAge = newEstimatedAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, oldEstimatedAge, estimatedAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDeceasedx() {
		if (deceasedx != null && deceasedx.eIsProxy()) {
			InternalEObject oldDeceasedx = (InternalEObject)deceasedx;
			deceasedx = (DataType)eResolveProxy(oldDeceasedx);
			if (deceasedx != oldDeceasedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX, oldDeceasedx, deceasedx));
			}
		}
		return deceasedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDeceasedx() {
		return deceasedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeceasedx(DataType newDeceasedx) {
		DataType oldDeceasedx = deceasedx;
		deceasedx = newDeceasedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX, oldDeceasedx, deceasedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getNote() {
		if (note != null && note.eIsProxy()) {
			InternalEObject oldNote = (InternalEObject)note;
			note = (Annotation)eResolveProxy(oldNote);
			if (note != oldNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE, oldNote, note));
			}
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(Annotation newNote) {
		Annotation oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyMemberHistoryCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<FamilyMemberHistoryCondition>(FamilyMemberHistoryCondition.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__GENDER:
				if (resolve) return getGender();
				return basicGetGender();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				if (resolve) return getBornx();
				return basicGetBornx();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				if (resolve) return getAgex();
				return basicGetAgex();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				if (resolve) return getEstimatedAge();
				return basicGetEstimatedAge();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				if (resolve) return getDeceasedx();
				return basicGetDeceasedx();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return getConditions();
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				setBornx((DataType)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				setAgex((DataType)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				setEstimatedAge((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				setDeceasedx((DataType)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				setNote((Annotation)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends FamilyMemberHistoryCondition>)newValue);
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				setBornx((DataType)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				setAgex((DataType)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				setEstimatedAge((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				setDeceasedx((DataType)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				setNote((Annotation)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				getConditions().clear();
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				return patient != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				return date != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				return status != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				return name != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				return relationship != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__GENDER:
				return gender != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				return bornx != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				return agex != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				return estimatedAge != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				return deceasedx != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				return note != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return conditions != null && !conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyMemberHistoryImpl

/**
 */
package org.eclipse.mdht.uml.cda.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.IdentityDoc;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.eclipse.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Doc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.IdentityDocImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.IdentityDocImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.IdentityDocImpl#getIssueOrgName <em>Issue Org Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.IdentityDocImpl#getIssueOrgCode <em>Issue Org Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.IdentityDocImpl#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.IdentityDocImpl#getIdentityCardTypeId <em>Identity Card Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentityDocImpl extends EObjectImpl implements IdentityDoc {
	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected ST series;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected ST number;

	/**
	 * The cached value of the '{@link #getIssueOrgName() <em>Issue Org Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueOrgName()
	 * @generated
	 * @ordered
	 */
	protected ST issueOrgName;

	/**
	 * The cached value of the '{@link #getIssueOrgCode() <em>Issue Org Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueOrgCode()
	 * @generated
	 * @ordered
	 */
	protected ST issueOrgCode;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected TS issueDate;

	/**
	 * The cached value of the '{@link #getIdentityCardTypeId() <em>Identity Card Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityCardTypeId()
	 * @generated
	 * @ordered
	 */
	protected CD identityCardTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityDocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.IDENTITY_DOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(ST newSeries, NotificationChain msgs) {
		ST oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__SERIES, oldSeries, newSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(ST newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(ST newNumber, NotificationChain msgs) {
		ST oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(ST newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getIssueOrgName() {
		return issueOrgName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueOrgName(ST newIssueOrgName, NotificationChain msgs) {
		ST oldIssueOrgName = issueOrgName;
		issueOrgName = newIssueOrgName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME, oldIssueOrgName, newIssueOrgName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueOrgName(ST newIssueOrgName) {
		if (newIssueOrgName != issueOrgName) {
			NotificationChain msgs = null;
			if (issueOrgName != null)
				msgs = ((InternalEObject)issueOrgName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME, null, msgs);
			if (newIssueOrgName != null)
				msgs = ((InternalEObject)newIssueOrgName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME, null, msgs);
			msgs = basicSetIssueOrgName(newIssueOrgName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME, newIssueOrgName, newIssueOrgName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getIssueOrgCode() {
		return issueOrgCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueOrgCode(ST newIssueOrgCode, NotificationChain msgs) {
		ST oldIssueOrgCode = issueOrgCode;
		issueOrgCode = newIssueOrgCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE, oldIssueOrgCode, newIssueOrgCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueOrgCode(ST newIssueOrgCode) {
		if (newIssueOrgCode != issueOrgCode) {
			NotificationChain msgs = null;
			if (issueOrgCode != null)
				msgs = ((InternalEObject)issueOrgCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE, null, msgs);
			if (newIssueOrgCode != null)
				msgs = ((InternalEObject)newIssueOrgCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE, null, msgs);
			msgs = basicSetIssueOrgCode(newIssueOrgCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE, newIssueOrgCode, newIssueOrgCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueDate(TS newIssueDate, NotificationChain msgs) {
		TS oldIssueDate = issueDate;
		issueDate = newIssueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__ISSUE_DATE, oldIssueDate, newIssueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDate(TS newIssueDate) {
		if (newIssueDate != issueDate) {
			NotificationChain msgs = null;
			if (issueDate != null)
				msgs = ((InternalEObject)issueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__ISSUE_DATE, null, msgs);
			if (newIssueDate != null)
				msgs = ((InternalEObject)newIssueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__ISSUE_DATE, null, msgs);
			msgs = basicSetIssueDate(newIssueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__ISSUE_DATE, newIssueDate, newIssueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getIdentityCardTypeId() {
		return identityCardTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentityCardTypeId(CD newIdentityCardTypeId, NotificationChain msgs) {
		CD oldIdentityCardTypeId = identityCardTypeId;
		identityCardTypeId = newIdentityCardTypeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID, oldIdentityCardTypeId, newIdentityCardTypeId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityCardTypeId(CD newIdentityCardTypeId) {
		if (newIdentityCardTypeId != identityCardTypeId) {
			NotificationChain msgs = null;
			if (identityCardTypeId != null)
				msgs = ((InternalEObject)identityCardTypeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID, null, msgs);
			if (newIdentityCardTypeId != null)
				msgs = ((InternalEObject)newIdentityCardTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID, null, msgs);
			msgs = basicSetIdentityCardTypeId(newIdentityCardTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID, newIdentityCardTypeId, newIdentityCardTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.IDENTITY_DOC__SERIES:
				return basicSetSeries(null, msgs);
			case CDAPackage.IDENTITY_DOC__NUMBER:
				return basicSetNumber(null, msgs);
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME:
				return basicSetIssueOrgName(null, msgs);
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE:
				return basicSetIssueOrgCode(null, msgs);
			case CDAPackage.IDENTITY_DOC__ISSUE_DATE:
				return basicSetIssueDate(null, msgs);
			case CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID:
				return basicSetIdentityCardTypeId(null, msgs);
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
			case CDAPackage.IDENTITY_DOC__SERIES:
				return getSeries();
			case CDAPackage.IDENTITY_DOC__NUMBER:
				return getNumber();
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME:
				return getIssueOrgName();
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE:
				return getIssueOrgCode();
			case CDAPackage.IDENTITY_DOC__ISSUE_DATE:
				return getIssueDate();
			case CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID:
				return getIdentityCardTypeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.IDENTITY_DOC__SERIES:
				setSeries((ST)newValue);
				return;
			case CDAPackage.IDENTITY_DOC__NUMBER:
				setNumber((ST)newValue);
				return;
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME:
				setIssueOrgName((ST)newValue);
				return;
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE:
				setIssueOrgCode((ST)newValue);
				return;
			case CDAPackage.IDENTITY_DOC__ISSUE_DATE:
				setIssueDate((TS)newValue);
				return;
			case CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID:
				setIdentityCardTypeId((CD)newValue);
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
			case CDAPackage.IDENTITY_DOC__SERIES:
				setSeries((ST)null);
				return;
			case CDAPackage.IDENTITY_DOC__NUMBER:
				setNumber((ST)null);
				return;
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME:
				setIssueOrgName((ST)null);
				return;
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE:
				setIssueOrgCode((ST)null);
				return;
			case CDAPackage.IDENTITY_DOC__ISSUE_DATE:
				setIssueDate((TS)null);
				return;
			case CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID:
				setIdentityCardTypeId((CD)null);
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
			case CDAPackage.IDENTITY_DOC__SERIES:
				return series != null;
			case CDAPackage.IDENTITY_DOC__NUMBER:
				return number != null;
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_NAME:
				return issueOrgName != null;
			case CDAPackage.IDENTITY_DOC__ISSUE_ORG_CODE:
				return issueOrgCode != null;
			case CDAPackage.IDENTITY_DOC__ISSUE_DATE:
				return issueDate != null;
			case CDAPackage.IDENTITY_DOC__IDENTITY_CARD_TYPE_ID:
				return identityCardTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //IdentityDocImpl

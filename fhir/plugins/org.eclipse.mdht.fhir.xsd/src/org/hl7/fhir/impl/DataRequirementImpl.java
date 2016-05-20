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

import org.hl7.fhir.Code;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getCodeFilter <em>Code Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementImpl#getDateFilter <em>Date Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementImpl extends ElementImpl implements DataRequirement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Reference profile;

	/**
	 * The cached value of the '{@link #getMustSupport() <em>Must Support</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> mustSupport;

	/**
	 * The cached value of the '{@link #getCodeFilter() <em>Code Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementCodeFilter> codeFilter;

	/**
	 * The cached value of the '{@link #getDateFilter() <em>Date Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementDateFilter> dateFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDataRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Reference newProfile, NotificationChain msgs) {
		Reference oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(Reference newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getMustSupport() {
		if (mustSupport == null) {
			mustSupport = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.DATA_REQUIREMENT__MUST_SUPPORT);
		}
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirementCodeFilter> getCodeFilter() {
		if (codeFilter == null) {
			codeFilter = new EObjectContainmentEList<DataRequirementCodeFilter>(DataRequirementCodeFilter.class, this, FhirPackage.DATA_REQUIREMENT__CODE_FILTER);
		}
		return codeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirementDateFilter> getDateFilter() {
		if (dateFilter == null) {
			dateFilter = new EObjectContainmentEList<DataRequirementDateFilter>(DataRequirementDateFilter.class, this, FhirPackage.DATA_REQUIREMENT__DATE_FILTER);
		}
		return dateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DATA_REQUIREMENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DATA_REQUIREMENT__PROFILE:
				return basicSetProfile(null, msgs);
			case FhirPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return ((InternalEList<?>)getMustSupport()).basicRemove(otherEnd, msgs);
			case FhirPackage.DATA_REQUIREMENT__CODE_FILTER:
				return ((InternalEList<?>)getCodeFilter()).basicRemove(otherEnd, msgs);
			case FhirPackage.DATA_REQUIREMENT__DATE_FILTER:
				return ((InternalEList<?>)getDateFilter()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DATA_REQUIREMENT__TYPE:
				return getType();
			case FhirPackage.DATA_REQUIREMENT__PROFILE:
				return getProfile();
			case FhirPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return getMustSupport();
			case FhirPackage.DATA_REQUIREMENT__CODE_FILTER:
				return getCodeFilter();
			case FhirPackage.DATA_REQUIREMENT__DATE_FILTER:
				return getDateFilter();
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
			case FhirPackage.DATA_REQUIREMENT__TYPE:
				setType((Code)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT__PROFILE:
				setProfile((Reference)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				getMustSupport().clear();
				getMustSupport().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT__CODE_FILTER:
				getCodeFilter().clear();
				getCodeFilter().addAll((Collection<? extends DataRequirementCodeFilter>)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT__DATE_FILTER:
				getDateFilter().clear();
				getDateFilter().addAll((Collection<? extends DataRequirementDateFilter>)newValue);
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
			case FhirPackage.DATA_REQUIREMENT__TYPE:
				setType((Code)null);
				return;
			case FhirPackage.DATA_REQUIREMENT__PROFILE:
				setProfile((Reference)null);
				return;
			case FhirPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				getMustSupport().clear();
				return;
			case FhirPackage.DATA_REQUIREMENT__CODE_FILTER:
				getCodeFilter().clear();
				return;
			case FhirPackage.DATA_REQUIREMENT__DATE_FILTER:
				getDateFilter().clear();
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
			case FhirPackage.DATA_REQUIREMENT__TYPE:
				return type != null;
			case FhirPackage.DATA_REQUIREMENT__PROFILE:
				return profile != null;
			case FhirPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return mustSupport != null && !mustSupport.isEmpty();
			case FhirPackage.DATA_REQUIREMENT__CODE_FILTER:
				return codeFilter != null && !codeFilter.isEmpty();
			case FhirPackage.DATA_REQUIREMENT__DATE_FILTER:
				return dateFilter != null && !dateFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementImpl

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ActionDefinitionRelatedAction;
import org.hl7.fhir.ActionRelationshipAnchor;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Definition Related Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ActionDefinitionRelatedActionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActionDefinitionRelatedActionImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActionDefinitionRelatedActionImpl#getOffsetQuantity <em>Offset Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActionDefinitionRelatedActionImpl#getOffsetRange <em>Offset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActionDefinitionRelatedActionImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDefinitionRelatedActionImpl extends ElementImpl implements ActionDefinitionRelatedAction {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected ActionRelationshipType relationship;

	/**
	 * The cached value of the '{@link #getOffsetQuantity() <em>Offset Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetQuantity()
	 * @generated
	 * @ordered
	 */
	protected Duration offsetQuantity;

	/**
	 * The cached value of the '{@link #getOffsetRange() <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetRange()
	 * @generated
	 * @ordered
	 */
	protected Range offsetRange;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected ActionRelationshipAnchor anchor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionDefinitionRelatedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getActionDefinitionRelatedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionIdentifier(Identifier newActionIdentifier, NotificationChain msgs) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, newActionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		if (newActionIdentifier != actionIdentifier) {
			NotificationChain msgs = null;
			if (actionIdentifier != null)
				msgs = ((InternalEObject)actionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER, null, msgs);
			if (newActionIdentifier != null)
				msgs = ((InternalEObject)newActionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER, null, msgs);
			msgs = basicSetActionIdentifier(newActionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER, newActionIdentifier, newActionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipType getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(ActionRelationshipType newRelationship, NotificationChain msgs) {
		ActionRelationshipType oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(ActionRelationshipType newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getOffsetQuantity() {
		return offsetQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetQuantity(Duration newOffsetQuantity, NotificationChain msgs) {
		Duration oldOffsetQuantity = offsetQuantity;
		offsetQuantity = newOffsetQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY, oldOffsetQuantity, newOffsetQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetQuantity(Duration newOffsetQuantity) {
		if (newOffsetQuantity != offsetQuantity) {
			NotificationChain msgs = null;
			if (offsetQuantity != null)
				msgs = ((InternalEObject)offsetQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY, null, msgs);
			if (newOffsetQuantity != null)
				msgs = ((InternalEObject)newOffsetQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY, null, msgs);
			msgs = basicSetOffsetQuantity(newOffsetQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY, newOffsetQuantity, newOffsetQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getOffsetRange() {
		return offsetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetRange(Range newOffsetRange, NotificationChain msgs) {
		Range oldOffsetRange = offsetRange;
		offsetRange = newOffsetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE, oldOffsetRange, newOffsetRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetRange(Range newOffsetRange) {
		if (newOffsetRange != offsetRange) {
			NotificationChain msgs = null;
			if (offsetRange != null)
				msgs = ((InternalEObject)offsetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE, null, msgs);
			if (newOffsetRange != null)
				msgs = ((InternalEObject)newOffsetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE, null, msgs);
			msgs = basicSetOffsetRange(newOffsetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE, newOffsetRange, newOffsetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipAnchor getAnchor() {
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchor(ActionRelationshipAnchor newAnchor, NotificationChain msgs) {
		ActionRelationshipAnchor oldAnchor = anchor;
		anchor = newAnchor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR, oldAnchor, newAnchor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchor(ActionRelationshipAnchor newAnchor) {
		if (newAnchor != anchor) {
			NotificationChain msgs = null;
			if (anchor != null)
				msgs = ((InternalEObject)anchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR, null, msgs);
			if (newAnchor != null)
				msgs = ((InternalEObject)newAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR, null, msgs);
			msgs = basicSetAnchor(newAnchor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR, newAnchor, newAnchor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER:
				return basicSetActionIdentifier(null, msgs);
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY:
				return basicSetOffsetQuantity(null, msgs);
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				return basicSetOffsetRange(null, msgs);
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR:
				return basicSetAnchor(null, msgs);
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
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER:
				return getActionIdentifier();
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY:
				return getOffsetQuantity();
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				return getOffsetRange();
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR:
				return getAnchor();
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
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((ActionRelationshipType)newValue);
				return;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY:
				setOffsetQuantity((Duration)newValue);
				return;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				setOffsetRange((Range)newValue);
				return;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR:
				setAnchor((ActionRelationshipAnchor)newValue);
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
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((ActionRelationshipType)null);
				return;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY:
				setOffsetQuantity((Duration)null);
				return;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				setOffsetRange((Range)null);
				return;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR:
				setAnchor((ActionRelationshipAnchor)null);
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
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_QUANTITY:
				return offsetQuantity != null;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				return offsetRange != null;
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION__ANCHOR:
				return anchor != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionDefinitionRelatedActionImpl

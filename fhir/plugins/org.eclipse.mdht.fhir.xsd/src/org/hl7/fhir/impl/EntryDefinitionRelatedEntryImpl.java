/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.EntryDefinitionRelatedEntry;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Definition Related Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionRelatedEntryImpl#getRelationtype <em>Relationtype</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionRelatedEntryImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryDefinitionRelatedEntryImpl extends BackboneElementImpl implements EntryDefinitionRelatedEntry {
	/**
	 * The cached value of the '{@link #getRelationtype() <em>Relationtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationtype()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationtype;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Reference item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryDefinitionRelatedEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEntryDefinitionRelatedEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRelationtype() {
		return relationtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationtype(CodeableConcept newRelationtype, NotificationChain msgs) {
		CodeableConcept oldRelationtype = relationtype;
		relationtype = newRelationtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE, oldRelationtype, newRelationtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationtype(CodeableConcept newRelationtype) {
		if (newRelationtype != relationtype) {
			NotificationChain msgs = null;
			if (relationtype != null)
				msgs = ((InternalEObject)relationtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE, null, msgs);
			if (newRelationtype != null)
				msgs = ((InternalEObject)newRelationtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE, null, msgs);
			msgs = basicSetRelationtype(newRelationtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE, newRelationtype, newRelationtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(Reference newItem, NotificationChain msgs) {
		Reference oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM, oldItem, newItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(Reference newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE:
				return basicSetRelationtype(null, msgs);
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM:
				return basicSetItem(null, msgs);
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
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE:
				return getRelationtype();
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM:
				return getItem();
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
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE:
				setRelationtype((CodeableConcept)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM:
				setItem((Reference)newValue);
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
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE:
				setRelationtype((CodeableConcept)null);
				return;
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM:
				setItem((Reference)null);
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
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__RELATIONTYPE:
				return relationtype != null;
			case FhirPackage.ENTRY_DEFINITION_RELATED_ENTRY__ITEM:
				return item != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryDefinitionRelatedEntryImpl

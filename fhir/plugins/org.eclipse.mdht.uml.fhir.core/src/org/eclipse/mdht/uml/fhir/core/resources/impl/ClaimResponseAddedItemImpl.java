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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Money;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseAddedItem;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseAddedItemAddedItemsDetail;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseItemAdjudication;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Added Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getSequenceLinkIds <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getFee <em>Fee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseAddedItemImpl#getDetails <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimResponseAddedItemImpl extends BackboneElementImpl implements ClaimResponseAddedItem {
	/**
	 * The cached value of the '{@link #getSequenceLinkIds() <em>Sequence Link Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> sequenceLinkIds;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept revenue;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept service;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifiers;

	/**
	 * The cached value of the '{@link #getFee() <em>Fee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFee()
	 * @generated
	 * @ordered
	 */
	protected Money fee;

	/**
	 * The cached value of the '{@link #getNoteNumbers() <em>Note Number</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumbers;

	/**
	 * The cached value of the '{@link #getAdjudications() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudications()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItemAdjudication> adjudications;

	/**
	 * The cached value of the '{@link #getDetails() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddedItemAddedItemsDetail> details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseAddedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimResponseAddedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getSequenceLinkIds() {
		if (sequenceLinkIds == null) {
			sequenceLinkIds = new EObjectResolvingEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID);
		}
		return sequenceLinkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRevenue() {
		if (revenue != null && revenue.eIsProxy()) {
			InternalEObject oldRevenue = (InternalEObject)revenue;
			revenue = (CodeableConcept)eResolveProxy(oldRevenue);
			if (revenue != oldRevenue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__REVENUE, oldRevenue, revenue));
			}
		}
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenue(CodeableConcept newRevenue) {
		CodeableConcept oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__REVENUE, oldRevenue, revenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (CodeableConcept)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (CodeableConcept)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(CodeableConcept newService) {
		CodeableConcept oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getFee() {
		if (fee != null && fee.eIsProxy()) {
			InternalEObject oldFee = (InternalEObject)fee;
			fee = (Money)eResolveProxy(oldFee);
			if (fee != oldFee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__FEE, oldFee, fee));
			}
		}
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetFee() {
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFee(Money newFee) {
		Money oldFee = fee;
		fee = newFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__FEE, oldFee, fee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumbers() {
		if (noteNumbers == null) {
			noteNumbers = new EObjectResolvingEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER);
		}
		return noteNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ClaimResponseItemAdjudication>(ClaimResponseItemAdjudication.class, this, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAddedItemAddedItemsDetail> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<ClaimResponseAddedItemAddedItemsDetail>(ClaimResponseAddedItemAddedItemsDetail.class, this, ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID:
				return getSequenceLinkIds();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__REVENUE:
				if (resolve) return getRevenue();
				return basicGetRevenue();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__MODIFIER:
				return getModifiers();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__FEE:
				if (resolve) return getFee();
				return basicGetFee();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER:
				return getNoteNumbers();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				return getAdjudications();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
				return getDetails();
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
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID:
				getSequenceLinkIds().clear();
				getSequenceLinkIds().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__REVENUE:
				setRevenue((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE:
				setService((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__FEE:
				setFee((Money)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER:
				getNoteNumbers().clear();
				getNoteNumbers().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ClaimResponseItemAdjudication>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
				getDetails().clear();
				getDetails().addAll((Collection<? extends ClaimResponseAddedItemAddedItemsDetail>)newValue);
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
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID:
				getSequenceLinkIds().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__REVENUE:
				setRevenue((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE:
				setService((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__FEE:
				setFee((Money)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER:
				getNoteNumbers().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				getAdjudications().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
				getDetails().clear();
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
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID:
				return sequenceLinkIds != null && !sequenceLinkIds.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__REVENUE:
				return revenue != null;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__CATEGORY:
				return category != null;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE:
				return service != null;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__FEE:
				return fee != null;
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER:
				return noteNumbers != null && !noteNumbers.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
				return details != null && !details.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseAddedItemImpl

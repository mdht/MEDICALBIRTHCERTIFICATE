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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefits;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefitsBenefit;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Insurance Benefits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsImpl#getFinancials <em>Financial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EligibilityResponseInsuranceBenefitsImpl extends BackboneElementImpl implements EligibilityResponseInsuranceBenefits {
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
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subCategory;

	/**
	 * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean excluded;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept network;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept term;

	/**
	 * The cached value of the '{@link #getFinancials() <em>Financial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancials()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseInsuranceBenefitsBenefit> financials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseInsuranceBenefitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEligibilityResponseInsuranceBenefits();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubCategory() {
		if (subCategory != null && subCategory.eIsProxy()) {
			InternalEObject oldSubCategory = (InternalEObject)subCategory;
			subCategory = (CodeableConcept)eResolveProxy(oldSubCategory);
			if (subCategory != oldSubCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__SUB_CATEGORY, oldSubCategory, subCategory));
			}
		}
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSubCategory() {
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubCategory(CodeableConcept newSubCategory) {
		CodeableConcept oldSubCategory = subCategory;
		subCategory = newSubCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__SUB_CATEGORY, oldSubCategory, subCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getExcluded() {
		if (excluded != null && excluded.eIsProxy()) {
			InternalEObject oldExcluded = (InternalEObject)excluded;
			excluded = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldExcluded);
			if (excluded != oldExcluded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__EXCLUDED, oldExcluded, excluded));
			}
		}
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetExcluded() {
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcluded(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newExcluded) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldExcluded = excluded;
		excluded = newExcluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__EXCLUDED, oldExcluded, excluded));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (CodeableConcept)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(CodeableConcept newNetwork) {
		CodeableConcept oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (CodeableConcept)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(CodeableConcept newUnit) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTerm() {
		if (term != null && term.eIsProxy()) {
			InternalEObject oldTerm = (InternalEObject)term;
			term = (CodeableConcept)eResolveProxy(oldTerm);
			if (term != oldTerm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__TERM, oldTerm, term));
			}
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(CodeableConcept newTerm) {
		CodeableConcept oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EligibilityResponseInsuranceBenefitsBenefit> getFinancials() {
		if (financials == null) {
			financials = new EObjectContainmentEList<EligibilityResponseInsuranceBenefitsBenefit>(EligibilityResponseInsuranceBenefitsBenefit.class, this, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__FINANCIAL);
		}
		return financials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__FINANCIAL:
				return ((InternalEList<?>)getFinancials()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__SUB_CATEGORY:
				if (resolve) return getSubCategory();
				return basicGetSubCategory();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__EXCLUDED:
				if (resolve) return getExcluded();
				return basicGetExcluded();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__TERM:
				if (resolve) return getTerm();
				return basicGetTerm();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__FINANCIAL:
				return getFinancials();
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__SUB_CATEGORY:
				setSubCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__EXCLUDED:
				setExcluded((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NETWORK:
				setNetwork((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__TERM:
				setTerm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__FINANCIAL:
				getFinancials().clear();
				getFinancials().addAll((Collection<? extends EligibilityResponseInsuranceBenefitsBenefit>)newValue);
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__SUB_CATEGORY:
				setSubCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__EXCLUDED:
				setExcluded((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NETWORK:
				setNetwork((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__TERM:
				setTerm((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__FINANCIAL:
				getFinancials().clear();
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__CATEGORY:
				return category != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__SUB_CATEGORY:
				return subCategory != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__EXCLUDED:
				return excluded != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NAME:
				return name != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__DESCRIPTION:
				return description != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__NETWORK:
				return network != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__UNIT:
				return unit != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__TERM:
				return term != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS__FINANCIAL:
				return financials != null && !financials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseInsuranceBenefitsImpl
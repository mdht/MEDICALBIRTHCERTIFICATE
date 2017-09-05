/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationProductIngredient;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Product Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationProductIngredientImpl#getItemx <em>Itemx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationProductIngredientImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationProductIngredientImpl extends BackboneElementImpl implements MedicationProductIngredient {
	/**
	 * The cached value of the '{@link #getItemx() <em>Itemx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemx()
	 * @generated
	 * @ordered
	 */
	protected Base itemx;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Ratio amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationProductIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationProductIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getItemx() {
		if (itemx != null && itemx.eIsProxy()) {
			InternalEObject oldItemx = (InternalEObject)itemx;
			itemx = (Base)eResolveProxy(oldItemx);
			if (itemx != oldItemx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__ITEMX, oldItemx, itemx));
			}
		}
		return itemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetItemx() {
		return itemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemx(Base newItemx) {
		Base oldItemx = itemx;
		itemx = newItemx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__ITEMX, oldItemx, itemx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getAmount() {
		if (amount != null && amount.eIsProxy()) {
			InternalEObject oldAmount = (InternalEObject)amount;
			amount = (Ratio)eResolveProxy(oldAmount);
			if (amount != oldAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__AMOUNT, oldAmount, amount));
			}
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio basicGetAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Ratio newAmount) {
		Ratio oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__ITEMX:
				if (resolve) return getItemx();
				return basicGetItemx();
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__AMOUNT:
				if (resolve) return getAmount();
				return basicGetAmount();
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
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__ITEMX:
				setItemx((Base)newValue);
				return;
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__AMOUNT:
				setAmount((Ratio)newValue);
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
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__ITEMX:
				setItemx((Base)null);
				return;
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__AMOUNT:
				setAmount((Ratio)null);
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
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__ITEMX:
				return itemx != null;
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationProductIngredientImpl
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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Money;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.ContractTermTermValuedItem;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Term Term Valued Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractTermTermValuedItemImpl#getEntityx <em>Entityx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractTermTermValuedItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractTermTermValuedItemImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractTermTermValuedItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractTermTermValuedItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractTermTermValuedItemImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractTermTermValuedItemImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractTermTermValuedItemImpl#getNet <em>Net</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractTermTermValuedItemImpl extends BackboneElementImpl implements ContractTermTermValuedItem {
	/**
	 * The cached value of the '{@link #getEntityx() <em>Entityx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityx()
	 * @generated
	 * @ordered
	 */
	protected Base entityx;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getEffectiveTime() <em>Effective Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveTime;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Decimal points;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermTermValuedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractTermTermValuedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getEntityx() {
		if (entityx != null && entityx.eIsProxy()) {
			InternalEObject oldEntityx = (InternalEObject)entityx;
			entityx = (Base)eResolveProxy(oldEntityx);
			if (entityx != oldEntityx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__ENTITYX, oldEntityx, entityx));
			}
		}
		return entityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetEntityx() {
		return entityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityx(Base newEntityx) {
		Base oldEntityx = entityx;
		entityx = newEntityx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__ENTITYX, oldEntityx, entityx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEffectiveTime() {
		if (effectiveTime != null && effectiveTime.eIsProxy()) {
			InternalEObject oldEffectiveTime = (InternalEObject)effectiveTime;
			effectiveTime = (DateTime)eResolveProxy(oldEffectiveTime);
			if (effectiveTime != oldEffectiveTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__EFFECTIVE_TIME, oldEffectiveTime, effectiveTime));
			}
		}
		return effectiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetEffectiveTime() {
		return effectiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveTime(DateTime newEffectiveTime) {
		DateTime oldEffectiveTime = effectiveTime;
		effectiveTime = newEffectiveTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__EFFECTIVE_TIME, oldEffectiveTime, effectiveTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnitPrice() {
		if (unitPrice != null && unitPrice.eIsProxy()) {
			InternalEObject oldUnitPrice = (InternalEObject)unitPrice;
			unitPrice = (Money)eResolveProxy(oldUnitPrice);
			if (unitPrice != oldUnitPrice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__UNIT_PRICE, oldUnitPrice, unitPrice));
			}
		}
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Money newUnitPrice) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__UNIT_PRICE, oldUnitPrice, unitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		if (factor != null && factor.eIsProxy()) {
			InternalEObject oldFactor = (InternalEObject)factor;
			factor = (Decimal)eResolveProxy(oldFactor);
			if (factor != oldFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__FACTOR, oldFactor, factor));
			}
		}
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPoints() {
		if (points != null && points.eIsProxy()) {
			InternalEObject oldPoints = (InternalEObject)points;
			points = (Decimal)eResolveProxy(oldPoints);
			if (points != oldPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__POINTS, oldPoints, points));
			}
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(Decimal newPoints) {
		Decimal oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getNet() {
		if (net != null && net.eIsProxy()) {
			InternalEObject oldNet = (InternalEObject)net;
			net = (Money)eResolveProxy(oldNet);
			if (net != oldNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__NET, oldNet, net));
			}
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Money newNet) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__ENTITYX:
				if (resolve) return getEntityx();
				return basicGetEntityx();
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__EFFECTIVE_TIME:
				if (resolve) return getEffectiveTime();
				return basicGetEffectiveTime();
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__UNIT_PRICE:
				if (resolve) return getUnitPrice();
				return basicGetUnitPrice();
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__FACTOR:
				if (resolve) return getFactor();
				return basicGetFactor();
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__POINTS:
				if (resolve) return getPoints();
				return basicGetPoints();
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__NET:
				if (resolve) return getNet();
				return basicGetNet();
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
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__ENTITYX:
				setEntityx((Base)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__EFFECTIVE_TIME:
				setEffectiveTime((DateTime)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__POINTS:
				setPoints((Decimal)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__NET:
				setNet((Money)newValue);
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
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__ENTITYX:
				setEntityx((Base)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__EFFECTIVE_TIME:
				setEffectiveTime((DateTime)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__FACTOR:
				setFactor((Decimal)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__POINTS:
				setPoints((Decimal)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__NET:
				setNet((Money)null);
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
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__ENTITYX:
				return entityx != null;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__EFFECTIVE_TIME:
				return effectiveTime != null;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__QUANTITY:
				return quantity != null;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__FACTOR:
				return factor != null;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__POINTS:
				return points != null;
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM__NET:
				return net != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractTermTermValuedItemImpl

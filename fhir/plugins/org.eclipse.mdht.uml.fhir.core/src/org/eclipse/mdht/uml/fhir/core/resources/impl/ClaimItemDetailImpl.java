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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Money;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimItemDetail;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimItemDetailSubDetail;
import org.eclipse.mdht.uml.fhir.core.resources.Device;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Item Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getProgramCodes <em>Program Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getUdis <em>Udi</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemDetailImpl#getSubDetails <em>Sub Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimItemDetailImpl extends BackboneElementImpl implements ClaimItemDetail {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

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
	 * The cached value of the '{@link #getProgramCodes() <em>Program Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> programCodes;

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
	 * The cached value of the '{@link #getNet() <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdis() <em>Udi</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdis()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> udis;

	/**
	 * The cached value of the '{@link #getSubDetails() <em>Sub Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimItemDetailSubDetail> subDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimItemDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (PositiveInt)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_DETAIL__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_DETAIL__SEQUENCE, oldSequence, sequence));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_DETAIL__REVENUE, oldRevenue, revenue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_DETAIL__REVENUE, oldRevenue, revenue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_DETAIL__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_DETAIL__CATEGORY, oldCategory, category));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_DETAIL__SERVICE, oldService, service));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_DETAIL__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CLAIM_ITEM_DETAIL__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getProgramCodes() {
		if (programCodes == null) {
			programCodes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CLAIM_ITEM_DETAIL__PROGRAM_CODE);
		}
		return programCodes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_DETAIL__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_DETAIL__QUANTITY, oldQuantity, quantity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_DETAIL__UNIT_PRICE, oldUnitPrice, unitPrice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_DETAIL__UNIT_PRICE, oldUnitPrice, unitPrice));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_DETAIL__FACTOR, oldFactor, factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_DETAIL__FACTOR, oldFactor, factor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_DETAIL__NET, oldNet, net));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_DETAIL__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getUdis() {
		if (udis == null) {
			udis = new EObjectResolvingEList<Device>(Device.class, this, ResourcesPackage.CLAIM_ITEM_DETAIL__UDI);
		}
		return udis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimItemDetailSubDetail> getSubDetails() {
		if (subDetails == null) {
			subDetails = new EObjectContainmentEList<ClaimItemDetailSubDetail>(ClaimItemDetailSubDetail.class, this, ResourcesPackage.CLAIM_ITEM_DETAIL__SUB_DETAIL);
		}
		return subDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SUB_DETAIL:
				return ((InternalEList<?>)getSubDetails()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__REVENUE:
				if (resolve) return getRevenue();
				return basicGetRevenue();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__MODIFIER:
				return getModifiers();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__PROGRAM_CODE:
				return getProgramCodes();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__UNIT_PRICE:
				if (resolve) return getUnitPrice();
				return basicGetUnitPrice();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__FACTOR:
				if (resolve) return getFactor();
				return basicGetFactor();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__NET:
				if (resolve) return getNet();
				return basicGetNet();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__UDI:
				return getUdis();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SUB_DETAIL:
				return getSubDetails();
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
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__REVENUE:
				setRevenue((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SERVICE:
				setService((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__PROGRAM_CODE:
				getProgramCodes().clear();
				getProgramCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__NET:
				setNet((Money)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__UDI:
				getUdis().clear();
				getUdis().addAll((Collection<? extends Device>)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
				getSubDetails().addAll((Collection<? extends ClaimItemDetailSubDetail>)newValue);
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
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__REVENUE:
				setRevenue((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SERVICE:
				setService((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__PROGRAM_CODE:
				getProgramCodes().clear();
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__FACTOR:
				setFactor((Decimal)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__NET:
				setNet((Money)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__UDI:
				getUdis().clear();
				return;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
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
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__REVENUE:
				return revenue != null;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__CATEGORY:
				return category != null;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SERVICE:
				return service != null;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__PROGRAM_CODE:
				return programCodes != null && !programCodes.isEmpty();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__QUANTITY:
				return quantity != null;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__UNIT_PRICE:
				return unitPrice != null;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__FACTOR:
				return factor != null;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__NET:
				return net != null;
			case ResourcesPackage.CLAIM_ITEM_DETAIL__UDI:
				return udis != null && !udis.isEmpty();
			case ResourcesPackage.CLAIM_ITEM_DETAIL__SUB_DETAIL:
				return subDetails != null && !subDetails.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimItemDetailImpl
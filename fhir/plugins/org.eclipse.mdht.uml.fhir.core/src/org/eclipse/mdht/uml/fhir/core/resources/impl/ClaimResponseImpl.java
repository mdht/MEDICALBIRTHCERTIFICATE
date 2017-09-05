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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Money;
import org.eclipse.mdht.uml.fhir.core.resources.Claim;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponse;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseAddedItem;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseError;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseInsurance;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseItem;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseNote;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponsePayment;
import org.eclipse.mdht.uml.fhir.core.resources.CommunicationRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getAddItems <em>Add Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getErrors <em>Error</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getCommunicationRequests <em>Communication Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseImpl#getInsurances <em>Insurance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimResponseImpl extends DomainResourceImpl implements ClaimResponse {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Organization insurer;

	/**
	 * The cached value of the '{@link #getRequestProvider() <em>Request Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner requestProvider;

	/**
	 * The cached value of the '{@link #getRequestOrganization() <em>Request Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization requestOrganization;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Claim request;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String disposition;

	/**
	 * The cached value of the '{@link #getPayeeType() <em>Payee Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept payeeType;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItem> items;

	/**
	 * The cached value of the '{@link #getAddItems() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddedItem> addItems;

	/**
	 * The cached value of the '{@link #getErrors() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseError> errors;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected Money totalCost;

	/**
	 * The cached value of the '{@link #getUnallocDeductable() <em>Unalloc Deductable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnallocDeductable()
	 * @generated
	 * @ordered
	 */
	protected Money unallocDeductable;

	/**
	 * The cached value of the '{@link #getTotalBenefit() <em>Total Benefit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBenefit()
	 * @generated
	 * @ordered
	 */
	protected Money totalBenefit;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponsePayment payment;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Coding reserved;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseNote> notes;

	/**
	 * The cached value of the '{@link #getCommunicationRequests() <em>Communication Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRequest> communicationRequests;

	/**
	 * The cached value of the '{@link #getInsurances() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurances()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseInsurance> insurances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		if (created != null && created.eIsProxy()) {
			InternalEObject oldCreated = (InternalEObject)created;
			created = (DateTime)eResolveProxy(oldCreated);
			if (created != oldCreated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__CREATED, oldCreated, created));
			}
		}
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getInsurer() {
		if (insurer != null && insurer.eIsProxy()) {
			InternalEObject oldInsurer = (InternalEObject)insurer;
			insurer = (Organization)eResolveProxy(oldInsurer);
			if (insurer != oldInsurer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__INSURER, oldInsurer, insurer));
			}
		}
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetInsurer() {
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurer(Organization newInsurer) {
		Organization oldInsurer = insurer;
		insurer = newInsurer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__INSURER, oldInsurer, insurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getRequestProvider() {
		if (requestProvider != null && requestProvider.eIsProxy()) {
			InternalEObject oldRequestProvider = (InternalEObject)requestProvider;
			requestProvider = (Practitioner)eResolveProxy(oldRequestProvider);
			if (requestProvider != oldRequestProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
			}
		}
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetRequestProvider() {
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProvider(Practitioner newRequestProvider) {
		Practitioner oldRequestProvider = requestProvider;
		requestProvider = newRequestProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getRequestOrganization() {
		if (requestOrganization != null && requestOrganization.eIsProxy()) {
			InternalEObject oldRequestOrganization = (InternalEObject)requestOrganization;
			requestOrganization = (Organization)eResolveProxy(oldRequestOrganization);
			if (requestOrganization != oldRequestOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
			}
		}
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetRequestOrganization() {
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrganization(Organization newRequestOrganization) {
		Organization oldRequestOrganization = requestOrganization;
		requestOrganization = newRequestOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Claim)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Claim newRequest) {
		Claim oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (CodeableConcept)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDisposition() {
		if (disposition != null && disposition.eIsProxy()) {
			InternalEObject oldDisposition = (InternalEObject)disposition;
			disposition = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDisposition);
			if (disposition != oldDisposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__DISPOSITION, oldDisposition, disposition));
			}
		}
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDisposition) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__DISPOSITION, oldDisposition, disposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPayeeType() {
		if (payeeType != null && payeeType.eIsProxy()) {
			InternalEObject oldPayeeType = (InternalEObject)payeeType;
			payeeType = (CodeableConcept)eResolveProxy(oldPayeeType);
			if (payeeType != oldPayeeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE, oldPayeeType, payeeType));
			}
		}
		return payeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetPayeeType() {
		return payeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayeeType(CodeableConcept newPayeeType) {
		CodeableConcept oldPayeeType = payeeType;
		payeeType = newPayeeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE, oldPayeeType, payeeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ClaimResponseItem>(ClaimResponseItem.class, this, ResourcesPackage.CLAIM_RESPONSE__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAddedItem> getAddItems() {
		if (addItems == null) {
			addItems = new EObjectContainmentEList<ClaimResponseAddedItem>(ClaimResponseAddedItem.class, this, ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM);
		}
		return addItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseError> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<ClaimResponseError>(ClaimResponseError.class, this, ResourcesPackage.CLAIM_RESPONSE__ERROR);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalCost() {
		if (totalCost != null && totalCost.eIsProxy()) {
			InternalEObject oldTotalCost = (InternalEObject)totalCost;
			totalCost = (Money)eResolveProxy(oldTotalCost);
			if (totalCost != oldTotalCost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__TOTAL_COST, oldTotalCost, totalCost));
			}
		}
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(Money newTotalCost) {
		Money oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__TOTAL_COST, oldTotalCost, totalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnallocDeductable() {
		if (unallocDeductable != null && unallocDeductable.eIsProxy()) {
			InternalEObject oldUnallocDeductable = (InternalEObject)unallocDeductable;
			unallocDeductable = (Money)eResolveProxy(oldUnallocDeductable);
			if (unallocDeductable != oldUnallocDeductable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, oldUnallocDeductable, unallocDeductable));
			}
		}
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetUnallocDeductable() {
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnallocDeductable(Money newUnallocDeductable) {
		Money oldUnallocDeductable = unallocDeductable;
		unallocDeductable = newUnallocDeductable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, oldUnallocDeductable, unallocDeductable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalBenefit() {
		if (totalBenefit != null && totalBenefit.eIsProxy()) {
			InternalEObject oldTotalBenefit = (InternalEObject)totalBenefit;
			totalBenefit = (Money)eResolveProxy(oldTotalBenefit);
			if (totalBenefit != oldTotalBenefit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, oldTotalBenefit, totalBenefit));
			}
		}
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotalBenefit() {
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBenefit(Money newTotalBenefit) {
		Money oldTotalBenefit = totalBenefit;
		totalBenefit = newTotalBenefit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, oldTotalBenefit, totalBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponsePayment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(ClaimResponsePayment newPayment, NotificationChain msgs) {
		ClaimResponsePayment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PAYMENT, oldPayment, newPayment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(ClaimResponsePayment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getReserved() {
		if (reserved != null && reserved.eIsProxy()) {
			InternalEObject oldReserved = (InternalEObject)reserved;
			reserved = (Coding)eResolveProxy(oldReserved);
			if (reserved != oldReserved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__RESERVED, oldReserved, reserved));
			}
		}
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Coding newReserved) {
		Coding oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		if (form != null && form.eIsProxy()) {
			InternalEObject oldForm = (InternalEObject)form;
			form = (CodeableConcept)eResolveProxy(oldForm);
			if (form != oldForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE__FORM, oldForm, form));
			}
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseNote> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<ClaimResponseNote>(ClaimResponseNote.class, this, ResourcesPackage.CLAIM_RESPONSE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationRequest> getCommunicationRequests() {
		if (communicationRequests == null) {
			communicationRequests = new EObjectResolvingEList<CommunicationRequest>(CommunicationRequest.class, this, ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST);
		}
		return communicationRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseInsurance> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<ClaimResponseInsurance>(ClaimResponseInsurance.class, this, ResourcesPackage.CLAIM_RESPONSE__INSURANCE);
		}
		return insurances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				return ((InternalEList<?>)getAddItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				return basicSetPayment(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				if (resolve) return getInsurer();
				return basicGetInsurer();
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				if (resolve) return getRequestProvider();
				return basicGetRequestProvider();
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				if (resolve) return getRequestOrganization();
				return basicGetRequestOrganization();
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				if (resolve) return getDisposition();
				return basicGetDisposition();
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				if (resolve) return getPayeeType();
				return basicGetPayeeType();
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				return getItems();
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				return getAddItems();
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				return getErrors();
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL_COST:
				if (resolve) return getTotalCost();
				return basicGetTotalCost();
			case ResourcesPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				if (resolve) return getUnallocDeductable();
				return basicGetUnallocDeductable();
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				if (resolve) return getTotalBenefit();
				return basicGetTotalBenefit();
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				return getPayment();
			case ResourcesPackage.CLAIM_RESPONSE__RESERVED:
				if (resolve) return getReserved();
				return basicGetReserved();
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case ResourcesPackage.CLAIM_RESPONSE__NOTE:
				return getNotes();
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return getCommunicationRequests();
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				return getInsurances();
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
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				setInsurer((Organization)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Claim)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends ClaimResponseItem>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItems().clear();
				getAddItems().addAll((Collection<? extends ClaimResponseAddedItem>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				getErrors().clear();
				getErrors().addAll((Collection<? extends ClaimResponseError>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL_COST:
				setTotalCost((Money)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				setTotalBenefit((Money)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				setPayment((ClaimResponsePayment)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__RESERVED:
				setReserved((Coding)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends ClaimResponseNote>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequests().clear();
				getCommunicationRequests().addAll((Collection<? extends CommunicationRequest>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends ClaimResponseInsurance>)newValue);
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
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				setInsurer((Organization)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Claim)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				getItems().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItems().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				getErrors().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL_COST:
				setTotalCost((Money)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				setTotalBenefit((Money)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				setPayment((ClaimResponsePayment)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__RESERVED:
				setReserved((Coding)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				setForm((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequests().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				getInsurances().clear();
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
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				return created != null;
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				return insurer != null;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				return requestProvider != null;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				return requestOrganization != null;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				return request != null;
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				return outcome != null;
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				return disposition != null;
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return payeeType != null;
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				return items != null && !items.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				return addItems != null && !addItems.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				return errors != null && !errors.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL_COST:
				return totalCost != null;
			case ResourcesPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				return unallocDeductable != null;
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				return totalBenefit != null;
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				return payment != null;
			case ResourcesPackage.CLAIM_RESPONSE__RESERVED:
				return reserved != null;
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				return form != null;
			case ResourcesPackage.CLAIM_RESPONSE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return communicationRequests != null && !communicationRequests.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				return insurances != null && !insurances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.PaymentNotice;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Notice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PaymentNoticeImpl#getPaymentStatus <em>Payment Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentNoticeImpl extends DomainResourceImpl implements PaymentNotice {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Resource request;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Resource response;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Organization target;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner provider;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept paymentStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentNoticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPaymentNotice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.PAYMENT_NOTICE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Resource)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Resource newRequest) {
		Resource oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (Resource)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Resource newResponse) {
		Resource oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStatusDate() {
		if (statusDate != null && statusDate.eIsProxy()) {
			InternalEObject oldStatusDate = (InternalEObject)statusDate;
			statusDate = (Date)eResolveProxy(oldStatusDate);
			if (statusDate != oldStatusDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__STATUS_DATE, oldStatusDate, statusDate));
			}
		}
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(Date newStatusDate) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__STATUS_DATE, oldStatusDate, statusDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Organization)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Organization newTarget) {
		Organization oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Practitioner)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Practitioner newProvider) {
		Practitioner oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPaymentStatus() {
		if (paymentStatus != null && paymentStatus.eIsProxy()) {
			InternalEObject oldPaymentStatus = (InternalEObject)paymentStatus;
			paymentStatus = (CodeableConcept)eResolveProxy(oldPaymentStatus);
			if (paymentStatus != oldPaymentStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PAYMENT_NOTICE__PAYMENT_STATUS, oldPaymentStatus, paymentStatus));
			}
		}
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatus(CodeableConcept newPaymentStatus) {
		CodeableConcept oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_NOTICE__PAYMENT_STATUS, oldPaymentStatus, paymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.PAYMENT_NOTICE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PAYMENT_NOTICE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.PAYMENT_NOTICE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case ResourcesPackage.PAYMENT_NOTICE__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case ResourcesPackage.PAYMENT_NOTICE__STATUS_DATE:
				if (resolve) return getStatusDate();
				return basicGetStatusDate();
			case ResourcesPackage.PAYMENT_NOTICE__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case ResourcesPackage.PAYMENT_NOTICE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ResourcesPackage.PAYMENT_NOTICE__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case ResourcesPackage.PAYMENT_NOTICE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case ResourcesPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				if (resolve) return getPaymentStatus();
				return basicGetPaymentStatus();
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
			case ResourcesPackage.PAYMENT_NOTICE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__REQUEST:
				setRequest((Resource)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__RESPONSE:
				setResponse((Resource)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__TARGET:
				setTarget((Organization)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				setPaymentStatus((CodeableConcept)newValue);
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
			case ResourcesPackage.PAYMENT_NOTICE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PAYMENT_NOTICE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__REQUEST:
				setRequest((Resource)null);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__RESPONSE:
				setResponse((Resource)null);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__STATUS_DATE:
				setStatusDate((Date)null);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__TARGET:
				setTarget((Organization)null);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ResourcesPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				setPaymentStatus((CodeableConcept)null);
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
			case ResourcesPackage.PAYMENT_NOTICE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PAYMENT_NOTICE__STATUS:
				return status != null;
			case ResourcesPackage.PAYMENT_NOTICE__REQUEST:
				return request != null;
			case ResourcesPackage.PAYMENT_NOTICE__RESPONSE:
				return response != null;
			case ResourcesPackage.PAYMENT_NOTICE__STATUS_DATE:
				return statusDate != null;
			case ResourcesPackage.PAYMENT_NOTICE__CREATED:
				return created != null;
			case ResourcesPackage.PAYMENT_NOTICE__TARGET:
				return target != null;
			case ResourcesPackage.PAYMENT_NOTICE__PROVIDER:
				return provider != null;
			case ResourcesPackage.PAYMENT_NOTICE__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				return paymentStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentNoticeImpl

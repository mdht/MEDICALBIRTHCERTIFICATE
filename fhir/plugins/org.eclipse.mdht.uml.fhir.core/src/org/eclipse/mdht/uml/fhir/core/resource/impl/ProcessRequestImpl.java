/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.ProcessRequest;
import org.eclipse.mdht.uml.fhir.core.resource.ProcessRequestItems;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getNullify <em>Nullify</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getExcludes <em>Exclude</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRequestImpl extends DomainResourceImpl implements ProcessRequest {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Code action;

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
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

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
	 * The cached value of the '{@link #getNullify() <em>Nullify</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullify()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean nullify;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String reference;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessRequestItems> items;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Include</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Exclude</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> excludes;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getProcessRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Code)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Code newAction) {
		Code oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.PROCESS_REQUEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		if (ruleset != null && ruleset.eIsProxy()) {
			InternalEObject oldRuleset = (InternalEObject)ruleset;
			ruleset = (Coding)eResolveProxy(oldRuleset);
			if (ruleset != oldRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__RULESET, oldRuleset, ruleset));
			}
		}
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__RULESET, oldRuleset, ruleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		if (originalRuleset != null && originalRuleset.eIsProxy()) {
			InternalEObject oldOriginalRuleset = (InternalEObject)originalRuleset;
			originalRuleset = (Coding)eResolveProxy(oldOriginalRuleset);
			if (originalRuleset != oldOriginalRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
			}
		}
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__CREATED, oldCreated, created));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__TARGET, oldTarget, target));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__PROVIDER, oldProvider, provider));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__ORGANIZATION, oldOrganization, organization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__ORGANIZATION, oldOrganization, organization));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__REQUEST, oldRequest, request));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__REQUEST, oldRequest, request));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__RESPONSE, oldResponse, response));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getNullify() {
		if (nullify != null && nullify.eIsProxy()) {
			InternalEObject oldNullify = (InternalEObject)nullify;
			nullify = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldNullify);
			if (nullify != oldNullify) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__NULLIFY, oldNullify, nullify));
			}
		}
		return nullify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetNullify() {
		return nullify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullify(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newNullify) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldNullify = nullify;
		nullify = newNullify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__NULLIFY, oldNullify, nullify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(org.eclipse.mdht.uml.fhir.core.datatype.String newReference) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessRequestItems> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ProcessRequestItems>(ProcessRequestItems.class, this, FhirResourcePackage.PROCESS_REQUEST__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getIncludes() {
		if (includes == null) {
			includes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.PROCESS_REQUEST__INCLUDE);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.PROCESS_REQUEST__EXCLUDE);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.PROCESS_REQUEST__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.PROCESS_REQUEST__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case FhirResourcePackage.PROCESS_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.PROCESS_REQUEST__RULESET:
				if (resolve) return getRuleset();
				return basicGetRuleset();
			case FhirResourcePackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				if (resolve) return getOriginalRuleset();
				return basicGetOriginalRuleset();
			case FhirResourcePackage.PROCESS_REQUEST__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case FhirResourcePackage.PROCESS_REQUEST__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FhirResourcePackage.PROCESS_REQUEST__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case FhirResourcePackage.PROCESS_REQUEST__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case FhirResourcePackage.PROCESS_REQUEST__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case FhirResourcePackage.PROCESS_REQUEST__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case FhirResourcePackage.PROCESS_REQUEST__NULLIFY:
				if (resolve) return getNullify();
				return basicGetNullify();
			case FhirResourcePackage.PROCESS_REQUEST__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case FhirResourcePackage.PROCESS_REQUEST__ITEM:
				return getItems();
			case FhirResourcePackage.PROCESS_REQUEST__INCLUDE:
				return getIncludes();
			case FhirResourcePackage.PROCESS_REQUEST__EXCLUDE:
				return getExcludes();
			case FhirResourcePackage.PROCESS_REQUEST__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
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
			case FhirResourcePackage.PROCESS_REQUEST__ACTION:
				setAction((Code)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__TARGET:
				setTarget((Organization)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__REQUEST:
				setRequest((Resource)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__RESPONSE:
				setResponse((Resource)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__NULLIFY:
				setNullify((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__REFERENCE:
				setReference((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends ProcessRequestItems>)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__INCLUDE:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__EXCLUDE:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirResourcePackage.PROCESS_REQUEST__ACTION:
				setAction((Code)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.PROCESS_REQUEST__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__TARGET:
				setTarget((Organization)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__REQUEST:
				setRequest((Resource)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__RESPONSE:
				setResponse((Resource)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__NULLIFY:
				setNullify((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__REFERENCE:
				setReference((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.PROCESS_REQUEST__ITEM:
				getItems().clear();
				return;
			case FhirResourcePackage.PROCESS_REQUEST__INCLUDE:
				getIncludes().clear();
				return;
			case FhirResourcePackage.PROCESS_REQUEST__EXCLUDE:
				getExcludes().clear();
				return;
			case FhirResourcePackage.PROCESS_REQUEST__PERIOD:
				setPeriod((Period)null);
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
			case FhirResourcePackage.PROCESS_REQUEST__ACTION:
				return action != null;
			case FhirResourcePackage.PROCESS_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.PROCESS_REQUEST__RULESET:
				return ruleset != null;
			case FhirResourcePackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirResourcePackage.PROCESS_REQUEST__CREATED:
				return created != null;
			case FhirResourcePackage.PROCESS_REQUEST__TARGET:
				return target != null;
			case FhirResourcePackage.PROCESS_REQUEST__PROVIDER:
				return provider != null;
			case FhirResourcePackage.PROCESS_REQUEST__ORGANIZATION:
				return organization != null;
			case FhirResourcePackage.PROCESS_REQUEST__REQUEST:
				return request != null;
			case FhirResourcePackage.PROCESS_REQUEST__RESPONSE:
				return response != null;
			case FhirResourcePackage.PROCESS_REQUEST__NULLIFY:
				return nullify != null;
			case FhirResourcePackage.PROCESS_REQUEST__REFERENCE:
				return reference != null;
			case FhirResourcePackage.PROCESS_REQUEST__ITEM:
				return items != null && !items.isEmpty();
			case FhirResourcePackage.PROCESS_REQUEST__INCLUDE:
				return includes != null && !includes.isEmpty();
			case FhirResourcePackage.PROCESS_REQUEST__EXCLUDE:
				return excludes != null && !excludes.isEmpty();
			case FhirResourcePackage.PROCESS_REQUEST__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessRequestImpl
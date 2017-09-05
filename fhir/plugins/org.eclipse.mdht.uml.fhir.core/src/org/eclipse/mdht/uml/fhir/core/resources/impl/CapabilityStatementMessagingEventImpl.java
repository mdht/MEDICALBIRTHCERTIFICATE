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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementMessagingEvent;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Messaging Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingEventImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingEventImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingEventImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingEventImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingEventImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingEventImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingEventImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityStatementMessagingEventImpl extends BackboneElementImpl implements CapabilityStatementMessagingEvent {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Coding code;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Code category;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Code mode;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Code focus;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition request;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition response;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementMessagingEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementMessagingEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Coding)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Coding newCode) {
		Coding oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Code)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Code newCategory) {
		Code oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (Code)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Code newMode) {
		Code oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getFocus() {
		if (focus != null && focus.eIsProxy()) {
			InternalEObject oldFocus = (InternalEObject)focus;
			focus = (Code)eResolveProxy(oldFocus);
			if (focus != oldFocus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__FOCUS, oldFocus, focus));
			}
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Code newFocus) {
		Code oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__FOCUS, oldFocus, focus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (StructureDefinition)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(StructureDefinition newRequest) {
		StructureDefinition oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (StructureDefinition)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(StructureDefinition newResponse) {
		StructureDefinition oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDocumentation() {
		if (documentation != null && documentation.eIsProxy()) {
			InternalEObject oldDocumentation = (InternalEObject)documentation;
			documentation = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDocumentation);
			if (documentation != oldDocumentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__DOCUMENTATION, oldDocumentation, documentation));
			}
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDocumentation) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__FOCUS:
				if (resolve) return getFocus();
				return basicGetFocus();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CODE:
				setCode((Coding)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CATEGORY:
				setCategory((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__MODE:
				setMode((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__FOCUS:
				setFocus((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__REQUEST:
				setRequest((StructureDefinition)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__RESPONSE:
				setResponse((StructureDefinition)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CODE:
				setCode((Coding)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CATEGORY:
				setCategory((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__MODE:
				setMode((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__FOCUS:
				setFocus((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__REQUEST:
				setRequest((StructureDefinition)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__RESPONSE:
				setResponse((StructureDefinition)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CODE:
				return code != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__CATEGORY:
				return category != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__MODE:
				return mode != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__FOCUS:
				return focus != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__REQUEST:
				return request != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__RESPONSE:
				return response != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementMessagingEventImpl

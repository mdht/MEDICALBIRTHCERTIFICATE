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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.Device;
import org.eclipse.mdht.uml.fhir.core.resources.MessageHeaderMessageDestination;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Header Message Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MessageHeaderMessageDestinationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MessageHeaderMessageDestinationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MessageHeaderMessageDestinationImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageHeaderMessageDestinationImpl extends BackboneElementImpl implements MessageHeaderMessageDestination {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Device target;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Uri endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageHeaderMessageDestinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMessageHeaderMessageDestination();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Device)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Device newTarget) {
		Device oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getEndpoint() {
		if (endpoint != null && endpoint.eIsProxy()) {
			InternalEObject oldEndpoint = (InternalEObject)endpoint;
			endpoint = (Uri)eResolveProxy(oldEndpoint);
			if (endpoint != oldEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__ENDPOINT, oldEndpoint, endpoint));
			}
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(Uri newEndpoint) {
		Uri oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__ENDPOINT:
				if (resolve) return getEndpoint();
				return basicGetEndpoint();
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
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__TARGET:
				setTarget((Device)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__ENDPOINT:
				setEndpoint((Uri)newValue);
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
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__TARGET:
				setTarget((Device)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__ENDPOINT:
				setEndpoint((Uri)null);
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
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__NAME:
				return name != null;
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__TARGET:
				return target != null;
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION__ENDPOINT:
				return endpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageHeaderMessageDestinationImpl

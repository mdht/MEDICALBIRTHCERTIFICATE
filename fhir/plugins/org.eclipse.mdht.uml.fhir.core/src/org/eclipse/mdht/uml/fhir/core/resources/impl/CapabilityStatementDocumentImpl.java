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
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementDocument;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementDocumentImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementDocumentImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementDocumentImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityStatementDocumentImpl extends BackboneElementImpl implements CapabilityStatementDocument {
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
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String documentation;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementDocument();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__MODE, oldMode, mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__MODE, oldMode, mode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getProfile() {
		if (profile != null && profile.eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject)profile;
			profile = (StructureDefinition)eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(StructureDefinition newProfile) {
		StructureDefinition oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__MODE:
				setMode((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__PROFILE:
				setProfile((StructureDefinition)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__MODE:
				setMode((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__PROFILE:
				setProfile((StructureDefinition)null);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__MODE:
				return mode != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__DOCUMENTATION:
				return documentation != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT__PROFILE:
				return profile != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementDocumentImpl

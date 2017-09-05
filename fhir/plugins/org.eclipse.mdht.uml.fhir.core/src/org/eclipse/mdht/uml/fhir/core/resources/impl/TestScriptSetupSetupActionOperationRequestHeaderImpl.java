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
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionOperationRequestHeader;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Setup Action Operation Request Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationRequestHeaderImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationRequestHeaderImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestScriptSetupSetupActionOperationRequestHeaderImpl extends BackboneElementImpl implements TestScriptSetupSetupActionOperationRequestHeader {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String field;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptSetupSetupActionOperationRequestHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptSetupSetupActionOperationRequestHeader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(org.eclipse.mdht.uml.fhir.core.dataTypes.String newField) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(org.eclipse.mdht.uml.fhir.core.dataTypes.String newValue) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				setField((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				setField((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				return field != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupSetupActionOperationRequestHeaderImpl

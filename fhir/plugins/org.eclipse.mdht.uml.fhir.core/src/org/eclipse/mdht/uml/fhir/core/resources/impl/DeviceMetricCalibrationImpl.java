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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Instant;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.DeviceMetricCalibration;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Metric Calibration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceMetricCalibrationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceMetricCalibrationImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceMetricCalibrationImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceMetricCalibrationImpl extends BackboneElementImpl implements DeviceMetricCalibration {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected Code state;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Instant time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceMetricCalibrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceMetricCalibration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_METRIC_CALIBRATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_METRIC_CALIBRATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (Code)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_METRIC_CALIBRATION__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(Code newState) {
		Code oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_METRIC_CALIBRATION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getTime() {
		if (time != null && time.eIsProxy()) {
			InternalEObject oldTime = (InternalEObject)time;
			time = (Instant)eResolveProxy(oldTime);
			if (time != oldTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_METRIC_CALIBRATION__TIME, oldTime, time));
			}
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Instant newTime) {
		Instant oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_METRIC_CALIBRATION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__STATE:
				if (resolve) return getState();
				return basicGetState();
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__TIME:
				if (resolve) return getTime();
				return basicGetTime();
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
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__STATE:
				setState((Code)newValue);
				return;
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__TIME:
				setTime((Instant)newValue);
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
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__STATE:
				setState((Code)null);
				return;
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__TIME:
				setTime((Instant)null);
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
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__TYPE:
				return type != null;
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__STATE:
				return state != null;
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION__TIME:
				return time != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceMetricCalibrationImpl

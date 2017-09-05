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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ObservationComponent;
import org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ObservationComponentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ObservationComponentImpl#getValuex <em>Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ObservationComponentImpl#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ObservationComponentImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ObservationComponentImpl#getReferenceRanges <em>Reference Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationComponentImpl extends BackboneElementImpl implements ObservationComponent {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * The cached value of the '{@link #getDataAbsentReason() <em>Data Absent Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAbsentReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dataAbsentReason;

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept interpretation;

	/**
	 * The cached value of the '{@link #getReferenceRanges() <em>Reference Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationReferenceRange> referenceRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getObservationComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (CodeableConcept)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OBSERVATION_COMPONENT__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValuex() {
		if (valuex != null && valuex.eIsProxy()) {
			InternalEObject oldValuex = (InternalEObject)valuex;
			valuex = (DataType)eResolveProxy(oldValuex);
			if (valuex != oldValuex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OBSERVATION_COMPONENT__VALUEX, oldValuex, valuex));
			}
		}
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuex(DataType newValuex) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__VALUEX, oldValuex, valuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDataAbsentReason() {
		if (dataAbsentReason != null && dataAbsentReason.eIsProxy()) {
			InternalEObject oldDataAbsentReason = (InternalEObject)dataAbsentReason;
			dataAbsentReason = (CodeableConcept)eResolveProxy(oldDataAbsentReason);
			if (dataAbsentReason != oldDataAbsentReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON, oldDataAbsentReason, dataAbsentReason));
			}
		}
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDataAbsentReason() {
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataAbsentReason(CodeableConcept newDataAbsentReason) {
		CodeableConcept oldDataAbsentReason = dataAbsentReason;
		dataAbsentReason = newDataAbsentReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON, oldDataAbsentReason, dataAbsentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getInterpretation() {
		if (interpretation != null && interpretation.eIsProxy()) {
			InternalEObject oldInterpretation = (InternalEObject)interpretation;
			interpretation = (CodeableConcept)eResolveProxy(oldInterpretation);
			if (interpretation != oldInterpretation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION, oldInterpretation, interpretation));
			}
		}
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(CodeableConcept newInterpretation) {
		CodeableConcept oldInterpretation = interpretation;
		interpretation = newInterpretation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION, oldInterpretation, interpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationReferenceRange> getReferenceRanges() {
		if (referenceRanges == null) {
			referenceRanges = new EObjectContainmentEList<ObservationReferenceRange>(ObservationReferenceRange.class, this, ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE);
		}
		return referenceRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				return ((InternalEList<?>)getReferenceRanges()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				if (resolve) return getValuex();
				return basicGetValuex();
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				if (resolve) return getDataAbsentReason();
				return basicGetDataAbsentReason();
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				if (resolve) return getInterpretation();
				return basicGetInterpretation();
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				return getReferenceRanges();
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
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				setValuex((DataType)newValue);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				setInterpretation((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				getReferenceRanges().clear();
				getReferenceRanges().addAll((Collection<? extends ObservationReferenceRange>)newValue);
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
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				setValuex((DataType)null);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				setInterpretation((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				getReferenceRanges().clear();
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
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				return code != null;
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				return valuex != null;
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				return dataAbsentReason != null;
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				return interpretation != null;
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				return referenceRanges != null && !referenceRanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationComponentImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Timing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getMeasurementPeriod <em>Measurement Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getCalibrations <em>Calibration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric()
 * @model
 * @generated
 */
public interface DeviceMetric extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_Type()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_Identifier()
	 * @model required="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_Unit()
	 * @model
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Device)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_Source()
	 * @model
	 * @generated
	 */
	Device getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Device value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DeviceComponent)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_Parent()
	 * @model
	 * @generated
	 */
	DeviceComponent getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DeviceComponent value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Status</em>' reference.
	 * @see #setOperationalStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_OperationalStatus()
	 * @model
	 * @generated
	 */
	Code getOperationalStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getOperationalStatus <em>Operational Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Status</em>' reference.
	 * @see #getOperationalStatus()
	 * @generated
	 */
	void setOperationalStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' reference.
	 * @see #setColor(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_Color()
	 * @model
	 * @generated
	 */
	Code getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getColor <em>Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Code value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_Category()
	 * @model required="true"
	 * @generated
	 */
	Code getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Code value);

	/**
	 * Returns the value of the '<em><b>Measurement Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Period</em>' reference.
	 * @see #setMeasurementPeriod(Timing)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_MeasurementPeriod()
	 * @model
	 * @generated
	 */
	Timing getMeasurementPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetric#getMeasurementPeriod <em>Measurement Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Period</em>' reference.
	 * @see #getMeasurementPeriod()
	 * @generated
	 */
	void setMeasurementPeriod(Timing value);

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.DeviceMetricCalibration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceMetric_Calibration()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceMetricCalibration> getCalibrations();

} // DeviceMetric

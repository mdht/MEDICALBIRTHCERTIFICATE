/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestReport is a resource that includes summary information on the results of executing a TestScript.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestReportAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReportAction#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestReportAction()
 * @model extendedMetaData="name='TestReport.Action' kind='elementOnly'"
 * @generated
 */
public interface TestReportAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(TestReportOperation)
	 * @see org.hl7.fhir.FhirPackage#getTestReportAction_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReportOperation getOperation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReportAction#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestReportOperation value);

	/**
	 * Returns the value of the '<em><b>Assert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The results of the assertion performed on the previous operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assert</em>' containment reference.
	 * @see #setAssert(TestReportAssert)
	 * @see org.hl7.fhir.FhirPackage#getTestReportAction_Assert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assert' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReportAssert getAssert();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReportAction#getAssert <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert</em>' containment reference.
	 * @see #getAssert()
	 * @generated
	 */
	void setAssert(TestReportAssert value);

} // TestReportAction

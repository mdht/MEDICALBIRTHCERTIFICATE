/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getRatio()
 * @model
 * @generated
 */
public interface Ratio extends DataType {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' reference.
	 * @see #setNumerator(Quantity)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getRatio_Numerator()
	 * @model
	 * @generated
	 */
	Quantity getNumerator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio#getNumerator <em>Numerator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' reference.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(Quantity value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' reference.
	 * @see #setDenominator(Quantity)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getRatio_Denominator()
	 * @model
	 * @generated
	 */
	Quantity getDenominator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio#getDenominator <em>Denominator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(Quantity value);

} // Ratio

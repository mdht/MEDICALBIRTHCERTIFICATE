/**
 */
package org.eclipse.mdht.uml.cda;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.eclipse.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.IdentityDoc#getSeries <em>Series</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.IdentityDoc#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.IdentityDoc#getIssueOrgName <em>Issue Org Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.IdentityDoc#getIssueOrgCode <em>Issue Org Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.IdentityDoc#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.IdentityDoc#getIdentityCardTypeId <em>Identity Card Type Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.CDAPackage#getIdentityDoc()
 * @model
 * @generated
 */
public interface IdentityDoc extends EObject {
	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(ST)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getIdentityDoc_Series()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='Series' namespace='urn:f103' kind='element'"
	 * @generated
	 */
	ST getSeries();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.IdentityDoc#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(ST value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(ST)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getIdentityDoc_Number()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='Number' namespace='urn:f103' kind='element'"
	 * @generated
	 */
	ST getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.IdentityDoc#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(ST value);

	/**
	 * Returns the value of the '<em><b>Issue Org Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Org Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Org Name</em>' containment reference.
	 * @see #setIssueOrgName(ST)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getIdentityDoc_IssueOrgName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='IssueOrgName' namespace='urn:f103' kind='element'"
	 * @generated
	 */
	ST getIssueOrgName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.IdentityDoc#getIssueOrgName <em>Issue Org Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Org Name</em>' containment reference.
	 * @see #getIssueOrgName()
	 * @generated
	 */
	void setIssueOrgName(ST value);

	/**
	 * Returns the value of the '<em><b>Issue Org Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Org Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Org Code</em>' containment reference.
	 * @see #setIssueOrgCode(ST)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getIdentityDoc_IssueOrgCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='IssueOrgCode' namespace='urn:f103' kind='element'"
	 * @generated
	 */
	ST getIssueOrgCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.IdentityDoc#getIssueOrgCode <em>Issue Org Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Org Code</em>' containment reference.
	 * @see #getIssueOrgCode()
	 * @generated
	 */
	void setIssueOrgCode(ST value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' containment reference.
	 * @see #setIssueDate(TS)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getIdentityDoc_IssueDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='IssueDate' namespace='urn:f103' kind='element'"
	 * @generated
	 */
	TS getIssueDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.IdentityDoc#getIssueDate <em>Issue Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' containment reference.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(TS value);

	/**
	 * Returns the value of the '<em><b>Identity Card Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Card Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Card Type Id</em>' containment reference.
	 * @see #setIdentityCardTypeId(CD)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getIdentityDoc_IdentityCardTypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='IdentityCardTypeId' namespace='urn:f103' kind='element'"
	 * @generated
	 */
	CD getIdentityCardTypeId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.IdentityDoc#getIdentityCardTypeId <em>Identity Card Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Card Type Id</em>' containment reference.
	 * @see #getIdentityCardTypeId()
	 * @generated
	 */
	void setIdentityCardTypeId(CD value);

} // IdentityDoc

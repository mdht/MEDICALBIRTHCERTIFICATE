/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getHash <em>Hash</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getCreation <em>Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends DataType {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference.
	 * @see #setContentType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment_ContentType()
	 * @model
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getContentType <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment_Language()
	 * @model
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Base64Binary)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment_Data()
	 * @model
	 * @generated
	 */
	Base64Binary getData();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' reference.
	 * @see #setUrl(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment_Url()
	 * @model
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getUrl <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' reference.
	 * @see #setSize(UnsignedInt)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment_Size()
	 * @model
	 * @generated
	 */
	UnsignedInt getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getSize <em>Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' reference.
	 * @see #setHash(Base64Binary)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment_Hash()
	 * @model
	 * @generated
	 */
	Base64Binary getHash();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getHash <em>Hash</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' reference.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' reference.
	 * @see #setTitle(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment_Title()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation</em>' reference.
	 * @see #setCreation(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getAttachment_Creation()
	 * @model
	 * @generated
	 */
	DateTime getCreation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getCreation <em>Creation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' reference.
	 * @see #getCreation()
	 * @generated
	 */
	void setCreation(DateTime value);

} // Attachment

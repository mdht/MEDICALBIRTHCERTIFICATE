/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Oid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getAuthoringTime <em>Authoring Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getStudies <em>Study</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImagingManifest()
 * @model
 * @generated
 */
public interface ImagingManifest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' reference.
	 * @see #setUid(Oid)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImagingManifest_Uid()
	 * @model
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getUid <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImagingManifest_Patient()
	 * @model required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Authoring Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authoring Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authoring Time</em>' reference.
	 * @see #setAuthoringTime(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImagingManifest_AuthoringTime()
	 * @model
	 * @generated
	 */
	DateTime getAuthoringTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getAuthoringTime <em>Authoring Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authoring Time</em>' reference.
	 * @see #getAuthoringTime()
	 * @generated
	 */
	void setAuthoringTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImagingManifest_Author()
	 * @model
	 * @generated
	 */
	Resource getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Resource value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' reference.
	 * @see #setTitle(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImagingManifest_Title()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImagingManifest_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifest#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ImagingManifestStudy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImagingManifest_Study()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ImagingManifestStudy> getStudies();

} // ImagingManifest

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getSourcex <em>Sourcex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getTargetx <em>Targetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getGroups <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap()
 * @model
 * @generated
 */
public interface ConceptMap extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Url()
	 * @model
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getUrl <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Identifier()
	 * @model
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Version()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Name()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Title()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Status()
	 * @model required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experimental</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experimental</em>' reference.
	 * @see #setExperimental(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Experimental()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getExperimental <em>Experimental</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Publisher()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getPublisher();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Contact()
	 * @model
	 * @generated
	 */
	EList<ContactDetail> getContacts();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' reference.
	 * @see #setDate(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Date()
	 * @model
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getDate <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Description()
	 * @model
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Context</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_UseContext()
	 * @model
	 * @generated
	 */
	EList<UsageContext> getUseContexts();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Jurisdiction()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getJurisdictions();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' reference.
	 * @see #setPurpose(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Purpose()
	 * @model
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getPurpose <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Markdown value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' reference.
	 * @see #setCopyright(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Copyright()
	 * @model
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getCopyright <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

	/**
	 * Returns the value of the '<em><b>Sourcex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourcex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcex</em>' reference.
	 * @see #setSourcex(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Sourcex()
	 * @model
	 * @generated
	 */
	Base getSourcex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getSourcex <em>Sourcex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcex</em>' reference.
	 * @see #getSourcex()
	 * @generated
	 */
	void setSourcex(Base value);

	/**
	 * Returns the value of the '<em><b>Targetx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetx</em>' reference.
	 * @see #setTargetx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Targetx()
	 * @model
	 * @generated
	 */
	Base getTargetx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMap#getTargetx <em>Targetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetx</em>' reference.
	 * @see #getTargetx()
	 * @generated
	 */
	void setTargetx(Base value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMap_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptMapGroup> getGroups();

} // ConceptMap
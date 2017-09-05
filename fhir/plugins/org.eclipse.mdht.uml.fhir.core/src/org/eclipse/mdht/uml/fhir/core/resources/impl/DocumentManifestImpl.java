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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.resources.DocumentManifest;
import org.eclipse.mdht.uml.fhir.core.resources.DocumentManifestContent;
import org.eclipse.mdht.uml.fhir.core.resources.DocumentManifestRelated;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getMasterIdentifier <em>Master Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getRecipients <em>Recipient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getContents <em>Content</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentManifestImpl#getRelateds <em>Related</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentManifestImpl extends DomainResourceImpl implements DocumentManifest {
	/**
	 * The cached value of the '{@link #getMasterIdentifier() <em>Master Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier masterIdentifier;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> recipients;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> authors;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getContents() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentManifestContent> contents;

	/**
	 * The cached value of the '{@link #getRelateds() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateds()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentManifestRelated> relateds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDocumentManifest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getMasterIdentifier() {
		if (masterIdentifier != null && masterIdentifier.eIsProxy()) {
			InternalEObject oldMasterIdentifier = (InternalEObject)masterIdentifier;
			masterIdentifier = (Identifier)eResolveProxy(oldMasterIdentifier);
			if (masterIdentifier != oldMasterIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, oldMasterIdentifier, masterIdentifier));
			}
		}
		return masterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetMasterIdentifier() {
		return masterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterIdentifier(Identifier newMasterIdentifier) {
		Identifier oldMasterIdentifier = masterIdentifier;
		masterIdentifier = newMasterIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, oldMasterIdentifier, masterIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOCUMENT_MANIFEST__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getAuthors() {
		if (authors == null) {
			authors = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		if (created != null && created.eIsProxy()) {
			InternalEObject oldCreated = (InternalEObject)created;
			created = (DateTime)eResolveProxy(oldCreated);
			if (created != oldCreated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOCUMENT_MANIFEST__CREATED, oldCreated, created));
			}
		}
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Uri)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOCUMENT_MANIFEST__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Uri newSource) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOCUMENT_MANIFEST__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentManifestContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<DocumentManifestContent>(DocumentManifestContent.class, this, ResourcesPackage.DOCUMENT_MANIFEST__CONTENT);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentManifestRelated> getRelateds() {
		if (relateds == null) {
			relateds = new EObjectContainmentEList<DocumentManifestRelated>(DocumentManifestRelated.class, this, ResourcesPackage.DOCUMENT_MANIFEST__RELATED);
		}
		return relateds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				return ((InternalEList<?>)getRelateds()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				if (resolve) return getMasterIdentifier();
				return basicGetMasterIdentifier();
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				return getRecipients();
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				return getAuthors();
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				return getContents();
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				return getRelateds();
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
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				setSource((Uri)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				getContents().clear();
				getContents().addAll((Collection<? extends DocumentManifestContent>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				getRelateds().clear();
				getRelateds().addAll((Collection<? extends DocumentManifestRelated>)newValue);
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
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				getRecipients().clear();
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				setSource((Uri)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				getContents().clear();
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				getRelateds().clear();
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
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				return masterIdentifier != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				return subject != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				return recipients != null && !recipients.isEmpty();
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				return type != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				return created != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				return source != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				return status != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				return description != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				return contents != null && !contents.isEmpty();
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				return relateds != null && !relateds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentManifestImpl

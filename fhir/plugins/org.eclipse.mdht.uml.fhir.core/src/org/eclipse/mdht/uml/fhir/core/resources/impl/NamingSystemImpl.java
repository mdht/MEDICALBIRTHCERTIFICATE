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
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext;
import org.eclipse.mdht.uml.fhir.core.resources.NamingSystem;
import org.eclipse.mdht.uml.fhir.core.resources.NamingSystemUniqueId;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Naming System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getUniqueIds <em>Unique Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NamingSystemImpl#getReplacedBy <em>Replaced By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamingSystemImpl extends DomainResourceImpl implements NamingSystem {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String name;

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
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Code kind;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String publisher;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contacts;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String responsible;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getUseContexts() <em>Use Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContexts;

	/**
	 * The cached value of the '{@link #getJurisdictions() <em>Jurisdiction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdictions;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String usage;

	/**
	 * The cached value of the '{@link #getUniqueIds() <em>Unique Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueIds()
	 * @generated
	 * @ordered
	 */
	protected EList<NamingSystemUniqueId> uniqueIds;

	/**
	 * The cached value of the '{@link #getReplacedBy() <em>Replaced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedBy()
	 * @generated
	 * @ordered
	 */
	protected NamingSystem replacedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNamingSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String newName) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (Code)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Code newKind) {
		Code oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.eclipse.mdht.uml.fhir.core.dataTypes.String newPublisher) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.NAMING_SYSTEM__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(org.eclipse.mdht.uml.fhir.core.dataTypes.String newResponsible) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__RESPONSIBLE, oldResponsible, responsible));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Markdown)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<UsageContext>(UsageContext.class, this, ResourcesPackage.NAMING_SYSTEM__USE_CONTEXT);
		}
		return useContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.NAMING_SYSTEM__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getUsage() {
		if (usage != null && usage.eIsProxy()) {
			InternalEObject oldUsage = (InternalEObject)usage;
			usage = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldUsage);
			if (usage != oldUsage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__USAGE, oldUsage, usage));
			}
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(org.eclipse.mdht.uml.fhir.core.dataTypes.String newUsage) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamingSystemUniqueId> getUniqueIds() {
		if (uniqueIds == null) {
			uniqueIds = new EObjectContainmentEList<NamingSystemUniqueId>(NamingSystemUniqueId.class, this, ResourcesPackage.NAMING_SYSTEM__UNIQUE_ID);
		}
		return uniqueIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem getReplacedBy() {
		if (replacedBy != null && replacedBy.eIsProxy()) {
			InternalEObject oldReplacedBy = (InternalEObject)replacedBy;
			replacedBy = (NamingSystem)eResolveProxy(oldReplacedBy);
			if (replacedBy != oldReplacedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NAMING_SYSTEM__REPLACED_BY, oldReplacedBy, replacedBy));
			}
		}
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem basicGetReplacedBy() {
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedBy(NamingSystem newReplacedBy) {
		NamingSystem oldReplacedBy = replacedBy;
		replacedBy = newReplacedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM__REPLACED_BY, oldReplacedBy, replacedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.NAMING_SYSTEM__UNIQUE_ID:
				return ((InternalEList<?>)getUniqueIds()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.NAMING_SYSTEM__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.NAMING_SYSTEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.NAMING_SYSTEM__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case ResourcesPackage.NAMING_SYSTEM__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.NAMING_SYSTEM__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case ResourcesPackage.NAMING_SYSTEM__CONTACT:
				return getContacts();
			case ResourcesPackage.NAMING_SYSTEM__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case ResourcesPackage.NAMING_SYSTEM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.NAMING_SYSTEM__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.NAMING_SYSTEM__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.NAMING_SYSTEM__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.NAMING_SYSTEM__USAGE:
				if (resolve) return getUsage();
				return basicGetUsage();
			case ResourcesPackage.NAMING_SYSTEM__UNIQUE_ID:
				return getUniqueIds();
			case ResourcesPackage.NAMING_SYSTEM__REPLACED_BY:
				if (resolve) return getReplacedBy();
				return basicGetReplacedBy();
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
			case ResourcesPackage.NAMING_SYSTEM__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__KIND:
				setKind((Code)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__RESPONSIBLE:
				setResponsible((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__USAGE:
				setUsage((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__UNIQUE_ID:
				getUniqueIds().clear();
				getUniqueIds().addAll((Collection<? extends NamingSystemUniqueId>)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM__REPLACED_BY:
				setReplacedBy((NamingSystem)newValue);
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
			case ResourcesPackage.NAMING_SYSTEM__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__KIND:
				setKind((Code)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.NAMING_SYSTEM__RESPONSIBLE:
				setResponsible((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.NAMING_SYSTEM__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.NAMING_SYSTEM__USAGE:
				setUsage((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM__UNIQUE_ID:
				getUniqueIds().clear();
				return;
			case ResourcesPackage.NAMING_SYSTEM__REPLACED_BY:
				setReplacedBy((NamingSystem)null);
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
			case ResourcesPackage.NAMING_SYSTEM__NAME:
				return name != null;
			case ResourcesPackage.NAMING_SYSTEM__STATUS:
				return status != null;
			case ResourcesPackage.NAMING_SYSTEM__KIND:
				return kind != null;
			case ResourcesPackage.NAMING_SYSTEM__DATE:
				return date != null;
			case ResourcesPackage.NAMING_SYSTEM__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.NAMING_SYSTEM__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.NAMING_SYSTEM__RESPONSIBLE:
				return responsible != null;
			case ResourcesPackage.NAMING_SYSTEM__TYPE:
				return type != null;
			case ResourcesPackage.NAMING_SYSTEM__DESCRIPTION:
				return description != null;
			case ResourcesPackage.NAMING_SYSTEM__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.NAMING_SYSTEM__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.NAMING_SYSTEM__USAGE:
				return usage != null;
			case ResourcesPackage.NAMING_SYSTEM__UNIQUE_ID:
				return uniqueIds != null && !uniqueIds.isEmpty();
			case ResourcesPackage.NAMING_SYSTEM__REPLACED_BY:
				return replacedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //NamingSystemImpl

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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Address;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Person;
import org.eclipse.mdht.uml.fhir.core.resources.PersonLink;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PersonImpl#getLinks <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends DomainResourceImpl implements Person {
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
	 * The cached value of the '{@link #getNames() <em>Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanName> names;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecoms;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Code gender;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Address</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Attachment photo;

	/**
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization managingOrganization;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.PERSON__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanName> getNames() {
		if (names == null) {
			names = new EObjectResolvingEList<HumanName>(HumanName.class, this, ResourcesPackage.PERSON__NAME);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.PERSON__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGender() {
		if (gender != null && gender.eIsProxy()) {
			InternalEObject oldGender = (InternalEObject)gender;
			gender = (Code)eResolveProxy(oldGender);
			if (gender != oldGender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PERSON__GENDER, oldGender, gender));
			}
		}
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Code newGender) {
		Code oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		if (birthDate != null && birthDate.eIsProxy()) {
			InternalEObject oldBirthDate = (InternalEObject)birthDate;
			birthDate = (Date)eResolveProxy(oldBirthDate);
			if (birthDate != oldBirthDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PERSON__BIRTH_DATE, oldBirthDate, birthDate));
			}
		}
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectResolvingEList<Address>(Address.class, this, ResourcesPackage.PERSON__ADDRESS);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getPhoto() {
		if (photo != null && photo.eIsProxy()) {
			InternalEObject oldPhoto = (InternalEObject)photo;
			photo = (Attachment)eResolveProxy(oldPhoto);
			if (photo != oldPhoto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PERSON__PHOTO, oldPhoto, photo));
			}
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment basicGetPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(Attachment newPhoto) {
		Attachment oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__PHOTO, oldPhoto, photo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getManagingOrganization() {
		if (managingOrganization != null && managingOrganization.eIsProxy()) {
			InternalEObject oldManagingOrganization = (InternalEObject)managingOrganization;
			managingOrganization = (Organization)eResolveProxy(oldManagingOrganization);
			if (managingOrganization != oldManagingOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PERSON__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
			}
		}
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingOrganization(Organization newManagingOrganization) {
		Organization oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getActive() {
		if (active != null && active.eIsProxy()) {
			InternalEObject oldActive = (InternalEObject)active;
			active = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldActive);
			if (active != oldActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PERSON__ACTIVE, oldActive, active));
			}
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newActive) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<PersonLink>(PersonLink.class, this, ResourcesPackage.PERSON__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PERSON__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PERSON__NAME:
				return getNames();
			case ResourcesPackage.PERSON__TELECOM:
				return getTelecoms();
			case ResourcesPackage.PERSON__GENDER:
				if (resolve) return getGender();
				return basicGetGender();
			case ResourcesPackage.PERSON__BIRTH_DATE:
				if (resolve) return getBirthDate();
				return basicGetBirthDate();
			case ResourcesPackage.PERSON__ADDRESS:
				return getAddresses();
			case ResourcesPackage.PERSON__PHOTO:
				if (resolve) return getPhoto();
				return basicGetPhoto();
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				if (resolve) return getManagingOrganization();
				return basicGetManagingOrganization();
			case ResourcesPackage.PERSON__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case ResourcesPackage.PERSON__LINK:
				return getLinks();
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PERSON__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends HumanName>)newValue);
				return;
			case ResourcesPackage.PERSON__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.PERSON__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.PERSON__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case ResourcesPackage.PERSON__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case ResourcesPackage.PERSON__PHOTO:
				setPhoto((Attachment)newValue);
				return;
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)newValue);
				return;
			case ResourcesPackage.PERSON__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PERSON__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends PersonLink>)newValue);
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PERSON__NAME:
				getNames().clear();
				return;
			case ResourcesPackage.PERSON__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.PERSON__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.PERSON__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case ResourcesPackage.PERSON__ADDRESS:
				getAddresses().clear();
				return;
			case ResourcesPackage.PERSON__PHOTO:
				setPhoto((Attachment)null);
				return;
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)null);
				return;
			case ResourcesPackage.PERSON__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PERSON__LINK:
				getLinks().clear();
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PERSON__NAME:
				return names != null && !names.isEmpty();
			case ResourcesPackage.PERSON__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.PERSON__GENDER:
				return gender != null;
			case ResourcesPackage.PERSON__BIRTH_DATE:
				return birthDate != null;
			case ResourcesPackage.PERSON__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.PERSON__PHOTO:
				return photo != null;
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case ResourcesPackage.PERSON__ACTIVE:
				return active != null;
			case ResourcesPackage.PERSON__LINK:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl

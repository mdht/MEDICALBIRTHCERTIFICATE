/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.PatientAnimal;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Animal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientAnimalImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientAnimalImpl#getBreed <em>Breed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientAnimalImpl#getGenderStatus <em>Gender Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientAnimalImpl extends BackboneElementImpl implements PatientAnimal {
	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept species;

	/**
	 * The cached value of the '{@link #getBreed() <em>Breed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreed()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept breed;

	/**
	 * The cached value of the '{@link #getGenderStatus() <em>Gender Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenderStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept genderStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientAnimalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPatientAnimal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecies() {
		if (species != null && species.eIsProxy()) {
			InternalEObject oldSpecies = (InternalEObject)species;
			species = (CodeableConcept)eResolveProxy(oldSpecies);
			if (species != oldSpecies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT_ANIMAL__SPECIES, oldSpecies, species));
			}
		}
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(CodeableConcept newSpecies) {
		CodeableConcept oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT_ANIMAL__SPECIES, oldSpecies, species));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBreed() {
		if (breed != null && breed.eIsProxy()) {
			InternalEObject oldBreed = (InternalEObject)breed;
			breed = (CodeableConcept)eResolveProxy(oldBreed);
			if (breed != oldBreed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT_ANIMAL__BREED, oldBreed, breed));
			}
		}
		return breed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBreed() {
		return breed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreed(CodeableConcept newBreed) {
		CodeableConcept oldBreed = breed;
		breed = newBreed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT_ANIMAL__BREED, oldBreed, breed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGenderStatus() {
		if (genderStatus != null && genderStatus.eIsProxy()) {
			InternalEObject oldGenderStatus = (InternalEObject)genderStatus;
			genderStatus = (CodeableConcept)eResolveProxy(oldGenderStatus);
			if (genderStatus != oldGenderStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT_ANIMAL__GENDER_STATUS, oldGenderStatus, genderStatus));
			}
		}
		return genderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetGenderStatus() {
		return genderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenderStatus(CodeableConcept newGenderStatus) {
		CodeableConcept oldGenderStatus = genderStatus;
		genderStatus = newGenderStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT_ANIMAL__GENDER_STATUS, oldGenderStatus, genderStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.PATIENT_ANIMAL__SPECIES:
				if (resolve) return getSpecies();
				return basicGetSpecies();
			case ResourcesPackage.PATIENT_ANIMAL__BREED:
				if (resolve) return getBreed();
				return basicGetBreed();
			case ResourcesPackage.PATIENT_ANIMAL__GENDER_STATUS:
				if (resolve) return getGenderStatus();
				return basicGetGenderStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.PATIENT_ANIMAL__SPECIES:
				setSpecies((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PATIENT_ANIMAL__BREED:
				setBreed((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PATIENT_ANIMAL__GENDER_STATUS:
				setGenderStatus((CodeableConcept)newValue);
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
			case ResourcesPackage.PATIENT_ANIMAL__SPECIES:
				setSpecies((CodeableConcept)null);
				return;
			case ResourcesPackage.PATIENT_ANIMAL__BREED:
				setBreed((CodeableConcept)null);
				return;
			case ResourcesPackage.PATIENT_ANIMAL__GENDER_STATUS:
				setGenderStatus((CodeableConcept)null);
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
			case ResourcesPackage.PATIENT_ANIMAL__SPECIES:
				return species != null;
			case ResourcesPackage.PATIENT_ANIMAL__BREED:
				return breed != null;
			case ResourcesPackage.PATIENT_ANIMAL__GENDER_STATUS:
				return genderStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //PatientAnimalImpl

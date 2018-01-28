/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicinalProductClinicalsContraindication;
import org.hl7.fhir.MedicinalProductClinicalsOtherTherapy;
import org.hl7.fhir.MedicinalProductClinicalsPopulation;
import org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Clinicals Contraindication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsContraindicationImpl#getDisease <em>Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsContraindicationImpl#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsContraindicationImpl#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsContraindicationImpl#getTherapeuticIndication <em>Therapeutic Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsContraindicationImpl#getOtherTherapy <em>Other Therapy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsContraindicationImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductClinicalsContraindicationImpl extends BackboneElementImpl implements MedicinalProductClinicalsContraindication {
	/**
	 * The cached value of the '{@link #getDisease() <em>Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisease()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept disease;

	/**
	 * The cached value of the '{@link #getDiseaseStatus() <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diseaseStatus;

	/**
	 * The cached value of the '{@link #getComorbidity() <em>Comorbidity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> comorbidity;

	/**
	 * The cached value of the '{@link #getTherapeuticIndication() <em>Therapeutic Indication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTherapeuticIndication()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductClinicalsTherapeuticIndication> therapeuticIndication;

	/**
	 * The cached value of the '{@link #getOtherTherapy() <em>Other Therapy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTherapy()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductClinicalsOtherTherapy> otherTherapy;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductClinicalsPopulation> population;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductClinicalsContraindicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductClinicalsContraindication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDisease() {
		return disease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisease(CodeableConcept newDisease, NotificationChain msgs) {
		CodeableConcept oldDisease = disease;
		disease = newDisease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE, oldDisease, newDisease);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisease(CodeableConcept newDisease) {
		if (newDisease != disease) {
			NotificationChain msgs = null;
			if (disease != null)
				msgs = ((InternalEObject)disease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE, null, msgs);
			if (newDisease != null)
				msgs = ((InternalEObject)newDisease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE, null, msgs);
			msgs = basicSetDisease(newDisease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE, newDisease, newDisease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDiseaseStatus() {
		return diseaseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiseaseStatus(CodeableConcept newDiseaseStatus, NotificationChain msgs) {
		CodeableConcept oldDiseaseStatus = diseaseStatus;
		diseaseStatus = newDiseaseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS, oldDiseaseStatus, newDiseaseStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseStatus(CodeableConcept newDiseaseStatus) {
		if (newDiseaseStatus != diseaseStatus) {
			NotificationChain msgs = null;
			if (diseaseStatus != null)
				msgs = ((InternalEObject)diseaseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS, null, msgs);
			if (newDiseaseStatus != null)
				msgs = ((InternalEObject)newDiseaseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS, null, msgs);
			msgs = basicSetDiseaseStatus(newDiseaseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS, newDiseaseStatus, newDiseaseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getComorbidity() {
		if (comorbidity == null) {
			comorbidity = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__COMORBIDITY);
		}
		return comorbidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductClinicalsTherapeuticIndication> getTherapeuticIndication() {
		if (therapeuticIndication == null) {
			therapeuticIndication = new EObjectContainmentEList<MedicinalProductClinicalsTherapeuticIndication>(MedicinalProductClinicalsTherapeuticIndication.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__THERAPEUTIC_INDICATION);
		}
		return therapeuticIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductClinicalsOtherTherapy> getOtherTherapy() {
		if (otherTherapy == null) {
			otherTherapy = new EObjectContainmentEList<MedicinalProductClinicalsOtherTherapy>(MedicinalProductClinicalsOtherTherapy.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__OTHER_THERAPY);
		}
		return otherTherapy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductClinicalsPopulation> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MedicinalProductClinicalsPopulation>(MedicinalProductClinicalsPopulation.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE:
				return basicSetDisease(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS:
				return basicSetDiseaseStatus(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__COMORBIDITY:
				return ((InternalEList<?>)getComorbidity()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				return ((InternalEList<?>)getTherapeuticIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__OTHER_THERAPY:
				return ((InternalEList<?>)getOtherTherapy()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE:
				return getDisease();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS:
				return getDiseaseStatus();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__COMORBIDITY:
				return getComorbidity();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				return getTherapeuticIndication();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__OTHER_THERAPY:
				return getOtherTherapy();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__POPULATION:
				return getPopulation();
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE:
				setDisease((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__COMORBIDITY:
				getComorbidity().clear();
				getComorbidity().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				getTherapeuticIndication().clear();
				getTherapeuticIndication().addAll((Collection<? extends MedicinalProductClinicalsTherapeuticIndication>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__OTHER_THERAPY:
				getOtherTherapy().clear();
				getOtherTherapy().addAll((Collection<? extends MedicinalProductClinicalsOtherTherapy>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MedicinalProductClinicalsPopulation>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE:
				setDisease((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__COMORBIDITY:
				getComorbidity().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				getTherapeuticIndication().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__OTHER_THERAPY:
				getOtherTherapy().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__POPULATION:
				getPopulation().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE:
				return disease != null;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__DISEASE_STATUS:
				return diseaseStatus != null;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__COMORBIDITY:
				return comorbidity != null && !comorbidity.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				return therapeuticIndication != null && !therapeuticIndication.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__OTHER_THERAPY:
				return otherTherapy != null && !otherTherapy.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_CONTRAINDICATION__POPULATION:
				return population != null && !population.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductClinicalsContraindicationImpl

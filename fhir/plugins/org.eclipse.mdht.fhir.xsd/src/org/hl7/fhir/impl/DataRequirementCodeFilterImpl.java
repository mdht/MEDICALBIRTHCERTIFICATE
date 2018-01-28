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

import org.hl7.fhir.Coding;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Code Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getValueSetReference <em>Value Set Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementCodeFilterImpl extends ElementImpl implements DataRequirementCodeFilter {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String path;

	/**
	 * The cached value of the '{@link #getValueSetUri() <em>Value Set Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetUri()
	 * @generated
	 * @ordered
	 */
	protected Uri valueSetUri;

	/**
	 * The cached value of the '{@link #getValueSetReference() <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueSetReference;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementCodeFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDataRequirementCodeFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.fhir.String newPath, NotificationChain msgs) {
		org.hl7.fhir.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(org.hl7.fhir.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getValueSetUri() {
		return valueSetUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetUri(Uri newValueSetUri, NotificationChain msgs) {
		Uri oldValueSetUri = valueSetUri;
		valueSetUri = newValueSetUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI, oldValueSetUri, newValueSetUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetUri(Uri newValueSetUri) {
		if (newValueSetUri != valueSetUri) {
			NotificationChain msgs = null;
			if (valueSetUri != null)
				msgs = ((InternalEObject)valueSetUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI, null, msgs);
			if (newValueSetUri != null)
				msgs = ((InternalEObject)newValueSetUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI, null, msgs);
			msgs = basicSetValueSetUri(newValueSetUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI, newValueSetUri, newValueSetUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getValueSetReference() {
		return valueSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetReference(Reference newValueSetReference, NotificationChain msgs) {
		Reference oldValueSetReference = valueSetReference;
		valueSetReference = newValueSetReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE, oldValueSetReference, newValueSetReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetReference(Reference newValueSetReference) {
		if (newValueSetReference != valueSetReference) {
			NotificationChain msgs = null;
			if (valueSetReference != null)
				msgs = ((InternalEObject)valueSetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE, null, msgs);
			if (newValueSetReference != null)
				msgs = ((InternalEObject)newValueSetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE, null, msgs);
			msgs = basicSetValueSetReference(newValueSetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE, newValueSetReference, newValueSetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return basicSetPath(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI:
				return basicSetValueSetUri(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				return basicSetValueSetReference(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return getPath();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI:
				return getValueSetUri();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				return getValueSetReference();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				return getCode();
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
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				setPath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI:
				setValueSetUri((Uri)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				setValueSetReference((Reference)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Coding>)newValue);
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
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				setPath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI:
				setValueSetUri((Uri)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				setValueSetReference((Reference)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				getCode().clear();
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
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return path != null;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_URI:
				return valueSetUri != null;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				return valueSetReference != null;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				return code != null && !code.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementCodeFilterImpl

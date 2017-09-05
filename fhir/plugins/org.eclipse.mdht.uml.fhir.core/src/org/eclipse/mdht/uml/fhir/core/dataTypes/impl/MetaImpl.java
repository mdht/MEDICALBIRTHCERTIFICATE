/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Instant;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Meta;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl#getVersionId <em>Version Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl#getProfiles <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl#getSecurities <em>Security</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl#getTags <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaImpl extends DataTypeImpl implements Meta {
	/**
	 * The cached value of the '{@link #getVersionId() <em>Version Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionId()
	 * @generated
	 * @ordered
	 */
	protected Id versionId;

	/**
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected Instant lastUpdated;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> profiles;

	/**
	 * The cached value of the '{@link #getSecurities() <em>Security</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurities()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securities;

	/**
	 * The cached value of the '{@link #getTags() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getVersionId() {
		if (versionId != null && versionId.eIsProxy()) {
			InternalEObject oldVersionId = (InternalEObject)versionId;
			versionId = (Id)eResolveProxy(oldVersionId);
			if (versionId != oldVersionId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.META__VERSION_ID, oldVersionId, versionId));
			}
		}
		return versionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetVersionId() {
		return versionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionId(Id newVersionId) {
		Id oldVersionId = versionId;
		versionId = newVersionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.META__VERSION_ID, oldVersionId, versionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getLastUpdated() {
		if (lastUpdated != null && lastUpdated.eIsProxy()) {
			InternalEObject oldLastUpdated = (InternalEObject)lastUpdated;
			lastUpdated = (Instant)eResolveProxy(oldLastUpdated);
			if (lastUpdated != oldLastUpdated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.META__LAST_UPDATED, oldLastUpdated, lastUpdated));
			}
		}
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetLastUpdated() {
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdated(Instant newLastUpdated) {
		Instant oldLastUpdated = lastUpdated;
		lastUpdated = newLastUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.META__LAST_UPDATED, oldLastUpdated, lastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectResolvingEList<Uri>(Uri.class, this, DataTypesPackage.META__PROFILE);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSecurities() {
		if (securities == null) {
			securities = new EObjectResolvingEList<Coding>(Coding.class, this, DataTypesPackage.META__SECURITY);
		}
		return securities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Coding>(Coding.class, this, DataTypesPackage.META__TAG);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.META__VERSION_ID:
				if (resolve) return getVersionId();
				return basicGetVersionId();
			case DataTypesPackage.META__LAST_UPDATED:
				if (resolve) return getLastUpdated();
				return basicGetLastUpdated();
			case DataTypesPackage.META__PROFILE:
				return getProfiles();
			case DataTypesPackage.META__SECURITY:
				return getSecurities();
			case DataTypesPackage.META__TAG:
				return getTags();
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
			case DataTypesPackage.META__VERSION_ID:
				setVersionId((Id)newValue);
				return;
			case DataTypesPackage.META__LAST_UPDATED:
				setLastUpdated((Instant)newValue);
				return;
			case DataTypesPackage.META__PROFILE:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Uri>)newValue);
				return;
			case DataTypesPackage.META__SECURITY:
				getSecurities().clear();
				getSecurities().addAll((Collection<? extends Coding>)newValue);
				return;
			case DataTypesPackage.META__TAG:
				getTags().clear();
				getTags().addAll((Collection<? extends Coding>)newValue);
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
			case DataTypesPackage.META__VERSION_ID:
				setVersionId((Id)null);
				return;
			case DataTypesPackage.META__LAST_UPDATED:
				setLastUpdated((Instant)null);
				return;
			case DataTypesPackage.META__PROFILE:
				getProfiles().clear();
				return;
			case DataTypesPackage.META__SECURITY:
				getSecurities().clear();
				return;
			case DataTypesPackage.META__TAG:
				getTags().clear();
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
			case DataTypesPackage.META__VERSION_ID:
				return versionId != null;
			case DataTypesPackage.META__LAST_UPDATED:
				return lastUpdated != null;
			case DataTypesPackage.META__PROFILE:
				return profiles != null && !profiles.isEmpty();
			case DataTypesPackage.META__SECURITY:
				return securities != null && !securities.isEmpty();
			case DataTypesPackage.META__TAG:
				return tags != null && !tags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaImpl

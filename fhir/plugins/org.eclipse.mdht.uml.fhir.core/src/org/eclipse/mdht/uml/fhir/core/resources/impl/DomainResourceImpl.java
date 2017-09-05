/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Extension;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Narrative;
import org.eclipse.mdht.uml.fhir.core.resources.DomainResource;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DomainResourceImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DomainResourceImpl#getContaineds <em>Contained</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DomainResourceImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DomainResourceImpl#getModifierExtensions <em>Modifier Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainResourceImpl extends ResourceImpl implements DomainResource {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Narrative text;

	/**
	 * The cached value of the '{@link #getContaineds() <em>Contained</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaineds()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> containeds;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

	/**
	 * The cached value of the '{@link #getModifierExtensions() <em>Modifier Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifierExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> modifierExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDomainResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (Narrative)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOMAIN_RESOURCE__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Narrative newText) {
		Narrative oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOMAIN_RESOURCE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getContaineds() {
		if (containeds == null) {
			containeds = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DOMAIN_RESOURCE__CONTAINED);
		}
		return containeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectResolvingEList<Extension>(Extension.class, this, ResourcesPackage.DOMAIN_RESOURCE__EXTENSION);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getModifierExtensions() {
		if (modifierExtensions == null) {
			modifierExtensions = new EObjectResolvingEList<Extension>(Extension.class, this, ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION);
		}
		return modifierExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				return getContaineds();
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				return getExtensions();
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return getModifierExtensions();
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
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				setText((Narrative)newValue);
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				getContaineds().clear();
				getContaineds().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				getModifierExtensions().clear();
				getModifierExtensions().addAll((Collection<? extends Extension>)newValue);
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
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				setText((Narrative)null);
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				getContaineds().clear();
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				getExtensions().clear();
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				getModifierExtensions().clear();
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
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				return text != null;
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				return containeds != null && !containeds.isEmpty();
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return modifierExtensions != null && !modifierExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainResourceImpl

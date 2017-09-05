/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.mdht.uml.fhir.DerivationKind;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl#getContexts <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl#getIsLogical <em>Is Logical</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl#getDerivation <em>Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureDefinitionImpl extends ConformanceResourceImpl implements StructureDefinition {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected String display = DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextType() <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected String contextType = CONTEXT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContexts() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contexts;

	/**
	 * The default value of the '{@link #getIsLogical() <em>Is Logical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLogical()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LOGICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLogical() <em>Is Logical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLogical()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLogical = IS_LOGICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivation() <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected static final DerivationKind DERIVATION_EDEFAULT = DerivationKind.CONSTRAINT;

	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected DerivationKind derivation = DERIVATION_EDEFAULT;

	/**
	 * This is true if the Derivation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean derivationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.Literals.STRUCTURE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FHIRPackage.STRUCTURE_DEFINITION__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_DEFINITION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplay(String newDisplay) {
		String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_DEFINITION__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextType(String newContextType) {
		String oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE, oldContextType, contextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getContexts() {
		if (contexts == null) {
			contexts = new EDataTypeUniqueEList<String>(String.class, this, FHIRPackage.STRUCTURE_DEFINITION__CONTEXT);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsLogical() {
		return isLogical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLogical(Boolean newIsLogical) {
		Boolean oldIsLogical = isLogical;
		isLogical = newIsLogical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_DEFINITION__IS_LOGICAL, oldIsLogical, isLogical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivationKind getDerivation() {
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivation(DerivationKind newDerivation) {
		DerivationKind oldDerivation = derivation;
		derivation = newDerivation == null ? DERIVATION_EDEFAULT : newDerivation;
		boolean oldDerivationESet = derivationESet;
		derivationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_DEFINITION__DERIVATION, oldDerivation, derivation, !oldDerivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDerivation() {
		DerivationKind oldDerivation = derivation;
		boolean oldDerivationESet = derivationESet;
		derivation = DERIVATION_EDEFAULT;
		derivationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FHIRPackage.STRUCTURE_DEFINITION__DERIVATION, oldDerivation, DERIVATION_EDEFAULT, oldDerivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDerivation() {
		return derivationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FHIRPackage.STRUCTURE_DEFINITION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case FHIRPackage.STRUCTURE_DEFINITION__DISPLAY:
				return getDisplay();
			case FHIRPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				return getContextType();
			case FHIRPackage.STRUCTURE_DEFINITION__CONTEXT:
				return getContexts();
			case FHIRPackage.STRUCTURE_DEFINITION__IS_LOGICAL:
				return getIsLogical();
			case FHIRPackage.STRUCTURE_DEFINITION__DERIVATION:
				return getDerivation();
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
			case FHIRPackage.STRUCTURE_DEFINITION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__DISPLAY:
				setDisplay((String)newValue);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				setContextType((String)newValue);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__CONTEXT:
				getContexts().clear();
				getContexts().addAll((Collection<? extends String>)newValue);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__IS_LOGICAL:
				setIsLogical((Boolean)newValue);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__DERIVATION:
				setDerivation((DerivationKind)newValue);
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
			case FHIRPackage.STRUCTURE_DEFINITION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				setContextType(CONTEXT_TYPE_EDEFAULT);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__CONTEXT:
				getContexts().clear();
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__IS_LOGICAL:
				setIsLogical(IS_LOGICAL_EDEFAULT);
				return;
			case FHIRPackage.STRUCTURE_DEFINITION__DERIVATION:
				unsetDerivation();
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
			case FHIRPackage.STRUCTURE_DEFINITION__BASE_CLASS:
				return base_Class != null;
			case FHIRPackage.STRUCTURE_DEFINITION__DISPLAY:
				return DISPLAY_EDEFAULT == null ? display != null : !DISPLAY_EDEFAULT.equals(display);
			case FHIRPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				return CONTEXT_TYPE_EDEFAULT == null ? contextType != null : !CONTEXT_TYPE_EDEFAULT.equals(contextType);
			case FHIRPackage.STRUCTURE_DEFINITION__CONTEXT:
				return contexts != null && !contexts.isEmpty();
			case FHIRPackage.STRUCTURE_DEFINITION__IS_LOGICAL:
				return IS_LOGICAL_EDEFAULT == null ? isLogical != null : !IS_LOGICAL_EDEFAULT.equals(isLogical);
			case FHIRPackage.STRUCTURE_DEFINITION__DERIVATION:
				return isSetDerivation();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (display: ");
		result.append(display);
		result.append(", contextType: ");
		result.append(contextType);
		result.append(", context: ");
		result.append(contexts);
		result.append(", isLogical: ");
		result.append(isLogical);
		result.append(", derivation: ");
		if (derivationESet) result.append(derivation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StructureDefinitionImpl

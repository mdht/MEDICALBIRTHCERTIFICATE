/**
 */
package org.eclipse.mdht.uml.term.core.profile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraints;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintsImpl#getBase_Property <em>Base Property</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintsImpl#getValueSetConstraint <em>Value Set Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetConstraintsImpl extends EObjectImpl implements ValueSetConstraints {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The cached value of the '{@link #getValueSetConstraint() <em>Value Set Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getValueSetConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetConstraint> valueSetConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ValueSetConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermPackage.Literals.VALUE_SET_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject) base_Property;
			base_Property = (Property) eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired()) {
					eNotify(
						new ENotificationImpl(
							this, Notification.RESOLVE, TermPackage.VALUE_SET_CONSTRAINTS__BASE_PROPERTY,
							oldBase_Property, base_Property));
				}
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINTS__BASE_PROPERTY, oldBase_Property,
					base_Property));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EList<ValueSetConstraint> getValueSetConstraint() {
		if (valueSetConstraint == null) {
			valueSetConstraint = new EObjectResolvingEList<ValueSetConstraint>(
				ValueSetConstraint.class, this, TermPackage.VALUE_SET_CONSTRAINTS__VALUE_SET_CONSTRAINT);
		}
		return valueSetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONSTRAINTS__BASE_PROPERTY:
				if (resolve) {
					return getBase_Property();
				}
				return basicGetBase_Property();
			case TermPackage.VALUE_SET_CONSTRAINTS__VALUE_SET_CONSTRAINT:
				return getValueSetConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONSTRAINTS__BASE_PROPERTY:
				setBase_Property((Property) newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINTS__VALUE_SET_CONSTRAINT:
				getValueSetConstraint().clear();
				getValueSetConstraint().addAll((Collection<? extends ValueSetConstraint>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONSTRAINTS__BASE_PROPERTY:
				setBase_Property((Property) null);
				return;
			case TermPackage.VALUE_SET_CONSTRAINTS__VALUE_SET_CONSTRAINT:
				getValueSetConstraint().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONSTRAINTS__BASE_PROPERTY:
				return base_Property != null;
			case TermPackage.VALUE_SET_CONSTRAINTS__VALUE_SET_CONSTRAINT:
				return valueSetConstraint != null && !valueSetConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ValueSetConstraintsImpl

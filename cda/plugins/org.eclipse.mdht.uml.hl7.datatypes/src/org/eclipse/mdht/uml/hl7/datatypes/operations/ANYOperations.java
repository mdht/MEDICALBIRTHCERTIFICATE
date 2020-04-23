/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.hl7.datatypes.operations;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ANY</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.ANY#isNullFlavorDefined() <em>Is Null Flavor Defined</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.ANY#isNullFlavorUndefined() <em>Is Null Flavor Undefined</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.ANY#hasContent() <em>Has Content</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.ANY#isDefined(java.lang.String) <em>Is Defined</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.ANY#matches(java.lang.String, java.lang.String) <em>Matches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANYOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANYOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isNullFlavorDefined(ANY any) {
		return any.isSetNullFlavor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isNullFlavorUndefined(ANY any) {
		return !isNullFlavorDefined(any);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean hasContent(ANY any) {
		for (EStructuralFeature feature : any.eClass().getEAllStructuralFeatures()) {
			if (any.eIsSet(feature) && !"nullFlavor".equals(feature.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isDefined(ANY any, String featureName) {
		return (any.eIsSet(any.eClass().getEStructuralFeature(featureName)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean matches(ANY any, String featureName, String regularExpression) {
		if (hasContent(any) && isDefined(any, featureName)) {
			Object value = any.eGet(any.eClass().getEStructuralFeature(featureName));
			if (value instanceof String) {
				return ((String) value).matches(regularExpression);
			}
		}
		return false;
	}

} // ANYOperations

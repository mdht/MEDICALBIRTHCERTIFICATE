/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.valueset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Set Item Grouping Behavior</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getOrderSetItemGroupingBehavior()
 * @model
 * @generated
 */
public enum OrderSetItemGroupingBehavior implements Enumerator {
	/**
	 * The '<em><b>Visualgroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISUALGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	VISUALGROUP(0, "visualgroup", "visualgroup"),

	/**
	 * The '<em><b>Logicalgroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICALGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICALGROUP(1, "logicalgroup", "logicalgroup"),

	/**
	 * The '<em><b>Sentencegroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTENCEGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	SENTENCEGROUP(2, "sentencegroup", "sentencegroup");

	/**
	 * The '<em><b>Visualgroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visualgroup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISUALGROUP
	 * @model name="visualgroup"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='visual-group'"
	 * @generated
	 * @ordered
	 */
	public static final int VISUALGROUP_VALUE = 0;

	/**
	 * The '<em><b>Logicalgroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Logicalgroup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGICALGROUP
	 * @model name="logicalgroup"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='logical-group'"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICALGROUP_VALUE = 1;

	/**
	 * The '<em><b>Sentencegroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sentencegroup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENTENCEGROUP
	 * @model name="sentencegroup"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='sentence-group'"
	 * @generated
	 * @ordered
	 */
	public static final int SENTENCEGROUP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Order Set Item Grouping Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderSetItemGroupingBehavior[] VALUES_ARRAY =
		new OrderSetItemGroupingBehavior[] {
			VISUALGROUP,
			LOGICALGROUP,
			SENTENCEGROUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Set Item Grouping Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderSetItemGroupingBehavior> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Set Item Grouping Behavior</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemGroupingBehavior get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderSetItemGroupingBehavior result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Set Item Grouping Behavior</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemGroupingBehavior getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderSetItemGroupingBehavior result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Set Item Grouping Behavior</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemGroupingBehavior get(int value) {
		switch (value) {
			case VISUALGROUP_VALUE: return VISUALGROUP;
			case LOGICALGROUP_VALUE: return LOGICALGROUP;
			case SENTENCEGROUP_VALUE: return SENTENCEGROUP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OrderSetItemGroupingBehavior(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OrderSetItemGroupingBehavior
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
package org.eclipse.mdht.uml.cda.operations;

import java.util.Stack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Struc Doc Text</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.StrucDocText#addText(java.lang.String) <em>Add Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.StrucDocText#getText() <em>Get Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.StrucDocText#getText(java.lang.String) <em>Get Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrucDocTextOperations {
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
	protected StrucDocTextOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void addText(StrucDocText strucDocText, String text) {
		if (text == null) {
			throw new IllegalArgumentException("text is null");
		}
		FeatureMapUtil.addText(strucDocText.getMixed(), text);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getText(StrucDocText strucDocText) {
		return getText(strucDocText.getMixed());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getText(StrucDocText strucDocText, String id) {
		String attributeValue = strucDocText.getID();
		if (attributeValue != null && attributeValue.equals(id)) {
			// Found a match in the root text element ID attribute. Return the text.
			return getText(strucDocText.getMixed());
		}
		// We don't have a match yet. Continue searching below the root text element.
		return getText(strucDocText.getMixed(), id);
	}

	private static String getText(FeatureMap root, String id) {
		Stack<FeatureMap> stack = new Stack<FeatureMap>();
		stack.push(root);
		while (!stack.isEmpty()) {
			FeatureMap featureMap = stack.pop();
			for (FeatureMap.Entry entry : featureMap) {
				if (entry.getEStructuralFeature() instanceof EReference) {
					AnyType anyType = (AnyType) entry.getValue();
					String attributeValue = getAttributeValue(anyType.getAnyAttribute(), "ID");
					if (attributeValue != null && attributeValue.equals(id)) {
						return getText(anyType.getMixed());
					}
					stack.push(anyType.getMixed());
				}
			}
		}
		return null;
	}

	public static String getAttributeValue(FeatureMap featureMap, String name) {
		for (FeatureMap.Entry entry : featureMap) {
			EStructuralFeature feature = entry.getEStructuralFeature();
			if (feature instanceof EAttribute && feature.getName().equals(name)) {
				return entry.getValue().toString();
			}
		}
		return null;
	}

	public static String getText(FeatureMap featureMap) {
		StringBuffer buffer = new StringBuffer("");
		for (int i = 0, size = featureMap.size(); i < size; ++i) {
			EStructuralFeature feature = featureMap.getEStructuralFeature(i);
			if (FeatureMapUtil.isText(feature)) {
				if (buffer.length() > 0) {
					buffer.append(" ");
				}
				buffer.append(featureMap.getValue(i).toString());
			} else if (FeatureMapUtil.isComment(feature)) {
				if (buffer.length() > 0) {
					buffer.append(" ");
				}
				buffer.append(featureMap.getValue(i).toString());
			} else if (FeatureMapUtil.isCDATA(feature)) {
				buffer.append(featureMap.getValue(i).toString());
				if (buffer.length() > 0) {
					buffer.append(" ");
				}
			} else if (feature instanceof EReference) {

				buffer.append(
					"<" + feature.getName() + ">" + getText(((AnyType) featureMap.getValue(i)).getMixed()) + "</" +
							feature.getName() + ">");
			}
		}

		return buffer.toString();
	}

} // StrucDocTextOperations

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
package org.eclipse.mdht.uml.hl7.datatypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TN</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getTN()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface TN extends EN {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.delimiter-&gt;isEmpty() and self.family-&gt;isEmpty() and self.given-&gt;isEmpty() and self.prefix-&gt;isEmpty() and self.suffix-&gt;isEmpty() and mixed-&gt;size() = 1'"
	 * @generated
	 */
	boolean validateInvariant(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TN

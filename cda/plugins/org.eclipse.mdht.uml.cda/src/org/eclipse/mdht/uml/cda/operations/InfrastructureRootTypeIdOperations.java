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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.InfrastructureRootTypeId;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.eclipse.mdht.uml.hl7.datatypes.operations.IIOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infrastructure Root Type Id</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.InfrastructureRootTypeId#validateRedefinedRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Root</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.InfrastructureRootTypeId#validateRedefinedExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Extension</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.InfrastructureRootTypeId#validateII(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate II</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureRootTypeIdOperations extends IIOperations {
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
	protected InfrastructureRootTypeIdOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRedefinedRoot(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRedefinedRoot(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REDEFINED_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.root='2.16.840.1.113883.1.3'";

	/**
	 * The cached OCL invariant for the '{@link #validateRedefinedRoot(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRedefinedRoot(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal< Constraint > VALIDATE_REDEFINED_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal< Constraint >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infrastructureRootTypeId The receiving '<em><b>Infrastructure Root Type Id</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRedefinedRoot(InfrastructureRootTypeId infrastructureRootTypeId,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
		
	
	
	
	
      
      
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InfrastructureRootTypeIdRedefinedRoot","null");
    
      
		if (VALIDATE_REDEFINED_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
		synchronized (EOCL_ENV) {
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDAPackage.Literals.INFRASTRUCTURE_ROOT_TYPE_ID);
			try {
				VALIDATE_REDEFINED_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REDEFINED_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_REDEFINED_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(infrastructureRootTypeId)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateRedefinedRoot", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infrastructureRootTypeId, context) }),
						 new Object [] { infrastructureRootTypeId }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRedefinedExtension(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRedefinedExtension(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.extension.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateRedefinedExtension(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRedefinedExtension(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal< Constraint > VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal< Constraint >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infrastructureRootTypeId The receiving '<em><b>Infrastructure Root Type Id</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRedefinedExtension(InfrastructureRootTypeId infrastructureRootTypeId,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
		
	
	
	
	
      
      
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InfrastructureRootTypeIdRedefinedExtension","null");
    
      
		if (VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
		synchronized (EOCL_ENV) {
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDAPackage.Literals.INFRASTRUCTURE_ROOT_TYPE_ID);
			try {
				VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(infrastructureRootTypeId)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateRedefinedExtension", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infrastructureRootTypeId, context) }),
						 new Object [] { infrastructureRootTypeId }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateII(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate II</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateII(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_II__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.isNullFlavorDefined() or self.isDefined('redefinedRoot') and not(self.isNullFlavorDefined() and self.isDefined('redefinedRoot')))";

	/**
	 * The cached OCL invariant for the '{@link #validateII(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate II</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateII(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal< Constraint > VALIDATE_II__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal< Constraint >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infrastructureRootTypeId The receiving '<em><b>Infrastructure Root Type Id</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateII(InfrastructureRootTypeId infrastructureRootTypeId, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
		
	
	
	
	
      
      
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InfrastructureRootTypeIdII","null");
    
      
		if (VALIDATE_II__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
		synchronized (EOCL_ENV) {
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDAPackage.Literals.INFRASTRUCTURE_ROOT_TYPE_ID);
			try {
				VALIDATE_II__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_II__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_II__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(infrastructureRootTypeId)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.INFRASTRUCTURE_ROOT_TYPE_ID__II,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateII", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infrastructureRootTypeId, context) }),
						 new Object [] { infrastructureRootTypeId }));
			}
			return false;
		}
		return true;
	}

} // InfrastructureRootTypeIdOperations

/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.mdht.transformation.ocl2csharp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.mdht.transformation.ocl.DomainSpecificOCLHandler;
import org.eclipse.ocl.uml.OCL;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;

/**
 * Transformation from UML OCL to XPath
 * 
 */
public class OCL2CSharpTransformationForUML extends OCL2CSharpTransformation<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> {

	public OCL2CSharpTransformationForUML(ResourceSet rset) {
		this.rset = rset;
	}

	public OCL2CSharpTransformationForUML(ResourceSet resourceSet, DomainSpecificOCLHandler<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> domainSpecificOCLHandler) {
		this(resourceSet);
		this.setDomainSpecificOCLHandler(domainSpecificOCLHandler);
	}

	@Override
	public OCL getOCLInstance() {
		return OCL.newInstance(rset);
	}

}

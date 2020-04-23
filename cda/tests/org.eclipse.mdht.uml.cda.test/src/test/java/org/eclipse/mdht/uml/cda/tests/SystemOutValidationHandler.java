/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil.ValidationStatistics;

public class SystemOutValidationHandler implements ValidationHandler {
	public void handleError(Diagnostic diagnostic) {
		System.out.println("ERROR: " + diagnostic.getMessage());
	}

	public void handleWarning(Diagnostic diagnostic) {
		System.out.println("Warning: " + diagnostic.getMessage());
	}

	public void handleInfo(Diagnostic diagnostic) {
		System.out.println("Info: " + diagnostic.getMessage());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#isCaptureValidationStatistics()
	 */
	@Override
	public boolean isCaptureValidationStatistics() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#getValidationStatistics()
	 */
	@Override
	public ValidationStatistics getValidationStatistics() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#setValidationStatistics(org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil.
	 * ValidationStatistics)
	 */
	@Override
	public void setValidationStatistics(ValidationStatistics validationStatistics) {
		// TODO Auto-generated method stub

	}
}

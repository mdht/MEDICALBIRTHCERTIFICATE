/**
 */
package org.eclipse.mdht.uml.fhir.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.mdht.uml.fhir.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage
 * @generated
 */
public class FHIRSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FHIRPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSwitch() {
		if (modelPackage == null) {
			modelPackage = FHIRPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FHIRPackage.TYPE_CHOICE: {
				TypeChoice typeChoice = (TypeChoice)theEObject;
				T result = caseTypeChoice(typeChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.STRUCTURE_DEFINITION: {
				StructureDefinition structureDefinition = (StructureDefinition)theEObject;
				T result = caseStructureDefinition(structureDefinition);
				if (result == null) result = caseConformanceResource(structureDefinition);
				if (result == null) result = caseElement(structureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.CONFORMANCE_RESOURCE: {
				ConformanceResource conformanceResource = (ConformanceResource)theEObject;
				T result = caseConformanceResource(conformanceResource);
				if (result == null) result = caseElement(conformanceResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.ELEMENT_DEFINITION: {
				ElementDefinition elementDefinition = (ElementDefinition)theEObject;
				T result = caseElementDefinition(elementDefinition);
				if (result == null) result = caseElement(elementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.SHORT_DESCRIPTION: {
				ShortDescription shortDescription = (ShortDescription)theEObject;
				T result = caseShortDescription(shortDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.REQUIREMENTS: {
				Requirements requirements = (Requirements)theEObject;
				T result = caseRequirements(requirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.COMMENTS: {
				Comments comments = (Comments)theEObject;
				T result = caseComments(comments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.VALUE_SET_BINDING: {
				ValueSetBinding valueSetBinding = (ValueSetBinding)theEObject;
				T result = caseValueSetBinding(valueSetBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T result = caseValueSet(valueSet);
				if (result == null) result = caseConformanceResource(valueSet);
				if (result == null) result = caseElement(valueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseConformanceResource(dataElement);
				if (result == null) result = caseElement(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.VALUE_SET_MEMBER: {
				ValueSetMember valueSetMember = (ValueSetMember)theEObject;
				T result = caseValueSetMember(valueSetMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.ELEMENT_SLICING: {
				ElementSlicing elementSlicing = (ElementSlicing)theEObject;
				T result = caseElementSlicing(elementSlicing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.SEARCH_PARAMETER: {
				SearchParameter searchParameter = (SearchParameter)theEObject;
				T result = caseSearchParameter(searchParameter);
				if (result == null) result = caseConformanceResource(searchParameter);
				if (result == null) result = caseElement(searchParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FHIRPackage.SEARCH_PARAMETER_COMPONENT_CLASS: {
				SearchParameter_ComponentClass searchParameter_ComponentClass = (SearchParameter_ComponentClass)theEObject;
				T result = caseSearchParameter_ComponentClass(searchParameter_ComponentClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeChoice(TypeChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinition(StructureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceResource(ConformanceResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinition(ElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortDescription(ShortDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirements(Requirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComments(Comments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetBinding(ValueSetBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSet(ValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetMember(ValueSetMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Slicing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Slicing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementSlicing(ElementSlicing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameter(SearchParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter Component Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter Component Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameter_ComponentClass(SearchParameter_ComponentClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FHIRSwitch

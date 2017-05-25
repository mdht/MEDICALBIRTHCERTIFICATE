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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.uml.fhir.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FHIRFactoryImpl extends EFactoryImpl implements FHIRFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FHIRFactory init() {
		try {
			FHIRFactory theFHIRFactory = (FHIRFactory)EPackage.Registry.INSTANCE.getEFactory(FHIRPackage.eNS_URI);
			if (theFHIRFactory != null) {
				return theFHIRFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FHIRFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FHIRPackage.TYPE_CHOICE: return createTypeChoice();
			case FHIRPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case FHIRPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case FHIRPackage.SHORT_DESCRIPTION: return createShortDescription();
			case FHIRPackage.DESCRIPTION: return createDescription();
			case FHIRPackage.DEFINITION: return createDefinition();
			case FHIRPackage.REQUIREMENTS: return createRequirements();
			case FHIRPackage.COMMENTS: return createComments();
			case FHIRPackage.VALUE_SET_BINDING: return createValueSetBinding();
			case FHIRPackage.VALUE_SET: return createValueSet();
			case FHIRPackage.DATA_ELEMENT: return createDataElement();
			case FHIRPackage.VALUE_SET_MEMBER: return createValueSetMember();
			case FHIRPackage.ELEMENT_SLICING: return createElementSlicing();
			case FHIRPackage.SEARCH_PARAMETER: return createSearchParameter();
			case FHIRPackage.SEARCH_PARAMETER_COMPONENT_CLASS: return createSearchParameter_ComponentClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FHIRPackage.DERIVATION_KIND:
				return createDerivationKindFromString(eDataType, initialValue);
			case FHIRPackage.PROPERTY_REPRESENTATION_KIND:
				return createPropertyRepresentationKindFromString(eDataType, initialValue);
			case FHIRPackage.BINDING_STRENGTH_KIND:
				return createBindingStrengthKindFromString(eDataType, initialValue);
			case FHIRPackage.SLICING_RULES_KIND:
				return createSlicingRulesKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FHIRPackage.DERIVATION_KIND:
				return convertDerivationKindToString(eDataType, instanceValue);
			case FHIRPackage.PROPERTY_REPRESENTATION_KIND:
				return convertPropertyRepresentationKindToString(eDataType, instanceValue);
			case FHIRPackage.BINDING_STRENGTH_KIND:
				return convertBindingStrengthKindToString(eDataType, instanceValue);
			case FHIRPackage.SLICING_RULES_KIND:
				return convertSlicingRulesKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeChoice createTypeChoice() {
		TypeChoiceImpl typeChoice = new TypeChoiceImpl();
		return typeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortDescription createShortDescription() {
		ShortDescriptionImpl shortDescription = new ShortDescriptionImpl();
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements createRequirements() {
		RequirementsImpl requirements = new RequirementsImpl();
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comments createComments() {
		CommentsImpl comments = new CommentsImpl();
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetBinding createValueSetBinding() {
		ValueSetBindingImpl valueSetBinding = new ValueSetBindingImpl();
		return valueSetBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetMember createValueSetMember() {
		ValueSetMemberImpl valueSetMember = new ValueSetMemberImpl();
		return valueSetMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSlicing createElementSlicing() {
		ElementSlicingImpl elementSlicing = new ElementSlicingImpl();
		return elementSlicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter_ComponentClass createSearchParameter_ComponentClass() {
		SearchParameter_ComponentClassImpl searchParameter_ComponentClass = new SearchParameter_ComponentClassImpl();
		return searchParameter_ComponentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationKind createDerivationKindFromString(EDataType eDataType, String initialValue) {
		DerivationKind result = DerivationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationKind createPropertyRepresentationKindFromString(EDataType eDataType, String initialValue) {
		PropertyRepresentationKind result = PropertyRepresentationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthKind createBindingStrengthKindFromString(EDataType eDataType, String initialValue) {
		BindingStrengthKind result = BindingStrengthKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesKind createSlicingRulesKindFromString(EDataType eDataType, String initialValue) {
		SlicingRulesKind result = SlicingRulesKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRPackage getFHIRPackage() {
		return (FHIRPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FHIRPackage getPackage() {
		return FHIRPackage.eINSTANCE;
	}

} //FHIRFactoryImpl

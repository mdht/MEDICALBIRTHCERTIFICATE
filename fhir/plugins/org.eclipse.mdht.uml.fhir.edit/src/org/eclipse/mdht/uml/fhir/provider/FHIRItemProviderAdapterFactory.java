/**
 */
package org.eclipse.mdht.uml.fhir.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.mdht.uml.fhir.util.FHIRAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FHIRItemProviderAdapterFactory extends FHIRAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
		supportedTypes.add(ITableItemFontProvider.class);
		supportedTypes.add(IItemFontProvider.class);
		supportedTypes.add(IItemStyledLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.TypeChoice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeChoiceItemProvider typeChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.TypeChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeChoiceAdapter() {
		if (typeChoiceItemProvider == null) {
			typeChoiceItemProvider = new TypeChoiceItemProvider(this);
		}

		return typeChoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.StructureDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDefinitionItemProvider structureDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.StructureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureDefinitionAdapter() {
		if (structureDefinitionItemProvider == null) {
			structureDefinitionItemProvider = new StructureDefinitionItemProvider(this);
		}

		return structureDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.ElementDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionItemProvider elementDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.ElementDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementDefinitionAdapter() {
		if (elementDefinitionItemProvider == null) {
			elementDefinitionItemProvider = new ElementDefinitionItemProvider(this);
		}

		return elementDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.ShortDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortDescriptionItemProvider shortDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.ShortDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShortDescriptionAdapter() {
		if (shortDescriptionItemProvider == null) {
			shortDescriptionItemProvider = new ShortDescriptionItemProvider(this);
		}

		return shortDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.Description} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionItemProvider descriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.Description}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptionAdapter() {
		if (descriptionItemProvider == null) {
			descriptionItemProvider = new DescriptionItemProvider(this);
		}

		return descriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.Definition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionItemProvider definitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefinitionAdapter() {
		if (definitionItemProvider == null) {
			definitionItemProvider = new DefinitionItemProvider(this);
		}

		return definitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.Requirements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsItemProvider requirementsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.Requirements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementsAdapter() {
		if (requirementsItemProvider == null) {
			requirementsItemProvider = new RequirementsItemProvider(this);
		}

		return requirementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.Comments} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentsItemProvider commentsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.Comments}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentsAdapter() {
		if (commentsItemProvider == null) {
			commentsItemProvider = new CommentsItemProvider(this);
		}

		return commentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.ValueSetBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetBindingItemProvider valueSetBindingItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.ValueSetBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSetBindingAdapter() {
		if (valueSetBindingItemProvider == null) {
			valueSetBindingItemProvider = new ValueSetBindingItemProvider(this);
		}

		return valueSetBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.ValueSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetItemProvider valueSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.ValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSetAdapter() {
		if (valueSetItemProvider == null) {
			valueSetItemProvider = new ValueSetItemProvider(this);
		}

		return valueSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.DataElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementItemProvider dataElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.DataElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataElementAdapter() {
		if (dataElementItemProvider == null) {
			dataElementItemProvider = new DataElementItemProvider(this);
		}

		return dataElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.ValueSetMember} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetMemberItemProvider valueSetMemberItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.ValueSetMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSetMemberAdapter() {
		if (valueSetMemberItemProvider == null) {
			valueSetMemberItemProvider = new ValueSetMemberItemProvider(this);
		}

		return valueSetMemberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.ElementSlicing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementSlicingItemProvider elementSlicingItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.ElementSlicing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementSlicingAdapter() {
		if (elementSlicingItemProvider == null) {
			elementSlicingItemProvider = new ElementSlicingItemProvider(this);
		}

		return elementSlicingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.SearchParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchParameterItemProvider searchParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.SearchParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSearchParameterAdapter() {
		if (searchParameterItemProvider == null) {
			searchParameterItemProvider = new SearchParameterItemProvider(this);
		}

		return searchParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchParameter_ComponentClassItemProvider searchParameter_ComponentClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSearchParameter_ComponentClassAdapter() {
		if (searchParameter_ComponentClassItemProvider == null) {
			searchParameter_ComponentClassItemProvider = new SearchParameter_ComponentClassItemProvider(this);
		}

		return searchParameter_ComponentClassItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (typeChoiceItemProvider != null) typeChoiceItemProvider.dispose();
		if (structureDefinitionItemProvider != null) structureDefinitionItemProvider.dispose();
		if (elementDefinitionItemProvider != null) elementDefinitionItemProvider.dispose();
		if (shortDescriptionItemProvider != null) shortDescriptionItemProvider.dispose();
		if (descriptionItemProvider != null) descriptionItemProvider.dispose();
		if (definitionItemProvider != null) definitionItemProvider.dispose();
		if (requirementsItemProvider != null) requirementsItemProvider.dispose();
		if (commentsItemProvider != null) commentsItemProvider.dispose();
		if (valueSetBindingItemProvider != null) valueSetBindingItemProvider.dispose();
		if (valueSetItemProvider != null) valueSetItemProvider.dispose();
		if (dataElementItemProvider != null) dataElementItemProvider.dispose();
		if (valueSetMemberItemProvider != null) valueSetMemberItemProvider.dispose();
		if (elementSlicingItemProvider != null) elementSlicingItemProvider.dispose();
		if (searchParameterItemProvider != null) searchParameterItemProvider.dispose();
		if (searchParameter_ComponentClassItemProvider != null) searchParameter_ComponentClassItemProvider.dispose();
	}

}

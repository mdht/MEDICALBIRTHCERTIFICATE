package org.eclipse.mdht.uml.term.ui.service.fhir.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.mdht.uml.term.ui.service.fhir.internal.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_FHIRURL, "https://cts.nlm.nih.gov/fhir");
		store.setDefault(PreferenceConstants.P_FHIRUSER, "");
		store.setDefault(PreferenceConstants.P_FHIRPASSWORD, "");
	}

}

package com.plusonelabs.calendar.prefs;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.plusonelabs.calendar.EventAppWidgetProvider;
import com.plusonelabs.calendar.R;

public class EventFiltersPreferencesFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_event_filters);
	}

	@Override
	public void onPause() {
		super.onPause();
		EventAppWidgetProvider.updateEventList(getActivity());
		EventAppWidgetProvider.updateAllWidgets(getActivity());
	}
}
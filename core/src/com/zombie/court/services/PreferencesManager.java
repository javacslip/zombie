package com.zombie.court.services;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

/**
 * Handles any game preferences, including music enabled/disabled, volume, etc. 
 */
public class PreferencesManager
{
	private static final String VOLUME = "volume";
	private static final String MUSIC_ENABLED = "musicEnabled";
	private static final String SOUND_ENABLED = "soundEnabled";
	// name of the XML file where the preferences are stored
	private static final String PREFS_NAME = "User Preferences";

	public PreferencesManager()
	{

	}

	protected Preferences getPrefs()
	{
		return Gdx.app.getPreferences(PREFS_NAME);
	}

	public boolean isSoundEnabled()
	{
		// if there isn't a preference stored for sound, then it will be enabled
		// by default
		return getPrefs().getBoolean(SOUND_ENABLED, true);
	}

	public void setSoundEnabled(boolean soundEnabled)
	{
		getPrefs().putBoolean(SOUND_ENABLED, soundEnabled);
		// persists the preference change
		getPrefs().flush();
	}

	public boolean isMusicEnabled()
	{
		// if there isn't a preference stored for sound, then it will be enabled
		// by default
		return getPrefs().getBoolean(MUSIC_ENABLED, true);
	}

	public void setMusicEnabled(boolean musicEnabled)
	{
		getPrefs().putBoolean(MUSIC_ENABLED, musicEnabled);
		// persists the preference change
		getPrefs().flush();
	}

	public float getVolume()
	{
		// if there isn't a preference stored for the volume level, then it will
		// be at half
		return getPrefs().getFloat(VOLUME, 0.5f);
	}

	public void setVolume(float volume)
	{
		getPrefs().putFloat(VOLUME, volume);
		// persist the preference change
		getPrefs().flush();
	}
}

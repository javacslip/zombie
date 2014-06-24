package com.zombie.court;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.zombie.court.screens.MainMenuScreen;
import com.zombie.court.services.MusicManager;
import com.zombie.court.services.PlayerManager;
import com.zombie.court.services.PreferencesManager;
import com.zombie.court.services.SoundManager;

// entry point into the game
public class ZombieCourt extends Game
{

	public static final String LOG = ZombieCourt.class.getSimpleName();

	// services for the game
	private PreferencesManager prefsMgr;
	private PlayerManager playerMgr;
	private MusicManager musicMgr;
	private SoundManager soundMgr;

	public ZombieCourt()
	{

	}

	@Override
	public void create()
	{
		Gdx.app.log(ZombieCourt.LOG, "Creating game on " + Gdx.app.getType());
	}

	@Override
	public void render()
	{
		super.render();
	}

	@Override
	public void resize(int width, int height)
	{
		super.resize(width, height);
		Gdx.app.log(ZombieCourt.LOG, "Setting screen to Main Menu");
		setScreen(new MainMenuScreen(this));
	}

	@Override
	public void pause()
	{
		super.pause();
	}

	@Override
	public void resume()
	{
		super.resume();
	}

	@Override
	public void dispose()
	{
		super.dispose();
	}

	@Override
	public void setScreen(Screen screen)
	{
		super.setScreen(screen);
	}
}

package com.zombie.court.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.zombie.court.ZombieCourt;

public class MainMenuScreen implements Screen
{
	// the screen that will be shown upon application start

	final ZombieCourt game;

	OrthographicCamera camera;

	public MainMenuScreen(final ZombieCourt game)
	{
		this.game = game;

		camera = new OrthographicCamera();
		// the last 2 values should be set to whatever resolution we want the
		// game to have: the Viewport -> check Viewport documentation TODO
		camera.setToOrtho(false, 800, 480);
	}

	@Override
	public void render(float delta)
	{

		// this should check to see if the "start game" button is pressed on the
		// main menu - tbd
		if (Gdx.input.isTouched())
		{
			// game.setScreen(new GameScreen(game));
			// dispose();
		}
		// checks for a "settings" button press on the main menu - tbd
		else if (Gdx.input.isButtonPressed(0))
		{
			// game.setScreen(new SettingsScreen(game));
			// dispose();
		}
		else
		{
			// throw LoggedUncheckedException.... amirite?
		}

	}

	@Override
	public void resize(int width, int height)
	{

	}

	@Override
	public void show()
	{

	}

	@Override
	public void hide()
	{

	}

	@Override
	public void pause()
	{

	}

	@Override
	public void resume()
	{

	}

	@Override
	public void dispose()
	{

	}

}

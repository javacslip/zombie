package com.zombie.court.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.zombie.court.ZombieCourt;

public class GameScreen implements Screen
{
	// screen that will be used to show anything involving gameplay

	final ZombieCourt game;

	OrthographicCamera camera;

	public GameScreen(final ZombieCourt game)
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

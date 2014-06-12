package com.zombie.court;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zombie.court.screens.MainMenuScreen;

// entry point into the game
public class ZombieCourt extends Game
{
	// used to draw 2D images
	SpriteBatch batch;
	// default font is Arial
	public BitmapFont font;

	@Override
	public void create()
	{
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render()
	{
		super.render();
	}

	@Override
	public void resize(int width, int height)
	{

	}

	@Override
	public void pause()
	{
		// process sent to the background: interrupted via call, "home" button,
		// etc.
	}

	@Override
	public void resume()
	{
		// process brought back from the background
	}

	@Override
	public void dispose()
	{
		// always dispose objects!
		batch.dispose();
		font.dispose();
	}
}

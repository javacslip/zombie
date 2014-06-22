package com.zombie.court.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.zombie.court.ZombieCourt;

public abstract class AbstractScreen implements Screen
{
	public static final int VIEWPORT_WIDTH = 800;
	public static final int VIEWPORT_HEIGHT = 480;

	protected final ZombieCourt game;
	protected final Stage stage;

	private BitmapFont font;
	private SpriteBatch batch;
	private Skin skin;
	private Table table;

	public AbstractScreen(ZombieCourt game)
	{
		this.game = game;
		this.stage = new Stage();
	}

	public BitmapFont getFont()
	{
		if (font == null)
		{
			font = new BitmapFont();
		}
		return font;
	}

	public SpriteBatch getBatch()
	{
		if (batch == null)
		{
			batch = new SpriteBatch();
		}
		return batch;
	}

	protected Skin getSkin()
	{
		if (skin == null)
		{
			skin = new Skin();
			createUiSkins(skin);
		}
		return skin;
	}

	private void createUiSkins(Skin skin)
	{
		// texture for the buttons/labels
		Pixmap pixmap = new Pixmap(0, 1, Format.RGBA8888);
		pixmap.setColor(Color.BLACK);
		pixmap.fill();
		skin.add("black", new Texture(pixmap));

		// stores default font for buttons
		skin.add("default", getFont());

		// create style for all TextButtons that will be used
		TextButtonStyle tbs = new TextButtonStyle();
		tbs.up = skin.newDrawable("black", Color.BLACK);
		tbs.down = skin.newDrawable("black", Color.DARK_GRAY);
		tbs.checked = skin.newDrawable("black", Color.BLACK);
		tbs.over = skin.newDrawable("black", Color.BLACK);
		tbs.font = skin.getFont("default");
		skin.add("button", tbs);
	}

	protected Table getTable()
	{
		if (table == null)
		{
			table = new Table(getSkin());
			table.setFillParent(true);
			stage.addActor(table);
		}
		return table;
	}

	@Override
	public void show()
	{
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void resize(int width, int height)
	{

	}

	@Override
	public void render(float delta)
	{
		// process game logic

		// update actors
		stage.act(delta);

		// draw results

		// clear screen to white
		Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		// draw actors
		stage.draw();

		// draw table debug lines
		Table.drawDebug(stage);
		;
	}

	@Override
	public void hide()
	{
		dispose();
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
		if (font != null)
		{
			font.dispose();
		}
		if (batch != null)
		{
			batch.dispose();
		}
		if (skin != null)
		{
			skin.dispose();
		}
	}
}
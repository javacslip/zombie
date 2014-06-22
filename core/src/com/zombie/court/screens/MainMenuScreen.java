package com.zombie.court.screens;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.zombie.court.ZombieCourt;

public class MainMenuScreen extends AbstractScreen
{

	public MainMenuScreen(ZombieCourt game)
	{
		super(game);
	}

	@Override
	public void show()
	{
		super.show();

		// get the Table
		Table table = super.getTable();

		// button for navigating to Settings screen
		TextButton settingsButton = new TextButton("Settings", getSkin(),
				"button");
		settingsButton.addListener(new ClickListener()
		{
			@Override
			public void clicked(InputEvent event, float x, float y)
			{
				game.setScreen(new SettingsScreen(game));
			}
		});
		table.add(settingsButton).size(300, 50).uniform();
	}
}

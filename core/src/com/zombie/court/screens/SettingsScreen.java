package com.zombie.court.screens;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.zombie.court.ZombieCourt;

public class SettingsScreen extends AbstractScreen
{
	// screen shown to adjust volume, maybe credits, reset data?

	public SettingsScreen(ZombieCourt game)
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
		TextButton mainMenuButton = new TextButton("Main Menu", getSkin(),
				"button");
		mainMenuButton.addListener(new ClickListener()
		{
			@Override
			public void clicked(InputEvent event, float x, float y)
			{
				game.setScreen(new MainMenuScreen(game));
			}
		});
		table.add(mainMenuButton).size(300, 50).uniform();
	}

}

package com.zombie.court.containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.zombie.court.logic.NextLevelMgr;

public class Player extends BaseCharacter implements Serializable
{

	// initial number of quests per day
	private Integer maxQuests = 30;

	private Integer remainingQuests = 30;

	public Integer getExpToLevel()
	{
		return NextLevelMgr.expToLevel(getLevel(), getExperience());
	}

	public Integer getMaxQuests()
	{
		return maxQuests;
	}

	public void setMaxQuests(Integer maxQuests)
	{
		this.maxQuests = maxQuests;
	}

	public Integer getRemainingQuests()
	{
		return remainingQuests;
	}

	public void setRemainingQuests(Integer remainingQuests)
	{
		this.remainingQuests = remainingQuests;
	}

	// eats a quest
	public void useQuest()
	{
		this.remainingQuests -= 1;
	}

	// check if a player is allowed to enter a new area
	public boolean canQuest()
	{
		if (remainingQuests > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// Serializable implementation

	@Override
	public void write(Json json)
	{
		json.writeValue("name", getName());
		json.writeValue("description", getDescription());

		// player stats
		json.writeValue("level", getLevel());
		json.writeValue("experience", getExperience());
		json.writeValue("guts", getGuts());
		json.writeValue("wits", getWits());
		json.writeValue("charm", getCharm());

		// TODO: need two objectStart/End blocks?
		json.writeObjectStart();
		json.writeValue("inventory", getInventory());
		json.writeObjectEnd();

		json.writeObjectStart();
		json.writeValue("equippedItems", getEquippedItems().getEquippedItems());
		json.writeObjectEnd();

		json.writeValue("maxQuests", getMaxQuests());
		json.writeValue("remainingQuests", getRemainingQuests());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void read(Json json, JsonValue jsonData)
	{
		setName(json.readValue("name", String.class, jsonData));
		setDescription(json.readValue("description", String.class, jsonData));

		// retrieve player stats
		setLevel(json.readValue("level", Integer.class, jsonData));
		setExperience(json.readValue("experience", Integer.class, jsonData));
		setGuts(json.readValue("guts", Integer.class, jsonData));
		setWits(json.readValue("wits", Integer.class, jsonData));
		setCharm(json.readValue("charm", Integer.class, jsonData));
		setGold(json.readValue("gold", Integer.class, jsonData));

		// retrieve inventory
		List<IItem> inventory = json.readValue("inventory", ArrayList.class,
				jsonData);
		for (IItem item : inventory)
		{
			addInventoryItem(item);
		}

		// retrieve equipped items
		Map<String, IItem> equipment = json.readValue("equippedItems",
				HashMap.class, jsonData);
		for (String bodyPart : equipment.keySet())
		{
			getEquippedItems().setEquippedItem(bodyPart,
					equipment.get(bodyPart));
		}

		setMaxQuests(json.readValue("maxQuests", Integer.class, jsonData));
		setRemainingQuests(json.readValue("remainingQuests", Integer.class,
				jsonData));

	}

}

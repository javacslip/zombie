package com.zombie.court.containers;

import java.util.ArrayList;
import java.util.List;

public class BaseCharacter
{

	private String name;

	private String description;

	private EquippedItems equippedItems;

	private List<IItem> inventory = new ArrayList<IItem>();

	// stats
	private int level = 1;
	private int experience = 0;
	private int guts;
	private int wits;
	private int charm;
	private int gold = 0;

	/**
	 * Increment character's experience
	 * 
	 * @param experience
	 */
	public void addExperience(int experience)
	{
		this.experience += experience;
	}

	public int getMaxDamage()
	{

		int maxDamage = 0;

		for (String itemName : equippedItems.getEquippedItems().keySet())
		{
			IItem item = equippedItems.getEquippedItems().get(itemName);
			maxDamage += item.getDamage();
		}

		return maxDamage;

	}

	public void addGold(int additionalGold)
	{
		this.gold += additionalGold;
	}

	public void setGold(int gold)
	{
		this.gold = gold;
	}

	public int getGold()
	{
		return gold;
	}

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public void addGuts(int additionalGuts)
	{
		this.guts += additionalGuts;
	}

	public void setGuts(int guts)
	{
		this.guts = guts;
	}

	public int getGuts()
	{
		return guts;
	}

	public void addWits(int additionalWits)
	{
		this.wits += additionalWits;
	}

	public void setWits(int wits)
	{
		this.wits = wits;
	}

	public int getWits()
	{
		return wits;
	}

	public List<IItem> getInventory()
	{
		return this.inventory;
	}

	public void addInventoryItem(IItem newItem)
	{
		this.inventory.add(newItem);
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public EquippedItems getEquippedItems()
	{
		return equippedItems;
	}

	public void setEquippedItems(EquippedItems equippedItems)
	{
		this.equippedItems = equippedItems;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCharm()
	{
		return charm;
	}

	public void setCharm(int charm)
	{
		this.charm = charm;
	}

	public int getExperience()
	{
		return experience;
	}

	public void setExperience(int experience)
	{
		this.experience = experience;
	}

}

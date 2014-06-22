package com.zombie.court.containers;

import java.util.ArrayList;
import java.util.List;

public class BaseCharacter {

	private String name;

	private String description;

	private EquippedItems equippedItems;

	private List<IItem> inventory = new ArrayList<IItem>();

	// stats
	private Integer level = 1;
	private Integer experience = 0;
	private Integer guts;
	private Integer wits;
	private Integer charm;
	private Integer gold = 0;

	/**
	 * Increment character's experience
	 * 
	 * @param experience
	 */
	public void addExperience(Integer experience) {
		this.experience += experience;
	}
	
	public Integer getMaxDamage(){
		
		Integer maxDamage = 0;
		
		for(String itemName : equippedItems.getEquippedItems().keySet())
		{
			IItem item = equippedItems.getEquippedItems().get(itemName);
			maxDamage += item.getDamage();
		}
		
		return maxDamage;
		
	}

	public void addGold(Integer additionalGold) {
		this.gold += additionalGold;
	}

	public Integer getGold() {
		return gold;
	}

	public Integer getLevel() {
		return level;
	}

	public void addGuts(Integer additionalGuts) {
		this.guts += additionalGuts;
	}

	public void setGuts(Integer guts) {
		this.guts = guts;
	}

	public void addWits(Integer additionalWits) {
		this.wits += additionalWits;
	}

	public void setWits(Integer wits) {
		this.wits = wits;
	}

	public List<IItem> getInventory() {
		return this.inventory;
	}
	
	public void addInventoryItem(IItem newItem){
		this.inventory.add(newItem);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EquippedItems getEquippedItems() {
		return equippedItems;
	}

	public void setEquippedItems(EquippedItems equippedItems) {
		this.equippedItems = equippedItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCharm() {
		return charm;
	}

	public void setCharm(Integer charm) {
		this.charm = charm;
	}
	
	public Integer getExperience()
	{
		return experience;
	}
	
	public void setExperience(Integer experience)
	{
		this.experience = experience;
	}

}

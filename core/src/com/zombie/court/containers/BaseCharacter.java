package com.zombie.court.containers;

import java.util.ArrayList;
import java.util.List;

public class BaseCharacter {

	private String name;

	private String description;

	private EquippedItems equippedItems;
	
	private List<IItem> invetory = new ArrayList<IItem>();

	// stats
	private Integer level = 1;
	private Integer experience = 0;
	private Integer guts;
	private Integer wits;

	/**
	 * Increment character's experience
	 * 
	 * @param experience
	 */
	public void addExperience(Integer experience) {
		this.experience += experience;
	}

}

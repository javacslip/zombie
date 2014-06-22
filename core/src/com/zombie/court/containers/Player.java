package com.zombie.court.containers;

import com.zombie.court.logic.NextLevelMgr;

public class Player extends BaseCharacter {

	// initial number of quests per day
	private Integer maxQuests = 30;

	private Integer remainingQuests = 30;
	
	public Integer getExpToLevel()
	{
		return NextLevelMgr.expToLevel(getLevel(), getExperience());
	}
	
	public Integer getMaxQuests() {
		return maxQuests;
	}

	public void setMaxQuests(Integer maxQuests) {
		this.maxQuests = maxQuests;
	}

	public Integer getRemainingQuests() {
		return remainingQuests;
	}

	public void setRemainingQuests(Integer remainingQuests) {
		this.remainingQuests = remainingQuests;
	}

	// eats a quest
	public void useQuest() {
		this.remainingQuests -= 1;
	}

	// check if a player is allowed to enter a new area
	public boolean canQuest() {
		if (remainingQuests > 0) {
			return true;
		} else {
			return false;
		}
	}

}

package com.zombie.court.logic;

public class NextLevelMgr {
	
	private static final Integer BASE_XP = 50;
	
	public static Integer expToLevel(Integer currentLevel,Integer currentExp)
	{
		return getExpForLevel(currentLevel+1) - currentExp;
	}
	
	private static Integer getExpForLevel(Integer level)
	{
		// y=n(n-1)*B
		return level*(level-1)*BASE_XP;
	}

}

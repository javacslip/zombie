package com.zombie.court.containers;

import java.util.Map;

public class EquippedItems {
	
	public final static String HEADGEAR = "Headgear";
	public final static String FEET = "Feet";
	public final static String HANDS = "Hands";
	public final static String BODY = "Body";
	public final static String WIELD = "Wield";
	public final static String FINGER = "Finger";
	
	private Map<String,IItem> equippedItems;
	
	public Map<String,IItem> getEquippedItems()
	{
		return equippedItems;
	}
	
	public void setEquippedItem(String bodypart,IItem item)
	{
		this.equippedItems.put(bodypart, item);
	}
	
	public void removeAllEquipped()
	{
		this.equippedItems.clear();
	}
	
	
}

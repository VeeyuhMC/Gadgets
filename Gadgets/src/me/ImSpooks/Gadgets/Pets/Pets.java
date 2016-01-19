package me.ImSpooks.Gadgets.Pets;

import org.bukkit.entity.Player;

public abstract class Pets implements AbstractPets {
	
	private Player owner;
	private String name;
	private boolean baby;
	
	public Player getOwner() {
		return owner;
	}
	
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isBaby() {
		return baby;
	}
	
	public void setBaby(boolean baby) {
		this.baby = baby;
	}

}
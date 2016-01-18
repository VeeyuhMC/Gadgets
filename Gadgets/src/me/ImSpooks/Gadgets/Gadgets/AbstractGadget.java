package me.ImSpooks.Gadgets.Gadgets;

import java.util.List;

import org.bukkit.Material;

public interface AbstractGadget {
	
	public void gadgetEffect();
	
	public int gadgetCooldown();
	
	public String gadgetName();
	public Material itemstackMaterial();
	public List<String> itemstackLore();
}
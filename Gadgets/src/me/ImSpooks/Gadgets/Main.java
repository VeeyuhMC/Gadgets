package me.ImSpooks.Gadgets;

import me.ImSpooks.Gadgets.Commands.ToggleGadgets;
import me.ImSpooks.Gadgets.Commands.ToggleVanity;
import me.ImSpooks.Gadgets.Events.InteractManager;
import me.ImSpooks.Gadgets.Gadgets.RegisteredGadgets;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	
	void registerEvent(){
		new InteractManager();
	}
	
	void registerGadgets(){
		new RegisteredGadgets().initializeGadgets();
	}
	
	void registerCommands(){
		new ToggleVanity();
		new ToggleGadgets();
	}
	
	public void onEnable() {
		plugin = this;
		
		registerEvent();
		registerGadgets();
		registerCommands();
		
		new InteractManager().cooldownSupport();
	}
	
	public void onDisable() {
		plugin = null;
	}
}
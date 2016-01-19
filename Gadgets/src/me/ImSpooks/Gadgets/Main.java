package me.ImSpooks.Gadgets;

import me.ImSpooks.Gadgets.Commands.ToggleGadgets;
import me.ImSpooks.Gadgets.Commands.ToggleVanity;
import me.ImSpooks.Gadgets.Events.HatMenuEvent;
import me.ImSpooks.Gadgets.Events.InteractManager;
import me.ImSpooks.Gadgets.Events.PetsMenuEvent;
import me.ImSpooks.Gadgets.Events.VanityMenuEvent;
import me.ImSpooks.Gadgets.GUIs.HatMenu;
import me.ImSpooks.Gadgets.Gadgets.RegisteredGadgets;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	
	void registerEvent(){
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new InteractManager(), this);

		pm.registerEvents(new VanityMenuEvent(), this);
		pm.registerEvents(new HatMenuEvent(), this);
		pm.registerEvents(new PetsMenuEvent(), this);
	}
	
	void registerGadgets(){
		new RegisteredGadgets().initializeGadgets();
	}
	
	void registerCommands(){
		if (getCommand("togglegadgets") != null)
			getCommand("togglegadgets").setExecutor(new ToggleGadgets());
		if (getCommand("togglevanity") != null)
			getCommand("togglevanity").setExecutor(new ToggleVanity());
	}
	
	@Override
	public void onEnable() {
		plugin = this;
		
		registerEvent();
		registerGadgets();
		registerCommands();
		
		new InteractManager().cooldownSupport();
	}
	
	@Override
	public void onDisable() {
		plugin = null;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (command.getName().equalsIgnoreCase("m1"))
			HatMenu.menu1((Player)sender);
		return true;
	}
}
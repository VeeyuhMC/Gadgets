package me.ImSpooks.Gadgets;

import me.ImSpooks.Gadgets.Commands.ToggleGadgets;
import me.ImSpooks.Gadgets.Commands.ToggleVanity;
import me.ImSpooks.Gadgets.Events.InteractManager;
import me.ImSpooks.Gadgets.Events.ParticlePlayer;
import me.ImSpooks.Gadgets.Events.ClickEvents.HatMenuEvent;
import me.ImSpooks.Gadgets.Events.ClickEvents.MorphMenuEvent;
import me.ImSpooks.Gadgets.Events.ClickEvents.ParticleMenuEvent;
import me.ImSpooks.Gadgets.Events.ClickEvents.PetsMenuEvent;
import me.ImSpooks.Gadgets.Events.ClickEvents.VanityMenuEvent;
import me.ImSpooks.Gadgets.Events.MorphEvent.MorphEvent;
import me.ImSpooks.Gadgets.Events.MorphEvent.MorphPlayer;
import me.ImSpooks.Gadgets.GUIs.VanityMenu;
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
		pm.registerEvents(new ParticleMenuEvent(), this);
		pm.registerEvents(new MorphMenuEvent(), this);

		pm.registerEvents(new MorphEvent(), this);
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
		
		new ParticlePlayer();
		new MorphPlayer();
	}
	
	@Override
	public void onDisable() {
		plugin = null;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (command.getName().equalsIgnoreCase("smoozevanity"))
			VanityMenu.menu((Player)sender);
		return true;
	}
}
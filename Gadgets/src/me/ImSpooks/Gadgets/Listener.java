package me.ImSpooks.Gadgets;

public class Listener implements org.bukkit.event.Listener {
	
	public Main plugin = Main.plugin;

	public Listener(){
		Main.plugin.getServer().getPluginManager().registerEvents(this, Main.plugin);
	}
}
package me.ImSpooks.Gadgets.Commands.API;

import me.ImSpooks.Gadgets.Main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public abstract class CustomCommand implements AbstractCommand, CommandExecutor {
	
	public Main plugin = Main.plugin;
	
	public CustomCommand(){
		plugin.getCommand(getName()).setExecutor(this);
	}
	
	protected boolean isPlayer(CommandSender sender){
		return sender instanceof Player;
	}
	
	protected boolean isConsole(CommandSender sender){
		return sender instanceof ConsoleCommandSender;
	}
	
	public Player makePlayer(CommandSender sender){
		return (Player)sender;
	}
	
	public boolean createCommand(org.bukkit.command.Command command){
		return command.getName().equalsIgnoreCase(getName());
	}
	
	public boolean onCommand(CommandSender arg0,
			org.bukkit.command.Command arg1, String arg2, String[] arg3) {
		registerCommand(arg0, arg1, arg2, arg3);
		return false;
	}
}
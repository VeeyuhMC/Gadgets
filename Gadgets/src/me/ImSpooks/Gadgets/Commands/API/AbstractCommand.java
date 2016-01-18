package me.ImSpooks.Gadgets.Commands.API;

import org.bukkit.command.CommandSender;

public abstract interface AbstractCommand {
	
	public String getName();
	public boolean registerCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args);

}
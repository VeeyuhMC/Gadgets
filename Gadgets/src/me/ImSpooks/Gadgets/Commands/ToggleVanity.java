package me.ImSpooks.Gadgets.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ToggleVanity implements CommandExecutor {

	public static boolean toggle = true;

	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (command.getName().equalsIgnoreCase("togglevanity")){
			if (sender.hasPermission("smoozemc.togglevanity")){
				toggle = !toggle;
				sender.sendMessage(toggle ? "" : ""); // TODO Messages
			}
		}
		return false;
	}
}
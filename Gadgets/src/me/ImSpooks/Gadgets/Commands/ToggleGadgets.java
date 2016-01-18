package me.ImSpooks.Gadgets.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import me.ImSpooks.Gadgets.Commands.API.CustomCommand;

public class ToggleGadgets extends CustomCommand {
	
	public static boolean toggle = true;

	public String getName() {
		return "togglevanity";
	}

	public boolean registerCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (createCommand(command)){
			if (sender.hasPermission("smoozemc.togglevanity")){
				toggle = !toggle;
				sender.sendMessage(toggle ? "" : ""); // TODO Messages
			}
		}
		return false;
	}
}
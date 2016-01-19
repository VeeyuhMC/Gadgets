package me.ImSpooks.Gadgets.Configuration;

import java.io.File;

import me.ImSpooks.Gadgets.Main;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerConfig extends YamlConfiguration {
	
	// Support naar MySQL

	public static String getPlayersUUID(Player p) {
		return p.getUniqueId().toString();
	}
	public static Config offlinePlayerConfig(String args){
		@SuppressWarnings("deprecation")
		OfflinePlayer p = Bukkit.getOfflinePlayer(args);
		return new Config("Players", p.getUniqueId().toString());
	}

	private JavaPlugin plugin;
	private String fileName;

	public PlayerConfig(JavaPlugin plugin, Player p) {
		if (!PlayerConfig.exists(p)){
			this.plugin = plugin;
			this.fileName = "";
		}
		this.plugin = plugin;
		this.fileName = getPlayersUUID(p)+".yml";

		save();
		Load();
	}

	public PlayerConfig(Player p) {
		this(Main.plugin, p);
	}
	
	public static Config offlineplayerConfig(OfflinePlayer p){
		return new Config(Main.plugin.getDataFolder() + "/Players", p.getUniqueId().toString());
	}
	
	public static boolean exists(Player p){
		boolean b = false;
		try {
			File file = new File(Main.plugin.getDataFolder() + "/Players", p.getUniqueId().toString()+".yml");
			if (file.exists()) {
				b = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return b;
	}

	public void save() {
		try {
			File file = new File(plugin.getDataFolder() + "/Players", fileName);
			if (!file.exists()) {
				if (plugin.getResource(fileName) != null) {
					plugin.saveResource(fileName, false);
				} else {
					save(file);
				}
			} else {
				load(file);
				save(file);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void Save() {
		try {
			save(new File(plugin.getDataFolder() + "/Players", fileName));
			Load();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void Load() {
		try {
			File file = new File(plugin.getDataFolder() + "/Players", fileName);
			if (!file.exists()) {
				if (plugin.getResource(fileName) != null) {
					save(file);
					load(file);
				} else {
					save(file);
				}
			} else {
				save(file);
				load(file);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
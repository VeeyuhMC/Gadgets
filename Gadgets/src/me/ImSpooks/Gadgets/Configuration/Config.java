package me.ImSpooks.Gadgets.Configuration;

import java.io.File;

import me.ImSpooks.Gadgets.Main;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Config extends YamlConfiguration {
	
	// Support naar MySQL

	private String folder;
	private JavaPlugin plugin;
	private String fileName;

	public Config(String folder, String fileName, JavaPlugin plugin) {
		this.plugin = plugin;
		
		if ((folder.equalsIgnoreCase("")) || (folder == "") || (folder == null))
			this.folder = plugin.getDataFolder() + "/";
		else
			this.folder = plugin.getDataFolder() + "/" + folder;
		
		this.fileName = fileName+".yml";

		save();
		Load();
	}
	public Config(String folder, String fileName) {
		this(folder, fileName, Main.plugin);
	}

	public void save() {
		try {
			File file = new File(folder, fileName);
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
			save(new File(folder, fileName));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void Load() {
		try {
			File file = new File(folder, fileName);
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
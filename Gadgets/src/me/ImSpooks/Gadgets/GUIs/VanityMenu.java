package me.ImSpooks.Gadgets.GUIs;

import java.util.ArrayList;
import java.util.Arrays;

import me.ImSpooks.Gadgets.Utils.Menu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class VanityMenu {
	
	public static void menu(Player p){
		Inventory inv = Bukkit.createInventory(null, 5*9, "§8Vanity Menu");
		
		Menu m = new Menu();
		
		m.create(inv, 13, Material.DOUBLE_PLANT, 0, "§a§lCoins: " + "tokens.amount", new ArrayList<String>(Arrays.asList("&eJe beschikt over &6&l" + "tokens.amount" + " &r&eTokens&r&e!")));
		// TODO "coins.amount" = Aantal tokens (Smooze Coins/Credits) van de speler;
		
		m.create(inv, 19, Material.NETHER_STAR, 0, "&b&lPARTICLES", new ArrayList<>(Arrays.asList(
				"",
				"&7Muziek",
				"&7... Hartjes",
				"&7VUUR!",
				"&7Selecteer de particle die goed bij jou past!",
				"",
				"&8(Aantal vrijgespeelde particles: " + "particles.amount" + "/6)",
				"",
				"&eKlik om het Particle menu te openen!"
				)));
		
		inv.setItem(21, null); // Hiervoor miet ik de lores nog hebben

		m.create(inv, 23, Material.GOLD_HELMET, 0, "&b&lHATS", new ArrayList<String>(Arrays.asList(
				"",
				"&7Selecteer een toffe hat,",
				"&7om jou emotie te laten zien ... of kies",
				"&7een hat die echt bij jou past!",
				"",
				"&8(Aantal vrijgespeelde hats: " + "hats.amount" + "/42)",
				"",
				"&eKlik om het Hat menu te openen!"
				)));
		
		inv.setItem(25, null); // Hiervoor miet ik de lores nog hebben
		
		inv.setItem(28, null); // Hiervoor miet ik de lores nog hebben
		
		m.create(inv, 30, Material.STAINED_GLASS_PANE, 7, "&7&l??", null);
		m.create(inv, 32, Material.STAINED_GLASS_PANE, 7, "&7&l??", null);
		m.create(inv, 34, Material.STAINED_GLASS_PANE, 7, "&7&l??", null);
		
		p.openInventory(inv);
	}
}
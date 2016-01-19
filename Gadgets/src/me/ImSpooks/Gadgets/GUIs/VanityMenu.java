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
		Inventory inv = Bukkit.createInventory(null, 5*9, "§7Vanity Menu");
		
		Menu m = new Menu();
		
		m.create(inv, 13, Material.DOUBLE_PLANT, 0, "§a§lCoins: " + "coins.amount", new ArrayList<String>(Arrays.asList("", "&eJe beschikt over &6&l" + "coins.amount" + "Tokens&r&e!")));
		// TODO coins.amount moet de coins zijn die je nu hebt
		
		inv.setItem(19, null); // Hiervoor miet ik de lores nog hebben
		
		inv.setItem(21, null); // Hiervoor miet ik de lores nog hebben // Hiervoor miet ik de lores nog hebben

		m.create(inv, 23, Material.GOLD_HELMET, 0, "&b&lHATS", new ArrayList<String>(Arrays.asList(
				"",
				"&7Selecteer een toffe hat,",
				"&7om jou emotie te laten zien ... of kies",
				"&7een hat die echt bij jou past!",
				"",
				"&a(Aantal vrijgespeelde hats: " + "hats.amount" + "/42)",
				"",
				"&eKlik om het Hat menu te openen!")));
		
		inv.setItem(25, null); // Hiervoor miet ik de lores nog hebben
		
		inv.setItem(28, null); // Hiervoor miet ik de lores nog hebben
		
		m.create(inv, 30, Material.STAINED_GLASS_PANE, 7, "&7&l??", null);
		m.create(inv, 32, Material.STAINED_GLASS_PANE, 7, "&7&l??", null);
		m.create(inv, 34, Material.STAINED_GLASS_PANE, 7, "&7&l??", null);
		
		p.openInventory(inv);
	}
}
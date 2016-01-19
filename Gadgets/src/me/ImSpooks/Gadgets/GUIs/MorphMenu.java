package me.ImSpooks.Gadgets.GUIs;

import me.ImSpooks.Gadgets.Utils.Menu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class MorphMenu {
	
	@SuppressWarnings("deprecation")
	public static void menu(Player p){
		Inventory inv = Bukkit.createInventory(null, 4*9, "§8Vanity Menu - Morphs (1/1)");
		
		Menu m = new Menu();
		
		m.create(inv, 10, Material.getMaterial(383), 90, "&ePig Morph", null);
		m.create(inv, 11, Material.getMaterial(383), 93, "&eChicken Morph", null);
		m.create(inv, 12, Material.getMaterial(383), 54, "&eZombie Morph", null);
		m.create(inv, 13, Material.getMaterial(383), 51, "&eSkeleton Morph", null);
		m.create(inv, 14, Material.getMaterial(383), 66, "&eWitch Morph", null);
		m.create(inv, 15, Material.getMaterial(383), 61, "&eBlaze Morph", null);
		m.create(inv, 15, Material.getMaterial(383), 68, "&eGuardian Morph", null);
		
		m.create(inv, 30, Material.ARROW, 0, "&b← Klik hier om naar de vorige pagina te gaan", null);
		m.create(inv, 31, Material.SKULL_ITEM, 0, "&cKlik hier om je particle uit te zetten", null);
		
		p.openInventory(inv);
	}
}
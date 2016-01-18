package me.ImSpooks.Gadgets.GUIs;

import me.ImSpooks.Gadgets.Utils.Menu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ParticleMenu {
	
	public static void menu(Player p){
		Inventory inv = Bukkit.createInventory(null, 4*9, "§7Vanity Menu - Particles (1/1)");
		
		Menu.create(inv, 10, Material.RED_ROSE, 0, "&eHeart Particle", null);
		Menu.create(inv, 11, Material.EMERALD, 0, "&eHappy Particle", null);
		Menu.create(inv, 12, Material.NETHER_STAR, 0, "&eSparkle Particle", null);
		Menu.create(inv, 13, Material.BOOK, 0, "&eEnchantment Particle", null);
		Menu.create(inv, 14, Material.BLAZE_POWDER, 0, "&eFire Particle", null);
		Menu.create(inv, 15, Material.RECORD_4, 0, "&eMusic Particle", null);
		
		Menu.create(inv, 30, Material.ARROW, 0, "&aKlik hier om terug te gaan!", null);
		Menu.create(inv, 31, Material.NETHER_STAR, 0, "&aKlik hier om je particle uit te zetten!", null);
		
		p.openInventory(inv);
	}
}
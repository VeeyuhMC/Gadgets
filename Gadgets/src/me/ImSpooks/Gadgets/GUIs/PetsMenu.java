package me.ImSpooks.Gadgets.GUIs;

import me.ImSpooks.Gadgets.Utils.Menu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PetsMenu {
	
	@SuppressWarnings("deprecation")
	public static void menu(Player p){
		Inventory inv = Bukkit.createInventory(null, 6*9, "§8Vanity Menu - Pets (1/1)");
		
		Menu m = new Menu();
		
		m.create(inv, 10, Material.getMaterial(383), 90, "&ePig Pet", null);
		m.create(inv, 11, Material.getMaterial(383), 93, "&eChicken Pet", null);
		m.create(inv, 12, Material.getMaterial(383), 92, "&eCow Pet", null);
		m.create(inv, 13, Material.getMaterial(383), 91, "&eSheep Pet", null);
		m.create(inv, 14, Material.getMaterial(383), 95, "&eWolf Pet", null);
		m.create(inv, 15, Material.getMaterial(383), 98, "&eOcelot Pet", null);
		m.create(inv, 19, Material.getMaterial(383), 100, "&eHorse Pet", null);
		m.create(inv, 20, Material.getMaterial(383), 120, "&eVillager Pet", null);
		m.create(inv, 21, Material.getMaterial(383), 101, "&eRabbit Pet", null);
		m.create(inv, 22, Material.getMaterial(383), 94, "&eSquid Pet", null);
		m.create(inv, 23, Material.getMaterial(383), 54, "&eZombie Pet", null);
		m.create(inv, 24, Material.getMaterial(383), 51, "&eSkeleton Pet", null);
		m.create(inv, 28, Material.getMaterial(383), 50, "&eCreeper Pet", null);
		m.create(inv, 29, Material.getMaterial(383), 52, "&eSpider Pet", null);
		m.create(inv, 30, Material.getMaterial(383), 58, "&eEnderman Pet", null);
		m.create(inv, 31, Material.getMaterial(383), 66, "&eWitch Pet", null);
		m.create(inv, 32, Material.getMaterial(383), 55, "&eSlime Pet", null);
		m.create(inv, 33, Material.getMaterial(383), 56, "&eIronGolem Pet", null);
		
		m.create(inv, 16, Material.SADDLE, 0, "&bGa op je Pet zitten!", null);
		m.create(inv, 25, Material.ENDER_PEARL, 0, "&bTeleporteer je Pet naar jouw!", null);
		m.create(inv, 34, Material.NAME_TAG, 0, "&bGa op je Pet zitten!", null);

		m.create(inv, 48, Material.ARROW, 0, "&b← Klik hier om naar de vorige pagina te gaan", null);
		m.create(inv, 49, Material.BONE, 0, "&bKlik hier om je Pet te laten despawnen!", null);

		p.openInventory(inv);
	}
}
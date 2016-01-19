package me.ImSpooks.Gadgets.Events.ClickEvents;

import me.ImSpooks.Gadgets.GUIs.HatMenu;
import me.ImSpooks.Gadgets.GUIs.ParticleMenu;
import me.ImSpooks.Gadgets.GUIs.PetsMenu;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class VanityMenuEvent implements Listener{
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		if (e.getInventory().getName().equalsIgnoreCase("§8Vanity Menu")){
			Player p = (Player) e.getWhoClicked();
			e.setCancelled(true);
			
			if (e.getCurrentItem() == null || e.getCurrentItem().getType().equals(Material.AIR))
				return;
			
			if (e.getCurrentItem().getType().equals(Material.NETHER_STAR)){
				ParticleMenu.menu(p);
			}
			
			else if (e.getCurrentItem().getType().equals(Material.BONE)){
				PetsMenu.menu(p);
			}
			
			else if (e.getCurrentItem().getType().equals(Material.GOLD_HELMET)){
				HatMenu.menu1(p);
			}
			
			else if (e.getCurrentItem().getType().equals(Material.SKULL_ITEM)){
				
			}
			
			else if (e.getCurrentItem().getType().equals(Material.REDSTONE)){
				
			}
		}
	}
}
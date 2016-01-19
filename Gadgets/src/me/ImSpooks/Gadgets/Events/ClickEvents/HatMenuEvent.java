package me.ImSpooks.Gadgets.Events.ClickEvents;


import me.ImSpooks.Gadgets.GUIs.HatMenu;
import me.ImSpooks.Gadgets.GUIs.VanityMenu;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class HatMenuEvent implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		if (e.getInventory().getName().equalsIgnoreCase("§8Vanity Menu - Hats (1/2)")){
			Player p = (Player) e.getWhoClicked();
			e.setCancelled(true);
			
			if (e.getCurrentItem() == null || e.getCurrentItem().getType().equals(Material.AIR))
				return;
			
			if (!e.getCurrentItem().getType().equals(Material.ARROW)){
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 2);
				p.closeInventory();
			}
			
			if (e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && e.getCurrentItem().getDurability() == 3){
				p.getInventory().setHelmet(e.getCurrentItem());
				p.updateInventory();
			}
			else if (e.getCurrentItem().getType().equals(Material.GOLD_HELMET)){
				p.getInventory().setHelmet(null);
				p.updateInventory();
			}
			
			else if (e.getCurrentItem().getType().equals(Material.ARROW)){
				if (e.getSlot() == 48){
					VanityMenu.menu(p);
				}
				else if (e.getSlot() == 50){
					HatMenu.menu2(p);
				}
			}
		}
		
		else if (e.getInventory().getName().equalsIgnoreCase("§8Vanity Menu - Hats (2/2)")){
			Player p = (Player) e.getWhoClicked();
			e.setCancelled(true);
			
			if (e.getCurrentItem() == null || e.getCurrentItem().getType().equals(Material.AIR))
				return;
			
			if (!e.getCurrentItem().getType().equals(Material.ARROW)){
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 2);
				p.closeInventory();
			}
			
			if (e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && e.getCurrentItem().getDurability() == 3){
				p.getInventory().setHelmet(e.getCurrentItem());
				p.updateInventory();
			}
			else if (e.getCurrentItem().getType().equals(Material.GOLD_HELMET)){
				p.getInventory().setHelmet(null);
				p.updateInventory();
			}
			
			else if (e.getCurrentItem().getType().equals(Material.ARROW)){
				HatMenu.menu1(p);
			}
		}
	}
}
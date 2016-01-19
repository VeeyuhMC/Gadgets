package me.ImSpooks.Gadgets.Events.ClickEvents;

import java.util.HashMap;
import java.util.Map;

import me.ImSpooks.Gadgets.GUIs.VanityMenu;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MorphMenuEvent implements Listener {
	
	public static Map<Player, EntityType> morph = new HashMap<Player, EntityType>();

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(InventoryClickEvent e){
		if (e.getInventory().getName().equalsIgnoreCase("§7Vanity Menu - Morphs (1/1)")){
			Player p = (Player) e.getWhoClicked();
			e.setCancelled(true);
			
			if (e.getCurrentItem() == null)
				return;
			
			if (e.getCurrentItem() != null && !e.getCurrentItem().getType().equals(Material.ARROW)){
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 2);
				p.closeInventory();
			}
			
			else if (e.getCurrentItem().getTypeId() == 383){
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				if (name.contains("Pig")){
					morph.put(p, EntityType.PIG);
				}
				else if (name.contains("Chicken")){
					morph.put(p, EntityType.CHICKEN);
				}
				else if (name.contains("Zombie")){
					morph.put(p, EntityType.ZOMBIE);
				}
				else if (name.contains("Skeleton")){
					morph.put(p, EntityType.SKELETON);
				}
				else if (name.contains("Witch")){
					morph.put(p, EntityType.WITCH);
				}
				else if (name.contains("Blaze")){
					morph.put(p, EntityType.BLAZE);
				}
				else if (name.contains("Guardian")){
					morph.put(p, EntityType.GUARDIAN);
				}
			}
			
			else if (e.getCurrentItem().getType().equals(Material.ARROW)){
				VanityMenu.menu(p);
			}
			
			else if (e.getCurrentItem().getType().equals(Material.SKULL_ITEM)){
				morph.put(p, null);
			}
		}
	}
}
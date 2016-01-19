package me.ImSpooks.Gadgets.Events.ClickEvents;

import me.ImSpooks.Gadgets.GUIs.VanityMenu;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PetsMenuEvent implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(InventoryClickEvent e){
		if (e.getInventory().getName().equalsIgnoreCase("§8Vanity Menu - Pets (1/1)")){
			e.setCancelled(true);
			Player p = (Player) e.getWhoClicked();
			
			if (e.getCurrentItem() == null || e.getCurrentItem().getType().equals(Material.AIR))
				return;
			
			if (!e.getCurrentItem().getType().equals(Material.ARROW) &&
					!e.getCurrentItem().getType().equals(Material.SADDLE) &&
					!e.getCurrentItem().getType().equals(Material.ENDER_PEARL) &&
					!e.getCurrentItem().getType().equals(Material.NAME_TAG)){
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 2);
				p.closeInventory();
			}
			
			
			if (e.getCurrentItem().getType().equals(Material.BONE)){ // TODO Despawnt pet van de player
				
			}
			
			else if (e.getCurrentItem().getType().equals(Material.ARROW)){
				VanityMenu.menu(p);
			}
			
			else if (e.getCurrentItem().getType().equals(Material.SADDLE)){ // TODO Laat player op zijn Pet rijden
				VanityMenu.menu(p);
			}
			else if (e.getCurrentItem().getType().equals(Material.ENDER_PEARL)){ // TODO Teleporteer Pet naar player
				VanityMenu.menu(p);
			}
			else if (e.getCurrentItem().getType().equals(Material.NAME_TAG)){ // TODO Geef Pet een naam
				VanityMenu.menu(p);
			}
			
			else if (e.getCurrentItem().getTypeId() == 383){
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				if (name.contains("Pig")){ // TODO Spawnt Pig
					
				}
				else if (name.contains("Chicken")){ // TODO Spawnt Chicken
					
				}
				else if (name.contains("Cow")){ // TODO Spawnt Cow
					
				}
				else if (name.contains("Sheep")){ // TODO Spawnt Sheep
					
				}
				else if (name.contains("Wolf")){ // TODO Spawnt Wolf
					
				}
				else if (name.contains("Ocelot")){ // TODO Spawnt Ocelot
					
				}

				else if (name.contains("Horse")){ // TODO Spawnt Horse
					
				}
				else if (name.contains("Villager")){ // TODO Spawnt Villager
					
				}
				else if (name.contains("Rabbit")){ // TODO Spawnt Rabbit
					
				}
				else if (name.contains("Squid")){ // TODO Spawnt Squid
					
				}
				else if (name.contains("Zombie")){ // TODO Spawnt Zombie
					
				}
				else if (name.contains("Skeleton")){ // TODO Spawnt Skeleton
					
				}

				else if (name.contains("Creeper")){ // TODO Spawnt Creeper
					
				}
				else if (name.contains("Spider")){ // TODO Spawnt Spider
					
				}
				else if (name.contains("Endeman")){ // TODO Spawnt Enderman
					
				}
				else if (name.contains("Witch")){ // TODO Spawnt Witch
					
				}
				else if (name.contains("Slime")){ // TODO Spawnt Slime
					
				}
				else if (name.contains("IronGolem")){ // TODO Spawnt IronGolem
					
				}
			}
		}
	}
}
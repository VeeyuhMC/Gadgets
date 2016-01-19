package me.ImSpooks.Gadgets.Events.ClickEvents;

import me.ImSpooks.Gadgets.Events.ParticlePlayer;
import me.ImSpooks.Gadgets.GUIs.VanityMenu;
import me.ImSpooks.Gadgets.Utils.ParticleEffect;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ParticleMenuEvent implements Listener{
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		if (e.getInventory().getName().equalsIgnoreCase("§7Vanity Menu - Particles (1/1)")){
			Player p = (Player) e.getWhoClicked();
			e.setCancelled(true);
			
			if (e.getCurrentItem() == null)
				return;
			
			if (e.getCurrentItem() != null && !e.getCurrentItem().getType().equals(Material.ARROW)){
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 2);
				p.closeInventory();
			}
			
			if (e.getCurrentItem().getType().equals(Material.RED_ROSE)){
				ParticlePlayer.particle.put(p, ParticleEffect.HEART);
			}
			else if (e.getCurrentItem().getType().equals(Material.EMERALD)){
				ParticlePlayer.particle.put(p, ParticleEffect.GREEN_SPARKLE);
			}
			else if (e.getCurrentItem().getType().equals(Material.NETHER_STAR)){
				ParticlePlayer.particle.put(p, ParticleEffect.WHITE_SPARKLE);
			}
			else if (e.getCurrentItem().getType().equals(Material.BOOK)){
				ParticlePlayer.particle.put(p, ParticleEffect.ENCHANTMENT_TABLE);
			}
			else if (e.getCurrentItem().getType().equals(Material.BLAZE_POWDER)){
				ParticlePlayer.particle.put(p, ParticleEffect.FIRE);
			}
			else if (e.getCurrentItem().getType().equals(Material.RECORD_4)){
				ParticlePlayer.particle.put(p, ParticleEffect.NOTE);
			}

			else if (e.getCurrentItem().getType().equals(Material.ARROW)){
				VanityMenu.menu(p);
			}

			else if (e.getCurrentItem().getType().equals(Material.NETHER_STAR)){
				ParticlePlayer.particle.put(p, null);
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 2);
				p.closeInventory();
			}
		}
	}
}
package me.ImSpooks.Gadgets.Events;

import java.util.HashMap;
import java.util.Map;

import me.ImSpooks.Gadgets.Main;
import me.ImSpooks.Gadgets.Commands.ToggleGadgets;
import me.ImSpooks.Gadgets.Gadgets.Gadget;
import me.ImSpooks.Gadgets.Gadgets.RegisteredGadgets;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class InteractManager implements Listener {
	
	Map<Player, Double> cooldown = new HashMap<Player, Double>();
	@EventHandler
	public void interactEvent(PlayerInteractEvent e){
		Player p = e.getPlayer();
		
		for (Gadget gadget : RegisteredGadgets.registeredGadgets()){
			if (p.getItemInHand().equals(gadget.toItemStack())){
				
				if (!ToggleGadgets.toggle) {
					// TODO Cooldown message;
					return;
				}
				
				if (cooldown.get(p) > 0){
					// TODO Cooldown message;
					return;
				}
				
				cooldown.put(p, Double.valueOf(gadget.gadgetCooldown() + ".0"));
			}
			else {
				return;
			}
		}
	}
	
	public double getCooldown(Player p){
		return cooldown.get(p) == null ? 0.0 : cooldown.get(p);
	}
	
	public void cooldownSupport(){
		new BukkitRunnable() {
			
			public void run() {
				for (Player p : Bukkit.getOnlinePlayers()){
					if (cooldown.get(p) == null)
						cooldown.put(p, 0.0);
					
					if (cooldown.get(p) > 0){
						return;
					}
					else {
						cooldown.put(p, cooldown.get(p)-0.1);
					}
				}
			}
		}.runTaskTimer(Main.plugin, 0, 1);
	}
}
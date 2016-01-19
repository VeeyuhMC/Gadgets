package me.ImSpooks.Gadgets.Events.MorphEvent;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class MorphEvent implements Listener{
	
	@EventHandler
	public void onDamage(EntityDamageEvent e){
		for (Player p : Bukkit.getOnlinePlayers())
			if (e.getEntity().equals(MorphPlayer.getMorph.get(p)))
				e.setCancelled(true);
	}
}
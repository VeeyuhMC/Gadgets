package me.ImSpooks.Gadgets.Events.MorphEvent;

import java.util.HashMap;
import java.util.Map;

import me.ImSpooks.Gadgets.Main;
import me.ImSpooks.Gadgets.Events.ClickEvents.MorphMenuEvent;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class MorphPlayer extends BukkitRunnable{
	
	Map<Player, Boolean> hasMorph = new HashMap<Player, Boolean>();
	Map<Player, EntityType> playerMorph = MorphMenuEvent.morph;
	public static Map<Player, LivingEntity> getMorph = new HashMap<Player, LivingEntity>();

	public MorphPlayer(){
		runTaskTimer(Main.plugin, 0, 0);
	}
	
	@Override
	public void run() {
		for (Player p : Bukkit.getOnlinePlayers()){
			if (hasMorph.get(p) == null)
				hasMorph.put(p, false);
			
			if (playerMorph.get(p) == null)
				return;
			
			EntityType morph = playerMorph.get(p);
			if (!hasMorph.get(p)){
				LivingEntity e = (LivingEntity) p.getWorld().spawnEntity(p.getLocation(), morph);
				hasMorph.put(p, true);
				getMorph.put(p, e);
				return;
			}
			
			LivingEntity e = getMorph.get(p);
			if (e.isValid()){
				Vector dir = p.getLocation().getDirection();
				
				Location toLoc = p.getLocation().subtract(dir.getX()*0.3, 0, dir.getZ()*0.3);
				
				e.setVelocity(toLoc.toVector().subtract(e.getLocation().toVector()));
			}
			else {
				hasMorph.put(p, false);
				getMorph.put(p, null);
			}
		}
	}
}
package me.ImSpooks.Gadgets.Events;

import java.util.HashMap;
import java.util.Map;

import me.ImSpooks.Gadgets.Main;
import me.ImSpooks.Gadgets.Utils.ParticleEffect;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class ParticlePlayer extends BukkitRunnable {
	
	public ParticlePlayer(){
		runTaskTimer(Main.plugin, 0, 1);
	}
	
	public static Map<Player, ParticleEffect> particle = new HashMap<Player, ParticleEffect>();
	
	int radials = 0;
	
	int particlesPerCirclel = 32;

	@Override
	public void run() {
		for (Player p : Bukkit.getOnlinePlayers()){
			if (particle.get(p) == null)
				return;
			
			Location loc = p.getLocation();
			
			double angle, x, z, speed = 0;
			
			boolean show = true;
			
			if (particle.get(p).equals(ParticleEffect.NOTE))
				speed = 1;
			
			
			angle = radials * Math.PI / (particlesPerCirclel / 2);
			
			x = Math.sin(angle) * 0.5;
			z = Math.cos(angle) * 0.5;
			
			if (particle.get(p).equals(ParticleEffect.GREEN_SPARKLE))
				loc.add(0.1, 0, 0.1);
			
			if ((particle.get(p).equals(ParticleEffect.HEART) || particle.get(p).equals(ParticleEffect.NOTE)) && (radials%3)!=0)
				show = false;
				
			
			if (show){
				particle.get(p).display(0, 0, 0, speed, 1, loc.add(x, 2, z));
				loc.subtract(x, 2, z);
			}
		}
		
		radials++;
		if (radials > particlesPerCirclel)
			radials = 0;
	}
}
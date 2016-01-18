package me.ImSpooks.Gadgets.Utils;

import net.minecraft.server.v1_8_R3.EntityFireworks;
import net.minecraft.server.v1_8_R3.PacketPlayOutEntityStatus;
import net.minecraft.server.v1_8_R3.World;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkEffectPlayer extends EntityFireworks {
	Player[] players = null;

	public FireworkEffectPlayer(World world, Player... p) {
		super(world);
		players = p;
		this.a(0F, 0F);
	}

	boolean gone = false;

	@Override
	public boolean s_() {
		if (gone) {
			return true;
		}

		if (this.world != null) {
			gone = false;

			if (players != null)
				if (players.length > 0)
					for (Player player : players)
						(((CraftPlayer) player).getHandle()).playerConnection.sendPacket(new PacketPlayOutEntityStatus(this, (byte) 17));
				else
					world.broadcastEntityEffect(this, (byte) 17);
			this.die();
		} else {
			gone = true;
			this.die();
		}
		return false;
	}
	
	public static void spawn(Location loc, FireworkEffect.Type type, Color color, Color fade, boolean trail, boolean flicker, Player... players) {
		spawn(loc, FireworkEffect.builder().with(type).withColor(color).withFade(fade).trail(trail).flicker(flicker).build(), players);
	}
	
	public static void spawn(Location loc, FireworkEffect.Type type, Color color, Color fade, boolean trail, boolean flicker) {
		for (Player p : Bukkit.getOnlinePlayers())
		spawn(loc, FireworkEffect.builder().with(type).withColor(color).withFade(fade).trail(trail).flicker(flicker).build(), p);
	}

	private static void spawn(Location location, FireworkEffect effect, Player... players) {
		double x = location.getX();
		double y = location.getY();
		double z = location.getZ();
		FireworkEffectPlayer firework = new FireworkEffectPlayer(((CraftWorld) location.getWorld()).getHandle(), players);
		try {
			FireworkMeta meta = ((Firework) firework.getBukkitEntity()).getFireworkMeta();
			meta.addEffect(effect);
			((Firework) firework.getBukkitEntity()).setFireworkMeta(meta);
			firework.makeSound("0", 0, 0);
			firework.setPosition(x, y+1, z);

			if ((((CraftWorld) location.getWorld()).getHandle()).addEntity(firework)) {
				firework.setInvisible(true);
				firework.world.broadcastEntityEffect(firework, (byte) 17);
				firework.die();
			}
		} catch (Exception e) {
			firework.die();
			e.printStackTrace();
		}
	}
}
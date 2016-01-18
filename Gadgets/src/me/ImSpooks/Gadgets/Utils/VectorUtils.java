package me.ImSpooks.Gadgets.Utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.util.Vector;

public final class VectorUtils {

	public static final Vector rotateAroundAxisX(Vector v, double angle) {
		double y, z, cos, sin;
		cos = Math.cos(angle);
		sin = Math.sin(angle);
		y = v.getY() * cos - v.getZ() * sin;
		z = v.getY() * sin + v.getZ() * cos;
		return v.setY(y).setZ(z);
	}

	public static final Vector rotateAroundAxisY(Vector v, double angle) {
		double x, z, cos, sin;
		cos = Math.cos(angle);
		sin = Math.sin(angle);
		x = v.getX() * cos + v.getZ() * sin;
		z = v.getX() * -sin + v.getZ() * cos;
		return v.setX(x).setZ(z);
	}

	public static final Vector rotateAroundAxisZ(Vector v, double angle) {
		double x, y, cos, sin;
		cos = Math.cos(angle);
		sin = Math.sin(angle);
		x = v.getX() * cos - v.getY() * sin;
		y = v.getX() * sin + v.getY() * cos;
		return v.setX(x).setY(y);
	}

	public static final Vector rotateVector(Vector v, double angleX, double angleY, double angleZ) {
		rotateAroundAxisX(v, angleX);
		rotateAroundAxisY(v, angleY);
		rotateAroundAxisZ(v, angleZ);
		return v;
	}

	public static final double angleToXAxis(Vector vector) {
		return Math.atan2(vector.getX(), vector.getY());
	}
	
	public List<Location> rotateBuilding(int degrees, int blockX1, int blockY1, int blockZ1,
			int blockX2, int blockY2, int blockZ2, String world) {
		
		List<Location> locs = new ArrayList<Location>();
		
		Location loc;
		for (int x = (blockX1 - blockX2); x < (blockX1 + blockX2); x++){
			for (int y = (blockY1 - blockY2); y < (blockY1 + blockY2); y++){
				for (int z = (blockZ1 - blockZ2); z < (blockZ1 + blockZ2); z++){
					int rad = (int)Math.toRadians(degrees);
					loc = new Location(Bukkit.getWorld(world), x, y, z);
					loc.setX(loc.getBlockX() + rad);
					loc.setZ(loc.getBlockZ() + rad);
					locs.add(loc);
				}
			}
		}
		return locs;
    }
}
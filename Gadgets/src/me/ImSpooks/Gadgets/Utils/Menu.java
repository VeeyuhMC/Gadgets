package me.ImSpooks.Gadgets.Utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Menu {
	
    public static ItemStack create(Inventory inv, int slot, Material material, int damage, String name, ArrayList<String> lore) {
        ItemStack i = new ItemStack(material, 1, (byte) damage);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> lo = new ArrayList<String>();
        for (String il : lore) {
            lo.add(ChatColor.translateAlternateColorCodes('&', il));
        }
        if(lore!=null)
        	im.setLore(lo);
        i.setItemMeta(im);
        inv.setItem(slot, i);
        return i;
    }
}
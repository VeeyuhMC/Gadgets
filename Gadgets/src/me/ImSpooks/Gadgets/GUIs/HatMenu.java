package me.ImSpooks.Gadgets.GUIs;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import me.ImSpooks.Gadgets.Utils.Menu;

import org.apache.commons.codec.binary.Base64;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

public class HatMenu {
	
	public static void menu1(Player p){
		Inventory inv = Bukkit.createInventory(null, 6*9, "§7Vanity Menu - Hats (1/2)");

		Menu m = new Menu();
		HatMenu hm = new HatMenu();

		hm.create(inv, 10, "&eNuttela Pot", null, "http://textures.minecraft.net/texture/515dcb2da02cf734829e1e273e3025617d8071516f953251b52545da8d3e8db8");
		hm.create(inv, 11, "&ePannenkoeken", null, "");
		hm.create(inv, 12, "&eTaart", null, "");
		hm.create(inv, 13, "&eChocolade Muffin", null, "");
		hm.create(inv, 14, "&eKoekje", null, "");
		hm.create(inv, 15, "&eZuurstok", null, "");
		hm.create(inv, 16, "&eAppel", null, "");
		
		hm.create(inv, 19, "&eMeloen", null, "");
		hm.create(inv, 20, "&eAardbei", null, "");
		hm.create(inv, 21, "&eKokosnoot", null, "");
		hm.create(inv, 22, "&eHamburger", null, "");
		hm.create(inv, 23, "&eFrietjes", null, "");
		hm.create(inv, 24, "&eGlas Bier", null, "");
		hm.create(inv, 25, "&ePepsi Cola", null, "");
		
		hm.create(inv, 28, "&eRoze Donut", null, "");
		hm.create(inv, 29, "&eGoud Klokje", null, "");
		hm.create(inv, 30, "&eComputer", null, "");
		hm.create(inv, 31, "&eOude Camera", null, "");
		hm.create(inv, 32, "&eLantaarn", null, "");
		hm.create(inv, 33, "&eKapotte Televisie", null, "");
		hm.create(inv, 34, "&eOogbal", null, "");

		m.create(inv, 48, Material.ARROW, 0, "&bKlik hier om terug te gaan!", null);
		m.create(inv, 49, Material.GOLD_HELMET, 0, "&bKlik hier om je Hat af te doen!", null);
		m.create(inv, 50, Material.ARROW, 0, "&bKlik hier om naar de volgende pagina te gaan!", null);

		p.openInventory(inv);
	}
	
	public static void menu2(Player p){ 
		Inventory inv = Bukkit.createInventory(null, 6*9, "§7Vanity Menu - Hats (2/2)");
		
		Menu m = new Menu();
		HatMenu hm = new HatMenu();

		hm.create(inv, 10, "§eSpongebob", null, "");
		hm.create(inv, 11, "§ePatrick", null, "");
		hm.create(inv, 12, "§eKissy", null, "");
		hm.create(inv, 13, "§eDerp", null, "");
		hm.create(inv, 14, "§eForever Crying", null, "");
		hm.create(inv, 15, "§eWink", null, "");
		hm.create(inv, 16, "§eNederland", null, "");
		
		hm.create(inv, 19, "§eDoodshoofd", null, "");
		hm.create(inv, 20, "§eDiamanten Steve", null, "");
		hm.create(inv, 21, "§eKroon", null, "");
		hm.create(inv, 22, "§eMario", null, "");
		hm.create(inv, 23, "§eLuigi", null, "");
		hm.create(inv, 24, "§eSonic", null, "");
		hm.create(inv, 25, "§eAsh Ketchum", null, "");
		
		hm.create(inv, 28, "§eMagikarp", null, "");
		hm.create(inv, 29, "§ePickachu", null, "");
		hm.create(inv, 30, "§eLeafeon", null, "");
		hm.create(inv, 31, "§eCaterpie", null, "");
		hm.create(inv, 32, "§eWereld", null, "");
		hm.create(inv, 33, "§eKerstmis Cadeau", null, "");
		hm.create(inv, 34, "§eGras blok", null, "");

		m.create(inv, 48, Material.ARROW, 0, "&bKlik hier om terug te gaan!", null);
		m.create(inv, 49, Material.GOLD_HELMET, 0, "&bKlik hier om je Hat af te doen!", null);

		p.openInventory(inv);
	}

    public ItemStack create(Inventory inv, int slot, String name, ArrayList<String> lore, String skinURL) {
        ItemStack i = getSkull(skinURL, name);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> lo = new ArrayList<String>();
        if (lore!=null)
        for (String il : lore) {
            lo.add(ChatColor.translateAlternateColorCodes('&', il));
        }
        if (lore!=null)
        im.setLore(lo);
        i.setItemMeta(im);
        inv.setItem(slot, i);
        return i;
    }
	
    public ItemStack getSkull(String url, String name) {
        ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
        if(url.isEmpty())return head;
       
       
        SkullMeta headMeta = (SkullMeta) head.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", url).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));
        Field profileField = null;
        try {
            profileField = headMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(headMeta, profile);
        } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException e1) {
            e1.printStackTrace();
        }
        headMeta.setDisplayName("§e"+name);
        return head;
    }
}
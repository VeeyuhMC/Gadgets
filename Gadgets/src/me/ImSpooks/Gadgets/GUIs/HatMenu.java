package me.ImSpooks.Gadgets.GUIs;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
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

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

public class HatMenu {
	
	public static void menu1(Player p){
		Inventory inv = Bukkit.createInventory(null, 6*9, "§7Vanity Menu - Hats (1/2)");

		create(inv, 10, "&eNuttela Pot", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTE1ZGNiMmRhMDJjZjczNDgyOWUxZTI3M2UzMDI1NjE3ZDgwNzE1MTZmOTUzMjUxYjUyNTQ1ZGE4ZDNlOGRiOCJ9fX0=");
		create(inv, 11, "&ePannenkoeken", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ3ZjRmNWE3NGM2NjkxMjgwY2Q4MGU3MTQ4YjQ5YjJjZTE3ZGNmNjRmZDU1MzY4NjI3ZjVkOTJhOTc2YTZhOCJ9fX0=");
		create(inv, 12, "&eTaart", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjkxMzY1MTRmMzQyZTdjNTIwOGExNDIyNTA2YTg2NjE1OGVmODRkMmIyNDkyMjAxMzllOGJmNjAzMmUxOTMifX19");
		create(inv, 13, "&eChocolade Muffin", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODM3OTRjNzM2ZmM3NmU0NTcwNjgzMDMyNWI5NTk2OTQ2NmQ4NmY4ZDdiMjhmY2U4ZWRiMmM3NWUyYWIyNWMifX19");
		create(inv, 14, "&eKoekje", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjU5MmNmOWY0MmE1YThjOTk1OTY4NDkzZmRkMWIxMWUwYjY5YWFkNjQ3M2ZmNDUzODRhYmU1OGI3ZmM3YzcifX19");
		create(inv, 15, "&eZuurstok", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGNjM2Y3ODFjOTIzYTI4ODdmMTRjMWVlYTExMDUwMTY2OTY2ZjI2MDI1Nzg0MDFmMTQ1MWU2MDk3Yjk3OWRmIn19fQ==");
		create(inv, 16, "&eAppel", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUyNTcwNzY5NmJjZDE1YTE3MzA1NmZhMzkyOTZlODBmZjQxMTY4YmIwYWRkNTUyZjQ1MjNlMjU1OGEzMTE5In19fQ==");
		
		create(inv, 19, "&eMeloen", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzNmZWQ1MTRjM2UyMzhjYTdhYzFjOTRiODk3ZmY2NzExYjFkYmU1MDE3NGFmYzIzNWM4ZjgwZDAyOSJ9fX0=");
		create(inv, 20, "&eAardbei", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2JjODI2YWFhZmI4ZGJmNjc4ODFlNjg5NDQ0MTRmMTM5ODUwNjRhM2Y4ZjA0NGQ4ZWRmYjQ0NDNlNzZiYSJ9fX0=");
		create(inv, 21, "&eKokosnoot", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTliMGU5NjljZjNmY2NlZDM2YjcxMjM1MGZmYjQ2ZDhlZDc2MWZlNWVmYjEwZTNiNmE5Nzk1ZTY2NTZkYTk3In19fQ==");
		create(inv, 22, "&eHamburger", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RhZGYxNzQ0NDMzZTFjNzlkMWQ1OWQyNzc3ZDkzOWRlMTU5YTI0Y2Y1N2U4YTYxYzgyYmM0ZmUzNzc3NTUzYyJ9fX0=");
		create(inv, 23, "&eFrietjes", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTBlYWNhYzQxYTllYWYwNTEzNzZlZjJmOTU5NzAxZTFiYmUxYmY0YWE2NzE1YWRjMzRiNmRjMjlhMTNlYTkifX19");
		create(inv, 24, "&eGlas Bier", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDA1M2UyNjg2N2JiNTc1MzhlOTc4OTEzN2RiYmI1Mzc3NGUxOGVkYTZmZWY1MWNiMmVkZjQyNmIzNzI2NCJ9fX0=");
		create(inv, 25, "&ePepsi Cola", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmJiYWU2ZGY5OWRjODJiZWFmNDlkMDY0ZGY3NGExYmJjMTVlOGUzNzY1MzMyNzY5MTJjOGM4ZmU1OWNiNGY0In19fQ==");
		
		create(inv, 28, "&eRoze Donut", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODM3YzliODJiMTg2NjU2ZTlmNjM2M2EyYTFjNmE0YjViOTNjZmE5ZWY0ZGFkNmYxNmI5NGViYjVlMzYyNjc4In19fQ==");
		create(inv, 29, "&eGoud Klokje", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmZlOGNmZjc1ZjdkNDMzMjYwYWYxZWNiMmY3NzNiNGJjMzgxZDk1MWRlNGUyZWI2NjE0MjM3NzlhNTkwZTcyYiJ9fX0=");
		create(inv, 30, "&eComputer", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGFlNTJhZThjOThhYzE5ZmQwNzYzN2E0NjlmZmEyNTZhYjBiM2IxMGVjZTYyNDMxODYxODhiYTM4ZGYxNTQifX19");
		create(inv, 31, "&eOude Camera", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDNhMGZlYjYyNmU1NjdlNDc5NTc2ZjRmZjU0M2UxNmU5YjM2YTczMDQ4OTFiMmYzMjkzZWFhOGI2ODczNWE0In19fQ==");
		create(inv, 32, "&eLantaarn", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2NjMjE3YTliOWUzY2UzY2QwNDg0YzdlOGNlNDlkMWNmNzQxMjgxYmRkYTVhNGQ2Y2I4MjFmMzc4NzUyNzE4In19fQ==");
		create(inv, 33, "&eKapotte Televisie", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmUzZGIyN2NiZDE3ODkzMTA0MDkwODFhZDhjNDJkNjkwYjA4OTYxYjU1Y2FkZDQ1YjQyZDQ2YmNhMjhiOCJ9fX0=");
		create(inv, 34, "&eOogbal", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmNlZjg3NzcyYWZkODViNDY4ZjRjN2ZiOTU3MWUzMTQzNWVmNzY1YWQ0MTNmZTQ2MDI2MjE1MDQyM2UyMDIxIn19fQ==");

		Menu.create(inv, 48, Material.ARROW, 0, "&aKlik hier om terug te gaan!", null);
		Menu.create(inv, 49, Material.GOLD_HELMET, 0, "&aKlik hier om je Hat af te doen!", null);
		Menu.create(inv, 50, Material.ARROW, 0, "&aKlik hier om naar de volgende pagina te gaan!", null);

		p.openInventory(inv);
	}
	
	public static void menu2(Player p){ 
		Inventory inv = Bukkit.createInventory(null, 6*9, "§7Vanity Menu - Hats (2/2)");

		create(inv, 10, "§eSpongebob", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWU3MWVmMzlhZjRlMzNlYmNmNjlhNGJlNjM3OTU0M2M1MDE1YWFlYzc2YmFiNmZjM2Q4NjJhNzVkZmUzYzQ3In19fQ==");
		create(inv, 11, "§ePatrick", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjk3MWI5Mjc3MjljNmVhY2UxNjU5M2IzM2E5ODZkNjE5NDNkNjJmNjk2MWRlNmRiNTk5YTgxOGIyYWYzMiJ9fX0=");
		create(inv, 12, "§eKissy", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTQ1YmQxOGEyYWFmNDY5ZmFkNzJlNTJjZGU2Y2ZiMDJiZmJhYTViZmVkMmE4MTUxMjc3Zjc3OWViY2RjZWMxIn19fQ==");
		create(inv, 13, "§eDerp", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2JhYWJlNzI0ZWFlNTljNWQxM2Y0NDJjN2RjNWQyYjFjNmI3MGMyZjgzMzY0YTQ4OGNlNTk3M2FlODBiNGMzIn19fQ==");
		create(inv, 14, "§eForever Crying", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWYxYjg3NWRlNDljNTg3ZTNiNDAyM2NlMjRkNDcyZmYyNzU4M2ExZjA1NGYzN2U3M2ExMTU0YjViNTQ5OCJ9fX0=");
		create(inv, 15, "§eWink", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjRlYTJkNmY5MzlmZWZlZmY1ZDEyMmU2M2RkMjZmYThhNDI3ZGY5MGIyOTI4YmMxZmE4OWE4MjUyYTdlIn19fQ==");
		create(inv, 16, "§eNederland", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzIzY2YyMTBlZGVhMzk2ZjJmNWRmYmNlZDY5ODQ4NDM0ZjkzNDA0ZWVmZWFiZjU0YjIzYzA3M2IwOTBhZGYifX19");
		
		create(inv, 19, "§eDoodshoofd", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFlMzg1NWY5NTJjZDRhMDNjMTQ4YTk0NmUzZjgxMmE1OTU1YWQzNWNiY2I1MjYyN2VhNGFjZDQ3ZDMwODEifX19");
		create(inv, 20, "§eDiamanten Steve", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTBiOGViMzMzNjIyYWU3ZGU5YjUzYjM2MDJmNDFmNjNkYjljMjUyOGI1YmUyMzFhYzk2NTE2NjExZmIxYSJ9fX0=");
		create(inv, 21, "§eKroon", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJiYWYwYzU4OWE2YjU4MzUxMWQ4M2MyNjgyNDA4NDJkMzM2NDc3NGVjOWY1NjZkMWZkNGQzNDljZjQyZmIifX19");
		create(inv, 22, "§eMario", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmY3ZWI3NWU1NTQyY2M0OTM3YWFhZDViYjg2NTczOTNlYWYwMjY1MDA2ZWFjMWRjOTY2OTFmMzJlMTY0MzcifX19");
		create(inv, 23, "§eLuigi", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmYxNTMzODcxZTQ5ZGRhYjhmMWNhODJlZGIxMTUzYTVlMmVkMzc2NGZkMWNlMDI5YmY4MjlmNGIzY2FhYzMifX19");
		create(inv, 24, "§eSonic", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzVmNWM5ZmY5NGMwZGQ1Y2JiMWUyNzFhODE3ZTZlOWM1NTJlMzkyOGIxNTk1MTlkZDIyNmVmYWJkZCJ9fX0=");
		create(inv, 25, "§eAsh Ketchum", null, "");
		
		create(inv, 28, "§eMagikarp", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTY5YWI4YjBmMTlhMWM5OWZlM2FkODZlYTFhMmVhMmJlZWVmYmE4ZTFiOTM0MzMwODc0M2I3YmNiZDgifX19");
		create(inv, 29, "§ePickachu", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGZhNjk1YjU5NjE4YjM2MTZiNmFhYTkxMGM1YTEwMTQ2MTk1ZWRkNjM2N2QyNWU5Mzk5YTc0Y2VlZjk2NiJ9fX0=");
		create(inv, 30, "§eLeafeon", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjc5ZGFhMjFmOWVlZWI2ZGM3ZjY1NmIwNTVkNmFjMzA5MGIzYzU4NmNiZTQxMWI5MWZiOTgyOTg1MGRhN2M4NSJ9fX0=");
		create(inv, 31, "§eCaterpie", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGFhMjUzZmFkZDg5N2E2YTE5YWFkMzk1OWM0NGZiNGNlYWM1YThjYTU4OGYxMGU1MmVjOGNmYmI0MTQ0YzZkIn19fQ==");
		create(inv, 32, "§eWereld", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFkZDRmZTRhNDI5YWJkNjY1ZGZkYjNlMjEzMjFkNmVmYTZhNmI1ZTdiOTU2ZGI5YzVkNTljOWVmYWIyNSJ9fX0=");
		create(inv, 33, "§eKerstmis Cadeau", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjU2MTJkYzdiODZkNzFhZmMxMTk3MzAxYzE1ZmQ5NzllOWYzOWU3YjFmNDFkOGYxZWJkZjgxMTU1NzZlMmUifX19");
		create(inv, 34, "§eGras blok", null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ5YzYzYmM1MDg3MjMzMjhhMTllNTk3ZjQwODYyZDI3YWQ1YzFkNTQ1NjYzYWMyNDQ2NjU4MmY1NjhkOSJ9fX0=");

		Menu.create(inv, 48, Material.ARROW, 0, "&aKlik hier om terug te gaan!", null);
		Menu.create(inv, 49, Material.GOLD_HELMET, 0, "&aKlik hier om je Hat af te doen!", null);

		p.openInventory(inv);
	}

    public static ItemStack create(Inventory inv, int slot, String name, ArrayList<String> lore, String skinURL) {
        ItemStack i = getSkull(skinURL, name);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> lo = new ArrayList<String>();
        for (String il : lore) {
            lo.add(ChatColor.translateAlternateColorCodes('&', il));
        }
        im.setLore(lo);
        i.setItemMeta(im);
        inv.setItem(slot, i);
        return i;
    }
	
    public static ItemStack getSkull(String skinURL, String name) {
        ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
        if(skinURL.isEmpty())return head;
     
        ItemMeta headMeta = head.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", skinURL).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));
        Field profileField = null;
        try {
            profileField = headMeta.getClass().getDeclaredField("profile");
        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
        profileField.setAccessible(true);
        try {
            profileField.set(headMeta, profile);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        headMeta.setDisplayName("§a"+name);
        
        headMeta.setLore(Arrays.asList("§r§7Klik om deze HAT te selecteren!§r"));
        
        head.setItemMeta(headMeta);
        return head;
    }
}
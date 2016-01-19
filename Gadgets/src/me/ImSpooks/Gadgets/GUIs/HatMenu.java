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
		Inventory inv = Bukkit.createInventory(null, 6*9, "§8Vanity Menu - Hats (1/2)");

		Menu m = new Menu();
		HatMenu hm = new HatMenu();

		hm.create(inv, 10, "&eNuttela Pot", null, "http://textures.minecraft.net/texture/515dcb2da02cf734829e1e273e3025617d8071516f953251b52545da8d3e8db8");
		hm.create(inv, 11, "&ePannenkoeken", null, "http://textures.minecraft.net/texture/347f4f5a74c6691280cd80e7148b49b2ce17dcf64fd55368627f5d92a976a6a8");
		hm.create(inv, 12, "&eTaart", null, "http://textures.minecraft.net/texture/f9136514f342e7c5208a1422506a866158ef84d2b249220139e8bf6032e193");
		hm.create(inv, 13, "&eChocolade Muffin", null, "http://textures.minecraft.net/texture/83794c736fc76e45706830325b95969466d86f8d7b28fce8edb2c75e2ab25c");
		hm.create(inv, 14, "&eKoekje", null, "http://textures.minecraft.net/texture/b592cf9f42a5a8c995968493fdd1b11e0b69aad6473ff45384abe58b7fc7c7");
		hm.create(inv, 15, "&eZuurstok", null, "http://textures.minecraft.net/texture/4cc3f781c923a2887f14c1eea11050166966f2602578401f1451e6097b979df");
		hm.create(inv, 16, "&eAppel", null, "http://textures.minecraft.net/texture/cbb311f3ba1c07c3d1147cd210d81fe11fd8ae9e3db212a0fa748946c3633");
		
		hm.create(inv, 19, "&eMeloen", null, "http://textures.minecraft.net/texture/c3fed514c3e238ca7ac1c94b897ff6711b1dbe50174afc235c8f80d029");
		hm.create(inv, 20, "&eAardbei", null, "http://textures.minecraft.net/texture/cbc826aaafb8dbf67881e68944414f13985064a3f8f044d8edfb4443e76ba");
		hm.create(inv, 21, "&eKokosnoot", null, "http://textures.minecraft.net/texture/e9b0e969cf3fcced36b712350ffb46d8ed761fe5efb10e3b6a9795e6656da97");
		hm.create(inv, 22, "&eHamburger", null, "http://textures.minecraft.net/texture/a6ef1c25f516f2e7d6f7667420e33adcf3cdf938cb37f9a41a8b35869f569b");
		hm.create(inv, 23, "&eFrietjes", null, "http://textures.minecraft.net/texture/a0eacac41a9eaf051376ef2f959701e1bbe1bf4aa6715adc34b6dc29a13ea9");
		hm.create(inv, 24, "&eGlas Bier", null, "http://textures.minecraft.net/texture/4053e26867bb57538e9789137dbbb53774e18eda6fef51cb2edf426b37264");
		hm.create(inv, 25, "&ePepsi Cola", null, "http://textures.minecraft.net/texture/2bbae6df99dc82beaf49d064df74a1bbc15e8e376533276912c8c8fe59cb4f4");
		
		hm.create(inv, 28, "&eDonut", null, "http://textures.minecraft.net/texture/837c9b82b186656e9f6363a2a1c6a4b5b93cfa9ef4dad6f16b94ebb5e362678");
		hm.create(inv, 29, "&eGoud Klokje", null, "http://textures.minecraft.net/texture/d2c3569b62a1a9d28d279098b05764fed0648138be98f55dc26265fd08c40");
		hm.create(inv, 30, "&eComputer", null, "http://textures.minecraft.net/texture/8ae52ae8c98ac19fd07637a469ffa256ab0b3b10ece6243186188ba38df154");
		hm.create(inv, 31, "&eOude Camera", null, "http://textures.minecraft.net/texture/d3a0feb626e567e479576f4ff543e16e9b36a7304891b2f3293eaa8b68735a4");
		hm.create(inv, 32, "&eLantaarn", null, "http://textures.minecraft.net/texture/7cc217a9b9e3ce3cd0484c7e8ce49d1cf741281bdda5a4d6cb821f378752718");
		hm.create(inv, 33, "&eKapotte Televisie", null, "http://textures.minecraft.net/texture/be3db27cbd1789310409081ad8c42d690b08961b55cadd45b42d46bca28b8");
		hm.create(inv, 34, "&eOogbal", null, "http://textures.minecraft.net/texture/2cef87772afd85b468f4c7fb9571e31435ef765ad413fe460262150423e2021");

		m.create(inv, 48, Material.ARROW, 0, "&b← Klik hier om naar de vorige pagina te gaan", null);
		m.create(inv, 49, Material.GOLD_HELMET, 0, "&bKlik hier om je Hat af te doen!", null);
		m.create(inv, 50, Material.ARROW, 0, "&bKlik hier om naar de volgende pagina te gaan →", null);

		p.openInventory(inv);
	}
	
	public static void menu2(Player p){ 
		Inventory inv = Bukkit.createInventory(null, 6*9, "§8Vanity Menu - Hats (2/2)");
		
		Menu m = new Menu();
		HatMenu hm = new HatMenu();

		hm.create(inv, 10, "§eSpongebob", null, "http://textures.minecraft.net/texture/5e71ef39af4e33ebcf69a4be6379543c5015aaec76bab6fc3d862a75dfe3c47");
		hm.create(inv, 11, "§ePatrick", null, "http://textures.minecraft.net/texture/b971b927729c6eace16593b33a986d61943d62f6961de6db599a818b2af32");
		hm.create(inv, 12, "§eKissy", null, "http://textures.minecraft.net/texture/545bd18a2aaf469fad72e52cde6cfb02bfbaa5bfed2a8151277f779ebcdcec1");
		hm.create(inv, 13, "§eDerp", null, "http://textures.minecraft.net/texture/3baabe724eae59c5d13f442c7dc5d2b1c6b70c2f83364a488ce5973ae80b4c3");
		hm.create(inv, 14, "§eForever Crying", null, "http://textures.minecraft.net/texture/1f1b875de49c587e3b4023ce24d472ff27583a1f054f37e73a1154b5b5498");
		hm.create(inv, 15, "§eWink", null, "http://textures.minecraft.net/texture/f4ea2d6f939fefeff5d122e63dd26fa8a427df90b2928bc1fa89a8252a7e");
		hm.create(inv, 16, "§eNederland", null, "textures.minecraft.net/texture/c23cf210edea396f2f5dfbced69848434f93404eefeabf54b23c073b090adf");
		
		hm.create(inv, 19, "§eDoodshoofd", null, "http://textures.minecraft.net/texture/1ae3855f952cd4a03c148a946e3f812a5955ad35cbcb52627ea4acd47d3081");
		hm.create(inv, 20, "§eDiamanten Steve", null, "http://textures.minecraft.net/texture/10b8eb333622ae7de9b53b3602f41f63db9c2528b5be231ac96516611fb1a");
		hm.create(inv, 21, "§eKroon", null, "http://textures.minecraft.net/texture/c2baf0c589a6b583511d83c268240842d3364774ec9f566d1fd4d349cf42fb");
		hm.create(inv, 22, "§eMario", null, "http://textures.minecraft.net/texture/dba8d8e53d8a5a75770b62cce73db6bab701cc3de4a9b654d213d54af9615");
		hm.create(inv, 23, "§eLuigi", null, "http://textures.minecraft.net/texture/ff1533871e49ddab8f1ca82edb1153a5e2ed3764fd1ce029bf829f4b3caac3");
		hm.create(inv, 24, "§eSonic", null, "http://textures.minecraft.net/texture/c5f5c9ff94c0dd5cbb1e271a817e6e9c552e3928b159519dd226efabdd");
		hm.create(inv, 25, "§eAsh Ketchum", null, "http://textures.minecraft.net/texture/a69ab8b0f19a1c99fe3ad86ea1a2ea2beeefba8e1b9343308743b7bcbd8");
		
		hm.create(inv, 28, "§ePokeball", null, "http://textures.minecraft.net/texture/d43d4b7ac24a1d650ddf73bd140f49fc12d2736fc14a8dc25c0f3f29d85f8f");
		hm.create(inv, 29, "§eMagikarp", null, "http://textures.minecraft.net/texture/2f58fb7cbf9f8dcfc3bc9d61c7cb5b229bf49db1101336ffdc2d087c0b94162");
		hm.create(inv, 30, "§ePickachu", null, "http://textures.minecraft.net/texture/dfa695b59618b3616b6aaa910c5a10146195edd6367d25e9399a74ceef966");
		hm.create(inv, 31, "§eLeafeon", null, "http://textures.minecraft.net/texture/b79daa21f9eeeb6dc7f656b055d6ac3090b3c586cbe411b91fb9829850da7c85");
		hm.create(inv, 32, "§eCaterpie", null, "http://textures.minecraft.net/texture/8aa253fadd897a6a19aad3959c44fb4ceac5a8ca588f10e52ec8cfbb4144c6d");
		hm.create(inv, 33, "§eWereld", null, "http://textures.minecraft.net/texture/b1dd4fe4a429abd665dfdb3e21321d6efa6a6b5e7b956db9c5d59c9efab25");
		hm.create(inv, 34, "§eKert Cadeau", null, "http://textures.minecraft.net/texture/f5612dc7b86d71afc1197301c15fd979e9f39e7b1f41d8f1ebdf8115576e2e");

		m.create(inv, 48, Material.ARROW, 0, "&b← Klik hier om naar de vorige pagina te gaan", null);
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
        head.setItemMeta(headMeta);
        return head;
    }
}
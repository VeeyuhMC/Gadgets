package me.ImSpooks.Gadgets.Gadgets;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class Gadget implements AbstractGadget{
	
	private Player caster;

	public Player getCaster() {
		return caster;
	}

	public void setCaster(Player caster) {
		this.caster = caster;
	}
	
	public ItemStack toItemStack(){
		ItemStack stack = new ItemStack(itemstackMaterial());
		ItemMeta meta = stack.getItemMeta();
		
		meta.setDisplayName("§7§l> §r§6" + gadgetName());
		
		if (!itemstackLore().isEmpty() || itemstackLore() != null){
			meta.setLore(itemstackLore());
		}
		
		stack.setItemMeta(meta);
		
		return stack;
	}
}
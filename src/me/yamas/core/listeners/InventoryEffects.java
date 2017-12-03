package me.yamas.core.listeners;

import java.util.Arrays;

import me.yamas.core.Lang;
import me.yamas.core.Main;
import me.yamas.core.utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InventoryEffects  implements Listener{
	

	public static ItemStack str = new ItemStack(Material.DIAMOND_SWORD, 1);{
		ItemMeta im = str.getItemMeta();
		im.setDisplayName("§4Sila I");
		im.setLore(Arrays.asList(" ",
				"§aCzas: §c5 minut",
				"§aKoszt: §c8x EMERALD_BLOCK"));
		str.setItemMeta(im);
	}

	public static ItemStack str2 = new ItemStack(Material.DIAMOND_SWORD, 1);{
		ItemMeta im = str2.getItemMeta();
		im.setDisplayName("§4Sila II");
		im.setLore(Arrays.asList(" ",
				"§aCzas: §c5 minut",
				"§aKoszt: §c10x EMERALD_BLOCK"));
		str2.setItemMeta(im);
	}

	public static ItemStack haste = new ItemStack(Material.DIAMOND_PICKAXE, 1);{
		ItemMeta im = haste.getItemMeta();
		im.setDisplayName("§eHaste I");
		im.setLore(Arrays.asList(" ",
				"§aCzas: §c5 minut",
				"§aKoszt: §c4x EMERALD_BLOCK"));
		haste.setItemMeta(im);
	}
	
	public static ItemStack haste2 = new ItemStack(Material.DIAMOND_PICKAXE, 1);{
		ItemMeta im = haste2.getItemMeta();
		im.setDisplayName("§eHaste II");
		im.setLore(Arrays.asList(" ",
				"§aCzas: §c5 minut",
				"§aKoszt: §c7x EMERALD_BLOCK"));
		haste2.setItemMeta(im);
	}
	
	public static ItemStack speed = new ItemStack(Material.FEATHER, 1);{
		ItemMeta im = speed.getItemMeta();
		im.setDisplayName("§bSpeed I");
		im.setLore(Arrays.asList(" ",
				"§aCzas: §c5 minut",
				"§aKoszt: §c3x EMERALD_BLOCK"));
		speed.setItemMeta(im);
	}
	
	public static ItemStack speed2 = new ItemStack(Material.FEATHER, 1);{
		ItemMeta im = speed2.getItemMeta();
		im.setDisplayName("§bSpeed II");
		im.setLore(Arrays.asList(" ",
				"§aCzas: §c5 minut",
				"§aKoszt: §c6x EMERALD_BLOCK"));
		speed2.setItemMeta(im);
	}
	
	public static ItemStack paper = new ItemStack(Material.PAPER, 1);{
		ItemMeta im = paper.getItemMeta();
		im.setDisplayName(Util.setHEX("&4YamasCore &8| &4Efekty"));
		im.setLore(Arrays.asList(" ",
				"§7Autor: §4Yamasky",
				"§7Wykonane dla: §4RCDROP",
				"§7Wersja: §c" + Main.getVersion()));
		paper.setItemMeta(im);
	}
	
	public static ItemStack close = new ItemStack(Material.FIRE, 1);{
		ItemMeta im = close.getItemMeta();
		im.setDisplayName(" ");
		im.setLore(Arrays.asList("§8(§aKliknij, aby zamknac§8)"));
		close.setItemMeta(im);
	}
	
	public static Inventory i = Bukkit.createInventory(null, 27, Util.setHEX("&aEFEKTY"));{
		i.setItem(10, str);
		i.setItem(11, str2);
		i.setItem(12, haste);
		i.setItem(13, haste2);
		i.setItem(14, speed);
		i.setItem(15, speed2);
		i.setItem(22, close);
		i.setItem(26, paper);
}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onInvClick(InventoryClickEvent e){
		Inventory inv = e.getInventory();
		Lang msg = Lang.getInstance();
		if(inv == null){
			return;
		}
		if(inv !=null){
			if(!inv.getName().equals(i.getName()))return;
			if(e.getCurrentItem() == null) return;
			else if(e.getCurrentItem().getItemMeta() == null) return;
		}
		if(e.getWhoClicked() instanceof Player){
			Player p = (Player) e.getWhoClicked();
			PlayerInventory pinv = p.getInventory();
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§4Sila I")){
				if(pinv.containsAtLeast(new ItemStack(Material.EMERALD_BLOCK), 8)){
					e.setCancelled(true);
					pinv.removeItem(new ItemStack(Material.EMERALD_BLOCK, 8));
					p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300*20, 0, true));
					Util.broadcast(msg.EFFECTS_BOUGHT.replace("{PLAYER}", p.getName()).replace("{EFFECT}", "SILA I"), true);
					p.closeInventory();
				} else {
					e.setCancelled(true);
					Util.sendMessage(p, msg.EFFECTS_NOITEM.replace("{ITEM}", "8x EMERALD_BLOCK"));
					p.closeInventory();
				}
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§4Sila II")){
				if(pinv.containsAtLeast(new ItemStack(Material.EMERALD_BLOCK), 10)){
					e.setCancelled(true);
					pinv.removeItem(new ItemStack(Material.EMERALD_BLOCK, 10));
					p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300*20, 1, true));
					Util.broadcast(msg.EFFECTS_BOUGHT.replace("{PLAYER}", p.getName()).replace("{EFFECT}", "SILA II"), true);
					p.closeInventory();
				} else {
					e.setCancelled(true);
					Util.sendMessage(p, msg.EFFECTS_NOITEM.replace("{ITEM}", "10x EMERALD_BLOCK"));
					p.closeInventory();
				}
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§eHaste I")){
				if(pinv.containsAtLeast(new ItemStack(Material.EMERALD_BLOCK), 4)){
					e.setCancelled(true);
					pinv.removeItem(new ItemStack(Material.EMERALD_BLOCK, 4));
					p.removePotionEffect(PotionEffectType.FAST_DIGGING);
					p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 300*20, 0, true));
					Util.broadcast(msg.EFFECTS_BOUGHT.replace("{PLAYER}", p.getName()).replace("{EFFECT}", "HASTE I"), true);
					p.closeInventory();
				} else {
					e.setCancelled(true);
					Util.sendMessage(p, msg.EFFECTS_NOITEM.replace("{ITEM}", "4x EMERALD_BLOCK"));
					p.closeInventory();
				}
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§eHaste II")){
				if(pinv.containsAtLeast(new ItemStack(Material.EMERALD_BLOCK), 7)){
					e.setCancelled(true);
					pinv.removeItem(new ItemStack(Material.EMERALD_BLOCK, 7));
					p.removePotionEffect(PotionEffectType.FAST_DIGGING);
					p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 300*20, 1, true));
					Util.broadcast(msg.EFFECTS_BOUGHT.replace("{PLAYER}", p.getName()).replace("{EFFECT}", "HASTE II"), true);
					p.closeInventory();
				} else {
					e.setCancelled(true);
					Util.sendMessage(p, msg.EFFECTS_NOITEM.replace("{ITEM}", "7x EMERALD_BLOCK"));
					p.closeInventory();
				}
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bSpeed I")){
				if(pinv.containsAtLeast(new ItemStack(Material.EMERALD_BLOCK), 3)){
					e.setCancelled(true);
					pinv.removeItem(new ItemStack(Material.EMERALD_BLOCK, 3));
					p.removePotionEffect(PotionEffectType.SPEED);
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 300*20, 0, true));
					Util.broadcast(msg.EFFECTS_BOUGHT.replace("{PLAYER}", p.getName()).replace("{EFFECT}", "SPEED I"), true);
					p.closeInventory();
				} else {
					e.setCancelled(true);
					Util.sendMessage(p, msg.EFFECTS_NOITEM.replace("{ITEM}", "3x EMERALD_BLOCK"));
					p.closeInventory();
				}
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bSpeed II")){
				if(pinv.containsAtLeast(new ItemStack(Material.EMERALD_BLOCK), 6)){
					e.setCancelled(true);
					pinv.removeItem(new ItemStack(Material.EMERALD_BLOCK, 6));
					p.removePotionEffect(PotionEffectType.SPEED);
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 300*20, 1, true));
					Util.broadcast(msg.EFFECTS_BOUGHT.replace("{PLAYER}", p.getName()).replace("{EFFECT}", "SPEED II"), true);
					p.closeInventory();
				} else {
					e.setCancelled(true);
					Util.sendMessage(p, msg.EFFECTS_NOITEM.replace("{ITEM}", "6x EMERALD_BLOCK"));
					p.closeInventory();
				}
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.setHEX("&4YamasCore &8| &4Efekty"))){
				e.setCancelled(true);
				Util.sendMessage(p, "&4YamasCore &8| &4Efekty " + Main.getVersion() + " &7by &4Yamasky");
				p.updateInventory();
				p.closeInventory();
			}
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(" ")){
				e.setCancelled(true);
				Util.sendMessage(p, "&4YamasCore &8| &4Efekty " + Main.getVersion() + " &7by &4Yamasky");
				p.updateInventory();
				p.closeInventory();
			}
		}
	}
}

package me.yamas.core.commands;

import java.util.Arrays;

import me.yamas.core.Lang;
import me.yamas.core.commands.util.Executor;
import me.yamas.core.utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ExcItemy implements Executor{
	
	public static ItemStack gracz_sign = new ItemStack(Material.SIGN, 1);{
		ItemMeta im = gracz_sign.getItemMeta();
		im.setDisplayName("§eHeros");
		gracz_sign.setItemMeta(im);
	}
	public static ItemStack gracz_glasspane = new ItemStack(Material.getMaterial(160), 1, (byte) 4);{
		ItemMeta im = gracz_glasspane.getItemMeta();
		im.setDisplayName(" ");
		gracz_glasspane.setItemMeta(im);
	}
	
	public static ItemStack gracz_1 = new ItemStack(Material.DIAMOND, 64);{
		ItemMeta im = gracz_1.getItemMeta();
		im.setDisplayName("§bDiamenty");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §464x"));
		gracz_1.setItemMeta(im);
	}
	public static ItemStack gracz_2 = new ItemStack(Material.GOLD_INGOT, 64);{
		ItemMeta im = gracz_2.getItemMeta();
		im.setDisplayName("§6Zloto");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §464x"));
		gracz_2.setItemMeta(im);
	}
	public static ItemStack gracz_3 = new ItemStack(Material.EMERALD, 64);{
		ItemMeta im = gracz_3.getItemMeta();
		im.setDisplayName("§2Szmaragdy");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §464x"));
		gracz_3.setItemMeta(im);
	}
	public static ItemStack gracz_4 = new ItemStack(Material.ENDER_PEARL, 16);{
		ItemMeta im = gracz_4.getItemMeta();
		im.setDisplayName("§5Perelki");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §416x"));
		gracz_4.setItemMeta(im);
	}
	public static ItemStack gracz_5 = new ItemStack(Material.BOOKSHELF, 64);{
		ItemMeta im = gracz_5.getItemMeta();
		im.setDisplayName("§eBiblioteczki");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §464x"));
		gracz_5.setItemMeta(im);
	}
	public static ItemStack gracz_6 = new ItemStack(Material.ENCHANTMENT_TABLE, 48);{
		ItemMeta im = gracz_6.getItemMeta();
		im.setDisplayName("§3Stoly do enchantowania");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §448x"));
		gracz_6.setItemMeta(im);
	}
	public static ItemStack gracz_7 = new ItemStack(Material.ANVIL, 16);{
		ItemMeta im = gracz_7.getItemMeta();
		im.setDisplayName("§fKowadla");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §416x"));
		gracz_7.setItemMeta(im);
	}
	public static ItemStack gracz_8 = new ItemStack(Material.TNT, 64);{
		ItemMeta im = gracz_8.getItemMeta();
		im.setDisplayName("§4TNT");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §464x"));
		gracz_8.setItemMeta(im);
	}
	/*
	 * itemy na gildie dla rangi vip
	 */
	
	public static ItemStack vip_sign = new ItemStack(Material.SIGN, 1);{
		ItemMeta im = vip_sign.getItemMeta();
		im.setDisplayName("§5Legenda");
		vip_sign.setItemMeta(im);
	}
	public static ItemStack vip_glasspane = new ItemStack(Material.getMaterial(160), 1, (byte) 1);{
		ItemMeta im = vip_glasspane.getItemMeta();
		im.setDisplayName(" ");
		vip_glasspane.setItemMeta(im);
	}
	
	public static ItemStack vip_1 = new ItemStack(Material.DIAMOND, 16);{
		ItemMeta im = vip_1.getItemMeta();
		im.setDisplayName("§bDiamenty");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §416x"));
		vip_1.setItemMeta(im);
	}
	public static ItemStack vip_2 = new ItemStack(Material.GOLD_INGOT, 16);{
		ItemMeta im = vip_2.getItemMeta();
		im.setDisplayName("§6Zloto");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §416x"));
		vip_2.setItemMeta(im);
	}
	public static ItemStack vip_3 = new ItemStack(Material.EMERALD, 16);{
		ItemMeta im = vip_3.getItemMeta();
		im.setDisplayName("§2Szmaragdy");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §416x"));
		vip_3.setItemMeta(im);
	}
	public static ItemStack vip_4 = new ItemStack(Material.ENDER_PEARL, 4);{
		ItemMeta im = vip_4.getItemMeta();
		im.setDisplayName("§5Perelki");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §44x"));
		vip_4.setItemMeta(im);
	}
	public static ItemStack vip_5 = new ItemStack(Material.BOOKSHELF, 16);{
		ItemMeta im = vip_5.getItemMeta();
		im.setDisplayName("§eBiblioteczki");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §416x"));
		vip_5.setItemMeta(im);
	}
	public static ItemStack vip_6 = new ItemStack(Material.ENCHANTMENT_TABLE, 12);{
		ItemMeta im = vip_6.getItemMeta();
		im.setDisplayName("§3Stoly do enchantowania");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §412x"));
		vip_6.setItemMeta(im);
	}
	public static ItemStack vip_7 = new ItemStack(Material.ANVIL, 4);{
		ItemMeta im = vip_7.getItemMeta();
		im.setDisplayName("§fKowadla");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §44x"));
		vip_7.setItemMeta(im);
	}
	public static ItemStack vip_8 = new ItemStack(Material.TNT, 16);{
		ItemMeta im = vip_8.getItemMeta();
		im.setDisplayName("§4TNT");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §416x"));
		vip_8.setItemMeta(im);
	}

	/*
	 * itemy na dolaczenie gildii
	 */
	
	public static ItemStack guild_join_sign = new ItemStack(Material.SIGN, 1);{
		ItemMeta im = guild_join_sign.getItemMeta();
		im.setDisplayName("§6Dolaczenie");
		guild_join_sign.setItemMeta(im);
	}
	
	public static ItemStack guild_join = new ItemStack(Material.DIAMOND, 48);{
		ItemMeta im = guild_join.getItemMeta();
		im.setDisplayName("§bDiamenty");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §448x"));
		guild_join.setItemMeta(im);
	}
	
	/*
	 * itemy na teleportacje do bazy gildii
	 */
	
	public static ItemStack guild_base_sign = new ItemStack(Material.SIGN, 1);{
		ItemMeta im = guild_base_sign.getItemMeta();
		im.setDisplayName("§6Teleportacja do bazy");
		guild_base_sign.setItemMeta(im);
	}
	
	public static ItemStack guild_base_tp = new ItemStack(Material.EMERALD, 8);{
		ItemMeta im = guild_base_tp.getItemMeta();
		im.setDisplayName("§2Szmaragdy");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §48x"));
		guild_base_tp.setItemMeta(im);
	}
	
	/*
	 * itemy na oplacenie waznosci gildii
	 */
	
	public static ItemStack guild_validity_sign = new ItemStack(Material.SIGN, 1);{
		ItemMeta im = guild_validity_sign.getItemMeta();
		im.setDisplayName("§6Oplacenie waznosci gildii");
		guild_validity_sign.setItemMeta(im);
	}
	
	public static ItemStack guild_validity = new ItemStack(Material.DIAMOND, 48);{
		ItemMeta im = guild_validity.getItemMeta();
		im.setDisplayName("§bDiamenty");
		im.setLore(Arrays.asList(" ",
				"§7Ilosc: §448x"));
		guild_validity.setItemMeta(im);
	}
	
	/*
	 * INNE
	 */
	public static ItemStack next_page = new ItemStack(Material.GOLD_NUGGET, 1);{
		ItemMeta im = next_page.getItemMeta();
		im.setDisplayName("§8(§7Nastepna strona§8)");
		next_page.setItemMeta(im);
	}
	
	public static ItemStack back_page = new ItemStack(Material.GOLD_NUGGET, 1);{
		ItemMeta im = back_page.getItemMeta();
		im.setDisplayName("§8(§7Poprzednia strona§8)");
		back_page.setItemMeta(im);
	}
	
	public static Inventory items = Bukkit.createInventory(null, 45, Util.setHEX("&7Przedmioty potrzebne do zalozenia gildii"));{
		items.setItem(0, gracz_glasspane);
		items.setItem(1, gracz_glasspane);
		items.setItem(2, gracz_glasspane);
		items.setItem(3, gracz_glasspane);
		items.setItem(4, gracz_sign);
		items.setItem(5, gracz_glasspane);
		items.setItem(6, gracz_glasspane);
		items.setItem(7, gracz_glasspane);
		items.setItem(8, gracz_glasspane);
		
		items.setItem(9, gracz_1);
		items.setItem(10, gracz_2);
		items.setItem(11, gracz_3);
		items.setItem(12, gracz_4);
		items.setItem(13, gracz_5);
		items.setItem(14, gracz_6);
		items.setItem(15, gracz_7);
		items.setItem(16, gracz_8);
		
		items.setItem(18, vip_glasspane);
		items.setItem(19, vip_glasspane);
		items.setItem(20, vip_glasspane);
		items.setItem(21, vip_glasspane);
		items.setItem(22, vip_sign);
		items.setItem(23, vip_glasspane);
		items.setItem(24, vip_glasspane);
		items.setItem(25, vip_glasspane);
		items.setItem(26, vip_glasspane);
		
		items.setItem(27, vip_1);
		items.setItem(28, vip_2);
		items.setItem(29, vip_3);
		items.setItem(30, vip_4);
		items.setItem(31, vip_5);
		items.setItem(32, vip_6);
		items.setItem(33, vip_7);
		items.setItem(34, vip_8);
		
		items.setItem(44, next_page);
		
	}
	
	public static Inventory join = Bukkit.createInventory(null, 45, Util.setHEX("&7Przedmioty potrzebne do dolaczenia do gildii"));{
		join.setItem(0, gracz_glasspane);
		join.setItem(1, gracz_glasspane);
		join.setItem(2, gracz_glasspane);
		join.setItem(3, gracz_glasspane);
		join.setItem(4, guild_join_sign);
		join.setItem(5, gracz_glasspane);
		join.setItem(6, gracz_glasspane);
		join.setItem(7, gracz_glasspane);
		join.setItem(8, gracz_glasspane);
		
		join.setItem(9, guild_join);
		
		join.setItem(36, back_page);
		join.setItem(44, next_page);
	}
	
	public static Inventory base = Bukkit.createInventory(null, 45, Util.setHEX("&7Przedmioty potrzebne do teleportacji gildii"));{
		base.setItem(0, gracz_glasspane);
		base.setItem(1, gracz_glasspane);
		base.setItem(2, gracz_glasspane);
		base.setItem(3, gracz_glasspane);
		base.setItem(4, guild_base_sign);
		base.setItem(5, gracz_glasspane);
		base.setItem(6, gracz_glasspane);
		base.setItem(7, gracz_glasspane);
		base.setItem(8, gracz_glasspane);
		
		base.setItem(9, guild_base_tp);
		
		base.setItem(36, back_page);
		base.setItem(44, next_page);
	}
	
	public static Inventory validity = Bukkit.createInventory(null, 45, Util.setHEX("&7Przedmioty potrzebne do oplacenia waznosci gildii"));{
		validity.setItem(0, gracz_glasspane);
		validity.setItem(1, gracz_glasspane);
		validity.setItem(2, gracz_glasspane);
		validity.setItem(3, gracz_glasspane);
		validity.setItem(4, guild_validity_sign);
		validity.setItem(5, gracz_glasspane);
		validity.setItem(6, gracz_glasspane);
		validity.setItem(7, gracz_glasspane);
		validity.setItem(8, gracz_glasspane);
		
		validity.setItem(9, guild_validity);
		
		validity.setItem(36, back_page);
	}
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		Lang msg = Lang.getInstance();
		if(!(sender instanceof Player)){
			Util.sendMessage(Bukkit.getConsoleSender(), msg.NOPLAYER);
			return;
		}
		Player p = (Player) sender;
		p.openInventory(items);
		
	}

}

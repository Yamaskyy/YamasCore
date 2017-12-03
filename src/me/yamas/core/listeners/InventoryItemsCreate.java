package me.yamas.core.listeners;

import me.yamas.core.Lang;
import me.yamas.core.commands.ExcItemy;
import me.yamas.core.utils.Util;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class InventoryItemsCreate implements Listener{	
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onInvClick(InventoryClickEvent e){
		Inventory inv = e.getInventory();
		Lang msg = Lang.getInstance();
		if(inv == null){
			return;
		}
		if(inv !=null){
			if(!inv.getName().equals(Util.setHEX("&7Przedmioty potrzebne do zalozenia gildii"))) return;
			if(e.getCurrentItem() == null) return;
			else if(e.getCurrentItem().getItemMeta() == null) return;
		}
		if(e.getWhoClicked() instanceof Player){
			Player p = (Player) e.getWhoClicked();
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(" ")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§eHeros")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Legenda")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bDiamenty")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Zloto")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§2Szmaragdy")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Perelki")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBiblioteczki")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§3Stoly do enchantowania")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§fKowadla")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§4TNT")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§8(§7Nastepna strona§8)")){
				e.setCancelled(true);
				p.closeInventory();
				p.openInventory(ExcItemy.join);
			}
		}
	}
}

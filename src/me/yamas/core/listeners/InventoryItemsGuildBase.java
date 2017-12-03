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

public class InventoryItemsGuildBase implements Listener{	
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onInvClick(InventoryClickEvent e){
		Inventory inv = e.getInventory();
		Lang msg = Lang.getInstance();
		if(inv == null){
			return;
		}
		if(inv !=null){
			if(!inv.getName().equals(Util.setHEX("&7Przedmioty potrzebne do teleportacji gildii"))) return;
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
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Dolaczenie")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bDiamenty")){
				e.setCancelled(true);
				p.closeInventory();
				Util.sendMessage(p, msg.INVENTORY_ERROR);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§8(§7Nastepna strona§8)")){
				e.setCancelled(true);
				p.closeInventory();
				p.openInventory(ExcItemy.validity);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§8(§7Poprzednia strona§8)")){
				e.setCancelled(true);
				p.closeInventory();
				p.openInventory(ExcItemy.join);
			}
		}
	}
}

package me.yamas.core.commands;

import me.yamas.core.Lang;
import me.yamas.core.commands.util.Executor;
import me.yamas.core.listeners.InventoryEffects;
import me.yamas.core.utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExcEfekty implements Executor{
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		Lang msg = Lang.getInstance();
		if(!(sender instanceof Player)){
			Util.sendMessage(Bukkit.getConsoleSender(), msg.NOPLAYER);
			return;
		}
		if(!sender.hasPermission("yamascore.cmd.efekty")){
			Util.sendMessage(sender, msg.NOPERMISSION.replace("{PERMISSION}", "yamascore.cmd.efekty"));
			return;
		}
		
		Player p = (Player) sender;
		p.openInventory(InventoryEffects.i);
		
	}

}

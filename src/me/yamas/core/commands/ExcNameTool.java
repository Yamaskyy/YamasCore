package me.yamas.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;

import me.yamas.core.Lang;
import me.yamas.core.commands.util.Executor;
import me.yamas.core.utils.Util;

public class ExcNameTool implements Executor{
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		Lang msg = Lang.getInstance();
		if(!(sender instanceof Player)){
			Util.sendMessage(Bukkit.getConsoleSender(), msg.NOPLAYER);
			return;
		}
		if(!sender.hasPermission("yamascore.cmd.nametool")){
			Util.sendMessage(sender, msg.NOPERMISSION.replace("{NOPERMISSION}", "yamascore.cmd.namtool"));
			return;
		}
		Player p = (Player) sender;
		if(p.getItemInHand() !=null){
			StringBuilder sb = new StringBuilder();
			for(String s : args){
				if(sb.length() > 0){
					sb.append(" ");
				}
				sb.append(s);
			}
			ItemMeta im = p.getItemInHand().getItemMeta();
			im.setDisplayName(Util.setHEX(sb.toString()));
			p.getItemInHand().setItemMeta(im);
			Util.sendMessage(p, msg.NAMETOOL_DONE.replace("{NEWNAME}", sb.toString()));
		} else {
			Util.sendMessage(p, msg.NAMETOOL_NOTITEM);
			return;
		}
		
	}

}

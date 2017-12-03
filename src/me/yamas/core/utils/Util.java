package me.yamas.core.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Util {
	
	public static String setHEX(String arg0){
		return ChatColor.translateAlternateColorCodes('&', arg0);
	}
	
	public static String replace(String arg0){
		return arg0.replace('&', '§');
	}
	
	public static boolean sendMessage(CommandSender sender, String string){
		if((string != null) || (string != " ")){
			sender.sendMessage(setHEX(string));
		}
		return false;
	}
	
	public static boolean broadcast(String string, boolean sendToConsole){
		if((string != null) || (string != " ")){
			if(!sendToConsole){
				for(Player p : Bukkit.getOnlinePlayers()){
					Util.sendMessage(p, string);
				}
			} else {
				Bukkit.getServer().broadcastMessage(setHEX(string));
			}
		}
		return false;
	}

}

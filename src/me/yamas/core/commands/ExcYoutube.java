package me.yamas.core.commands;

import me.yamas.core.Main;
import me.yamas.core.commands.util.Executor;
import me.yamas.core.utils.Util;

import org.bukkit.command.CommandSender;

public class ExcYoutube implements Executor{
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		for(String string : Main.getInstance().getConfig().getStringList("youtube-msg")){
			Util.sendMessage(sender, string);
		}
		
	}

}

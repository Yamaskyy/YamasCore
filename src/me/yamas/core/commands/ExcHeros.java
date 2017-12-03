package me.yamas.core.commands;

import org.bukkit.command.CommandSender;

import me.yamas.core.Main;
import me.yamas.core.commands.util.Executor;
import me.yamas.core.utils.Util;

public class ExcHeros implements Executor{
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		for(String string : Main.getInstance().getConfig().getStringList("heros-msg")){
			Util.sendMessage(sender, string);
		}
	}

}

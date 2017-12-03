package me.yamas.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.yamas.core.Lang;
import me.yamas.core.commands.util.Executor;
import me.yamas.core.utils.Util;

public class ExcExp implements Executor{
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		Lang msg = Lang.getInstance();
		if(!(sender instanceof Player)){
			Util.sendMessage(Bukkit.getConsoleSender(), msg.NOPLAYER);
			return;
		}
		Player p = (Player) sender;
		if(!p.hasPermission("yamascore.exp")){
			Util.sendMessage(p, msg.NOPERMISSION.replace("{PERMISSION}", "yamascore.exp"));
			return;
		}
		if(args.length == 0){
			Util.sendMessage(p, msg.EXP_HELP);
			return;
		} else {
			if(args.length >= 3){
				Player target = Bukkit.getPlayer(args[1]);
				if(target == null){
					Util.sendMessage(p, msg.PLAYEROFFLINE);
					return;
				}
				if(args[0].equalsIgnoreCase("give")){
					int exp = 0;
					try{
						exp = Integer.valueOf(args[2]);
					} catch(NumberFormatException e){
						Util.sendMessage(p, msg.EXP_INVALID_NUMBER.replace("{NUMBER}", Integer.toString(exp)));
						return;
					}
					p.setLevel(p.getLevel() + exp);
					Util.sendMessage(p, msg.EXP_GIVED
							.replace("{PLAYER}", target.getName())
							.replace("{EXP}", Integer.toString(exp)));
				}
				else if(args[0].equalsIgnoreCase("set")){
					int exp = 0;
					try{
						exp = Integer.valueOf(args[2]);
					} catch(NumberFormatException e){
						Util.sendMessage(p, msg.EXP_INVALID_NUMBER.replace("{NUMBER}", Integer.toString(exp)));
						return;
					}
					p.setLevel(exp);
					Util.sendMessage(p, msg.EXP_GIVED
							.replace("{PLAYER}", target.getName())
							.replace("{EXP}", Integer.toString(exp)));
				}
				else if(args[0].equalsIgnoreCase("remove")){
					int exp = 0;
					try{
						exp = Integer.valueOf(args[2]);
					} catch(NumberFormatException e){
						Util.sendMessage(p, msg.EXP_INVALID_NUMBER.replace("{NUMBER}", Integer.toString(exp)));
						return;
					}
					p.setLevel(p.getLevel() - exp);
					Util.sendMessage(p, msg.EXP_REMOVED
							.replace("{PLAYER}", target.getName())
							.replace("{EXP}", Integer.toString(exp)));
				}
			}
		}
	}

}

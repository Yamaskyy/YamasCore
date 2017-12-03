package me.yamas.core.commands;

import me.yamas.core.Lang;
import me.yamas.core.commands.util.Executor;
import me.yamas.core.utils.Util;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle.EnumTitleAction;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ExcAlertTitle implements Executor{
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		Lang msg = Lang.getInstance();
		if(!(sender instanceof Player)){
			Util.sendMessage(Bukkit.getConsoleSender(), msg.NOPLAYER);
			return;
		}
		Player p = (Player) sender;
		if(!p.hasPermission("yamascore.cmd.alerttitle")){
			Util.sendMessage(p, msg.NOPERMISSION.replace("{PERMISSION}", "yamascore.cmd.alerttile"));
			return;
		}
		if(args.length == 0){
			Util.sendMessage(p, msg.ALERTTITLE_HELP);
			return;
		} else {
			StringBuilder mb = new StringBuilder();
			for(String s : args){
				if(mb.length() > 0){
					mb.append(" ");
				}
				mb.append(s);
			}
			for(Player all : Bukkit.getOnlinePlayers()){
				IChatBaseComponent title = ChatSerializer.a("{\"text\":\"" + Util.setHEX(msg.ALERTTITLE_TITLE) + "\"}");
				IChatBaseComponent subtitle = ChatSerializer.a("{\"text\":\"" + Util.setHEX(msg.ALERTTITLE_SUBTITLE.replace("{MESSAGE}", mb.toString())) + "\"}");
				PacketPlayOutTitle packetTitle = new PacketPlayOutTitle(EnumTitleAction.TITLE, title, 6, 8, 6);
				PacketPlayOutTitle packetsubTitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, subtitle, 6, 8, 6);
				((CraftPlayer)all).getHandle().playerConnection.sendPacket(packetTitle);
				((CraftPlayer)all).getHandle().playerConnection.sendPacket(packetsubTitle);
			}
		}
		
	}

}

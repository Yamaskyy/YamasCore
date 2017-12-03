package me.yamas.core.runnables;

import java.util.List;

import me.yamas.core.Lang;
import me.yamas.core.Main;
import me.yamas.core.Settings;
import me.yamas.core.utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public class ClearItems implements Runnable{
	
	@Override
	public void run() {
		for(final Player all : Bukkit.getOnlinePlayers()){
			Util.sendMessage(all, Lang.getInstance().CLEAR_ITEMS_1.replace("{TIME}", Integer.toString(Settings.getInstance().CLEAR_DELAY)));
			Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable(){
				public void run() {
					World world = Bukkit.getServer().getWorld("world");
					List<Entity> entList = world.getEntities();
					for(Entity current : entList){
						if (current instanceof Item){
							current.remove();
						}
					}
					Util.sendMessage(all, Lang.getInstance().CLEAR_ITEMS_2);
				}
				
			}, Settings.getInstance().CLEAR_DELAY * 20);
		}
	}

}

package me.yamas.core.runnables;

import me.yamas.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class AlwaysDay implements Runnable{
	
	@Override
	public void run() {
		Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable(){
			public void run() {
	        	World world = Bukkit.getServer().getWorld("world");
				if(world.getTime() < 3000 || world.getTime() > 3000){
					world.setTime(3000);
				}
			}
		
		}, 10 * 20);
		
	}
}

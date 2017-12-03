package me.yamas.core.listeners;

import me.yamas.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class OnBreak implements Listener{
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		Player p = e.getPlayer();
		final Block b = e.getBlock();
		Location loc = b.getLocation();
		
		/*
		 * Stoniarka section
		 */
		
		final Location loc1 = new Location(loc.getWorld(), loc.getX(), loc.getY() - 1, loc.getZ());
		if(b.getType() == Material.STONE){
			if(loc1.getBlock().getType() == Material.ENDER_STONE){
				Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable(){
					public void run() {
						if(loc1.getBlock().getType() == Material.ENDER_STONE){
							b.setType(Material.STONE);
						}
					}
				}, 30L);
			}
		}
		
		/*
		 * Drzewkarki section
		 */
		final Location dloc = new Location(loc.getWorld(), loc.getX(), loc.getY() - 1, loc.getZ());
		if(b.getType() == Material.LOG){
			if(dloc.getBlock().getType() == Material.BEDROCK){
				Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable(){
					public void run() {
						if(dloc.getBlock().getType() == Material.BEDROCK){
							b.setType(Material.LOG);
						}
					}
				}, 30L);
			}
		}
		
		/*
		 * Enderchest break section
		 */

		if(b.getType() == Material.ENDER_CHEST){
			if(e.isCancelled()) return;
			if(p.getGameMode() != GameMode.CREATIVE){
				e.setCancelled(true);
				b.setType(Material.AIR);
				b.getWorld().dropItemNaturally(p.getLocation(), new ItemStack(Material.ENDER_CHEST, 1));
			}
		}
	}
}

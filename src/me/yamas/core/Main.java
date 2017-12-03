package me.yamas.core;

import me.yamas.core.commands.Commands;
import me.yamas.core.data.FileManager;
import me.yamas.core.listeners.InventoryEffects;
import me.yamas.core.listeners.InventoryItemsCreate;
import me.yamas.core.listeners.InventoryItemsGuildBase;
import me.yamas.core.listeners.InventoryItemsGuildJoin;
import me.yamas.core.listeners.InventoryItemsGuildValidity;
import me.yamas.core.listeners.OnBreak;
import me.yamas.core.listeners.OnPlace;
import me.yamas.core.listeners.PlayerChat;
import me.yamas.core.listeners.PlayerLogin;
import me.yamas.core.listeners.PlayerQuit;
import me.yamas.core.objects.Stoniarka;
import me.yamas.core.runnables.AlwaysDay;
import me.yamas.core.runnables.ClearItems;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	private static Main instance;
	
	@Override
	public void onLoad(){
		new Commands().register();
	}
	
	@SuppressWarnings("deprecation")
	public void onEnable(){
		instance = this;
		FileManager.check();
		PluginManager pm = Bukkit.getPluginManager();
		Stoniarka.createRecipe();
		pm.registerEvents(new PlayerChat(), this);
		pm.registerEvents(new OnBreak(), this);
		pm.registerEvents(new OnPlace(), this);
		pm.registerEvents(new InventoryEffects(), this);
		pm.registerEvents(new PlayerQuit(), this);
		pm.registerEvents(new PlayerLogin(), this);
		pm.registerEvents(new InventoryItemsCreate(), this);
		pm.registerEvents(new InventoryItemsGuildBase(), this);
		pm.registerEvents(new InventoryItemsGuildJoin(), this);
		pm.registerEvents(new InventoryItemsGuildValidity(), this);
		Bukkit.getServer().getScheduler().scheduleAsyncRepeatingTask(this, new ClearItems(), 0L, Settings.getInstance().CLEAR_INTERVAL * 20);
		Bukkit.getServer().getScheduler().scheduleAsyncRepeatingTask(this, new AlwaysDay(), 0L, 10 * 20);
	}

	public void onDisable(){
		instance = null;
	}
	
	public static String getVersion(){
		return instance.getDescription().getVersion();
	}
	
	public static Main getInstance(){
		if(instance == null) return new Main();
		return instance;
	}
	
}

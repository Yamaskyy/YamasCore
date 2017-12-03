package me.yamas.core.data;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

import me.yamas.core.Main;

public class FileManager {
	
	private static File mainDir = Main.getInstance().getDataFolder();
	private static File cfgFile = new File(mainDir, "config.yml");
	private static File msgFile = new File(mainDir, "messages.yml");
	private static YamlConfiguration msgConfiguration;
	
	public static void check(){
		if(!mainDir.exists()) mainDir.mkdir();
		if(!cfgFile.exists()) Main.getInstance().saveDefaultConfig();
	//	if(!msgFile.exists()) Main.getInstance().saveResource("messages.yml", true);
	//	msgConfiguration = YamlConfiguration.loadConfiguration(msgFile);
	}
	
//	public static YamlConfiguration getMessages(){
//		return msgConfiguration;
//	}
	

}

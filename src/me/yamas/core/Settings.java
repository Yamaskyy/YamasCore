package me.yamas.core;

public class Settings {
	
	private static Settings instance;
	
	public int CLEAR_DELAY = 10; // w sekundach
	public int CLEAR_INTERVAL = 300; // w sekundach
	public int CHAT_SLOW_SEC = 5; // w sekundach
	public int KIT_SLOW_SEC = 86400; // w sekundach (24h)
	
	public static Settings getInstance(){
		if(instance == null) return new Settings();
		return instance;
	}

}

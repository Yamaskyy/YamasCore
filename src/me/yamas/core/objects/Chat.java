package me.yamas.core.objects;

public class Chat {

	private static boolean chat = true;
	
	public static boolean getChat(){
		return chat;
	}
	
	public static boolean setChat(boolean mode){
		chat = mode;
		return mode;
	}
}

package me.yamas.core.commands;

import java.util.Arrays;

import me.yamas.core.Main;
import me.yamas.core.commands.util.ExecutorCaller;

public class Commands {
	
	/*
	 * The all classes from package me.yamas.core.commands.util.* was created by Dzikoysk from FunnyGuilds
	 * The class me.yamas.core.commands.Commands.java was created by Dzikoysk from FunnyGuilds
	 */
	
	
	private static Commands instance;
	
	public Commands(){
		instance = this;
	}
	
	public void register(){
		new ExecutorCaller(new ExcAlertTitle(), "alerttitle", "yamascore.cmd.alerttitle", Arrays.asList("at"));
		new ExecutorCaller(new ExcEfekty(), "efekty", "yamascore.cmd.efekty", Arrays.asList("efekt"));
		new ExecutorCaller(new ExcNameTool(), "nametool", "yamascore.cmd.nametool", Arrays.asList("nt", "name"));
		new ExecutorCaller(new ExcExp(), "exp", "yamascore.cmd.exp", null);
		new ExecutorCaller(new ExcHeros(), Main.getInstance().getConfig().getString("commands-name.heros"), null, null);
		new ExecutorCaller(new ExcItemy(), Main.getInstance().getConfig().getString("commands-name.itemy"), null, null);
		new ExecutorCaller(new ExcPomoc(), Main.getInstance().getConfig().getString("commands-name.pomoc"), null, null);
		new ExecutorCaller(new ExcLegenda(), Main.getInstance().getConfig().getString("commands-name.legenda"), null, null);
		new ExecutorCaller(new ExcYoutube(), Main.getInstance().getConfig().getString("commands-name.youtuber"), null, Arrays.asList("yt"));
		new ExecutorCaller(new ExcSwag(), Main.getInstance().getConfig().getString("commands-name.swag"), null, null);
	}
	
	public static Commands getInstance(){
		if(instance == null) return new Commands();
		return instance;
	}

}

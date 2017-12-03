package me.yamas.core;

public class Lang {
	
	private static Lang instance;
	
	public String NOPERMISSION = "&cNie masz uprawnien do uzycia tej komendy &8(&7{PERMISSION}&8)";
	public String NOPLAYER = "&4Blad: &cMusisz byc na serwerze aby wykonac te komende";
	public String PLAYEROFFLINE = "&4Blad: &cPodany gracz jest offline";

	public String TIMEPARSE_DAY = " day ";
	public String TIMEPARSE_DAYS = " days ";
	public String TIMEPARSE_HOUR = " hour ";
	public String TIMEPARSE_HOURS = " hours ";
	public String TIMEPARSE_HOURS_2 = " hours ";
	public String TIMEPARSE_MINUTE = " minute ";
	public String TIMEPARSE_MINUTES = " minutes ";
	public String TIMEPARSE_MINUTES_2 = " minutes ";
	public String TIMEPARSE_SECOND = " second ";
	public String TIMEPARSE_SECONDS = " seconds ";
	public String TIMEPARSE_SECONDS_2 = " seconds ";
	
	public String INVENTORY_ERROR = "&4Blad: &cNie mozesz wyciagac nic z menu!";
	
	public String EXP_HELP = "&cPoprawne uzycie: &3/exp &8[&3give&8|&3set&8|&3remove&8] [&3player&8] [&3ilosc expa&8]";
	public String EXP_GIVED = "&7Pomyslnie dales graczowi &4{PLAYER}&7 poziom doswiadczenia &4{EXP}&7!";
	public String EXP_REMOVED = "&7Pomyslnie zabrales graczowi &4{PLAYER}&7 poziom doswiadczenia &4{EXP}&7!";
	public String EXP_INVALID_NUMBER = "&4Blad: &cPodales nieprawidlowa liczbe! &8(&7{NUMBER}&8)";
	
	public String CHAT_HELP = "&7Poprawne uzycie: &3/chat &8[&3on&8/&3off&8/&3cc&8]";
	public String CHAT_ON = "&4Blad: &cChat jest juz wlaczony!";
	public String CHAT_OFF = "&4Blad: &cChat jest juz wylaczony!";
	public String CHAT_TRY = "&4Blad: &cChat jest aktualnie wylaczony!";
	public String CHAT_FLOOD = "&4Blad: &cTwoja wiadomosc zostala zablokowana!";
	public String CHAT_SLOW = "&4Blad: &cKolejna wiadomosc mozesz napisac za &7{TIME} sekund";
	public String CHAT_BROADCAST_ON = "&8[&2RC&fDROP&8] &7Chat zostal wlaczony przez &4{ADMIN}&7!";
	public String CHAT_BROADCAST_OFF = "&8[&2RC&fDROP&8] &7Chat zostal wylaczony przez &4{ADMIN}&7!";
	public String CHAT_BROADCAST_CC = "&8[&2RC&fDROP&8] &7Chat zostal wyczyszczony przez &4{ADMIN}&7!";
	
	public String NAMETOOL_NOTITEM = "&4Blad: &cNie mozesz nazwac reki!";
	public String NAMETOOL_DONE = "&7Pomyslnie zmieniles nazwe przedmiotu na: &4{NEWNAME}";

	public String HELPOP_HELP = "&7Poprawne uzycie: &3/helpop &8[&3wiadomosc&8]";
	public String HELPOP_DELAY= "&4Blad: &cNastepna wiadomosc mozesz napisac za &c{DELAY} sekund!";
	public String HELPOP_MESSAGE_TO_PLAYER = "&7Twoja wiadomosc zostala wyslana!";
	public String HELPOP_MESSAGE_TO_ADMINS = "&b[HelpOp] &7{PLAYER}: &f{MESSAGE}";
	
	public String ALERTTITLE_HELP = "&7Poprawne uzycie: &3/alerttitle &8[&3wiadomosc&8]";
	public String ALERTTITLE_TITLE = "&4Alert";
	public String ALERTTITLE_SUBTITLE = "&7{MESSAGE}";
	
	public String EFFECTS_NOITEM = "&4Blad: &cNie posiadasz {ITEM}";
	public String EFFECTS_BOUGHT = "&8[&2RC&fDROP&8] &4{PLAYER} &7zakupil efekt &4{EFFECT}";

	public String CLEAR_ITEMS_1 = "&7Czyszczenie przedmiotow z ziemi odbedzie sie za &3{TIME} sekund&7!";
	public String CLEAR_ITEMS_2 = "&7Przedmioty z ziemi zostaly usuniete!";

	public String FIRST_JOIN = "&cWitamy po raz pierwszy na serwerze, do twojego ekwipunku zostaly dodane przedmioty startowe! Pamietaj aby nie cheatowac!";

	public String GIVEALL_HELP = "&7Poprawne uzycie: &3/giveall &8[&3id&8] [&3ilosc&8]";
	public String GIVEALL_BROADCAST = "&8[&2RC&fDROP&8] &7Administrator {ADMIN} rozdal calemu serwerowi {AMOUNT}x{ITEM}";

	
	public static Lang getInstance(){
		if(instance == null) return new Lang();
		return instance;
	}
}
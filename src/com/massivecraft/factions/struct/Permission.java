package com.massivecraft.factions.struct;

import org.bukkit.command.CommandSender;

import com.massivecraft.factions.P;

public enum Permission
{
	LEADER("leader"),
	AUTOCLAIM("autoclaim"),
	BYPASS("bypass"),
	CHAT("chat"),
	CLAIM("claim"),
	CONFIG("config"),
	CREATE("create"),
	DEINVITE("deinvite"),
	DESCRIPTION("description"),
	DISBAND("disband"),
	DISBAND_ANY("disband.any"), // WHAT TO DO?
	FLAG("flag"),
	FLAG_ANY("flag.any"),
	PERM("perm"),
	PERM_ANY("perm.any"),
	HELP("help"),
	HOME("home"),
	INVITE("invite"),
	JOIN("join"),
	KICK("kick"),
	KICK_ANY("kick.any"),
	LEAVE("leave"),
	LIST("list"),
	LOCK("lock"),
	MAP("map"),
	OFFICER("officer"),
	MONEY_BALANCE("money.balance"),
	MONEY_BALANCE_ANY("money.balance.any"),
	MONEY_DEPOSIT("money.deposit"),
	MONEY_WITHDRAW("money.withdraw"),
	MONEY_WITHDRAW_ANY("money.withdraw.any"), // WHAT TO DO?
	MONEY_F2F("money.f2f"),
	MONEY_F2P("money.f2p"),
	MONEY_P2F("money.p2f"),
	OPEN("open"),
	SET_PEACEFUL("setpeaceful"),
	POWER("power"),
	POWER_ANY("power.any"),
	RELATION("relation"),
	RELOAD("reload"),
	SAVE("save"),
	SETHOME("sethome"),
	SETHOME_ANY("sethome.any"), // WHAT TO DO?
	SHOW("show"),
	TAG("tag"),
	TITLE("title"),
	UNCLAIM("unclaim"),
	UNCLAIM_ALL("unclaimall"),
	VERSION("version"),
	;
	
	public final String node;
	
	Permission(final String node)
	{
		this.node = "factions."+node;
    }
	
	public boolean has(CommandSender sender, boolean informSenderIfNot)
	{
		return P.p.perm.has(sender, this.node, informSenderIfNot);
	}
	
	public boolean has(CommandSender sender)
	{
		return has(sender, false);
	}
}
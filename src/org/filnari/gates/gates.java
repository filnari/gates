package org.filnari.gates;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class gates extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getLogger().info("Plugin started!");
		getServer().getPluginManager().registerEvents(this,this);
		// This is run when the server starts
	}
	@Override
	public void onDisable() {
		getLogger().info("Plugin stopped!");
		// This is run when the server stops	
	}
}

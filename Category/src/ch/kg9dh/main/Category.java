package ch.kg9dh.main;

import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import ch.kg9dh.main.categories.Builder;
import ch.kg9dh.main.categories.Defender;
import ch.kg9dh.main.categories.Farmer;
import ch.kg9dh.main.categories.Hunter;
import ch.kg9dh.main.categories.Miner;

public class Category extends JavaPlugin{

	Logger log = Bukkit.getLogger();
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Builder(this), this);
		getServer().getPluginManager().registerEvents(new Defender(this), this);
		getServer().getPluginManager().registerEvents(new Farmer(this), this);
		getServer().getPluginManager().registerEvents(new Hunter(this), this);
		getServer().getPluginManager().registerEvents(new Miner(this), this);
 		log.info("Plugin Enabled!");
 	}
	
 	@Override
    public void onDisable() {
 		
 		log.info("Plugin Disabled!");
 	}
	
 	
 	
 	
}

package ch.kg9dh.main.categories;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import ch.kg9dh.main.Category;

public class Defender implements Listener {
	
	Category plugin;
	
	public Defender(Category instance) {
        plugin = instance;
    }
	
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
    	
    	Block block = event.getBlock();
    	Player player = event.getPlayer();
    	        
        if (player.hasPermission("category.builder.*")||
        	player.hasPermission("category.builder." + event.getBlock().getType().toString())||
        	player.hasPermission("category.builder." + event.getBlock().getTypeId())){
        		return;
        }else{
        	event.setCancelled(true);
        }
    }
}

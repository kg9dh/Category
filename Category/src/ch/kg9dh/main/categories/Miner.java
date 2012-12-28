package ch.kg9dh.main.categories;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import ch.kg9dh.main.Category;

public class Miner implements Listener {
	
	Category plugin;
	
	public Miner(Category instance) {
        plugin = instance;
    }
	
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
    	
    	Block block = event.getBlock();
    	Player player = event.getPlayer();
    	        
        if (player.hasPermission("category.miner.*")||
        	player.hasPermission("category.miner." + event.getBlock().getType().toString())||
        	player.hasPermission("category.miner." + event.getBlock().getTypeId())){
        		return;
        }else{
        	event.setCancelled(true);
        }
    }
}

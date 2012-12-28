package ch.kg9dh.main.categories;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import ch.kg9dh.main.Category;

public class Farmer implements Listener {

	Category plugin;
	
	public Farmer(Category instance) {
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
    
    @EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){   	
    	Player player = event.getPlayer(); 
    	ItemStack item = event.getItem();  	
    	if(event.getAction() == Action.RIGHT_CLICK_BLOCK&&item.getType()==Material.BONE&&player.hasPermission("category.farmer.")){
    		return;
    	}
	}	
    
}

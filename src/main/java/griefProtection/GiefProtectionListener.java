package griefProtection;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class GiefProtectionListener implements Listener {

	public GriefProtectionPlugin plugin;

	// i nsert rest of code

	public GiefProtectionListener(GriefProtectionPlugin instance) {
		plugin = instance;
	}

	public void onPlayerInteract(PlayerInteractEvent event) {
		try {
			if (event.getPlayer().getItemInHand()
					.equals(new ItemStack(Material.WOOD_PICKAXE))
					&& event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {

				if (!plugin.blocks.contains(event.getClickedBlock()
						.getLocation())) {
					plugin.blocks.add(event.getClickedBlock().getLocation());
					sendMessage(event.getPlayer(), "Block is now proteced!");
					event.setCancelled(true);
				} else {
					sendMessage(event.getPlayer(),
							"The block is already protected");
					event.setCancelled(true);
				}

			} else { // check if block is protected
				if (plugin.blocks.contains(event.getClickedBlock()
						.getLocation())) {
					sendMessage(event.getPlayer(), "That block is protected ");
					event.setCancelled(true);
				}
			}
		} catch (Exception e) {

		}
	}

	public void onBlockInteract(BlockBreakEvent event) {
		
		if(plugin.blocks.contains(event.getBlock().getLocation())){
			sendMessage(event.getPlayer(), "That block is protected "); //check the ArrayList if the block is breaking and add it
			event.setCancelled(true);
		}

	}

	public void sendMessage(Player sendMessageTo, String messageToBesent) {
		sendMessageTo.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD
				+ "GiefProtectionPlugin" + ChatColor.DARK_GRAY + "]"
				+ ChatColor.GRAY + messageToBesent);

	}
}

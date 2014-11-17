package com.gmail.nossr50.commands;

import java.util.ArrayList;
import java.util.List;








import javax.swing.text.html.HTMLDocument.Iterator;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;

import questpack.Quest;
import questpack.QuestManager;

import org.bukkit.Location;

import com.gmail.nossr50.mcMMO;
import com.gmail.nossr50.config.experience.ExperienceConfig;
import com.gmail.nossr50.datatypes.player.McMMOPlayer;
import com.gmail.nossr50.locale.LocaleLoader;
import com.gmail.nossr50.util.Permissions;
import com.gmail.nossr50.util.StringUtils;
import com.gmail.nossr50.util.commands.CommandUtils;
import com.gmail.nossr50.util.player.UserManager;
import com.google.common.collect.ImmutableList;

public class GrowCommand implements TabExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		McMMOPlayer mcMMOPlayer = UserManager.getPlayer(sender.getName());

		if (!Permissions.grow(sender)) {
			sender.sendMessage(command.getPermissionMessage());
			return true;
		}
		mcMMOPlayer.getPlayer().sendMessage("DEBUG");
				
		switch (args.length) {
		case 0:
			
			mcMMOPlayer.getPlayer().sendMessage("Saplings are now fully grown trees");
			getSaplings(20, mcMMOPlayer);

			
			
			

			return true;
	
		default:
			return false;
		}
	}

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command,
			String alias, String[] args) {
		switch (args.length) {
		case 1:
			if (StringUtils.isInt(args[0])) {
				return ImmutableList.of();
			}

			return StringUtil.copyPartialMatches(args[0],
					CommandUtils.RESET_OPTIONS, new ArrayList<String>(
							CommandUtils.RESET_OPTIONS.size()));
		case 2:
			return StringUtil.copyPartialMatches(args[1],
					CommandUtils.TRUE_FALSE_OPTIONS, new ArrayList<String>(
							CommandUtils.TRUE_FALSE_OPTIONS.size()));
		default:
			return ImmutableList.of();
		}
	}
	
   
	private static void getSaplings(int radius,McMMOPlayer player)
    {
		List<Block> tempList = new ArrayList<Block>();
		Location l = player.getPlayer().getLocation();
		World w = l.getWorld();
        int xCoord = (int) l.getX();
        int zCoord = (int) l.getZ();
        int YCoord = (int) l.getY();
 
        
        for (int x = 0; x <= 2 * radius; x++)
        {
            for (int z = 0; z <= 2 * radius; z++)
            {
                for (int y = 0; y <= 2 * radius; y++)
                {
                	Block block = w.getBlockAt(xCoord + x, YCoord + y, zCoord
                            + z); 
                	if (block.getType().equals(Material.SAPLING)) {             		
                		block.breakNaturally();
                    
                	}
                }
            }
        }
        
        player.getPlayer().sendMessage(""+ tempList.size());
       
    }
	
	public void run(int radius,McMMOPlayer player) 
	{
		List<Block> tempList = new ArrayList<Block>();	
		Location location = player.getPlayer().getLocation();
		Location locationAhead = location.getBlock().getRelative(getPlayerFacing(player), 20).getLocation();
		for (int x = -(radius); x <= radius; x++)
		{
			
			for (int y = -(radius); y <= radius; y++)
			{
				
				for (int z = -(radius); z <= radius; z++)
				{
				
					Location loc = locationAhead.getBlock().getRelative(x, y, z).getLocation();
                	Block block = location.getBlock();
                	if (block.getType().equals(Material.SAPLING)) {
                		block.breakNaturally();
                		player.getPlayer().sendMessage("SAPLING");
                		tempList.add(block);
                		
                    
                	}
				

				}
			
			}
	
		}
	}
	public static BlockFace getPlayerFacing(McMMOPlayer player)
	{
	
         float y = player.getPlayer().getLocation().getYaw();
         if( y < 0 ) y += 360;
         y %= 360;
         int i = (int)((y+8) / 22.5);
         
         if(i == 0) return BlockFace.WEST;
         else if(i == 1) return BlockFace.NORTH_WEST;
         else if(i == 2) return BlockFace.NORTH_WEST;
         else if(i == 3) return BlockFace.NORTH_WEST;
         else if(i == 4) return BlockFace.NORTH;
         else if(i == 5) return BlockFace.NORTH_EAST;
         else if(i == 6) return BlockFace.NORTH_EAST;
         else if(i == 7) return BlockFace.NORTH_EAST;
         else if(i == 8) return BlockFace.EAST;
         else if(i == 9) return BlockFace.SOUTH_EAST;
         else if(i == 10) return BlockFace.SOUTH_EAST;
         else if(i == 11) return BlockFace.SOUTH_EAST;
         else if(i == 12) return BlockFace.SOUTH;
         else if(i == 13) return BlockFace.SOUTH_WEST;
         else if(i == 14) return BlockFace.SOUTH_WEST;
         else if(i == 15) return BlockFace.SOUTH_WEST;

         return BlockFace.WEST;
		
	}
	
	
	
}
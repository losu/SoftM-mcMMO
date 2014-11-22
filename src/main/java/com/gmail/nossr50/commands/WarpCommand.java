package com.gmail.nossr50.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;

import questpack.Quest;
import questpack.QuestManager;

import com.gmail.nossr50.mcMMO;
import com.gmail.nossr50.config.experience.ExperienceConfig;
import com.gmail.nossr50.datatypes.player.McMMOPlayer;
import com.gmail.nossr50.locale.LocaleLoader;
import com.gmail.nossr50.util.Permissions;
import com.gmail.nossr50.util.StringUtils;
import com.gmail.nossr50.util.commands.CommandUtils;
import com.gmail.nossr50.util.player.UserManager;
import com.google.common.collect.ImmutableList;

public class WarpCommand implements TabExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		McMMOPlayer mcMMOPlayer = UserManager.getPlayer(sender.getName());
		Player player = (Player) sender;
		
		final   Location playerLocation = player.getLocation().clone();
				
		
		
		if (!Permissions.quest(sender)) {
			sender.sendMessage(command.getPermissionMessage());
			return true;
		}
		
		
		switch(args.length) {
		case 0: //If there is only the command
			
			if(label.equalsIgnoreCase("setwarp")) {
				mcMMOPlayer.getPlayer().sendMessage("/setwarp <name>");
				return true;
				
			} if(label.equalsIgnoreCase("warpe")){
				mcMMOPlayer.getPlayer().sendMessage("/warpe <name>");
			}
			if(label.equalsIgnoreCase("warpes")) {
		
			mcMMOPlayer.getWarpList();
			return true;
			}
				
		
		
		
		case 1: //If there is an argument
			if(label.equalsIgnoreCase("setwarp")) {
				
				System.out.println(args[0]);
				
				if(playerLocation == null) 	
					System.out.println("null location");	
				else
					System.out.println(playerLocation.toString());
				
				
				mcMMOPlayer.setWarpLocation(playerLocation, args[0]);
				System.out.println(mcMMOPlayer.getWarpLocation().getX());
				
				if(mcMMOPlayer.checkWarpName(0, playerLocation, args[0])) {
					mcMMOPlayer.getPlayer().sendMessage("SUCESSFULY ADDED: " + args[0]);
				} 
					
					
					
				return true;		
				
								
				
				
				
			} 
			if(label.equalsIgnoreCase("warpe")) {
				System.out.println(mcMMOPlayer.getWarpLocation().getX());
				
				if(mcMMOPlayer.checkWarpName(1, playerLocation, args[0])) {
					mcMMOPlayer.getPlayer().sendMessage("warped to: " + args[0]);
					mcMMOPlayer.getPlayer().teleport(mcMMOPlayer.getWarpLocationByName(args[0]));
					System.out.println(mcMMOPlayer.getWarpLocation().getX());	
				} else 
					return false;
					
				
				System.out.println(label);
				
			} 
			return true;
		}
		
		
				
	
		return false;
		
		
		
		
		
		
		
	
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


}
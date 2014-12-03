package com.gmail.nossr50.commands;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;
import org.bukkit.util.StringUtil;

import questpack.Quest;
import questpack.QuestManager;
import testing.TestQuestManager;


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

		switch (args.length) {
		case 0:

			mcMMOPlayer.getPlayer().sendMessage(
					"Saplings are now fully grown trees");

			
			
			for (Location loc : mcMMO.saplingsList) {
				Block block = loc.getBlock();
				World world = loc.getWorld();

				final byte id = block.getData();

				block.setType(Material.AIR);

				switch (id) {
				case 0:
					world.generateTree(loc, TreeType.TREE);
					break;
				case 1:
					world.generateTree(loc, TreeType.REDWOOD);
					break;
				case 2:
					world.generateTree(loc, TreeType.BIRCH);
					break;
				case 3:
					world.generateTree(loc, TreeType.JUNGLE);
					break;
				case 4:
					world.generateTree(loc, TreeType.ACACIA);
					break;
				case 5:
					world.generateTree(loc, TreeType.DARK_OAK);
					break;
				}

			}
			mcMMO.saplingsList.clear();

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

}
package com.gmail.nossr50.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
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

public class QuestCommand implements TabExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		McMMOPlayer mcMMOPlayer = UserManager.getPlayer(sender.getName());

		if (!Permissions.quest(sender)) {
			sender.sendMessage(command.getPermissionMessage());
			return true;
		}

		Quest[] quests = mcMMOPlayer.getQuestData();
		
		switch (args.length) {
		case 0:

			mcMMOPlayer.getPlayer().sendMessage("Quests avalible:");

			for (int i = 0; i <= quests.length - 1; i++) {
				if (quests[i] != null) {
					int status = quests[i].getQuestStatus();
					switch (status) {
					case 0:
						mcMMOPlayer.getPlayer().sendMessage(ChatColor.GRAY + "#"+
								i + " " + ChatColor.WHITE + quests[i].getName() + ChatColor.GREEN + " AVAILABLE");
						break;
					case 1:
						mcMMOPlayer.getPlayer().sendMessage(ChatColor.GRAY + "#"+
								i + " "  + ChatColor.WHITE + quests[i].getName() + ChatColor.YELLOW + " IN PROGRESS");
						break;
					case 2:
						mcMMOPlayer.getPlayer().sendMessage(ChatColor.GRAY + "#"+
								i + " " + ChatColor.WHITE + quests[i].getName() + ChatColor.RED + " COMPLETED");
						break;
					}
				}
			}

			return true;
		case 1:
			
			QuestManager.handleQuest(mcMMOPlayer, Integer.parseInt(args[0]));
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
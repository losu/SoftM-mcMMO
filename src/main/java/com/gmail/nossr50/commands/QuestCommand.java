package com.gmail.nossr50.commands;

import org.bukkit.command.CommandSender;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;
import com.gmail.nossr50.locale.LocaleLoader;
import com.gmail.nossr50.util.Permissions;

public class QuestCommand extends ToggleCommand {
    @Override
    protected boolean hasOtherPermission(CommandSender sender) {
        return Permissions.questOthers(sender);
    }

    @Override
    protected boolean hasSelfPermission(CommandSender sender) {
        return Permissions.quest(sender);
    }

    @Override
    protected void applyCommandAction(McMMOPlayer mcMMOPlayer) {
        mcMMOPlayer.getPlayer().sendMessage("Quests avalible:");
        mcMMOPlayer.getPlayer().sendMessage("1. Some quest name"); 
        mcMMOPlayer.getPlayer().sendMessage("2. Greetings traveler");
        
    }

    @Override
    protected void sendSuccessMessage(CommandSender sender, String playerName) {
        sender.sendMessage("Quest command executed sucessfuly");
    }
}

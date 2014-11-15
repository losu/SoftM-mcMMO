package com.gmail.nossr50.commands;

import org.bukkit.command.CommandSender;

import questpack.Quest;
import questpack.QuestManager;

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
    protected void applyCommandAction(McMMOPlayer mcMMOPlayer, String[] args) {
    	
    	if(args.length == 0) {
        	try {
            	mcMMOPlayer.getPlayer().sendMessage("Quests avalible:");
            	
            	Quest[] quests = mcMMOPlayer.getQuestData();
                for (int i = 0; i <= quests.length-1; i++) {
                	if(quests[i] != null) {        		
                		if(!quests[i].isCompleted()) {
                			mcMMOPlayer.getPlayer().sendMessage(i + ": "+ quests[i].getName() + "  AVALIBLE"); 
                		}
                		else {
                			mcMMOPlayer.getPlayer().sendMessage(i + ": "+ quests[i].getName() + "  COMPLETED"); 
                		}
                	}
                } 

        	} catch (IndexOutOfBoundsException e) {
        	    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        	} 
    	} else if(args.length == 1) {
    		mcMMOPlayer.getPlayer().sendMessage("Args");
    		QuestManager.handleQuest(mcMMOPlayer, Integer.parseInt(args[1]));
    	}
    }

    @Override
    protected void sendSuccessMessage(CommandSender sender, String playerName) {
       
    }
}

package questpack;
 
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.junit.Test;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;
 
public class QuestManager {
	
      // public static Quest[] questList;
       

    
       
		public static Quest[] generateQuests() {
           Quest[] questList = new Quest[6];
            
            questList[0] = new Quest("Dirty business", "Gather 10 dirt and turn it in",10, 0, new Reward(Material.IRON_SPADE, 10),Material.DIRT);
            questList[1] = new Quest("Dirty business2", "Gather 100 dirt and turn it in",100, 0, new Reward(Material.DIAMOND_SPADE, 100),Material.DIRT);
            questList[2] = new Quest("Mine mine mine", "Gather 10 iron and turn it in",10, 0, new Reward(Material.IRON_PICKAXE, 10),Material.IRON_ORE);
            questList[3] = new Quest("Mine mine mine2", "Gather 100 iron and turn it in",100, 0, new Reward(Material.DIAMOND_PICKAXE, 100),Material.IRON_ORE);
            questList[4] = new Quest("Lumberjack", "Gather 10 wood and turn it in",10, 0, new Reward(Material.IRON_AXE, 10),Material.WOOD);                
            questList[5] = new Quest("Lumberjack2", "Gather 100 wood and turn it in",100, 0, new Reward(Material.DIAMOND_AXE, 100),Material.WOOD);
           return questList;
               
        }
 
    

        public static boolean checkIsQuestFinished (McMMOPlayer mcMMOPlayer, int questNumber){
        	Player player = mcMMOPlayer.getPlayer();
        	PlayerInventory playerInventory = player.getInventory();
        
        	Quest[] questList = mcMMOPlayer.getQuestData();
        	ItemStack itemStack = new ItemStack(questList[questNumber].getMaterial());
        	if (playerInventory.contains(questList[questNumber].getMaterial(), questList[questNumber].getAmountOfMaterial()))
        	{
        		
        		//mcMMOPlayer.getPlayer().sendMessage("You finish the Quest ! "+ questList[questNumber].getName());
        		questList[questNumber].setStateOfTheQuest(2);
        		return true;
        	}
        	else{
        		
        		mcMMOPlayer.getPlayer().sendMessage(ChatColor.RED + "You have to collect more items!");
        		mcMMOPlayer.getPlayer().sendMessage(ChatColor.WHITE + "You have to: " + ChatColor.YELLOW + questList[questNumber].getDescription());
        		
        		questList[questNumber].setStateOfTheQuest(1);
        		return false;
        	}       	
        }
        
        public static void handleQuest(McMMOPlayer mcMMOPlayer, int questNumber) {
        	
        	Player player = mcMMOPlayer.getPlayer();
        	PlayerInventory playerInventory = player.getInventory();
        	Quest[] questList = mcMMOPlayer.getQuestData();
        	
        	
        	//checkIsQuestFinished(mcMMOPlayer,questNumber);
        	 if (questList[questNumber].getQuestStatus() == 2) 
        	 {
        		 mcMMOPlayer.getPlayer().sendMessage(ChatColor.RED + "ALREADY COMPLETED! ");
        	 } 
        	 else if (questList[questNumber].getQuestStatus() == 1)
        	 {
        		 if (checkIsQuestFinished(mcMMOPlayer, questNumber))
        		 {

        			 mcMMOPlayer.getPlayer().sendMessage(ChatColor.RED + "**QUEST " + ChatColor.WHITE + questList[questNumber].getName() + ChatColor.GREEN + " COMPLETED!!" + ChatColor.RED +"**");
        			 ItemStack toRemoveitemStack = new ItemStack(questList[questNumber].getMaterial());
        			 toRemoveitemStack.setAmount(questList[questNumber].getAmountOfMaterial());
        			 playerInventory.removeItem(toRemoveitemStack);

        			 handleReward(mcMMOPlayer,questNumber);
        		 }
        	 }
        	 else if (questList[questNumber].getQuestStatus() == 0)
        	 {
        		 mcMMOPlayer.getPlayer().sendMessage("QUEST "+ChatColor.GRAY +questList[questNumber].getName()+ ChatColor.WHITE +" succesfuly taken.");
        		 mcMMOPlayer.getPlayer().sendMessage("Description: " +ChatColor.YELLOW + questList[questNumber].getDescription());
        		 questList[questNumber].setStateOfTheQuest(1);
        	 }
        
        }
        
        public static void handleReward(McMMOPlayer mcMMOPlayer, int questNumber) {
        	  Player player = mcMMOPlayer.getPlayer();
        	  PlayerInventory playerInventory = player.getInventory();
        	  Quest[] questList = mcMMOPlayer.getQuestData();  
        	  Reward reward = questList[questNumber].getReward();
        	  ItemStack itemStack = new ItemStack(reward.getMaterial());

        	  playerInventory.addItem(itemStack);
        	  mcMMOPlayer.getPlayer().sendMessage(ChatColor.YELLOW  + "Quest reward: " + reward.getMaterial().toString());

        	 }
 
        
}
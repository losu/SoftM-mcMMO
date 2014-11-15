package questpack;
 
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;
 
public class QuestManager {
	
       
        public static Quest[] generateQuests() {
                Quest[] questList = new Quest[10];
                questList[0] = new Quest("Lumberjack", "Pick up 10 wood and turn it in",10, 0, new Reward(Material.DIAMOND_AXE, 10),Material.WOOD);
                questList[2] = new Quest("Bla bla bla", "Pick up 10 iron and turn it in",15, 1, new Reward(Material.DIAMOND_AXE, 10),Material.SEEDS);
                questList[5] = new Quest("Abecad", "Pick up 10 wood and turn it in",20, 2, new Reward(Material.DIAMOND_AXE, 10),Material.SAND);
                return questList;
               
        }
 
//        public static void checkIsQuestFinished (McMMOPlayer mcMMOPlayer, int questNumber){
//        	Player player = mcMMOPlayer.getPlayer();
//        	PlayerInventory playerInventory = player.getInventory();
//        
//        	Quest[] questList = mcMMOPlayer.getQuestData();
//        	ItemStack itemStack = new ItemStack(questList[questNumber].getMaterial());
//        	
//        	
//        	{
//        		
//        		mcMMOPlayer.getPlayer().sendMessage("You finish the Quest ! "+ questList[questNumber].getName());
//        		questList[questNumber].setStateOfTheQuest(2);
//        		
//        	}
//        	else{
//        		
//        		mcMMOPlayer.getPlayer().sendMessage("You have to collect more items ! ");
//        		questList[questNumber].setStateOfTheQuest(1);
//        		
//        	}
////        	
//        }
        
        public static void handleQuest(McMMOPlayer mcMMOPlayer, int questNumber) {
             //  Quest[] questList = player.getq
        	Player player = mcMMOPlayer.getPlayer();
        	PlayerInventory playerInventory = player.getInventory();
        	
        	Quest[] questList = mcMMOPlayer.getQuestData();
        	ItemStack itemStack = new ItemStack(questList[questNumber].getMaterial());
        	
        	//checkIsQuestFinished(mcMMOPlayer, questNumber);
        	
        	if(questList[questNumber].getQuestStatus()==2)
        	{
        		mcMMOPlayer.getPlayer().sendMessage("ALREADY COMPLITED ! ");
        	}
        	else if (questList[questNumber].getQuestStatus()==1)
        	{
        		if (!playerInventory.containsAtLeast(itemStack, questList[questNumber].getAmountOfMaterial()))
        			mcMMOPlayer.getPlayer().sendMessage("In progress ! You have to collect more items !");	
        	}
        	
        	else if(questList[questNumber].getQuestStatus()==0)
        	{
        		mcMMOPlayer.getPlayer().sendMessage("Description: "+ questList[questNumber].getDescription());
        	}

        	
        }
        
     
        
    
        
}
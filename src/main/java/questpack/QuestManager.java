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
                questList[0] = new Quest("Lumberjack", "Pick up 10 wood and turn it in",10, false, new Reward(Material.DIAMOND_AXE, 10),Material.WOOD);
                questList[2] = new Quest("Bla bla bla", "Pick up 10 iron and turn it in",15, true, new Reward(Material.DIAMOND_AXE, 10),Material.SEEDS);
                questList[5] = new Quest("Abecad", "Pick up 10 wood and turn it in",20, false, new Reward(Material.DIAMOND_AXE, 10),Material.SAND);
                return questList;
               
        }
 
        public boolean checkNpcClicled(Entity npc) {
                return true;
        }
       
        public static void handleQuest(McMMOPlayer mcMMOPlayer, int questNumber) {
             //  Quest[] questList = player.getq
        	Player player = mcMMOPlayer.getPlayer();
        	PlayerInventory playerInventory = player.getInventory();
        	
        	Quest[] questList = mcMMOPlayer.getQuestData();
        	
        	if(questList[questNumber].isCompleted())
        	{
        		mcMMOPlayer.getPlayer().sendMessage("ALREADY COMPLITED ! ");
        	}
        	else if(!questList[questNumber].isCompleted())
        	{
        		mcMMOPlayer.getPlayer().sendMessage("AVAILABLE ! ");
        	}
        	
        }
        
        public void checkIsQuestFinished (McMMOPlayer mcMMOPlayer, int questNumber){
        	Player player = mcMMOPlayer.getPlayer();
        	PlayerInventory playerInventory = player.getInventory();
        
        	Quest[] questList = mcMMOPlayer.getQuestData();
        	ItemStack itemStack = new ItemStack(questList[questNumber].getMaterial());
        	
        	if (playerInventory.containsAtLeast(itemStack, questList[questNumber].getAmountOfMaterial()))
        	{
        		questList[questNumber].setCompleted(true);
        		mcMMOPlayer.getPlayer().sendMessage("You finish the Quest ! "+ questList[questNumber].getName());
        	}
        	else{
        		questList[questNumber].setCompleted(false);
        		mcMMOPlayer.getPlayer().sendMessage("You have to collect more items ! ");
        	}
        	
        	//return false;
        }
}
package questpack;
 
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;
 
public class QuestManager {
	
       
        public static Quest[] generateQuests() {
                Quest[] questList = new Quest[10];
                questList[0] = new Quest("Lumberjack", "Pick up 10 wood and turn it in", false, new Reward(Material.DIAMOND_AXE, 10));
                questList[2] = new Quest("Bla bla bla", "Pick up 10 iron and turn it in", true, new Reward(Material.DIAMOND_AXE, 10));
                questList[5] = new Quest("Abecad", "Pick up 10 wood and turn it in", false, new Reward(Material.DIAMOND_AXE, 10));
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
        	
        }
       
        
}
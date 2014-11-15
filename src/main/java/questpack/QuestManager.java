package questpack;
 
import org.bukkit.Material;
import org.bukkit.entity.Entity;
 
public class QuestManager {
       
        public static Quest[] generateQuests() {
                Quest[] questList = new Quest[10];
                questList[0] = new Quest("Lumberjack", "Pick up 10 wood and turn it in", false, new Reward(Material.DIAMOND_AXE, 10));
                return questList;
               
        }
 
        public boolean checkNpcClicled(Entity npc) {
                return true;
        }
       
        public void handleQuest() {
               
        }
       
        public boolean checkQuestFinished() {
                return true;
        }
}
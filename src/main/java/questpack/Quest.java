package questpack;
 
import java.util.Dictionary;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;
 
public class Quest {
 
        private String name;
        private String description;
        private int amountOfMaterial;
        private int questStatus; //0-available, 1-in progress, 2-finished
        private Reward reward;
        private Material material;
       
       
       


		public Quest(String name, String description, int amountOfMaterial, int stateOfTheQuest,
                        Reward reward, Material material) {
                this.name = name;
                this.description = description;
                this.amountOfMaterial=amountOfMaterial;
                this.questStatus = stateOfTheQuest;
                this.reward = reward;
                this.material=material;
                
                
               
        }
       
        public String getName() {
                return name;
        }
       
        public void setName(String name) {
                this.name = name;
        }
       
        public String getDescription() {
                return description;
        }
       
        public void setDescription(String description) {
                this.description = description;
        }


       
        public int getQuestStatus() {
			return questStatus;
		}

		public void setStateOfTheQuest(int stateOfTheQuest) {
			this.questStatus = stateOfTheQuest;
		}

		public Reward getReward() {
                return reward;
        }
       
        public void setReward(Reward reward) {
                this.reward = reward;
        }
        public Material getMaterial() {
 			return material;
 		}

 		public void setMaterial(Material material) {
 			this.material = material;
 		}
 		 
		public int getAmountOfMaterial() {
			return amountOfMaterial;
		}

		public void setAmountOfMaterial(int amountOfMaterial) {
			this.amountOfMaterial = amountOfMaterial;
		}
       
	    
       
       
       
}
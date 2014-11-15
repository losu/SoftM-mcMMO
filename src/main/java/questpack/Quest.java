package questpack;
 
import java.util.Dictionary;

import org.bukkit.Material;
 
public class Quest {
 
        private String name;
        private String description;
        private int amountOfMaterial;
        private boolean completed;
        private Reward reward;
        private Material material;
       
       
       


		public Quest(String name, String description, int amountOfMaterial, boolean completed,
                        Reward reward, Material material) {
                this.name = name;
                this.description = description;
                this.amountOfMaterial=amountOfMaterial;
                this.completed = completed;
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

		public boolean isCompleted() {
                return completed;
        }
       
        public void setCompleted(boolean completed) {
                this.completed = completed;
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
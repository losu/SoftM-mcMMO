package questpack;
 
import org.bukkit.Material;
 
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
       
		  @Override
	       public int hashCode() {
              final int prime = 31;
              int result = 1;
              result = prime * result
                           + ((name == null) ? 0 : name.hashCode());
              result = prime * result
                      + ((description == null) ? 0 : description.hashCode());
       
              result = prime * result + amountOfMaterial;
              result = prime * result + questStatus;
              
              result = prime * result
                      + ((reward == null) ? 0 : reward.hashCode());
              result = prime * result
                      + ((material == null) ? 0 : material.hashCode());
              return result;

		  }
		  
		@Override 
		public boolean equals(Object o)
		{
			if(o==this)
				return true;
			if(!(o instanceof Quest))
				return false;
			
			Quest quest = (Quest)o;
			return quest.name == name
					&& quest.description == description
					&& quest.amountOfMaterial == amountOfMaterial
					&& quest.questStatus == questStatus
					&& quest.reward == reward
					&& quest.material == material;
		}
       
       
       
}
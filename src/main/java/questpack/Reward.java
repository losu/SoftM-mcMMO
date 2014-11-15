package questpack;
import org.bukkit.Material;
import org.bukkit.entity.Item;
 
public class Reward {
 
        private Material material;
        private int exp;
       
        public Reward(Material goldNugget, int exp) {
                this.material = goldNugget;
                this.exp = exp;
        }
 
        public Material getMaterial() {
                return material;
        }
 
        public void setMaterial(Material material) {
                this.material = material;
        }
 
        public int getExp() {
                return exp;
        }
 
        public void setExp(int exp) {
                this.exp = exp;
        }
       
       
}
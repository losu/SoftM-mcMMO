package questpack;

import org.bukkit.entity.Item;

public class Reward {

	private Item item;
	private int exp;
	
	public Reward(Item item, int exp) {
		this.item = item;
		this.exp = exp;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}

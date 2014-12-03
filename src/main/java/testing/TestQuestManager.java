package testing;

import org.bukkit.Material;
import org.junit.Test;

import questpack.Quest;
import questpack.QuestManager;
import questpack.Reward;

public class TestQuestManager {
	Quest[] testQuestList;
	QuestManager questManager;
	
	@Test
	public void testListOfQuests ()
	{
		testQuestList = new Quest[6];
		
		
		testQuestList[0] = new Quest("Dirty business", "Gather 10 dirt and turn it in",10, 0, new Reward(Material.IRON_SPADE, 10),Material.DIRT);
		testQuestList[1] = new Quest("Dirty business2", "Gather 100 dirt and turn it in",100, 0, new Reward(Material.DIAMOND_SPADE, 100),Material.DIRT);
		testQuestList[2] = new Quest("Mine mine mine", "Gather 10 iron and turn it in",10, 0, new Reward(Material.IRON_PICKAXE, 10),Material.IRON_ORE);
		testQuestList[3] = new Quest("Mine mine mine2", "Gather 100 iron and turn it in",100, 0, new Reward(Material.DIAMOND_PICKAXE, 100),Material.IRON_ORE);
		testQuestList[4] = new Quest("Lumberjack", "Gather 10 wood and turn it in",10, 0, new Reward(Material.IRON_AXE, 10),Material.WOOD);                
		testQuestList[5] = new Quest("Lumberjack2", "Gather 100 wood and turn it in",100, 0, new Reward(Material.DIAMOND_AXE, 100),Material.WOOD);
		QuestManager.generateQuests();
		
		
	}

	
		
	
}

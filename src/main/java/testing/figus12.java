package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.junit.Test;

import com.gmail.nossr50.mcMMO;

public class figus12 {

	@Test
	public void test() {
		ArrayList <Location> saplings = new ArrayList<Location>();
		World world = Bukkit.getWorld("New");
		Location newLoc = new Location(world,-156.0,66.0,240.0);
		saplings.add(newLoc);
		
		assertEquals(saplings,mcMMO.saplingsList);
	}

}

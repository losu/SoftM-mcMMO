package testing;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.bukkit.command.CommandSender;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.api.robot.Key;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Image;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;









import com.gmail.nossr50.util.player.UserManager;

public class DavidSDU {

	public static java.lang.String keyboardUS;
	
	// background should be black for testing


	@Test
	public void sikuliTest() throws FindFailed {
		Screen s = new Screen();
		ImagePath.setBundlePath("C:/users/arm/desktop/unittest");
		
		//opening a application
		s.doubleClick("minecraftDavid.png");
		s.wait((double) 15.0);
		s.paste("losu");
		s.type(Key.ENTER);
		s.click("play.png");

		s.wait((double) 15.0);
		s.click("multiplayerDavid.png");
		s.wait((double) 5.0);
		s.doubleClick("serverDavid.png");

		s.wait((double) 5.0);

		//Showing the quest list
		s.type("/");
		s.wait((double) 2.0);
		s.paste("quest");
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		
		assertTrue("", s.exists("questlistavalible.png").getImage() != null);
		
		
		s.wait((double) 2.0);

		//Taking a quest and showing that it is taken
		s.type("/");
		s.wait((double) 2.0);
		s.paste("quest 0");
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		assertTrue("", s.exists("quest0taken.png").getImage() != null);
		
		s.wait((double) 2.0);
		s.type("/");
		s.paste("quest");
		s.wait((double) 1.0);
		s.type(Key.ENTER);
		s.wait((double) 2.0);
		assertTrue("", s.exists("questlist0progress.png").getImage() != null);
		
		//Completing the quest, first without required items and than with items
		s.type("/");
		s.wait((double) 2.0);
		s.paste("quest 0");
		s.wait((double) 2.0);
		
		s.type(Key.ENTER);
		assertTrue("", s.exists("quest0not.png").getImage() != null);	
		
		s.wait((double) 1.0);
		s.type("/");
		s.wait((double) 0.5);
		s.paste("gamemode 1");
		s.wait((double) 0.5);
		s.type(Key.ENTER);
		s.wait((double) 1.0);
		s.type("/");
		s.paste("give losu dirt 15");
		s.wait((double) 1.0);
		s.type(Key.ENTER);
		assertTrue("", s.exists("dirt.png").getImage() != null);
		
		
		s.wait((double) 1.0);
		s.type("/");
		s.wait((double) 0.5);
		s.paste("gamemode 0");
		s.wait((double) 0.5);
		s.type(Key.ENTER);
		s.wait((double) 1.0);
		s.type("/");
		s.paste("quest 0");
		s.wait((double) 0.5);
		s.type(Key.ENTER);
		
		assertTrue("", s.exists("dirtleft.png").getImage() != null);
		assertTrue("", s.exists("spade.png").getImage() != null);		
		assertTrue("", s.exists("quest0comp.png").getImage() != null);		
		
		
		s.type("/");
		s.wait((double) 2.0);
		s.paste("quest");
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		
		assertTrue("", s.exists("questlist0completed.png").getImage() != null);			
		
		
		
		
		s.wait((double) 2.0);
		//Checking if player can take again the complited quest
		s.type("/");
		s.wait((double) 2.0);
		s.paste("quest 0");
		s.wait((double) 5.0);
		assertTrue("", s.exists("questalready.png").getImage() != null);				
		



		
		
	}
}

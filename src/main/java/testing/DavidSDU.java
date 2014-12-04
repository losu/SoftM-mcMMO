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
	// background should be black for testing
//	@Before
//	public void beforeFirstTest() {
//		Screen s = new Screen();
//		//t/quest
//		ImagePath.setBundlePath("C:/Users/Rok Komatar/Desktop/sikuliUnitesting/join");
//
//		try {
//			s.doubleClick("start.png");
//			
//			s.doubleClick("mc.png");
//			
//			s.wait("play.png",(double) 20.0);
//			s.click("play.png");
//			s.wait("mp.png",(double) 20.0);
//			s.click("mp.png");
//			s.wait("server.png",(double) 20.0);
//			s.doubleClick("server.png");
//			s.doubleClick("join.png");
//
//		} catch (FindFailed e) {
//			e.printStackTrace();
//		}
//
//	}

	@Test
	public void sikuliTest() throws FindFailed {
		Screen s = new Screen();
		ImagePath.setBundlePath("C:/Users/david/git/SoftM-mcMMO/src/main/resources");
		
		//opening a application
		s.doubleClick("minecraftDavid.png");
		s.wait((double) 5.0);
		s.paste("losu");
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		s.wait((double) 5.0);
		s.click("play1.png");

		s.wait((double) 5.0);
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
		s.wait((double) 2.0);
		s.paste("quest");
		s.wait((double) 2.0);
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
		s.wait((double) 1.0);
		s.paste("gamemode 1");
		s.wait((double) 1.0);
		s.type(Key.ENTER);
		s.wait((double) 1.0);
		s.type("/");
		s.wait((double) 2.0);
		s.paste("give losu dirt 15");
		s.wait((double) 1.0);
		s.type(Key.ENTER);
		assertTrue("", s.exists("dirt1.png").getImage() != null);
		
		
		s.wait((double) 2.0);
		s.type("/");
		s.wait((double) 1.0);
		s.paste("gamemode 0");
		s.wait((double) 0.5);
		s.type(Key.ENTER);
		s.wait((double) 1.0);
		s.type("/");
		s.wait((double) 1.0);
		s.paste("quest 0");
		s.wait((double) 1.0);
		s.type(Key.ENTER);
		
		assertTrue("", s.exists("dirtleft1.png").getImage() != null);
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
		s.type(Key.ENTER);
		assertTrue("", s.exists("questalready.png").getImage() != null);				
		



		
		
	}
}

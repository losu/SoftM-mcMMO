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

public class rokom14 {

	public static java.lang.String keyboardUS;
	
	// background should be black for testing
	@Before
	public void beforeFirstTest() {
		Screen s = new Screen();
		ImagePath.setBundlePath("C:/Users/Rok Komatar/Desktop/sikuliUnitesting/join");

		try {
			s.doubleClick("start.png");
			
			s.doubleClick("mc.png");
			
			s.wait("play.png",(double) 20.0);
			s.click("play.png");
			s.wait("mp.png",(double) 20.0);
			s.click("mp.png");
			s.wait("server.png",(double) 20.0);
			s.doubleClick("server.png");
			s.doubleClick("join.png");

		} catch (FindFailed e) {
			e.printStackTrace();
		}

	}

	@Test
	public void sikuliTest() throws FindFailed {
		Screen s = new Screen();
		ImagePath.setBundlePath("C:/Users/Rok Komatar/Desktop/sikuliUnitesting/quest");
		

		// /quest COMMAND - SHOWS THE QUESTS AVALIBLE
		s.type("t");
		s.wait((double) 2.0);
		s.type("/quest");
				
		assertTrue("", s.exists("questcommand.png").getImage() != null);
				
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		
		assertTrue("", s.exists("questlistavalible.png").getImage() != null);
		
				
		//TAKE QUEST 0
		s.wait((double) 2.0);
		s.type("t"); 
		s.wait((double) 2.0);
		s.type("/quest 0"); 
		
		assertTrue("", s.exists("quest0.png").getImage() != null);
				
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		
		assertTrue("", s.exists("quest0taken.png").getImage() != null);
		
		s.wait((double) 2.0);
		

		//SHOW LIST OF QUESTS AGAIN (TO SHOW THAT QUEST 0 IS IN PROGRESS)
		s.type("t");
		s.wait((double) 2.0);
		s.type("/quest");
				
		assertTrue("", s.exists("questlist0progress.png").getImage() != null);
		
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		s.wait((double) 2.0);
		
		//TRY TO COMPLETE QUEST 0 BUT WE DONT HAVE ALL ITEMS
		s.type("t");
		s.wait((double) 2.0);
		s.type("/quest 0");
		
		assertTrue("", s.exists("quest0not.png").getImage() != null);	
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		s.wait((double) 2.0);
		
		//GET THE REQUIRED ITEMS BY COMANDS
		s.type("t");
		s.wait((double) 2.0);
		s.type("/gamemode 1");
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		s.wait((double) 2.0);
		
		s.type("t");
		s.wait((double) 2.0);
		s.type("/give rokic1337 dirt 15");
		
		
		s.wait((double) 2.0);
		assertTrue("", s.exists("givedirt.png").getImage() != null);
		
		s.type(Key.ENTER);
		s.wait((double) 2.0);
		
		//NOW WE GOT THE ITEMS, TURN IN THE QUEST, WE WILL GET IRON SPADE AS REWARD
		s.type("t");
		s.wait((double) 2.0);
		s.type("/quest 0");
		
		assertTrue("", s.exists("quest0comp.png").getImage() != null);
		
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		s.wait((double) 2.0);
		
		//SHOWS QUEST LIST AGAIN TO SHOW QUEST 0 IS NOW COMPLETED
		s.type("t");
		s.wait((double) 2.0);
		s.type("/quest");
		
		assertTrue("", s.exists("questlist0completed.png").getImage() != null);
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		s.wait((double) 5.0);
				
		
	}
}

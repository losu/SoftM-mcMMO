package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;

import org.junit.Test;

public class figus12testcase {

//	@Before
//	// this is what you do before the test. All the things you run, before the actual game is played
//	public void beforeFirstTest(){
//		Screen s = new Screen();
//		ImagePath.setBundlePath("src/main/resources");
//		
//		try{
//			//you must only have Eclipse open and when you minimize, you get on the desktop
//				s.click("minimize.png");
//				s.wait((double) 2.0);
//				s.doubleClick("runthis.png");
//				s.wait((double) 11.0);
//				s.doubleClick("minecraft.png");
//				s.wait((double) 8.0);
//				s.type("filip");
//				s.wait((double) 3.0);
//				s.click("play2.png");
//				s.wait((double) 4.0);
//				s.click("play1.png");
//				s.wait((double) 8.0);
//				s.click("multiplayer.png");
//				s.wait((double) 3.0);
//				s.click("direct connect.png");
//				s.wait((double) 2.0);
//				s.click("type here");
//				s.wait((double) 2.0);
//				s.type("127.0.0.1");
//				s.wait((double) 3.0);
//				s.click("join server.png");
//				s.wait((double) 4.0);
//			
//				
//				}catch(FindFailed e){
//					e.printStackTrace();
//		
//				}
//	}
	
		
		@Test
		public void sikuliTest() throws FindFailed{
			Screen s = new Screen();
			ImagePath.setBundlePath("src/main/resources");
			
		
		s.wait((double) 3.0);
		s.type("t");
		s.wait((double) 3.0);
		s.paste("/time set 3500");
		s.wait((double) 3.0);
		s.type(Key.ENTER);
		s.type("t");
		s.wait((double) 3.0);
		s.paste("/gamemode 1");
		s.wait((double) 3.0);
		s.type(Key.ENTER);
		s.wait((double) 4.0);
		s.type("e");
		s.wait((double) 5.0);
		s.click("search button.png");
		s.wait((double) 3.0);
		s.type("sapling");
		s.wait((double) 3.0);
		s.rightClick("sapling");
		s.wait((double) 3.0);
		s.click("item spot.png");
		s.wait((double) 3.0);
		s.type(Key.ESC);
		s.wait((double) 3.0);
		s.type("1");
		s.wait((double) 3.0);
		s.type("t");
		s.wait((double) 2.0);
		s.paste("/gamemode 0");
		s.wait((double) 3.0);
		s.type(Key.ENTER);
		s.wait((double) 4.0);
		s.mouseDown(Button.RIGHT);
		s.mouseUp(Button.RIGHT);
		s.wait((double)0.5);

		s.wait((double) 2.0);
		s.mouseDown(Button.RIGHT);
		s.mouseUp(Button.RIGHT);
		s.wait((double) 4.0);
		s.wait((double)0.5);
		assertTrue("", s.exists("sapling ready to grow.png").getImage() != null);	

		
		for (int i = 0; i<60; i++) {
			s.type("s");
			
		}
		s.wait((double) 3.0);
		
		s.type("t");
		s.wait((double) 2.0);
		s.paste("/grow");
		
		
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		assertTrue("", s.exists("saplings are fully grown trees.png").getImage() != null);	

		
		for (int i = 0; i<60; i++) {
			s.type("w");
		}	
		s.type("t");
		s.wait((double) 3.0);
		s.paste("/gamemode 1");
		s.wait((double) 3.0);
		s.type(Key.ENTER);
		s.wait((double) 4.0);
		s.type("e");
		s.wait((double) 5.0);
		s.click("search button.png");
		s.wait((double) 3.0);
		s.type("diamond pickaxe");
		s.wait((double) 3.0);
		s.rightClick("diamond pickaxe");
		s.wait((double) 3.0);
		s.click("item spot.png");
		s.wait((double) 3.0);
		s.type(Key.ESC);
		s.wait((double) 3.0);
		s.type("1");
		s.wait((double) 3.0);
		s.type("t");
		s.paste("/gamemode 0");
		s.wait((double) 2.0);
		s.mouseDown(Button.RIGHT);
		s.mouseUp(Button.RIGHT);
		s.wait((double) 2.0);
		s.mouseDown(Button.LEFT);
		s.wait((double) 3.0);
		s.mouseUp(Button.LEFT);
		assertTrue("", s.exists("sapling has been succesfully planted.png").getImage() != null);	

		
}
}

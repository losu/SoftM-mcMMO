package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;

import org.junit.Test;

public class figus12testcase {

	@Before
	// this is what you do before the test. All the things you run, before the actual game is played
	public void beforeFirstTest(){
		Screen s = new Screen();
		ImagePath.setBundlePath("src/main/resources");
		
		try{
				s.doubleClick("runthis.png");
				s.wait((double) 11.0);
				s.doubleClick("minecraft.png");
				s.wait((double) 5.0);
				
				s.wait((double) 3.0);
				s.click("type name here.png");
				s.wait((double) 3.0);
				s.type("filip");
				s.click("play2.png");
				s.wait((double) 4.0);
				s.click("play1.png");
				s.wait((double) 3.0);
				s.click("multiplayer.png");
				s.wait((double) 3.0);
				s.click("direct connect.png");
				s.wait((double) 3.0);
				s.click("type here");
				s.wait((double) 3.0);
				s.type("127.0.0.1");
				s.wait((double) 3.0);
				s.click("join server.png");
				s.wait((double) 4.0);
			
				
				}catch(FindFailed e){
					e.printStackTrace();
		
				}
	}
		
		@Test
		public void sikuliTest() throws FindFailed{
			Screen s = new Screen();
			ImagePath.setBundlePath("src/main/resources");
			
		s.type(Key.ESC);
		s.wait((double) 3.0);
		s.click("back to game.png");
		s.wait((double) 2.0);
		s.type("/time set 3500");
		s.wait((double) 2.0);
		s.type(Key.ENTER);
		s.type("t");
		s.wait((double) 2.0);
		s.type("/gamemode 1");
		s.wait((double) 2.0);
		
		s.wait((double) 2.0);
		s.paste("/game");
		//s.type("setwarp king1");
		assertTrue("", s.exists("sucess.png").getImage() != null);
		}
}

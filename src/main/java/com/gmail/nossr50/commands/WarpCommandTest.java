package com.gmail.nossr50.commands;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;

public class WarpCommandTest {

	
	
	@Before
	public void beforeFirstTest(){
		Screen s = new Screen();
		ImagePath.setBundlePath("src/main/resources");
		
		try{
				s.doubleClick("run.png");
				s.wait((double) 8.0);
				s.doubleClick("minecraft.png");
				s.wait((double) 5.0);
				s.type("nking52");
				s.click("play2.png");
				s.wait((double) 2.0);
				s.click("play1.png");
				s.wait((double) 3.0);
				s.click("multiplayer.png");
				s.wait((double) 2.0);
				s.doubleClick("server.png");
				s.wait((double) 4.0);
			
		}catch(FindFailed e){
			e.printStackTrace();
		}
		

	}
	
	@Test
	public void sikuliTest() throws FindFailed{
		Screen s = new Screen();
		ImagePath.setBundlePath("src/main/resources");
		
	s.type("t");
	s.wait((double) 2.0);
	s.paste("/setwarp king");
	//s.type("setwarp king1");
	assertTrue("", s.exists("sucess.png").getImage() != null);
	}

}

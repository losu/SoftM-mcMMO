package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class GiefProtectionTest {
	public static java.lang.String keyboardUS;

	@Before
	public void beforeFirstTest() {
		Screen s = new Screen();
		ImagePath.setBundlePath("src/main/resources");

		try {
			s.wait((double) 2.0);
			s.doubleClick("hej.png");
			s.wait((double) 20.0);
			s.find("minecraft.png");
			s.wait((double) 1.0);
			s.doubleClick("minecraft.png");
			s.wait((double) 30.0);
			s.type("alzildan");
			s.click("play2.png");
			s.wait((double) 4.0);
			s.click("play1.png");
			s.wait((double) 15.0);
			s.click("multiplayer.png");
			s.wait((double) 5.0);
			s.click("direct connect.png");
			s.wait((double) 3.0);
			s.type("127.0.0.1");
			s.wait((double) 3.0);
			s.click("join server.png");
			s.wait((double) 4.0);

		} catch (FindFailed e) {
			e.printStackTrace();

			s.wait((double) 7.0);
		}
	}

	@Test
	public void sikuliTest() throws FindFailed {
		Screen s = new Screen();
		ImagePath.setBundlePath("src/main/resources");
		s.wait((double) 8.0);
		s.type("e");
		s.wait((double) 1.0);
		s.find("WoodPickAxeI.png");
		s.wait((double) 1.0);
		s.click("WoodPickAxeH.png");
		s.wait((double) 1.0);
		s.find("EmptyI");
		s.wait((double) 1.0);
		s.click("EmptyI2");
		s.wait((double) 1.0);
		s.type("e");
		s.wait((double) 1.0);
		s.type("o");
		s.wait((double) 1.0);
		s.type("o");
		s.wait((double) 1.0);
		s.type("p");
		s.wait((double) 0.5);
		s.type("p");
		s.wait((double) 0.5);
		s.type("p");
		s.wait((double) 2.0);

		assertTrue("",s.exists("That block is protected.png").getImage() != null);

	}

}

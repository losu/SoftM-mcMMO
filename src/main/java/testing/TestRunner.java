package testing;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;


public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		      org.junit.runner.Result result = JUnitCore.runClasses(TestQuestManager.class);
		      for (Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
		      System.out.println(result.wasSuccessful());
		   
	}

}

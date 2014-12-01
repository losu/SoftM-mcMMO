package testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class figus12Runner {
	public static void main(String[]args ) {
	    org.junit.runner.Result result = JUnitCore.runClasses(figus12.class);
	    for (Failure failure : result.getFailures()) {
	       System.out.println(failure.toString());
	    }
	    System.out.println(result.wasSuccessful());
	}

}

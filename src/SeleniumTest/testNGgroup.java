package SeleniumTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class testNGgroup {

	@Test(groups = { "smoketest", "regressiontest","testexecutiontest"})
	public void xmlTestMethod1() {
		System.out.println("login");
		
	}

	@Test(groups = { "smoketest","testexecutiontest"})
	public void xmlTestMethod2() {
		System.out.println("Smoke");
	}

	@Test(groups = {"regressiontest","testexecutiontest"})
	public void xmlTestMethod3() {
		System.out.println("regression");
	}

	@Test(groups = {"testexecutiontest"})
	public void xmlTestMethod4() {
		System.out.println("test execution");
	}
	
	@Test(groups = { "test"},dependsOnGroups = "smoketest")
	public void testdepends() {
		System.out.println("test");
		
	}
}

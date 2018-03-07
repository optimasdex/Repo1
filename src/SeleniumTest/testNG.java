package SeleniumTest;

import org.testng.annotations.Test;

public class testNG {

	@Test(expectedExceptions = ArithmeticException.class) 
	public void test2() {

		int i = 1 / 0;
	}

}
package SeleniumTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	@DataProvider(name = "test1")
	public Object[][] createData1() {
		return new Object[][] { { "User1", "password1" }, { "User2", "password2" }, };
	}

	@Test(dataProvider = "test1")
	public void verifyData1(String n1, String n2) {
		System.out.println(n1 + " " + n2);
	}

}

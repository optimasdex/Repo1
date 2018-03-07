package SeleniumTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class properties {

	@Test
	public void properties() throws Exception {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\Environment.properties");
		// FileInputStream fs = new
		// FileInputStream(System.getProperty("C:\\Users\\berag\\eclipse-workspace\\SeleniumJavaProject\\src\\Environment.properties"));
		prop.load(fs);

		System.out.println(prop.getProperty("ChromeDriverPath"));
		System.out.println(prop.getProperty("FFDriverPath"));
	}

}

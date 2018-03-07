package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCloseBrowser {

	WebDriver driver;
	String path;

	@BeforeTest	
	public void OpenBrowser() {

		
		 path ="C:\\Users\\berag\\Desktop\\Selenium3.8\\RPS\\Driver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path); 
		 driver = new ChromeDriver();
		 
		 /*
		path = "C:\\Users\\berag\\Desktop\\Selenium3.8\\RPS\\Driver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		*/

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.get("http://www.google.com");
		


	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}

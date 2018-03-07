package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GooglePage extends OpenCloseBrowser {

	@Test(enabled = false)
	public void CounAndPrint() {

		driver.get("http://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
				
		System.out.println("Total sugession count: - "+list.size());

		for (int i = 1; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}

	}	
	
	// Performing MouseMove Operation
		@Test(enabled = false)
		public void MouseMove() throws Exception {

			driver.get("http://toolsqa.com/selenium-tutorial/");
			System.out.println("Title of the Page: = " + driver.getCurrentUrl());
			Thread.sleep(2000);

			WebElement elem = driver.findElement(By.xpath("//*[@id=\"presscore-custom-menu-2-13\"]/ul/li[6]/a/span"));

			Actions act = new Actions(driver);
			act.moveToElement(elem).build().perform();
						
			driver.findElement(By.xpath("//*[@id=\"presscore-custom-menu-2-13\"]/ul/li[6]/a/span")).click();

			driver.findElement(By.xpath("//*[@id=\"presscore-custom-menu-2-13\"]/ul/li[6]/ul/li[1]/a/span")).click();
			Thread.sleep(2000);
			System.out.println("Title of the Page: = " + driver.getCurrentUrl());			
			
		}
		
		@Test
		public void countTotalLinks() {
			
			driver.get("http://www.google.com/");
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println("Total links count: - "+links.size());
			
			
			for(int i=1;i<links.size();i++) {							
				System.out.println(links.get(i).getText());
			}
			
		}

}

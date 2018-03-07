package SeleniumTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {

	@Test
	public void assertTest() {
				
		System.out.println("Verify Page is up and Running");
		String pagetitle = "pagetitle"; // driver.gettitle();

		assertEquals("pagetitle", pagetitle);

		System.out.println("Login using Username and Password");
		String homepage = "homepage"; // driver.gettitle();

		assertEquals("homepage", homepage);

		SoftAssert asert = new SoftAssert();

		System.out.println("Verify company Logo is present");
		asert.assertEquals(true, true); 
		
		System.out.println("Verify 7 menu items present in left side");
		asert.assertEquals(true, true);	
		
		System.out.println("Verify SIGN-OFF link is working fine");
		asert.assertEquals(true, false, "Signoff link is not working");
		
		System.out.println("Verify ITINERARY link is working fine");
		asert.assertEquals(true, false, "ITINERARY link is NOT working");
		
		System.out.println("Verify PROFILE link is working fine");
		asert.assertEquals(true, false, "PROFILE link is NOT working");
		
		System.out.println("Verify SUPPORT link is working fine");
		asert.assertEquals(true, true);
		
		System.out.println("Verify CONTACT link is working fine");
		asert.assertEquals(true, false, "CONTACT link is working fine");
		
		asert.assertAll();

	}

}

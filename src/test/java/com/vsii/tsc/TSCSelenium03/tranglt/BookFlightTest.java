package com.vsii.tsc.TSCSelenium03.tranglt;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class BookFlightTest {
	TestBase testbase=new TestBase();

	@Test
	public void bookSucc() throws Exception {
		TestBase.flightFinder();
		TestBase.driver.findElement(By.name("reserveFlights")).click();
		TestBase.driver.findElement(By.name("passFirst0")).clear();
		TestBase.driver.findElement(By.name("passFirst0")).sendKeys("trang");
		TestBase.driver.findElement(By.name("passLast0")).clear();
		TestBase.driver.findElement(By.name("passLast0")).sendKeys("Le");
		TestBase.driver.findElement(By.name("creditnumber")).clear();
		TestBase.driver.findElement(By.name("creditnumber")).sendKeys("12345");
		TestBase.driver.findElement(By.name("buyFlights")).click();
		TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TestBase.driver.findElement(By.xpath(".//*[contains(font,'itinerary has been booked!')]"));
		Assert.assertEquals(TestBase.driver.findElement(By.xpath(".//*[contains(font,'itinerary has been booked!')]")).getText(), "Your itinerary has been booked!\n\n"
		
				+"Please print a copy of this screen for your records. Thank you for choosing Mercury Tours.");
	}
	
//	@Test
//	public void verifyPass() throws Exception {
//		TestBase.flightFinder();
//		TestBase.driver.findElement(By.name("reserveFlights")).click();
//		Assert.assertTrue(existsElement("passLast"+TestBase.getNumberPass()));
//		TestBase.driver.quit();
//	}
	
	
	private boolean existsElement(String name) {
	    try {
	    	testbase.driver.findElement(By.name(name));
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}

}

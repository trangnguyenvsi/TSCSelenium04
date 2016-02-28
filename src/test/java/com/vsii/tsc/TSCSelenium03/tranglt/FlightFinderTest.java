package com.vsii.tsc.TSCSelenium03.tranglt;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FlightFinderTest {
	TestBase testbase=new TestBase();
	
	@Test
	public void find() {
		testbase.flightFinder();
		testbase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		testbase.driver.findElement(By.xpath(".//*[contains(text(), 'Select your departure')]"));
		Assert.assertEquals(testbase.driver.findElement(By.xpath(".//*[contains(text(), 'Select your departure')]")).getText(),
				"Select your departure and return flight from the selections below. Your total price will be higher than quoted if you elect to fly on a different airline for both legs of your travel.");
	}
}

package com.vsii.tsc.TSCSelenium03.tranglt;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;


public class LoginTest{

	@Test(dataProvider="getData",dataProviderClass=TestBase.class)
	public void loginFail(String username, String password) throws Exception {
		TestBase.login(username, password);
		TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TestBase.driver.findElement(By.xpath(".//*[contains(font,'Enter your user information to access')]"));
		Assert.assertEquals(TestBase.driver.findElement(By.xpath(".//*[contains(font,'Enter your user information to access')]")).getText(), "Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.");
	}

	@Test
	public void loginSucc() throws Exception {
		TestBase.login("trang123", "123");
		TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TestBase.driver.findElement(By.xpath(".//*[contains(font,'Use our Flight Finder')]"));
		Assert.assertEquals(TestBase.driver.findElement(By.xpath(".//*[contains(font,'Use our Flight Finder')]")).getText(), "Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city.");
	}
	


}

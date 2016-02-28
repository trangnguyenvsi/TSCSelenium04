package com.vsii.tsc.TSCSelenium03.tranglt;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class RegisterTest
{
	TestBase testbase=new TestBase();
	  @Test
	  public void testregisSucc(){
		  testbase.driver.get( testbase.urlBase + "/");
		  testbase.driver.findElement(By.linkText("REGISTER")).click();
		  testbase.driver.findElement(By.name("firstName")).clear();
		  testbase.driver.findElement(By.name("firstName")).sendKeys("Trang");
		  testbase.driver.findElement(By.name("lastName")).clear();
		  testbase.driver.findElement(By.name("lastName")).sendKeys("Le");
		  testbase.driver.findElement(By.name("phone")).clear();
		  testbase.driver.findElement(By.name("phone")).sendKeys("123456");
		  testbase.driver.findElement(By.id("userName")).clear();
		  testbase.driver.findElement(By.id("userName")).sendKeys("trang@gmail.com");
		  testbase.driver.findElement(By.name("address1")).clear();
		  testbase.driver.findElement(By.name("address1")).sendKeys("1234");
		  testbase.driver.findElement(By.name("address2")).clear();
		  testbase.driver.findElement(By.name("address2")).sendKeys("567");
		  testbase.driver.findElement(By.name("city")).clear();
		  testbase.driver.findElement(By.name("city")).sendKeys("Ha Noi");
	    new Select( testbase.driver.findElement(By.name("country"))).selectByVisibleText("VIETNAM");
	    testbase.driver.findElement(By.id("email")).clear();
	    testbase.driver.findElement(By.id("email")).sendKeys("trang123");
	    testbase.driver.findElement(By.name("password")).clear();
	    testbase.driver.findElement(By.name("password")).sendKeys("123");
	    testbase.driver.findElement(By.name("confirmPassword")).clear();
	    testbase.driver.findElement(By.name("confirmPassword")).sendKeys("123");
	    testbase.driver.findElement(By.name("register")).click();
	    testbase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println(testbase.driver.findElement(By.xpath(".//*[contains(font,'Thank you for registering')]")).getText());
	  }
	 
}

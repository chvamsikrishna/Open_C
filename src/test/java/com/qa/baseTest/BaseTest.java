package com.qa.baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.Pages.QaFox_Page;

import co.qa.driverFactory.Driver_info;

public class BaseTest {
	
	 /* Rules: 
     *    Should hold driver created by driverFactory
     *    Maintain page specific object. 
     *    Before Method and After Method
     */
	
	WebDriver driver;
	Driver_info dinfo;
	protected QaFox_Page page;
	 
   @BeforeClass
   public void setUp()
   {
	   dinfo = new Driver_info();
	  driver = dinfo.browser_info("edge");
	  page = new QaFox_Page(driver);
   }
   
   @AfterClass
   public void tearDown()
   {
	   driver.quit();
   }
   
	
	
	
	
	
	

}

package co.qa.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver_info {
	
	public WebDriver driver;
	
	public WebDriver browser_info(String browser)
	{
	switch(browser.toLowerCase())
	{
	case "chrome":
		   driver = new ChromeDriver();
		   break;
	case "edge":
		   driver = new EdgeDriver();
		   break;	
	}
	
	driver.get("http://omayo.blogspot.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	return driver;
	}
}

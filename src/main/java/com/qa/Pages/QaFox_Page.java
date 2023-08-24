package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


// should have private by locators

public class QaFox_Page {

	
	private WebDriver driver;
	private By dropdownEle = By.cssSelector("#drop1");
	
	public QaFox_Page(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public List<WebElement> dropDown_List()
	{
		WebElement Drop = driver.findElement(dropdownEle);
		Select se = new Select(Drop);
        List<WebElement> options= se.getOptions();	
		return options;
		
	}

}

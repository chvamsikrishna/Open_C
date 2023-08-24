package com.qa.pageTest;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Pages.QaFox_Page;
import com.qa.baseTest.BaseTest;

public class QaFox_PageTest extends BaseTest{
	
	
	
	@Test(priority=1)
	public void getTitleTest()
	{
	     
	   String title= page.getTitle();
	   Assert.assertEquals(title,"omayo (QAFox.com)" );
	}
	
	@Test(priority=2)
	public void dropDownOptionsTest()
	{
		int dropdown_Op = page.dropDown_List().size();
		 Assert.assertEquals(dropdown_Op,5);
				
	}
}

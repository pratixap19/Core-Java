package com.OrangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.pages.HomePage;

public class HomePageTest extends BaseClass{
	
	HomePage homePage;
	@Test(priority = 3)
	public void adminTabTest() throws InterruptedException {
		
		homePage=loginPage.login();
		homePage.clickOnAdminTab();
		Thread.sleep(2000);
		String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}

}

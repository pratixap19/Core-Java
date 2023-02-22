package com.OrangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.pages.HomePage;

public class LoginPageTest extends BaseClass {
	
	HomePage homePage;
	@Test(priority = 1)
	public void verifyLogo() {
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority = 2)
	public void logintest() {
		homePage = loginPage.login();
		String expectedURL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		String actualURL=driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
	}

}

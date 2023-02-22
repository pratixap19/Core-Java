package com.test.selenium;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.framework.util.BaseTest;
import com.ui.pages.LoginPage;

public class Login extends BaseTest {

	@Test
	public void testVerifyFailed() {
		LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);

		loginPage.loginInApp(super.userName, "##########");
		super.reportLog("login into application with user name " + super.userName);

		loginPage.verifyLoginFailed();
		super.reportLog("Verify user " + super.userName + " not login successfully");

	}

}

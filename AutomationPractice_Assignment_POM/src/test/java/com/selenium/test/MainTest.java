package com.selenium.test;
import org.testng.annotations.Test;

import com.selenium.BaseTest;
import com.selenium.pages.ContactUs;
import com.selenium.pages.MyAccount;
import com.selenium.pages.SignIn;

public class MainTest extends BaseTest {
	
	@Test
	public void testLogin() {
	
	SignIn obj1 = new SignIn(driver);
	obj1.signIn();
	obj1.login();
	
	MyAccount obj2 = new MyAccount(driver);
	obj2.contactUS();
	obj2.verifyMyAccount();
	
	ContactUs obj3 = new ContactUs(driver);
	obj3.selectdropdownOption();
	obj3.Email();
	obj3.Message();
	obj3.Send();
	obj3.verifyMessage();
}
}

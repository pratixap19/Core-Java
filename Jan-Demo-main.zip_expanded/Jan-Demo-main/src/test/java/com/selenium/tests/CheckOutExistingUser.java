package com.selenium.tests;

import java.awt.AWTException;
import org.testng.annotations.Test;

import com.selenium.BaseTest;
import com.selenium.pages.CartPage;
import com.selenium.pages.HomePage;
import com.selenium.pages.ProductDetailsPage;
import com.selenium.pages.SignInPage;

public class CheckOutExistingUser extends BaseTest {
	
	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Test
	public void testCheckOutExistingUser() throws InterruptedException, AWTException {
		HomePage homePage = new HomePage(driver);
		homePage.search(product);
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.verifyProduct(product);
		productDetailsPage.clickAddCart();		
		productDetailsPage.verifyAndClickViewCheckOut(product);
		
		CartPage cartPage =  new CartPage(driver);
		cartPage.verifyProductTitle(product);
		cartPage.clickCheckOutButton();
		
		SignInPage signPage = new SignInPage(driver);		
		signPage.login("QA@gmail.com", "QA");	
	}
	
	
}

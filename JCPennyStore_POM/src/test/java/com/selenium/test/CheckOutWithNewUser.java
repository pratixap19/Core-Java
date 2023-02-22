package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selenium.BaseTest;
import com.selenium.pages.CartPage;
import com.selenium.pages.HomePage;
import com.selenium.pages.ProductDetailsPage;
import com.selenium.pages.SignInPage;

public class CheckOutWithNewUser extends BaseTest {

	String product = "Sharper Image Wireless QI Charging Speaker Dock";
    @Test
	public void testCheckOutWithNewUser(String product) {

		HomePage homepage = new HomePage(driver);
		homepage.search(product);

		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.verifyProduct(product);
		productDetailsPage.verifyAndClickViewCheckOut(product);

		CartPage cartPage = new CartPage(driver);
		cartPage.verifyProductTitle(product);
		cartPage.clickCheckOutButton();
		
		SignInPage signPage = new SignInPage(driver);
		signPage.clickOnCreateAccount();
		signPage.createAccount();
	}

}

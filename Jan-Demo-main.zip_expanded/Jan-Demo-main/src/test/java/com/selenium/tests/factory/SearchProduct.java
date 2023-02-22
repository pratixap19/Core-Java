package com.selenium.tests.factory;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.selenium.BaseTest;
import com.selenium.pages.CartPage;
import com.selenium.pages.ProductDetailsPage;
import com.selenium.pages.SignInPage;

public class SearchProduct extends BaseTest {
	
	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Test(priority = 1)
	public void testSearch() throws InterruptedException, AWTException, IOException {		
		ProductDetailsPage productDetailsPage = homePage.search(product);
		
		//ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);
		productDetailsPage.verifyProduct(product);
		takeScreenshot("search.png");
	}
	
	@Test(priority = 2)
	public void testCheckOutWIthNewUser() throws IOException {		
		ProductDetailsPage productDetailsPage = homePage.search(product);
		
		//ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.verifyProduct(product);
		productDetailsPage.clickAddCart();
		productDetailsPage.verifyAndClickViewCheckOut(product);
		takeScreenshot("search1.png");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(100, 100)");
		
		CartPage cartPage = new CartPage(driver);
		cartPage.verifyProductTitle(product);
		cartPage.clickCheckOutButton();
		
		SignInPage signInPage = new SignInPage(driver);
		signInPage.clickOnCreateAccount();
		signInPage.creatAccount();
		takeScreenshot("search2.png");
	}
	
	
}

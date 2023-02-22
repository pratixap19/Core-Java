package com.selenium.tests;

import java.awt.AWTException;
import org.testng.annotations.Test;

import com.selenium.BaseTest;
import com.selenium.pages.HomePage;
import com.selenium.pages.ProductDetailsPage;

public class SearchProduct extends BaseTest {
	
	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Test
	public void testSearch() throws InterruptedException, AWTException {
		
		HomePage homePage = new HomePage(driver);
		homePage.search(product);
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.verifyProduct(product);
	}
	
	
}

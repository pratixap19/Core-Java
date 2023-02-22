package com.selenium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	WebDriver driver;

	String productlocator = "[data-automation-id='at-product-title-link'] > span";
	
	public CartPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void verifyProductTitle(String product) {
		String productTitle = driver.findElement(By.cssSelector(productlocator)).getText();
		Assert.assertEquals(productTitle, product);
	}
	
	public void clickCheckOutButton() {
		driver.findElement(By.cssSelector("[id='checkoutButton']")).click();		
	}

}

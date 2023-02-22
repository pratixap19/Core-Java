package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductDetailsPage {
WebDriver driver;
	
	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyProduct(String product) {
		
		String productTitle = driver.findElement(By.cssSelector("h1[id='productTitle-false']")).getText();
		Assert.assertEquals(productTitle,product );
	}
	
	public void clickAddToCart() {
		driver.findElement(By.cssSelector("[data-automation-id='addToCart']")).click();
	}
public void verifyAndClickViewCheckOut(String product) {
	String viewCartChkText = driver.findElement(By.xpath("//span[text()='Sharper Image Wireless QI Charging Speaker Dock']")).getText();
	Assert.assertEquals(viewCartChkText,product );
	
	//View Cart & Checkout button
	driver.findElement(By.xpath("//button[@data-automation-id=\"at-panel-checkout-button\"]")).click();
}
}

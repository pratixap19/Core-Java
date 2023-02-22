package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyProductTitle(String product) {
		String cartText = driver.findElement(By.xpath("//span[text()='Sharper Image Wireless QI Charging Speaker Dock']")).getText();
		
		Assert.assertEquals(cartText,product );
	}

	public void clickCheckOutButton() {
		driver.findElement(By.xpath("//span[text()='Checkout']")).click();
		
	}
}

package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {

WebDriver driver;
	
	public ShippingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillGuestDetails(String userName, String lastName, String companyName, String zipcode) {
		driver.findElement(By.id("firstName")).sendKeys("userName");
		driver.findElement(By.id("lastName")).sendKeys("lastName");
		driver.findElement(By.id("company")).sendKeys("companyName");
		driver.findElement(By.id("zip")).sendKeys("zipcode");
	}
	
}

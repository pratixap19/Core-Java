package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void search(String product) {
		driver.findElement(By.xpath("//input[@id='searchInputId']")).sendKeys(product);
		driver.findElement(By.xpath("//button[@data-automation-id='searchIconBlock']")).click();
	}

}

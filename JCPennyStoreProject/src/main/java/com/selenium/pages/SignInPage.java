package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnGuestButton() {
		driver.findElement(By.xpath("(//*[@data-automation-id='at-continue-as-guest'])[2]")).click();
	}
	
	public void login(String userName,String password) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("cartSignInPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	public void clickOnCreateAccount() {
		driver.findElement(By.cssSelector("[data-automation-id='at-create-account-button']")).click();
		
	}
	
	public void createAccount() {
		
	}

}

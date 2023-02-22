package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccount {

	WebDriver driver;

	By ContactUsLink = By.linkText("Contact us");
	By MyAccount = By.className("info-account");
	
	public MyAccount(WebDriver driver) {
		this.driver = driver;
	}

	public void contactUS() {
		driver.findElement(ContactUsLink).click();
	}
	
	public String verifyMyAccount() {
		String text2 = driver.findElement(MyAccount).getText();
		System.out.println(text2);
		Assert.assertEquals(text2, "MY ACCOUNT");
		return text2;
	}
}

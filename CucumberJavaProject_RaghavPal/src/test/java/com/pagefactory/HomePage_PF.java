package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	@FindBy(id = "logout")
	public WebElement btn_logout;

	public void checkLogoutsisDisplayed() {
		btn_logout.isDisplayed();
	}

	WebDriver driver;

	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// LoginPage_PF.class
	}

}

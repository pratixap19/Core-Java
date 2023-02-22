package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(name="txtPassword")
	WebElement pswd;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//div[id='divLogo']/img")
	WebElement logo;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateLogo() {
		logo.isDisplayed();
		return true;
		
	}
	
	public HomePage login() {
		userName.sendKeys("admin");
		pswd.sendKeys("admin123");
		loginbtn.click();
		return new HomePage(driver);
	}

}

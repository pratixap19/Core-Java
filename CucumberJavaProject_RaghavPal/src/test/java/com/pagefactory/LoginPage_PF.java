package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id = "name")
	public WebElement txt_username;
	
	@FindBy(id = "password")
	public WebElement txt_password;
	
	@FindBy(id = "login")
	public WebElement btn_login;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//LoginPage_PF.class
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	public void clickOnloginButton() {
		btn_login.click();
	}
	
	

}

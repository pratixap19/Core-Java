package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Guru99.base.BaseClass;

public class Guru99LoginPageObject extends BaseClass {
	WebDriver driver;
	//constructor is created to initialize the WebElements initElements method.
	public Guru99LoginPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//instead of this we can write Guru99LoginPageObject.class
	}
	
	@FindBy(name = "uid")
	public WebElement txtuserID;
	
	@FindBy(name = "password")
	public WebElement txtpwd;
	
	@FindBy(name = "btnLogin")
	public WebElement btnLogin;
	
	@FindBy(name = "btnReset")
	public WebElement btnReset;
	
	public void setUserID(String userID) {
		
		txtuserID.sendKeys(userID);
	}
	
	public void setPwd(String pwd) {
		txtpwd.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		btnLogin.click();
	}

}

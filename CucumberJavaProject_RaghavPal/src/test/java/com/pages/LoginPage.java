package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	By txt_username = By.id("name");
	By txt_pwd = By.id("password");
	By btn_login =By.id("login");
	By btn_logout = By.id("logout");
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
				
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_pwd).sendKeys(password);
		
	}
	public void clickLogin() {
		driver.findElement(btn_login ).click();
	}
	
	
	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_pwd).sendKeys(password);
		driver.findElement(btn_login ).click();
		
	}

}

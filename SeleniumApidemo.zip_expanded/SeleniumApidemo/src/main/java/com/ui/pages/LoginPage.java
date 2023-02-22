package com.ui.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.util.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);		
	}
	
	@FindBy(id="userName")
	private WebElement userInput;
	
	@FindBy(id="password")
	private WebElement passwordInput;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	@FindBy(css="[id='output'] > div > p")
	private WebElement ErrorMessage;
	
	/**
	 * Login into application
	 * @param userName
	 * @param password
	 */
	public ProfilePage loginInApp(String userName, String password) {
		inputText(userInput, userName);
		inputText(passwordInput, password);
		clickOn(loginButton);
		return PageFactory.initElements(driver, ProfilePage.class);
	}
	
	public LoginPage verifyLoginFailed() {
		String message = getText(ErrorMessage);
		Assert.assertEquals(message, "Invalid username or password!");
		return PageFactory.initElements(driver, LoginPage.class);
	}
}

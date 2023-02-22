package com.selenium.pages.GCReddy;
//followed G C Reddy tutorial for POM
//Object Repository for LoginPage to store elements of LoginPage

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver webdriver_driver;// webdriver
	// create elements using element locators
	By SignInLink = By.className("login");
	By User = By.id("email");
	By Password = By.id("passwd");
	By SignInButton = By.name("SubmitLogin");

	// A constructor in Java is a block of code similar to method
	// that is called an instance of class is created
	// "this" keyword is invoke an instance current class constructor
	// We can invoke the constructor from another class by creating the object
	// we can invoke this class using this constructor from another class by
	// creating object in that class
	//Why we use constructor in POM? We need to maintain same driver instance across all the pages/java classes
	
	

	public LoginPage(WebDriver webdriverparameter) {
		// parameter driver
		this.webdriver_driver = webdriverparameter;
	}
	
	//Create user actions means customizes commands
	
	public void clickSignInLink() {
		webdriver_driver.findElement(SignInLink).click();
	}
	
	public void typeUsername(String Uname) {
		//Uname is a parameter. For parameter no ""
		webdriver_driver.findElement(User).sendKeys(Uname);
	}
	
	public void typePwd(String Pwd) {
		webdriver_driver.findElement(Password).sendKeys(Pwd);
	}
	
	public void clickSignInButton() {
		webdriver_driver.findElement(SignInButton).click();
	}

}

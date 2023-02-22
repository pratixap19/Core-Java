package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.BaseTest;

public class SignIn {
	
	WebDriver driver;
	
	By signInLink = By.xpath("//a[@class='login']");
	By email = By.xpath("//input[@id='email']");
	By pwd = By.xpath("//input[@id='passwd']");
	By signInBtn = By.xpath("//button[@id='SubmitLogin']");
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signIn() {
		driver.findElement(signInLink).click();
	}
	
	public void login() {
		driver.findElement(email).sendKeys("tester10@gmail.com");
		driver.findElement(pwd).sendKeys("zxcvbn");
		driver.findElement(signInBtn).click();
	
	}
	
	

}

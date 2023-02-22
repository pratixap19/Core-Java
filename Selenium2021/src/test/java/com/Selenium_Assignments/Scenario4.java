/*
1. Navigate url http://book.theautomatedtester.co.uk/ 
2.    Chick on Chapter2
3.    Verify “Verify this button here” button
4.    Verify button “chocolate”
5.    Verify Text “This element has a ID that changes every time the page is loaded”
 */

package com.Selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario4 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.navigate().to("http://book.theautomatedtester.co.uk/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void chapter2() {
		//Chick on Chapter2
		driver.findElement(By.linkText("Chapter2")).click();
		
		//Verify “Verify this button here” button
		WebElement button = driver.findElement(By.name("verifybutton"));
		
		boolean isDisplayed = button.isDisplayed();
		
		boolean isEnabled = button.isEnabled();
		
		if(isDisplayed) {
			System.out.println("Button is displayed");
		}
		else {
			System.out.println("Button is not displayed");
		}
		
		if(isEnabled) {
			
			System.out.println("Button is enabled");
			
		}
		else {
			System.out.println("Button is not enabled");
		}
		
		//Verify button “chocolate”
		WebElement ChocolateButton = driver.findElement(By.xpath("//input[@name='verifybutton1']"));
		
		Boolean isDisplayed1 = ChocolateButton.isDisplayed();
		Boolean isEnabled1 = ChocolateButton.isEnabled();
		
		if(isDisplayed1) {
			System.out.println("Chocolate button is displayed");
			
		}
		else {
			System.out.println("Chocolate button is not displayed");
		}
		
		if(isEnabled1) {
			System.out.println("Chocolate button is enabled");
		}
		else {
			System.out.println("Chocolate button is not enabled");
		}
		//Verify Text “This element has a ID that changes every time the page is loaded”
		WebElement msg = driver.findElement(By.xpath("//div[text()='This element has a ID that changes every time the page is loaded']"));
		
		String text1 = msg.getText();
		
		System.out.println(text1);
		
		Assert.assertEquals(text1, "This element has a ID that changes every time the page is loaded");
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
	
		//driver.quit();
	}


}

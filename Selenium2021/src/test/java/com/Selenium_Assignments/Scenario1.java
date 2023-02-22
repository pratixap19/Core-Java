/*1. Open url http://automationpractice.com/
 2. Click on sign in from top menu
 3. Enter user name and password
 4. click on sign in button
 5. Verify user login successfully
*/

package com.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		
		driver.manage().window().maximize();
	}
	@Test
	public void login() {
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tester10@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("zxcvbn");
		
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		WebElement myAccount = driver.findElement(By.xpath("//div[@id='center_column']/p"));
		
		String text = myAccount.getText();
		
		System.out.println(text);
		
		Assert.assertEquals(text, "MY ACCOUNT");
		
	}
	
	@AfterMethod
	public void teardown() {
	
		//driver.quit();
	}
	
	

}

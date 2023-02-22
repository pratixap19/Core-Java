package com.QAGuru99Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookReg {

	WebDriver driver;// instance variable

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriverManager.edgedriver().setup();

		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new InternetExplorerDriver();
		//driver = new EdgeDriver();

		driver.navigate().to("https://www.facebook.com/");

		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

	@Test
	public void testFacebook() {
		
		WebElement signUpButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signUpButton.click();
		
		WebElement firstNameElement = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstNameElement.sendKeys("QA");
		
		WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastNameField.sendKeys("Automation");
		
		WebElement mobileEmailField = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		mobileEmailField.sendKeys("system@gmail.com");
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
		passwordField.sendKeys("uss0101");
		
		Select dropdownDay = new Select(driver.findElement(By.id("day")));
		//dropdownDay.selectByVisibleText("6");
		dropdownDay.selectByValue("6");
		
		Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
		selectMonth.selectByVisibleText("Feb");
		
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2021");
		
		WebElement radioButtonGender = driver.findElement(By.name("sex"));
		radioButtonGender.click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("Total number of radio buttons are " + elements.size());
		elements.get(1).click();
		
		WebElement signUpButton1 = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signUpButton1.click();
	}

	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/

}

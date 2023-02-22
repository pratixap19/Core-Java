package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookReg {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.iedriver().setup();
		//driver. = new ChromeDriver();
		driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		//driver = new InternetExplorerDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
	
	@Test
	public void testFacebook() throws InterruptedException {
		
		WebElement sigUpButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		sigUpButton.click();
		
		WebElement firstNameElement = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstNameElement.sendKeys("QA");
		
		WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastNameField.sendKeys("Guru");
		
		WebElement mobileEmailField =  driver.findElement(By.name("reg_email__"));
		mobileEmailField.sendKeys("8634985643");
		
		WebElement passwordField =  driver.findElement(By.id("password_step_input"));
		passwordField.sendKeys("yweyuwteu");
		
		Select select = new Select(driver.findElement(By.id("day")));
		//select.selectByIndex(3);
		select.selectByVisibleText("6");
		//select.selectByValue("3");
		
		Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
		selectMonth.selectByValue("4");
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		radioButton.click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println(elements.size());
		//elements.get(1).click();
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
	
}

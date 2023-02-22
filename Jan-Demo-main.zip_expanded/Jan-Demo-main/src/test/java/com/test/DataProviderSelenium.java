package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderSelenium {

	WebDriver driver;

	@BeforeClass
	public void setup() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.navigate().to("https://en.wikipedia.org");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "TestData")
	public void testCountry(String county, String expectedValue) {
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys(county);
		driver.findElement(By.id("searchButton")).click();
		
		String country = driver.findElement(By.id("firstHeading")).getText();
		Assert.assertEquals(country, expectedValue);
	}
	
	@DataProvider(name = "TestData")
	public Object[][] getData() {		
		return new Object[][] {
			{"India", "India"},
			{"US", "United States"},
			{"UK", "United Kingdom"},
			{"UAE", "United Arab Emirates" }
		};		
	}
}

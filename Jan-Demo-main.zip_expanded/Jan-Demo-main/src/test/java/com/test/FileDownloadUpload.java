package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadUpload {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testActions() throws InterruptedException, AWTException {
		driver.navigate().to("https://demoqa.com/upload-download");
		WebElement source = driver.findElement(By.id("downloadButton"));
		source.click();
		
		WebElement elementButton = driver.findElement(By.id("uploadFile"));
		elementButton.sendKeys("C:\\Users\\user\\eclipse-workspace\\selenium-Jan\\Test.txt");
		
	}

	
}

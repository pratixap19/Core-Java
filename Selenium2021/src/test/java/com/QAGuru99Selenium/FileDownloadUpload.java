package com.QAGuru99Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadUpload {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void fileUploadDownload() {
		WebElement download = driver.findElement(By.id("downloadButton"));
		download.click();
		
		WebElement upload = driver.findElement(By.id("uploadFile"));
		upload.sendKeys("Complete path from your system");
	}

}

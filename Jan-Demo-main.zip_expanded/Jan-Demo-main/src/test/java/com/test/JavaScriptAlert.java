package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		//WebDriverManager.chromedriver().setup();	
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();		
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testFacebook() throws InterruptedException {
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Assert.assertEquals(text, "You clicked a button");
		alert.accept();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());				
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		
		String text1 = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "You selected Cancel");
		
		String value = "QA Test";
		driver.findElement(By.id("promtButton")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys(value);
		promptAlert.accept();
		
		String text12 = driver.findElement(By.id("promptResult")).getText();
		System.out.println(text12);
		Assert.assertEquals(text12, "You entered "+ value);
		
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
}

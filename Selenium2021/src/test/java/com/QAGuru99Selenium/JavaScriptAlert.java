package com.QAGuru99Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
@Test
	public void testDemoqa() {
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Assert.assertEquals(text, "You clicked a button");
		alert.accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		String text1 = alert.getText();
		System.out.println(text1);
		alert.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		
		String value = "QA Tester";
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys(value);
		promptAlert.accept();
		
		
	}
@AfterMethod(alwaysRun = true)
public void tearDown() {
	driver.quit();
}

}

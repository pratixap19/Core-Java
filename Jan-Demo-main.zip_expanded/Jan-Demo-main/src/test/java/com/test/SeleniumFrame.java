package com.test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFrame {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testIFrame() throws InterruptedException, AWTException {
		driver.navigate().to("https://demoqa.com/frames");
				
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		WebElement source = driver.findElement(By.id("sampleHeading"));
		System.out.println(source.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div")).getText();
		System.out.println(text);
	}
}

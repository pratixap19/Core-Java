package com.QAGuru99Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	public void testIframe() {
		
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0); by index
		//driver.switchTo().frame("frame1"); by id
		
		driver.switchTo().frame(driver.findElement(By.id("frame1")));// by WebElement object
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
		
		System.out.println(text.getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		WebElement paragraph = driver.findElement(By.xpath("//div[@id='framesWrapper']/div[1]"));
		
		System.out.println(paragraph.getText());
	}

}

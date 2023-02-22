package com.QAGuru99Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedIframes {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testNestedIFrame() {
		
		driver.get("https://demoqa.com/nestedframes");
		//switch to parent frame
		driver.switchTo().frame("frame1");
		//switch to child frame
	    driver.switchTo().frame(0);
	    String displayText = driver.findElement(By.tagName("p")).getText();
	    System.out.println(displayText);
	    
	    //move to root DOM
	    driver.switchTo().defaultContent();
	    String text = driver.findElement(By.xpath("//div[@class=\"main-header\"]")).getText();
	    System.out.println(text);
		
		
	}

}

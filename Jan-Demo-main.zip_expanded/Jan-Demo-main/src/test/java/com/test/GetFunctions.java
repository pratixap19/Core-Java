package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFunctions {

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
	public void testGetFunctions() throws InterruptedException {
		
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String text = driver.findElement(By.className("main-header")).getText();
		System.out.println(text);
		
		String attributeValue = driver.findElement(By.xpath("//header/a")).getAttribute("href");
		System.out.println(attributeValue);
			
		String str = driver.findElement(By.xpath("//header/a")).getCssValue("font-size");
		System.out.println(str);
		
		String tagName = driver.findElement(By.xpath("//header/a")).getTagName();
		System.out.println(tagName);
	}
}

package com.test;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWindowHandle {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testWindow() throws InterruptedException, AWTException {
		driver.get("https://demoqa.com/browser-windows");		
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		System.out.println(parentWindowId);
		System.out.println(windowId.size());
		Iterator<String> it = windowId.iterator();
	
		while(it.hasNext()) {
			String id = it.next();
			driver.switchTo().window(id);
			
			try {
				driver.findElement(By.id("sampleHeading")).isDisplayed();
				break;
			}catch(Exception ex){ }
			
		}
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.close();
		//driver.switchTo().window(parentWindowId);
		
		
		
	}
}

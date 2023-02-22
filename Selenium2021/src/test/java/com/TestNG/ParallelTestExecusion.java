package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class ParallelTestExecusion {
	
	WebDriver driver;
	@Parameters("myBrowser")
	@BeforeClass
	public void launchBrowser(String myBrowser) {
		if(myBrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(myBrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
@Test
	public void tc_1() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
	}
@Test
	public void tc_2() {
		System.out.println("This is second Test Case");
	}
@Test
	public void tc_3() {
		System.out.println("This is third Test Case");
	}
}

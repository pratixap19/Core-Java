package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void tc_1() {

		System.out.println("This is first test case");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");

	}

	@Test(enabled = false)
	public void tc_2() {
		System.out.println("This is second test case");
	}
	@Test
	public void tc_3() {
		
			System.out.println("This is third test case");
			
		}
	}
	/*
	@BeforeMethod
	public void setup() {
		System.out.println("Launch Browser");
		
	}
	*/
	
	/*
	@AfterMethod
	public void CloseBrowser() {
		System.out.println("Kill the Browser");
		
	}
	*/
	/*
	@BeforeClass
	public void start() {
		System.out.println("Start the Browser");
	}
	*/



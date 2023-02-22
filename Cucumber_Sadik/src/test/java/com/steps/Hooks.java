package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	static WebDriver driver;
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@After
	public void tearDown() {
		
			driver.quit();
	}
	
	@BeforeStep
	public void beforeStep(){
		System.out.println("Before step executed");
	}
	
	@AfterStep
	public void afterStep(){
		System.out.println("After step executed");
	}

}

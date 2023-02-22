package com.TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersExample {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser", "url"})
	public void setup(String browser, String app) {
		
		if(browser.equalsIgnoreCase(anotherString: "chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase(null)(anotherString: "firefox") {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
		}
		driver.get(app);
		
		
		
		
	}

}

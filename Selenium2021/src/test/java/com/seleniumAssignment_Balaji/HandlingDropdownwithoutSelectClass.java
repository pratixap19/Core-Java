package com.seleniumAssignment_Balaji;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownwithoutSelectClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void selectDropdown() throws InterruptedException {
		
		String cityName = "Chennai";
		
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		
		dropdown.click();
		
		Thread.sleep(3000);
		
		List<WebElement> cities = driver.findElements(By.cssSelector(".dropdownDiv ul li a"));
		
		for(WebElement city:cities) {
			
			if(city.getText().contains(cityName)) {
				
				city.click();
				break;
			}
			
		}
		
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		List<WebElement> e = select.getOptions();
		int count = e.size();
		System.out.println(count);
		
		for(int i=0; i<e.size(); i++) {
			System.out.println(e.get(i).getText());
		}
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}

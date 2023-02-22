package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo4_Xpath {

	
		WebDriver driver;
		
		@BeforeMethod
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.navigate().to("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
		}
		@Test
		public void testLocators() {
			
			//relative xpath
			//driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("T-Shirt");
			//driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click();
			
			//relative xpath with 'or' operators
			//driver.findElement(By.xpath("//input[@type='text' and @id='search_query_top']")).sendKeys("T-Shirts");
			//driver.findElement(By.xpath("//button[@name='submit_search' or @type='submit1']")).click();
			
			//xpath with contains()
			//driver.findElement(By.xpath("//input[contains(@id, 'search_query')]")).sendKeys("T-Shirt");
			//driver.findElement(By.xpath("//button[contains(@name, 'search')]")).click();
			
			//xpath with start-with()
			//driver.findElement(By.xpath("//input[starts-with(@name, 'search')]")).sendKeys("T-Shirt");
			//driver.findElement(By.xpath("//button[starts-with(@name, 'submit_')]")).click();
			
			//xpath with Text()
			//driver.findElement(By.xpath("//a[text()='Women']")).sendKeys("T-Shirt");
			
			//chained xpath
            driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("T-Shirt");//or you can 
            //write //form[@id='searchbox']//input[@id='search_query_top']
            driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();//or you can write
            ////form[@id='searchbox']//button
		
		}
		

	

	
}

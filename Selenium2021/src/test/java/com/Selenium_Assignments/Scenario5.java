/*
 1.   Navigate url http://book.theautomatedtester.co.uk/
2.    Click on chapter3
3.    Verify Text pool/ fool/ cool
4.    Verify “Virgo Cancer Capricorn'
 */

package com.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario5 {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://book.theautomatedtester.co.uk/");
		driver.manage().window().maximize();
	}
	@Test
	public void chapter3() {
		driver.findElement(By.linkText("Chapter3")).click();
		WebElement msgFool = driver.findElement(By.xpath("//div[@id='leftdiv']"));
		String fool = msgFool.getText();
		System.out.println(fool);
		
		WebElement msgPool = driver.findElement(By.xpath("//div[@id='leftdiv']"));
		String pool = msgPool.getText();
		System.out.println(pool);
		
		WebElement msgCool = driver.findElement(By.xpath("//div[@class='leftdiv']"));
		String cool = msgCool.getText();
		System.out.println(cool);
		
		 //Verify “Virgo Cancer Capricorn'
		WebElement virgomsg = driver.findElement(By.xpath("//div[@id='divinthecenter']"));
		String caprimsg = virgomsg.getText();
		System.out.println(caprimsg);
	}

}

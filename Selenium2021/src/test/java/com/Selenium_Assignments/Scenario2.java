
/*1. Open url http://automationpractice.com/
 2. Click on Contact us menu option
 3. Select Heading from drop down,
 4. Enter email into email address input box
 5. Enter some text into message box
 6. Verify message send successfully
 */

package com.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario2 {

	WebDriver driver;

	@BeforeClass
	public void setup(){
		
		WebDriverManager.chromedriver().setup();
		
        driver = new ChromeDriver();
        
		driver.navigate().to("http://automationpractice.com/");
		
		driver.manage().window().maximize();
     }

	@Test
	public void contactUs() {

		driver.findElement(By.linkText("Contact us")).click();
		
		WebElement dropdown = driver.findElement(By.id("id_contact"));
		
		Select sec = new Select(dropdown);
		
		sec.selectByVisibleText("Customer service");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tester10@gmail.com");
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Thank you");
		
		driver.findElement(By.xpath("//button[@id='submitMessage']")).click();
		
		WebElement message = driver.findElement(By.xpath("//p[@class='alert alert-success']"));
		
		String text = message.getText();
		
		System.out.println(text);
		
		Assert.assertEquals(text, "Your message has been successfully sent to our team.");
		
	}
	
	
	@AfterMethod
	public void teardown() {
	
		//driver.quit();
	}

	
}

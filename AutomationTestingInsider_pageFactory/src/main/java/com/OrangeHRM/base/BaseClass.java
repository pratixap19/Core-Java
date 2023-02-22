/**
 * 
 */
package com.OrangeHRM.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.OrangeHRM.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author prati
 *
 */

//Followed Automation Testing insider
//Page chaining model
public class BaseClass {
	
	public WebDriver driver;
	public LoginPage loginPage;
	
    @BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		loginPage = new LoginPage(driver);

	}
    
    @AfterMethod
	public void tearDown() {
		driver.close();

	}

}

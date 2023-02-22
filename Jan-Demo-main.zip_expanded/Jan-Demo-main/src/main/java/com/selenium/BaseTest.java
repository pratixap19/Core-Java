package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.test.pages.factory.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;
	protected HomePage homePage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setup(@Optional("chrome") String browserType) throws IOException {		
		
		if(browserType.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserType.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Conf.getConfig("Url"));
		
		//object initilazation
		 homePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	public void takeScreenshot(String image) throws IOException {
		TakesScreenshot takeScreen = (TakesScreenshot) driver;		
		File screenshot = takeScreen.getScreenshotAs(OutputType.FILE);		
		File screen = new File(image);
		FileUtils.copyFile(screenshot, screen);
		
	}
}

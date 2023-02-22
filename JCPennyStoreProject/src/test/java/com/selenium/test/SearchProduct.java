package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.BaseTest;
import com.selenium.pages.HomePage;
import com.selenium.pages.ProductDetailsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProduct extends BaseTest{

	
	String product = "Sharper Image Wireless QI Charging Speaker Dock";

	@Test
	public void testSearchBox() {
		
		HomePage homepage = new HomePage(driver);
		homepage.search(product);
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.verifyProduct(product);	
		
		productDetailsPage.clickAddToCart();
		
		
		//driver.findElement(By.xpath("//input[@id='searchInputId']")).sendKeys(product);
		//driver.findElement(By.xpath("//button[@data-automation-id='searchIconBlock']")).click();
		
		//String productTitle = driver.findElement(By.cssSelector("h1[id='productTitle-false']")).getText();
		//Assert.assertEquals(productTitle,product );
	}
	
}

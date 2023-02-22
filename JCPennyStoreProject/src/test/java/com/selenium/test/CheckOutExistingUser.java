package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.BaseTest;
import com.selenium.pages.CartPage;
import com.selenium.pages.HomePage;
import com.selenium.pages.ProductDetailsPage;
import com.selenium.pages.SignInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckOutExistingUser extends BaseTest {
	

	String product = "Sharper Image Wireless QI Charging Speaker Dock";


	@Test
	public void testCheckoutExistingUser() {
		
		HomePage homepage = new HomePage(driver);
		homepage.search(product);
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.verifyProduct(product);	
		productDetailsPage.verifyAndClickViewCheckOut(product);
		
		CartPage cartPage = new CartPage(driver);
		cartPage.verifyProductTitle(product);
		cartPage.clickCheckOutButton();
		
		SignInPage signPage = new SignInPage(driver);
		
		signPage.clickOnGuestButton();
		signPage.login("QA@gmail.com","QA");
		
		
		//WebElement searchbox = driver.findElement(By.xpath("//input[@id='searchInputId']"));
		//searchbox.sendKeys("sharper image wireless qi charging speaker dock");
		//driver.findElement(By.xpath("//button[@data-automation-id='searchIconBlock']")).click();
		
		//String productTitle = driver.findElement(By.cssSelector("h1[id='productTitle-false']")).getText();
		//Assert.assertEquals(productTitle,product );
		
		//Add to Cart button
		//driver.findElement(By.cssSelector("[data-automation-id='addToCart']")).click();
		//String viewCartChkText = driver.findElement(By.xpath("//span[text()='Sharper Image Wireless QI Charging Speaker Dock']")).getText();
		//Assert.assertEquals(viewCartChkText,product );
		
		//View Cart & Checkout button
		//driver.findElement(By.xpath("//button[@data-automation-id=\"at-panel-checkout-button\"]")).click();
		//String cartText = driver.findElement(By.xpath("//span[text()='Sharper Image Wireless QI Charging Speaker Dock']")).getText();
		//Assert.assertEquals(cartText,product );
		//driver.findElement(By.xpath("//span[text()='Checkout']")).click();
		
		//driver.findElement(By.id("email")).sendKeys("QA@gmail.com");
		//driver.findElement(By.id("cartSignInPassword")).sendKeys("QA");
		//driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	
	
	}
	
	
	

}

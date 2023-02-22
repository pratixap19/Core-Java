package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.BaseTest;
import com.selenium.pages.CartPage;
import com.selenium.pages.HomePage;
import com.selenium.pages.ProductDetailsPage;
import com.selenium.pages.ShippingPage;
import com.selenium.pages.SignInPage;

public class CheckOutGuestUser extends BaseTest {
	
	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Test
	public void guestCheckout() {
		
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
		
		ShippingPage shippingPage = new ShippingPage(driver);
		shippingPage.fillGuestDetails("Guest", "Last Name", "QA", "90010");
		
		
		
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
		
		//Continue as Guest
		//driver.findElement(By.xpath("(//*[@data-automation-id='at-continue-as-guest'])[2]")).click();
		
		//driver.findElement(By.id("firstName")).sendKeys("Guest");
		//driver.findElement(By.id("lastName")).sendKeys("Last Name");
		//driver.findElement(By.id("company")).sendKeys("QA");
		//driver.findElement(By.id("zip")).sendKeys("90010");
	}
  
}

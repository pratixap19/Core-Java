package com.selenium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
	
	WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddCart() {
		WebElement element = driver.findElement(By.cssSelector("[data-automation-id=\"addToCart\"]")); //.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void verifyProduct(String product) {
		String productTitle = driver.findElement(By.cssSelector("h1[id=\"productTitle-false\"]")).getText();
		Assert.assertEquals(productTitle, product);		
	}
	
	public void verifyAndClickViewCheckOut(String product) {
		String productTitle = driver.findElement(By.cssSelector("[data-automation-id='ocProductTitle'] > span")).getText();
		Assert.assertEquals(productTitle, product);		
		driver.findElement(By.cssSelector("[data-automation-id='at-panel-checkout-button']")).click();
		
	}
}

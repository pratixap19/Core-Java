package com.test.pages.factory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage {
	
	WebDriver driver;

	@FindBy(id="[data-automation-id=\"addToCart\"]")
	private WebElement addCartButton;
	
	@FindBy(css ="h1[id=\"productTitle-false\"]")
	private WebElement productTitle;
	
	@FindBy(id="[data-automation-id='ocProductTitle'] > span")
	private WebElement productTitle1;
	
	@FindBy(css ="[data-automation-id='at-panel-checkout-button']")
	private WebElement checkOutButton;
	
	
	public ProductDetailsPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickAddCart() {
		addCartButton.click();
	}
	
	public void verifyProduct(String product) {
		String productTitle1 = productTitle.getText();
		Assert.assertEquals(productTitle1, product);		
	}
	
	public void verifyAndClickViewCheckOut(String product) {
		String productTitle = productTitle1.getText();
		Assert.assertEquals(productTitle, product);		
		checkOutButton.click();
	}
}

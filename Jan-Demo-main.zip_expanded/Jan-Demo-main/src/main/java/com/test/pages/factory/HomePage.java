package com.test.pages.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.pages.ProductDetailsPage;

public class HomePage {

	WebDriver driver;
	
	//By searchInput = By.id("searchInputId");
	//By searchButton = By.cssSelector("button[data-automation-id='searchIconBlock']");
	
	//String id = "searchInputId";
	//String button = "button[data-automation-id='searchIconBlock']";
	
	@FindBy(id="searchInputId")
	private WebElement searchInput;
	
	@FindBy(css ="button[data-automation-id='searchIconBlock']")
	private WebElement searchButton;
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public ProductDetailsPage search(String product) {				
		searchInput.sendKeys(product);		
		searchButton.click();
		return PageFactory.initElements(driver, ProductDetailsPage.class);
		
	}
	
	
}

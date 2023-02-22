package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.util.BasePage;

public class StorePage extends BasePage {

	public StorePage(WebDriver driver) {
		super(driver);	
	}

	@FindBy(xpath = "//*[@class='menu-list']//span[text()='Book Store']")
	private WebElement bookSoreMenu;
	
	@FindBy(id="searchBox")
	private WebElement SearchInput;
	
	@FindBy(id="basic-addon2")
	private WebElement searchButton;
	
	@FindBy(xpath="(//*[@id='addNewRecordButton'])[2]")
	private WebElement addRecord;
	
	public StorePage selectBookStoreMenu() {
		javaScriptClick(bookSoreMenu);
		return PageFactory.initElements(driver, StorePage.class);
	}
	
	public StorePage searchBook(String book) {
		inputText(SearchInput, book);
		clickOn(searchButton);
		return PageFactory.initElements(driver, StorePage.class);
	}
	
	public StorePage selectBook(String book) {
		String bookLocator = "//*[@class='rt-tbody']//a[text()='"+book+"']";
		clickOn(driver.findElement(By.xpath(bookLocator)));
		return PageFactory.initElements(driver, StorePage.class);
	}
	
	public StorePage addToCart() {
		executeJsScroolToElement(addRecord);
		moveAndClickOnElement(addRecord);
		waitForAlert();
		driver.switchTo().alert().accept();
		return PageFactory.initElements(driver, StorePage.class);
	}
}

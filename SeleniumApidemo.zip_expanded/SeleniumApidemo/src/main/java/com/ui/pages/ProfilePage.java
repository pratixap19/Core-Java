package com.ui.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.framework.util.BasePage;


public class ProfilePage extends BasePage {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="[class='main-header']")
	private WebElement profileHeader;
	
	@FindBy(css="[id='userName-value']")
	private WebElement userNameField;
	
	@FindBy(xpath = "//*[@class='menu-list']//span[text()='Profile']")
	private WebElement profileMenu;
	
	@FindBy(id = "closeSmallModal-ok")
	private WebElement okButton;
	
	@FindBy(xpath = "//div[@class='rt-tbody']//div[@class='action-buttons']/span/a")
	private List<WebElement> storeListName;
	
	public void verifyLoginSuccess(String userName) {		
		String user = getText(userNameField);
		Assert.assertEquals(userName, user);
		String profileText = getText(profileHeader);
		Assert.assertEquals(profileText, "Profile");
	}
	
	public void clickOnProfileMenu(){
		javaScriptClick(profileMenu);
	}
	
	public void verifyBookAdded(String book) {		
		Assert.assertTrue(isBookAdded(book), "Book "+book+" not added into profile");
	
	}
	
	public void removeAddedBook(String book) {
		String locator = "//div[div[span[a[text()='"+book+"']]]]/following-sibling::div//*[@title='Delete']";		
		clickOn(driver.findElement(By.xpath(locator)));
		clickOn(okButton);
		waitForAlert();
		driver.switchTo().alert().accept();
	}
	
	public void verifyBookRemoved(String book){		
		Assert.assertFalse(isBookAdded(book), "Book "+book+" not removed from profile");
	}
	
	private boolean isBookAdded(String book) {
		boolean status = false;
		for(WebElement element : storeListName) {
			String name =	element.getText();
			if(name.equals(book)) {
				status = true;
				break;
			}
		}
		return status;
	}
}

package com.test.selenium;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.framework.util.BaseTest;
import com.ui.pages.LoginPage;
import com.ui.pages.ProfilePage;
import com.ui.pages.StorePage;

public class AddVerifyBook extends BaseTest {

	String book = "Git Pocket Guide";
	
	@Test
	public void TestAddAndRemoveBookInCollection() {
		LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);		
		
		ProfilePage profile = loginPage.loginInApp(super.userName, super.password);
		super.reportLog("login into application with user name "+super.userName);		
		
		profile.verifyLoginSuccess(super.userName);
		super.reportLog("Verify user "+super.userName +" login successfully");
		
		StorePage storePage = PageFactory.initElements(getWebDriver(), StorePage.class);
		storePage.selectBookStoreMenu();
		super.reportLog("Select book store menu");
		
		storePage.searchBook(book);
		super.reportLog("Search book " + book);
		
		storePage.selectBook(book);
		super.reportLog("Select book " + book);
		
		storePage.addToCart();
		super.reportLog("Add " + book + " to your collection");
		
		profile.clickOnProfileMenu();
		super.reportLog("Click on profile menu");
		
		profile.verifyBookAdded(book);
		super.reportLog("Verify book added");
		
		profile.removeAddedBook(book);
		super.reportLog("remove book from profile");
		
		profile.verifyBookRemoved(book);
		super.reportLog("verify book removed from profile");		
	}
	
}

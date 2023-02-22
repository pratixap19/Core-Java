package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']/b")
	WebElement adminTab;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//this means BaseClass.class
	}
	
	public SystemUsersPage clickOnAdminTab() {
		adminTab.click();
		return new SystemUsersPage();
	}

}

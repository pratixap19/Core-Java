package com.Guru99.testcases;

import org.openqa.selenium.WebDriver;

import com.Guru99.base.BaseClass;
import com.Guru99.pages.Guru99LoginPageObject;

public class Guru99Test extends BaseClass{
	
	
	public static void main(String[] args) {
		//Guru99LoginPageObject automation
		Guru99LoginPageObject loginPage = new Guru99LoginPageObject(driver);
		
		loginPage.setUserID("mngr328363");
		loginPage.setPwd("gAhevUz");
		loginPage.clickOnLogin();
	}

}

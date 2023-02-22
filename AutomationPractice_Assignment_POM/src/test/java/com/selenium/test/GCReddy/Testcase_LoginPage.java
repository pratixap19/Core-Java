package com.selenium.test.GCReddy;

//followed G C Reddy tutorial for POM
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.pages.GCReddy.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_LoginPage {

	    public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver currentClassdriver = new ChromeDriver();
		currentClassdriver.manage().window().maximize();

		LoginPage login = new LoginPage(currentClassdriver);// we are passing this class/current class constructor
															// 'currentClassdriver' as webdriverparameter

		// Create Admin login test case
		currentClassdriver.get("http://automationpractice.com/index.php");
		login.clickSignInLink();
		login.typeUsername("tester10@gmail.com");
		login.typePwd("zxcvbn");
		login.clickSignInButton();

		String url = currentClassdriver.getCurrentUrl();
		System.out.println(url);

		if (url.contains("http://automationpractice.com/index.php?controller=my-account")) {

			System.out.println("Admin ligin is successful");

		} else {
			System.out.println("Admin ligin is not successful");
		}
		currentClassdriver.close();

	}

}

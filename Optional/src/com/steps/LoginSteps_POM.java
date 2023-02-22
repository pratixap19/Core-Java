package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps_POM {

	WebDriver driver=null;//?
	LoginPage login;

	@Given("user is on login page")
	
	public void user_is_on_login_page() {
		System.out.println("Inside Step - user is on login page");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^user enters (.*) and password(.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("Inside Step - User enters username and password");
		 
		login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
		Thread.sleep(3000);
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside Step - Click on login button");
		login.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("Inside Step - user is navigated to the home page");
		
		driver.getPageSource().contains("Hello");
		Thread.sleep(2000);
		driver.close();
	}
}

package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		String message = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(message, "Welcome FirstName");

	}
	
	@Then("I logout from application")
	public void i_logout() {
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}
	}


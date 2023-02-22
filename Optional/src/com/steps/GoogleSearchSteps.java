package com.steps;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	WebDriver driver;
	
	@Given("launch the browser")
	public void launch_the_browser() {
	   System.out.println("Inside Step:Launch the browser");
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	}

	@And("user is on Google search page")
	public void user_is_on_Google_search_page() {
		System.out.println("Inside Step:user is on Google search page");
		driver.get("https://www.google.com/");
	}

	@When("user enters a text in searchbox")
	public void user_enters_a_text_in_searchbox() {
	    System.out.println("Inside search:user is on Google search page");
	    driver.findElement(By.name("q")).sendKeys("Costco");
	}

	@And("hits enter")
	public void hits_enter() {
	   System.out.println("Inside search: hits enter");
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	   System.out.println("Inside search:user is navigated to search results");
	   driver.getPageSource().contains("Electronics");
	   driver.close();
	}



}

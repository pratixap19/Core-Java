package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepsjcpenny {
    
	
	@Given("I am on home page") 
	public void I_am_on_home_page()
	{
	    Hooks.driver.navigate().to("https://www.jcpenney.com/");
	}

	@When("I search product in application")
	public void i_search_product_in_application() {
		Hooks.driver.findElement(By.id("searchInputId")).sendKeys("mens nike air monarch shoes");
	    Hooks.driver.findElement(By.cssSelector("[data-automation-id='searchIconBlock']")).click();
	}

	

	@Then("I verify product display successfully on product page")
	public void i_verify_product_listed_successfully_on_product_page() {
	    String text = Hooks.driver.findElement(By.cssSelector("[id=\"productTitle-false\"]")).getText();
	    Assert.assertEquals(text, "Nike Air Monarch IV Mens Training Shoes");
	}
	
	@When("I search product {string} in application")
	public void i_search_product_in_application(String productName){
		
		Hooks.driver.findElement(By.id("searchInputId")).sendKeys(productName);
	    Hooks.driver.findElement(By.cssSelector("[data-automation-id='searchIconBlock']")).click();
		
	}
	
	@Then("I verify {string} display successfully on product page")
	public void i_verify_display_successfully_on_product_page(String productName) {
		String text = Hooks.driver.findElement(By.cssSelector("[id=\"productTitle-false\"]")).getText();
	    Assert.assertEquals(text, productName);
	}
	

	


}

package com.cucumber.steps;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.Conf;
import com.test.pages.factory.HomePage;
import com.test.pages.factory.ProductDetailsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumSteps {

	WebDriver driver;

	@Given("I am on home page")
	public void i_am_on_home_page() throws IOException {
		driver = Hooks.driver;
		
		driver.get(Conf.getConfig("Url"));	
	}

	@When("I enter product name in search field")
	public void i_enter_product_name_in_search_field() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.search("Sharper Image Wireless QI Charging Speaker Dock");
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		
	}

	@Then("I verify product displayed on product page")
	public void i_verify_product_displayed_on_product_page() {
		ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);
		productDetailsPage.verifyProduct("Sharper Image Wireless QI Charging Speaker Dock");
	}

}

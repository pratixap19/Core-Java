package com.bdd.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import static com.bdd.utils.WebDriverUtils.*;

public class Demo1Steps {
	
	WebDriver cdriver;//here cdriver is a veriable as getDriver() method will return driver instance which is 
	//stored inside cdriver.
	
	@Given("User navigates to the application")
	public void user_navigates_to_the_application() {
	    
		cdriver=getDriver();
		cdriver.get("http://automationpractice.com/");
		
		
	}

	@When("User clicks on chapter1 link")
	public void user_clicks_on_chapter1_link() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I am in the step two");
	}

	@Then("verify if the test is displayed correctly")
	public void verify_if_the_test_is_displayed_correctly() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i am in the step three");
	}

}

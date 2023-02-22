package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("User is on login page");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		System.out.println("User enters username and passworde");
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("User clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("User is navigated to the home page");
	}


}

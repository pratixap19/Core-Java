package com.cucumber.steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	int c;
	int a;
	int b;

	@Given("numbers are {int} and {int}")
	public void numbers_are_and(int int1, int int2) {
		a = int1;
		b = int2;
	}
	
	@When("I added both numbers")
	public void i_added_both_numbers() {
		c = a + b;
	}

	@Then("I verify result is {int}")
	public void i_verify_result_is(int int1) {
		Assert.assertEquals(c, int1);
	}
	
	@Given("I am background scenario")
	public void i_am_background_scenario() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}

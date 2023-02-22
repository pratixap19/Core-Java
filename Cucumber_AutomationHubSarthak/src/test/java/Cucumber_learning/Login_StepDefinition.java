package Cucumber_learning;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition {

	@Given("^I am interested in practicing ([a-zA-Z]{1,})$")
	public void i_am_interested_in_practicing_MMA(String sport) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am interested in practicing:" + sport);

	}

	@And("^I went online to find ([a-zA-Z]{1,}) gym near me$")
	public void i_went_online_to_find_MMA_gym_near_me(String sport) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I went online to find: " + sport + "gym near me");
	}

	@And("^I went to see the nearest gym on [^\"]*$")
	public void i_went_to_see_the_nearest_gym_on_th_Jan(String visitDate) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I went to see the nearest gym on: " + visitDate);
	}

	@And("^They gave me annual membership discount of 10% from [^\"]*  to [^\"]*$")
	public void they_gave_me_annual_membership_discount_of_from_th_Jan_to_th_Jan(String joinDate, String endDate) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("They gave me annual membership discount of 10% from: " +  joinDate + "to:" + endDate);
	}

	@When("^My ([a-zA-Z]{1,}) got to hear about this$")
	public void my_friends_got_to_hear_about_this(String pals) {
		// Write code here that turns the phrase above into concrete actions
        System.out.println("My" + pals + "got to hear about this");
	}

	@Then("^(\\d+) of them decided to join$")
	public void of_them_decided_to_join(int numberOfPeople) {
		// Write code here that turns the phrase above into concrete actions
       System.out.println(numberOfPeople + "of them decided to join");
	}

	@Then("^I further got discount of 25% as referal bonus$")
	public void i_further_got_discount_of_as_referal_bonus(Integer int1) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^we could not start because of lockdown$")
	public void we_could_not_start_because_of_lockdown() {
		// Write code here that turns the phrase above into concrete actions

	}

}

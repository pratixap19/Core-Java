package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User launch Chrome browser")
	public void user_launch_Chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	   driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}

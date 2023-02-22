package Cucumber_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_StepDefinition {
	
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@Given("Open Chrome browser")
	public void open_Chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Open Chrome browser and enter url");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
	}

	@Given("I enter url")
	public void i_enter_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter url");
		driver.get("https://www.rediff.com/");
	}

	@Then("Click on signin link")
	public void click_on_signin_link() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on signin link");
		driver.findElement(By.className("signin")).click();
	    
	}

	@Then("I enter the Rediffmail page")
	public void i_enter_the_Rediffmail_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I check if I am in the Inbox page of Rediffmail");
		String actualTitle = "Rediffmail";
		String expectedTitle = driver.getTitle();
		softassert.assertEquals(actualTitle, expectedTitle);
		softassert.assertAll();//It is mandatory
	    
	}

	@Then("I enter correct username and password")
	public void i_enter_correct_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter correct username and password");
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
	    
	}

	@Then("I click on SignIn button")
	public void i_click_on_SignIn_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.className("signinbtn")).click();
	}

	@Then("I check if I am in the inbox page of Rediffmail")
	public void i_check_if_I_am_in_the_inbox_page_of_Rediffmail() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I check if I am in the inbox page of Rediffmail");
	}

	@Given("I am inside the inbox page")
	public void i_am_inside_the_inbox_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am inside the inbox page");
	    
	}

	@Given("i validate the presence of the logout link")
	public void i_validate_the_presence_of_the_logout_link() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("i validate the presence of the logout link");
	    
	}

	@When("I click on the logout link")
	public void i_click_on_the_logout_link() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on the logout link");
		driver.findElement(By.className("rd_logout")).click();
	    
	}

	@Then("I am logged out of Rediffmail")
	public void i_am_logged_out_of_Rediffmail() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am logged out of Rediffmail");
		String actualResult = "Welcome to Rediffmail";
		String expectedResult = driver.getTitle();
		softassert.assertEquals(actualResult, expectedResult);
		softassert.assertAll();
	    
	}

	@Then("I can validate the presence of the Rediff Home link")
	public void i_can_validate_the_presence_of_the_Rediff_Home_link() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I can validate the presence of the Rediff Home link");
		//softassert.assertTrue(driver.findElement(By.xpath("//div[@class='header']/descendant::b[contains(text(),"Rediff Home")]"))).isEnabled();
	    //softassert.assertAll();
	}

	
	

}

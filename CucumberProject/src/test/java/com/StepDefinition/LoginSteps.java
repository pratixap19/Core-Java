package com.StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("Step1:User is on login page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String pswd) {
		
		System.out.println("Step2:User enters username and password");
		driver.findElement(By.id("txtUsername")).sendKeys("uname");
		driver.findElement(By.id("txtPassword")).sendKeys("pswd");

	}

	@And("click on login button")
	public void click_on_login_button() {
		
		System.out.println("Step3:User is clicking on login button");
		driver.findElement(By.name("Submit")).click();

	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		
		System.out.println("Step4:User lands on homepage");
		//driver.close();
	}
	
	@When("user enters credentials using DataTable")
	public void user_enters_credentials_using_DataTable(DataTable dataTable) {
		
		System.out.println("Step5:User enters usList<A>me and password");
		List<List<String>> data = dataTable.cells();
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));
	}
	}


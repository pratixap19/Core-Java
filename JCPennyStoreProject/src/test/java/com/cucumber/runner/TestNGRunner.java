package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature" , 
		glue = {"com.cucumber.steps"},
		plugin = { 
				"pretty", 
				"json:target/cucumber-reports/CucumberTestReport.json",
				"html:target/cucumber-reports/cucumber-html.html"}
		)
		

public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	//No code should be written under TestRunner class
}

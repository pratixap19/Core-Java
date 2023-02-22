package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/feature",
		glue = {"com.cucumber.steps"},
		plugin = { "pretty", "json:target/cucumber-reports/CucumberTestReport.json",
	        "html:target/cucumber-reports/cucumber-html.html" }	
		)
public class TestNgRunner extends AbstractTestNGCucumberTests{

	
	
}

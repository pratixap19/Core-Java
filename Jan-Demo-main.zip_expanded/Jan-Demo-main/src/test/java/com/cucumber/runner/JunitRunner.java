package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature",
		glue = {"com.cucumber.steps"},
		plugin = { "pretty", "json:target/cucumber-reports/CucumberTestReport.json",
	        "html:target/cucumber-reports/cucumber-html.html" },
		tags = "@Selenium"
		)
public class JunitRunner {

}

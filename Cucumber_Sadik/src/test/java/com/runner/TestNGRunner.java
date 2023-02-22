package com.runner;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"com.steps"},
		plugin = {"pretty", "html:target/cucumber.Report.html", "json:target/report.json"},
		tags="@smoke"
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinition"},
monochrome = true,
plugin = {"pretty", "junit:target/JunitReports/report.xml",
		"json:target/JsonReports/report.json",
		"html:target/HtmlReports"},
          
tags="@smokeTest"
)
public class TestRunner {

}

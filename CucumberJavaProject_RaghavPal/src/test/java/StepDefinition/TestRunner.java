package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en_scouse.Dun;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature", glue= {"StepDefinition"},
monochrome = true,
//@dryRun=true,
plugin = {"pretty", "junit:target/JunitReports/report.xml",
		"json:target/JsonReports/report.json",
"html:target/HtmlReports"}

		)
public class TestRunner {

}

package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
		features="C:/Users/prati/Eclipse-workspace Selenium 2021/CucumberFramework_SDET/Features/Login.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:test-output"}
		)
public class TestRun {
	
	
	

}

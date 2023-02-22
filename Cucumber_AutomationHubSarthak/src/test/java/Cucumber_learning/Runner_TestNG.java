package Cucumber_learning;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Cucumber_learning", 
glue= {"Cucumber_learning"},
dryRun=false,
strict=true,
monochrome=true,
plugin={"pretty", "html:target/HTML Reports/cucumber.html", "json:target/JSON Reports/report.json" },
tags = {"@LookingForMMAGym"}
)

public class Runner_TestNG extends AbstractTestNGCucumberTests{

}

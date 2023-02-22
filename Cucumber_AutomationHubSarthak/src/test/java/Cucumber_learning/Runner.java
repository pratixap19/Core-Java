package Cucumber_learning;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/", 
glue= {"Cucumber_learning"},
dryRun=false,
strict=true,
monochrome=true,
plugin={"pretty", "html:target/HTML Reports/cucumber.html", "json:target/JSON Reports/report.json" },
tags = {"@LookingForMMAGym"}
)
public class Runner {

}

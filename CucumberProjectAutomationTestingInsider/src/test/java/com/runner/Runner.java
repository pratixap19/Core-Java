package com.runner;
//It will map all steps of feature file with step definition file
//Tidy Gherkin-chrome://apps/
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"com.StepDefinition"}, 
monochrome=true, 
plugin= {"html:Reports\\HTMLReports", "json:Reports\\JsonReports\\Cucumber.json", 
		"junit:Reports\\JunitReport\\Cucumber.xml"},
dryRun=false,   //mapping between feature file and step definition file. dryRun=false means it will map both files and execute the test.
strict=true,    //It will check if any step is not defined in step definition file
tags= {"SmokeTest or @SanityTest"}  //we need to write only one tag and paly around with different combination
)

public class Runner {

}

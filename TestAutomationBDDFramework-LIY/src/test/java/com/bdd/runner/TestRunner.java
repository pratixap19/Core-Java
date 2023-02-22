package com.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(features="src/test/resources/features/Demo1Feature.feature", 
glue={"com.bdd.steps"}, 
tags = "@demo1features",
plugin={"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
monochrome = true)

public class TestRunner {
	
//	TestNGCucumberRunner testngcucumber = new TestNGCucumberRunner(this.getClass());

}

package com.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/AppFeatures/LoginPage.feature" }, glue = { "com.stepdefinitions",
		"apphooks" }, plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/", "rerun:target/rerun.txt" }
// features={"@target/rerun.txt"}
// rerun:target/rerun.txt
)
public class MyTestRunner {

}

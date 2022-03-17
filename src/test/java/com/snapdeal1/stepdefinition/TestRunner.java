package com.snapdeal1.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
                 glue = "com.snapdeal1.stepdefinition",
                 plugin = "html:target",
                 monochrome =true,
                 dryRun = false,
                 tags = "@shirt"
                   )


public class TestRunner {
	

}

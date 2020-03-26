package com.Basic.sharedataSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:ShareFF.feature",
		glue = "com.Basic.sharedataSD",
		plugin = { "pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report5.json"
		}
		)
public class RunMyshareDataTest {

}

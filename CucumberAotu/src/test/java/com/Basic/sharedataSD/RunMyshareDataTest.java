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
						"html:target/cucumber9-htmlreport",
						"json:target/cucumber-report9.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport9.html" 
						
		}
		)
public class RunMyshareDataTest {

}

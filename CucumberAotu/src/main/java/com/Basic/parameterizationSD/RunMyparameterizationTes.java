package com.Basic.parameterizationSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:ParameterizationFF.feature",
		glue = "com.Basic.parameterizationSD",
				plugin = { "pretty",
						"html:target/cucumber2-htmlreport",
						"json:target/cucumber-report2.json",
		   
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
						}
		)
public class RunMyparameterizationTes {

}

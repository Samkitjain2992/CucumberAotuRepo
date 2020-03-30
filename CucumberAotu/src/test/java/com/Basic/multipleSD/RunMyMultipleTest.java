package com.Basic.multipleSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:MultipleFF.feature",
	     glue = "com.Basic.multipleSD",
				plugin = { "pretty",
						"html:target/cucumber8-htmlreport",
						"json:target/cucumber-report8.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html" 
						
		}
		
		)
public class RunMyMultipleTest {
	

}

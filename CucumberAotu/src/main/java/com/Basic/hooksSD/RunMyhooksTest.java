package com.Basic.hooksSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:HooksFF.feature",
		glue = "com.Basic.hooksSD",
				plugin = { "pretty",
						"html:target/cucumber7-htmlreport",
						"json:target/cucumber-report7.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html" 
						
		}
		)
public class RunMyhooksTest {

}

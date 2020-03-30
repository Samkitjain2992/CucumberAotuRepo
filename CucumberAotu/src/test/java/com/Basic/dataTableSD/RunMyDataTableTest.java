package com.Basic.dataTableSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:DataTableFF.feature",
		glue = "com.Basic.dataTableSD",
		
				plugin = { "pretty",
						"html:target/cucumber5-htmlreport",
						"json:target/cucumber-report5.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html" 
						
		}
		
		
		)
public class RunMyDataTableTest {

}

package com.Basic.datadrivenSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:DataDrivenFF.feature",
		glue = "com.Basic.datadrivenSD",
				plugin = { "pretty",
						"html:target/cucumber6-htmlreport",
						"json:target/cucumber-report6.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html" 
						
		}
		
		)
public class RunMyDataDrivenTest {

}

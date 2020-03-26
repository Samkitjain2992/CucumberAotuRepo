package com.Basic.multiplescnarioSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:MultipleScenarioFF.feature",
		glue = "com.Basic.multiplescnarioSD",
				plugin = { "pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report1.json"}
						
		)
				
public class RunMyMultipleScenarioTest {

}

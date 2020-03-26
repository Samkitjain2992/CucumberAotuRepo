package com.Basic.tagsSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		
		//tags = {"@Important"}, // All Scenario executed if this is tag for feature file
		//tags = {"@Smoke"}, // only tag with @Smoke
		 // tags = {"@Smoke", "@Regression"}, // And Condition
		tags = {"@Smoke,@Regression"}, // Or Condition
		
		features = "classpath:TagsFF.feature",
		glue = "com.Basic.tagsSD",
		plugin = { "pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report5.json"
				
				
				
		}
		)
public class RunMytagsTest {

}

package com.Basic.multipleSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:",
		glue = "com.Basic.multipleSD"
		
		)
public class RunMyMultipleTest {
	

}

package com.Basic.datadrivenSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		dryRun = true,
		features = "classpath:DataDrivenFF.feature",
		glue = "com.Basic.datadrivenSD"
		
		)
public class RunMyDataDrivenTest {

}

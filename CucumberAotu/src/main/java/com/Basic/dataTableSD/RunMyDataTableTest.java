package com.Basic.dataTableSD;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		features = "classpath:DataTableFF.feature",
		glue = ".com.Basic.dataTableSD"
		)
public class RunMyDataTableTest {

}

package com.Basic.MYFirstStepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "classpath:MyFirstFeatureFile.feature",
                 glue = "com.Basic.MYFirstStepDef",
                 
                 plugin= {"pretty",
                		 
         					"html:target/cucumber-htmlreport",
         					"json:target/cucumber-report.json",
                		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html" 
                		 
                 }
		
		
		
		)

public class RunMyFirstFeatureTest {
	




}


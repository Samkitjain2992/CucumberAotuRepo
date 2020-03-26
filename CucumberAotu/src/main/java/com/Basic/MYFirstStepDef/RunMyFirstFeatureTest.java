package com.Basic.MYFirstStepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "classpath:MyFirstFeatureFile.feature",
                 glue = "com.Basic.MYFirstStepDef",
                 
                 plugin= {"pretty",
                		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html" 
                		 
                 }
		
		
		
		)

public class RunMyFirstFeatureTest {




}


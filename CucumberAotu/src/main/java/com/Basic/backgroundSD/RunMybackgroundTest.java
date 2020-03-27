package com.Basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="classpath:BackgroundFF.feature",
                 glue ="com.Basic.backgroundSD",
                 
                plugin = { "pretty",
         				"html:target/cucumber3-htmlreport",
         				"json:target/cucumber-report3.json",
         				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html" 
         						
         		}
                 
                 
                 
                 
                 
                 
                 )

public class RunMybackgroundTest {

}

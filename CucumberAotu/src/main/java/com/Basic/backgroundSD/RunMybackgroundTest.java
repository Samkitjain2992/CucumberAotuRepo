package com.Basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="classpath:BackgroundFF.feature",
                 glue ="com.Basic.backgroundSD"
                 )

public class RunMybackgroundTest {

}

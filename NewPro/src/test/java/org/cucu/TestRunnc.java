package org.cucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features\\fblogin.feature",
glue = "org.cucu",monochrome = true,plugin = {"pretty","json:src\\test\\resources\\Features\\Reports\\sam"})
public class TestRunnc {
	
	

}

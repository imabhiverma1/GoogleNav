package com.navigation.googletest.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/features",
		glue= {"classpath:"},
		monochrome = true
		)

public class TestRunner extends AbstractTestNGCucumberTests {


}

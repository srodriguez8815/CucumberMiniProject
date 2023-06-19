package com.noorteck.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src\\test\\resources\\ntk\\Form.feature",
		glue = "com.noorteck.cucumber.steps"
		)


public class Runner {

}

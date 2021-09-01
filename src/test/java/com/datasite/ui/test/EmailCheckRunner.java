package com.datasite.ui.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/featurefiles/scenario2.feature"
		,glue={"stepdefinitions"}
		)

public class EmailCheckRunner {

}

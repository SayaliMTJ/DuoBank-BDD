package com.duobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "com/duobank/stepDefinitions",
        stepNotifications = true,
        plugin = {
                "pretty",
                "html:target/built-in-report/cucumber-html-report.html"
        }
        ,dryRun = true // used for quickly generating step definition snippets without running the scenarios
)
public class CucumberRunner {



}

package com.duobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@album",
        features = "src/test/resources",
        glue = "com/duobank/stepDefinitions",
        stepNotifications = true,
        plugin = {
                "pretty",  // displays more detailed aka prettier output on the console about the result of the scenario run
                "html:target/built-in-report/cucumber-html-report.html",  // generates built-in html report
                "json:target/cucumber.json"
        }

//        ,dryRun = true // used for quickly generating step definition snippets without running the scenarios





)
public class CucumberRunner {

}
package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                    "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        //dryRun = true,  //won't run actual implementation, it will compare feature and step definitions to pass

        //tags = "@login and not @admin"
        //tags = "@login and not @student"
        //tags = "@student"
        //tags = "@login and @sunday and not @admin"
        //tags = "@student or @admin"
        //tags = "@search and @keyword"
        //tags = "@about"
        //tags = "@googleSearch"
        //tags = "@smartbearLogin"
        //tags = "@etsy"
        tags = "@wikipedia",
        //tags = "@fail"
        publish = true


)
public class CucumberRunner {}


package com.cybertek.step_definitions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.java.sk.Tak;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Hooks {

    @Before(value = "@db", order = 1)
    public void databaseConnectionCreated(){
        System.out.println("Data connection created");
    }

    @Before(order = 2)
    public void setupScenario(){

        // System.out.println("<----Browser Setup----->");
    }

    @After
    public void afterScenario(Scenario scenario){
        System.out.println("scenario.getName() = " + scenario.getName());
        System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        System.out.println("scenario.isFailed() = " + scenario.isFailed());
    }

//    @After(order = 4)
//    public void tearDownScenario(){
//       Driver.closeDriver();
//
//    }

    @After(value = "@db", order = 3)
    public void tearDownDatabaseConnection(){
        System.out.println("Data connection ended");
    }

    //@AfterStep()
    //public void takeScreenshotOfEachStep(){
    //    BrowserUtils.takeScreenShot();
    //}

    @After
    public void takeScreenAndCloseBrowser(Scenario scenario) {
        //To be able to use getScreenshotAs, we need to cast our driver

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        //Driver.closeDriver();
    }


}

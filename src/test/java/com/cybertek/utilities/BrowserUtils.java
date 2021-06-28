package com.cybertek.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class BrowserUtils {


    public static void sleep(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            System.out.println("wait "+millisecond+ " milliseconds");
        }
    }


    public static void takeScreenShot(){
        String methodName = new Throwable().getStackTrace()[1].getMethodName();
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-uuuu--HH-mm-ss");

        String destFileName = "C:\\Users\\Leal\\Desktop\\ScreenShots\\" + methodName + dtf.format(LocalDateTime.now()) +".jpg";
        File destFile = new File(destFileName);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

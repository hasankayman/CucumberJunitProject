package com.cybertek.Base;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyMyCodeWorks {
    public static void main(String[] args) {
        Driver.getDriver().navigate().to("https://www.etsy.com/");
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@class='wt-input wt-input-btn-group__input global-enhancements-search-input-btn-group__input wt-pr-xs-7']"));
        //searchBox.click();
        searchBox.sendKeys("Wooden Spoon");
        Driver.getDriver().findElement(By.xpath("//form[@id=\"gnav-search\"]/div/div[1]/button")).click();
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith("Wooden Spoon"));
        BrowserUtils.sleep(2000);
        Driver.closeDriver();
    }
}

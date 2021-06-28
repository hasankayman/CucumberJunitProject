package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchPage {
    WebDriver driver = Driver.getDriver();
    public GoogleSearchPage(){
        PageFactory.initElements(driver,this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement googleSearchBox;

    @FindBy(className = "WrcADd")
    public WebElement switchToChromeAlert;

    @FindBy(xpath = "//div[@class='KxwPGc SSwjIe']//a[@class='pHiOh']")
    public List<WebElement> googleFooterLinks;



    @FindBy(css = "button.M6CB1c.rr4y5c")
    public WebElement dismissSwitchToChromeAlertButton;

    @FindBy(linkText = "About")
    public WebElement aboutLink;

    public void typeSearchKeywordGoogle(String str){
        googleSearchBox.sendKeys(str);
    }

    public void dismissSwitchToChromeAlert(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        dismissSwitchToChromeAlertButton.click();
    }

}

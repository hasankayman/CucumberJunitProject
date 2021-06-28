package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class EtsySearchPage {

    public EtsySearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//input[@class='wt-input wt-input-btn-group__input global-enhancements-search-input-btn-group__input wt-pr-xs-7']")
    public WebElement etsySearchBox;

    @FindBy(xpath = "//form[@id=\"gnav-search\"]/div/div[1]/button")
    public WebElement etsySearchButton;



}

package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class WikipediaHomePage {
    public WikipediaHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @FindBy(css = "input#searchInput")
    public WebElement wikipediaSearchBox;

    @FindBy(css = "button.pure-button.pure-button-primary-progressive")
    public WebElement wikipediaSearchButton;

    @FindBy(css = "h1#firstHeading")
    public WebElement wikipediaMainHeader;

    @FindBy(css = "div.fn")
    public WebElement wikipideMainPictureHeader;

}

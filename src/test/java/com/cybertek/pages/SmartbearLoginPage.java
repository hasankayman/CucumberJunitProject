package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartbearLoginPage {



    public SmartbearLoginPage(){
    PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="ctl00_MainContent_username")
    public WebElement usernameInput;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;

    @FindBy(xpath = "//h1[.='Web Orders']")
    public WebElement leftTopH1Title;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}

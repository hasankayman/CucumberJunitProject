package com.cybertek.step_definitions;

import com.cybertek.Base.TestBase;
import com.cybertek.pages.SmartbearLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartbearLoginStepDefinitions{
    SmartbearLoginPage smartbearLoginPage;


    @Given("User is on the Smartbear login page")
    public void user_is_on_the_smartbear_login_page() {
        String url = ConfigurationReader.getProperty("smartbearUrl");
        WebDriver driver = Driver.getDriver();
        driver.get(url);
    }

    @When("User logins username and password")
    public void user_logins_username_and_password() {
        smartbearLoginPage = new SmartbearLoginPage();
        String username = ConfigurationReader.getProperty("smartbearUsername");
        String password = ConfigurationReader.getProperty("smartbearPassword");
        smartbearLoginPage.login(username,password);
    }
    @Then("User should see H1 Title on the top left")
    public void user_should_see_h1_title_on_the_top_left() {
        smartbearLoginPage = new SmartbearLoginPage();
        Assert.assertTrue("H1 title is not displayed", smartbearLoginPage.leftTopH1Title.isDisplayed());
    }
    @Then("Browser will be automatically closed")
    public void browser_will_be_automatically_closed() {
        Driver.closeDriver();

    }


    @When("User enters wrong username and password")
    public void user_enters_wrong_username_and_password() {
        smartbearLoginPage = new SmartbearLoginPage();
        smartbearLoginPage.login("hasan", "test");

    }
    @Then("User should see wrong username and password error message")
    public void user_should_see_wrong_username_and_password_error_message() {
        smartbearLoginPage = new SmartbearLoginPage();
        Assert.assertTrue(smartbearLoginPage.errorMessage.isDisplayed());
    }


}




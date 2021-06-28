package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class GoogleSearchStepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    //WebDriver driver;

    String actualTitle;
    static String searchKeyword;

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
//        driver = Driver.getDriver();
//        driver.get(ConfigurationReader.getProperty("googleUrl"));
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
    }
    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
//        actualTitle = driver.getTitle();
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Actual title does not match expected title. ", actualTitle, expectedTitle);
    }

    @When("User searches a keyword in search box")
    public void user_searches_a_keyword_in_search_box() {
        searchKeyword = "apple";
        googleSearchPage.googleSearchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("User should see title contains the keyword")
    public void userShouldSeeTitleContainsTheKeyword() {

        actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Title does not contains search keyword",actualTitle.contains(searchKeyword));
    }


    @When("User searches a {string} in search box")
    public void userSearchesAInSearchBox(String arg0) {
        googleSearchPage.googleSearchBox.sendKeys(arg0 + Keys.ENTER);
    }

    @Then("User should see title contains the {string}")
    public void userShouldSeeTitleContainsThe(String arg0) {
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(arg0));
    }

    @Then("User should see About link")
    public void userShouldSeeAboutLink() {

        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());
    }

    @And("User clicks About link")
    public void userClicksAboutLink() {
        googleSearchPage.aboutLink.click();
    }


    @Then("User should see title is Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleIsGoogleAboutGoogleOurCultureCompanyNews() {
        String expectedTitle = "Google - About Google, Our Culture & Company News";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("User should see six links in the footer")
    public void userShouldSeeSixLinksInTheFooter(List<String> linkStrings) {

        int expectedSize = linkStrings.size();
        int actualSize = googleSearchPage.googleFooterLinks.size();

        Assert.assertEquals(actualSize, expectedSize);

    }
}

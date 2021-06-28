package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class EtsySearchStepDefinitions {
    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is on the etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("User should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Then("User searches a {string} in Etsy search box")
    public void user_searches_a_in_etsy_search_box(String string) {
        etsySearchPage.etsySearchBox.sendKeys(string);
    }
    @Then("User clicks etsy search button")
    public void user_clicks_etsy_search_button() {
        etsySearchPage.etsySearchButton.click();
    }
    @Then("User should see {string} is in the title")
    public void user_should_see_is_in_the_title(String string) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title does not match expected title", actualTitle, string);
    }



}


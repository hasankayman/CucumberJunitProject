package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaHomePage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class WikipediaStepDefinitions {
    WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();
    @Given("User is on the wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        //Assert.assertTrue(wikipediaHomePage.wikipediaSearchBox.isDisplayed());
        wikipediaHomePage.wikipediaSearchBox.sendKeys(string);

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaHomePage.wikipediaSearchButton.click();

    }
    @Then("User sees {string} in the wiki title")
    public void user_sees_in_the_wiki_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, string);

    }

    @Then("User sees {string} in the main header")
    public void user_sees_in_the_main_header(String string) {
        Assert.assertEquals(wikipediaHomePage.wikipediaMainHeader.getText(),string);
    }

    @Then("User sees {string} in the image header")
    public void userSeesInTheImageHeader(String string) {
        Assert.assertEquals(wikipediaHomePage.wikipideMainPictureHeader.getText(), string);


    }
}

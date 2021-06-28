package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableExampleStepDefinitions {
    @Given("User does something")
    public void user_does_something() {
        System.out.println("User does something");
    }
    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> fruitList) {
        System.out.println("fruitList.size() = " + fruitList.size());
    }

}

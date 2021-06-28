package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions{


    @Given("User is on the website login page")
    public void user_is_on_the_website_login_page() {
        System.out.println("User is on the website login page");
    }
    @When("User logins with correct username and password as Librarian")
    public void user_logins_with_correct_username_and_password_as_librarian() {
        System.out.println("User logins with correct username and password as Librarian");
    }
    @Then("Librarian Dashboard be displayed")
    public void librarian_dashboard_be_displayed() {
        System.out.println("Librarian Dashboard be displayed");

    }


    @When("User logins with correct username and password as Student")
    public void user_logins_with_correct_username_and_password_as_student() {
        System.out.println("User logins with correct username and password as Student");
    }
    @Then("Student Dashboard be displayed")
    public void student_dashboard_be_displayed() {
        System.out.println("Student Dashboard be displayed");

    }

    @When("User logins with correct username and password as Admin")
    public void user_logins_with_correct_username_and_password_as_admin() {
        System.out.println("User logins with correct username and password as Admin");
    }
    @Then("Admin Dashboard be displayed")
    public void admin_dashboard_be_displayed() {
        System.out.println("Admin Dashboard be displayed");

    }

    @Then("User sees title as Library")
    public void user_sees_title_as_library() {
        System.out.println("User sees the title as \"Library!\"");
    }

}

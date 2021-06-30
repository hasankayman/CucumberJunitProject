@smartbearLogin
Feature: Smartbear Login
  Agile Story: As a user, I should be able to login when I am on Smartbear login page.

  Background: User is on the Smartbear login page
    Given User is on the Smartbear login page

  Scenario: Smartbear login verification
    When User logins username and password
    Then User should see H1 Title on the top left
    And Browser will be automatically closed

  Scenario: Smartbear login fail verification
    When User enters wrong username and password
    Then User should see wrong username and password error message
    Then Browser will be automatically closed
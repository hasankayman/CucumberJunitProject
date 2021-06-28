@googleSearch
Feature: Google Search
  Agile Story: As a user, I should be able to search when I am on Google search page.

  Background: User is on the google search page
    Given User is on the google search page

  Scenario: Google default title verification
    Then User should see title is Google
    Then Browser will be automatically closed

  @search
  Scenario: Google search title verification
    When User searches a keyword in search box
    Then User should see title contains the keyword
    Then Browser will be automatically closed

  @search @keyword
  Scenario: Google title verification after keyword
    When User searches a "keyword" in search box
    Then User should see title contains the "keyword"
    Then Browser will be automatically closed

  @about
  Scenario: Google search page -About- link title
    Then User should see About link
    And User clicks About link
    Then User should see title is Google - About Google, Our Culture & Company News
    Then Browser will be automatically closed

    @googledatatable
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
      | Advertising               |
      | Business                  |
      | How Search works          |
      | Carbon neutral since 2007 |
      | Privacy                   |
      | Terms                     |


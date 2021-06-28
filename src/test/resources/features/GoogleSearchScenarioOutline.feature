@scenariooutline
Feature: Google Search with Scenario Outline
  Agile Story: As a user, I should be able to search when I am on Google search page.

  Scenario Outline: Google title verification after keyword
    Given User is on the google search page
    When User searches a "<searchValue>" in search box
    Then User should see title contains the "<expectedTitle>"

    Examples: Search values I want to search in Google

      | searchValue | expectedTitle |
      | hasan       | hasan         |
      | kayman      | kayman        |
      | books       | books         |
      | apple       | apple         |
      | El Paso     | El Paso       |


@wikipedia
Feature: Wikipedia Search Functionality
  Agile story: As a user, I should be able to make search from Wikipedia
  @smoke
 # Background: User is on the wikipedia home page
  Scenario:
    Given User is on the wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button

 #Scenario: I should be able to make a search
    Then User sees "Steve Jobs - Wikipedia" in the wiki title

 # Scenario: I should see search keyword in the main header
    Then User sees "Steve Jobs" in the main header

  #  Scenario: I should see search keyword in the image header
    Then User sees "Steve Jobs" in the image header

    Then Browser will be automatically closed

@wikiscenariooutline @fail @smoke
Feature: Wikipedia Search Functionality
  Agile story: As a user, I should be able to make search from Wikipedia


  Scenario Outline:
    Given User is on the wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" in the wiki title
    And User sees "<expectedMainHeader>" in the main header
    And User sees "<expectedImageHeader>" in the image header
    Then Browser will be automatically closed

    Examples: example test data for wikipedia search
      | searchValue   | expectedTitle             | expectedMainHeader | expectedImageHeader |
      | Steve Jobs    | Steve Jobs - Wikipedia    | Steve Jobs         | Steve Jobs          |
      | Eddie Murphy  | Eddie Murphy - Wikipedia  | Eddie Murphy       | Eddie Murphy        |
      | Gordon Ramsay | Gordon Ramsay - Wikipedia | Gordon Ramsay      | Gordon Ramsay       |
      | Bruce Lee     | Bruce Lee - Wikipedia     | Bruce Le          | Bruce Lee           |
      | Keanu Reeves  | Keanu Reeves - Wikipedia  | Keanu Reeves       | Keanu Reeves        |


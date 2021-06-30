@datatable
Feature: Example of how to implement data table
  @smoke
  Scenario: Something happens
    Given User does something
    Then User should see below words displayed
      | Apple    |
      | Kiwi     |
      | Orange   |
      | Cucumber |
      | Broccoli |

    #control alt L

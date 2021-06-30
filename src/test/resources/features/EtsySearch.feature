@etsy @smoke
Feature: ETSY Search
  Agile story: User should be able to enter search keywords and see
  relevant results in the page and in the title

  Background: User is on the etsy home page
    Given User is on the etsy home page

  Scenario: Title verification
    Then User should see title is as expected
    #expected : Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  Scenario: Etsy title verification after search
    Then User searches a "Wooden spoon" in Etsy search box
    And User clicks etsy search button
    Then User should see "Wooden spoon | Etsy" is in the title
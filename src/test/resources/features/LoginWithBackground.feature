@loginWithBackground @smoke
Feature: Login with Background Feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts: librarian, student, admin

  Background: User is on the website login page
    Given User is on the website login page
    Then User sees title as Library

  Scenario: Librarian login scenario
    When User logins with correct username and password as Librarian
    Then Librarian Dashboard be displayed

  @student @db
  Scenario: Student login scenario
    When User logins with correct username and password as Student
    Then Student Dashboard be displayed

  @db
  Scenario: Admin login scenario
    When User logins with correct username and password as Admin
    Then Admin Dashboard be displayed
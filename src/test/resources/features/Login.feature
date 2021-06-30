@login
Feature: Login Feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts: librarian, student, admin

  @librarian @employee @sunday
  Scenario: Librarian login scenario
    Given User is on the website login page
    When User logins with correct username and password as Librarian
    Then Librarian Dashboard be displayed

  @student @smoke
  Scenario: Student login scenario
    Given User is on the website login page
    When User logins with correct username and password as Student
    Then Student Dashboard be displayed

    @admin @employee @sunday
  Scenario: Admin login scenario
    Given User is on the website login page
    When User logins with correct username and password as Admin
    Then Admin Dashboard be displayed
@Signin
Feature: SignIn Test
  demo description

  Scenario: Verify the signin functionality
    Given browser is launched
    And url is opened
    When user has entered the userid as "abc123@gmail.com"
    And user has entered the password as "Welcome@111"
    And user has clicked on login button
    Then the home page should be displayed

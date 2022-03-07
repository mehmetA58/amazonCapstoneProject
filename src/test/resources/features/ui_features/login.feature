@login
@Regression
  @smoke
  @us01
Feature: login
  Scenario:US01_TC01 User must be able to login to the Site with a valid URL
    Given User goes to url.
    Then The user verifies that at "https://www.amazon.com/".
    And  The user closes the page.

  @us02
  Scenario: US02_TC01 The user should be able to login with valid information. (Positive Login)
    Given User goes to url.
    Then The user clicks the Sign-In button..
    When User enters valid email.
    Then The user clicks the continue button.
    When User enters valid password.
    Then The user clicks the Sign-In button.
    And The user sees the text "Hello,USER".
    Then User logs out of account
    And The user closes the page.

  Scenario: US02_TC02 The user should not be able to login with invalid information. (Negative Login)
    Given User goes to url.
    Then The user clicks the Sign-In button..
    When User enters valid email.
    Then The user clicks the continue button.
    When User enters invalid password.
    Then The user clicks the Sign-In button.
#    And The user sees the Your password is incorrect.
    And The user closes the page.

  Scenario: US02_TC03 The user should not be able to login with invalid information. (Negative Login)
    Given User goes to url.
    Then The user clicks the Sign-In button..
    When User enters invalid email.
    Then The user clicks the continue button.
#    And The user sees the Your password is incorrect.
    And The user closes the page.
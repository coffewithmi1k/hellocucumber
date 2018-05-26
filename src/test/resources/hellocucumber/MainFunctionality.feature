Feature: Smoke Tests

  Scenario: Check Home Page is opened
    Given user opens Home Page
    Then verify HomePage is Opened

  Scenario: Check Log in page is opened
    Given user opens Home Page
    And click on Log In link
    Then verify Log in Page Opened

  @run
  Scenario: User is able to log in with valid creds
    Given user opens Home Page
    And click on Log In link
    And Fills Log in form with valid creds
    And clicks on the Log In button
    Then verifies that user is logged In

  @define
  Scenario: User is able to register with valid data
    Given user opens Home Page
    And click on Log In link
    And enters valid email address
    And clicks Create an account button
    And Fills the register personal data form
    And Clicks register
    Then verifies that user is registered successfully


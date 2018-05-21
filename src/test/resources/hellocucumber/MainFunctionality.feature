Feature: Smoke Tests

  Scenario: Check Home Page is opened
    Given I open Home Page
    Then verify HomePage is Opened

  Scenario: Check Log in page is opened
    Given I open Home Page
    And click on Log In link
    Then verify Log in Page Opened
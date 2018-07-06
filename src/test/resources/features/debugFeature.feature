Feature: To debug errors


  @run
  Scenario: User is able to register with valid data
    Given user opens Home Page
    And click on Log In link
    And enters valid email address
    And clicks Create an account button
    And Fills the register personal data form
    And Clicks register
    Then verifies that user is logged In
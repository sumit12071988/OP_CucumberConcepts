Feature: Understanding Step Anti patterns and how to eliminate those

  Scenario: Scenario WITH Step Anti patterns
    Given I'm an existing customer of XYZ app
    When I enter username
    And I enter password
    * I enter the OTP received
    * I solve the CAPTCHA puzzle
    * I click on Login Btn
      # * can be used as a "continuation" of multiple test steps with "And" keyword
    Then I've logged in to the application
    And url title becomes 'Homepage Title'
    And footer grid has Facebook icon
    And footer grid has LinkedIn icon
    And footer grid has Twitter icon
    And the login record should be created in Database
      # NEVER ADD TECHNICAL INFO LIKE DB, JSON etc.. INSIDE FEATURE FILE. ABOVE LINE SHOULD NOT BE PART OF FEATURE FILE

  Scenario: Scenario WITHOUT Step Anti patterns
    Given I'm an existing customer of XYZ app
    When I login using user credentials
    Then I logged In
      # All the multiple steps/ assertions can be added in Step Definition of that above One-Liners


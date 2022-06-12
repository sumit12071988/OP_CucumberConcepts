# ----------- RULES OF CUCUMBER FEATURE FILES --------------
  # 1. 1 FEATURE FILE ==> 1 FEATURE.
  #            We cannot have multiple features using "Feature: " Keyword in same Feature file.
  # 2. Tags (@tag keyword) can be used to group multiple features from different feature files.


# DIFFERENCE B/W FEATURE AND USER STORY ?
  # A FEATURE (in Feature file) represents requirement. Similarly a USER STORY in AGILE methodology represents requirement
  # 1 USER STORY ==> 1 FEATURE
  # 1 FEATURE ==> 1 OR more USER STORIES

@2ndFeature
Feature: Add to cart
# Description will be the USER STORY represented in Agile by BA in Confluence in JIRA

# From Cucumber perspective, Title after "Feature:" keyword and descriptions below the "Feature: " keyword
#   will be ignored at runtime, but this info will appear in report. Thus putting above info is important from
#   documentation perspective.

# One Feature/ Feature file can have only 1 background for all the scenarios
  Background: Sample Background

# Each Rule can have its own Background
  Rule: rule #1
    Background: Sample Background for rule #1
    Scenario: Dummy Scenario title
    Dummy Scenario Description
      # A SCENARIO is same as Test Scenario/ Test Case we write for a Feature
      # A SCENARIO illustrates the BEHAVIOR of the SYSTEM and not of the test and the BEHAVIOR is derived from the requirement
      # A SCENARIO can have Title and Description just like that of Feature
      # Steps in a SCENARIO are OPTIONAL.
      # A FEATURE can have multiple SCENARIOS
      # A FEATURE can be bound to a specific RULE
      # Multiple SCENARIOS can be grouped using TAGS
      # A SCENARIO can have TEST STEPS represented by Given, When, Then, And, But etc..
      # TEST STEPS shouldn't exceed beyond 3-5 or max 5-8 since these Scenarios are suppose to be interpreted by Business/ Stakeholders/ Non-Technical people
      #     adding lot of steps will create issue with them understanding the Scenario.
      # "Given " Keyword is not mandatory. Using "When " before "Given " can work but doesn't make any sense while interpretation.
      # Can use * instead of Keywords like Given, When, Then, And, But etc.. and Cucumber can still run the feature file. but will create issue
      #     in interpretation for the Business/ Stakeholders/ Non-Technical people
      # Keywords Given, When, Then, And, But are ignored in step definition files.
      #     Thus replacing keyword "Given" with "When" in Feature file or replacing annotation @Given with @When in Step Definition File will not
      #     make any difference.
      Given I'm dummy
      When I'm dummy
      Then I'm dummy
      And I'm dummy
      But I'm dummy
      * I'm dummy
      # Above Test Steps will point to same Step Definition
      When I do dummy things
      Then dummy things happen

  Rule: rule #2
    Background: Sample Background for rule #2
    Scenario: Dummy Scenario 2
      Given I have a current account
      But I forgot to bring my debit card
      # But ==> Used to represent -ve emotion
      Given my Account balance is $100
      # Given ==> PreConditions
      #   Can have multiple "Given" using "And"
      When I withdraw $50
      # When ==> Steps to Reproduce
      #   Can have multiple "When" steps but recommended is not more than 2
      #   If exceeds 2, then we need to split it into multiple scenarios
      Then account balance should become $50
      And receipt should be sent via email
      # Then ==> Expected Result, thus assertions are used in Step Definitions of this Test Step
      But the receipt should NOT be sent via SMS
      * the customer should sent back an acknowledgement notification via email
      # * can be used instead of any keywords like Given, When, Then, And, But etc..
# ----------- RULES OF CUCUMBER FEATURE FILES --------------
  # 1. One Feature File can only have one feature. Thus we cannot have multiple features using "Feature: " Keyword in same Feature file.
  # 2. Tags (@tag keyword) can be used to group multiple features from different feature files.


# DIFFERENCE B/W FEATURE AND USER STORY ?
  # A Feature in Feature file represents requirement. Similarly a USER STORY in AGILE methodology represents requirement
  # A Feature in Feature File can have one USER STORY or multiple USER STORIES
  # A USER STORY cannot have multiple features.

@dummyTag
Feature: Add to cart
# Description will be the USER STORY represented in Agile by BA in Confluence in JIRA
  As a customer of xyz app              ==> Represents ACTOR
  I want to add a product to the cart   ==> Represents ACTION that ACTOR need to perform
  So that I can purchase the product    ==> Represents OUTCOME of the ACTION done by the ACTOR

# From Cucumber perspective, Title after "Feature:" keyword and descriptions below the "Feature: " keyword
#   will be ignored at runtime, but this info will appear in report. Thus putting above info is important from
#   documentation perspective.

# One Feature/ Feature file can have only 1 background for all the scenarios
  Background: Sample Background

# Each Rule can have its own Background
  Rule: rule #1
    Background: Sample Background for rule #1

    # A Scenario is same as Test Scenario/ Test Case we write for a Feature
    # Here a Scenario illustrates the BEHAVIOR of the SYSTEM and not of the test and the BEHAVIOR is derived from the requirement
    # A Scenario can have Title and Description just like that of Feature
    # Can have multiple SCENARIO for a FEATURE.
    # Can bind a SCENARIO to a specific RULE
    # Can group multiple scenarios using TAGS
    Scenario: Dummy Scenario
    This is my 1st Scenario

      # A Scenario can have TEST STEPS represented by Given, When, Then, And, But etc..
      # TEST STEPS shouldn't exceed beyond 5-8 since these Scenarios are suppose to be interpreted by Business/ Stakeholders/ Non-Technical people
      #     adding lot of steps will create issue with them understanding the Scenario.
      # "Given " Keyword is not mandatory. Using "When " before "Given " doesn't make any sense.
      # Can use * instead of Keywords like Given, When, Then, And, But etc.. and Cucumber can still run the feature file. but will create issue
      #     in interpretation for the Business/ Stakeholders/ Non-Technical people
      # Keywords Given, When, Then, And, But are ignored in step definition files.
      #   Thus replacing keyword "Given" with "When" in Feature file or replacing annotation @Given with @When in Step Definition File will not
      #   make any difference.
      Given I'm dummy
      When I'm dummy
      # Above Two Test Steps will point to same Step Definition
      When I do dummy things
      Then dummy things happen

  Rule: rule #2
    Background: Sample Background for rule #2
    Scenario: Dummy Scenario
      Given I'm dummy
      When I do dummy things
      Then dummy things happen




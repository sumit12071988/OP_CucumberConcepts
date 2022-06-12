# Rule:
#  This keyword is introduced in Gherkin from Cucumber v6
#  Used to represent ONE BUSINESS RULE which should be implemented
#  FEATURE i.e. USER STORY can have multiple Business Rules
#  RULE can contain multiple SCENARIOS
#  Used to GROUP several Scenarios which belong to a specific BUSINESS RULE

Feature: To Add Products to the Cart

  Background: Common steps for all scenarios within Feature

  Rule: Add from Store
  This is Rule #1
    Background: Common steps for all scenarios within Rule 1
    Scenario: scenario #1
    Scenario: scenario #2


  Rule: Add from Product Page
  This is Rule #2
    Background: Common steps for all scenarios within Rule 2
    Scenario: scenario #3
    Scenario: scenario #4


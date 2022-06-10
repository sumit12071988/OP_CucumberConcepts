Feature: Add to Cart
  As a customer for XYZ App
  I want to add a product to the cart
  So that I can purchase the product

# ------------- BACKGROUND ---------------------------------------------------------------------------------------------
#     Executes AFTER @Before hook
#     Contains common TEST STEPS which will get executed EVERYTIME BEFORE EVERY SCENARIO STARTS
#     A FEATURE can have only 1 Background
#     A FEATURE can have multiple RULE
#     Each RULE can have 1 Background

#  ------------ BACKGROUND RULES ---------------------------------------------------------------------------------------
#  1. No Technical & complicated stuffs
#         Technical stuffs will be added in @Before HOOKS. e.g :
#           a. WebDriver initialization
#           b. Setting up DB
#           c. Fetching a Token etc..
#  2. Keep it Short, Expressive and Vivid
#         Background should not have more than max 4 steps. Exceeding that indicates that we're adding irrelevant steps.
#           Those needs to be added in @Before HOOKS.
#         It should be Expressive in terms of requirement specs.
#         It should be Vivid which means the Test steps inside here should produce clear visual image
#  4. Keep SCENARIOS short which are associated with BACKGROUND
#        Keeping SCENARIOS Short to keep Background IN FOCUS and avoid scrolling down and lose focus from Background.
#  ---------------------------------------------------------------------------------------------------------------------



#  Feature level Background
  Background: Common Test Steps which needs to be executed 1st before every scenario
    Given I'm Bill
    And I'm logged in

  Rule: Sample Rule #1
    # Rule Level Background
    Background: Rule Level Background #1
    Scenario: Bill can do x thing
      When I do x thing
      Then x thing should happen

  Rule: Sample Rule #2
    # Rule Level Background
    Background: Rule Level Background #2
    Scenario: Bill can do y thing
      Given I'm exploring something
      When I do y thing
      Then y thing should happen
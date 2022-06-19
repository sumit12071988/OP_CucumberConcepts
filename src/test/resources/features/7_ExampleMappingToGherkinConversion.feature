Feature: Add to cart
  <Describe more about this FEATURE>

  Rule: Add products via Store
  <Describe more about this RULE>

    Scenario: Adding 1 Product to Cart - INCORRECT WAY DUE TO ANTI-PATTERNS
    <Describe more about this SCENARIO>

      Given I'm on the Home page and I navigate to the Store page by pressing "Store" menu option
      When I locate the product "Blue Shoes" and click on "Add to cart" button
      Then the "Add to cart" button changes and a tick mark is shown inside it
      And "View Cart" link is shown
      When I click on "View Cart" link
      Then I'm navigate to the Cart page
      When I check product name and quantity
      Then the product name is "Blue Shoes"
      And the product quantity is 1

#      Q: Why to avoid Anti patterns ?
#      A:  1. READABILITY & BETTER COLLABORATION
#                SCENARIO's should be self explanatory as those will be used by Business
#                 Keeping SCENARIO's short and self explanatory will help with increased collaboration between the 3 Amigos
#                     i.e. BA, DEV & QA
#          2. REUSABILITY
#                TEST STEPS should be made reusable so that same Step-definition associated with the TEST STEP can be
#                    reused for other SCENARIO's
#          3. MAINTAINABILITY
#                Writing scenario which only requires changes when REQUIREMENT changes instead of IMPLEMENTATION changes
#                    has a high maintainability as not much changes are required in feature file


    Scenario: Adding 1 Product to Cart - CORRECT WAY
      Given I'm on Store page
      When I add "Blue Shoes" to the Cart
      Then I see 1 "Blue Shoes" in the Cart

    @scenario3
    Scenario Outline: Adding 1 Product to Cart - Using Examples
      Given I'm on Store page
      When I add "<productName>" to the Cart
      Then I see 1 "<productName>" in the Cart
      Examples:
        | productName  |
        | Blue Shoes   |
        | Yellow Shoes |
#        | Red Shoes    |
#        | Green Shoes  |
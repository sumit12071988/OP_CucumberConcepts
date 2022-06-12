@CustomParameter
Feature: Add to Cart
  Rule: Add from Store
    Scenario Outline: Add a quantity to the cart
      Given I'm on the store page
      When I add a "<productName>" to the Cart
      Then I see 1 "<productName>" in the Cart
      Examples:
        | productName |
        | Blue Shoes  |


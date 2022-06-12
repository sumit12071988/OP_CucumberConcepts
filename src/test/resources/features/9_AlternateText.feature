Feature: To understand Alternate Text in Cucumber

  @AlternateText
  Scenario Outline: Scenario #1
    Given I'm on Store page
    When I add 1 "<product>" in the cart
    And I add 2 "<product>"s in the cart
    Examples:
      | product    |
      | Blue Shoes |

  @AlternateText
  Scenario Outline: Scenario #2
    Given I'm on Product page
    When I add 1 "<product>" in the cart
    And I add 2 "<product>"s in the cart
    Examples:
      | product    |
      | Blue Shoes |
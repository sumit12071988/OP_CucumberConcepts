Feature: To understand Optional Text in Cucumber

  @optionalText
  Scenario Outline: Using Optional Text
    Given I'm on Store page
    When I add 1 "<product>" in the cart
    And I add 2 "<product>"s in the cart
    Examples:
      | product    |
      | Blue Shoes |
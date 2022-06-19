@featureTag1
Feature: Sample Feature B
  As a customer of xyz app              ==> Represents ACTOR
  I want to add a product to the cart   ==> Represents ACTION that ACTOR need to perform
  So that I can purchase the product    ==> Represents OUTCOME of the ACTION done by the ACTOR

    Scenario Outline: Sample Scenario #4
      Given I'm on the Store Page
      When I add "<product_name>" to the Cart
      Then I see 1 "<product_name>" in the Cart

      Examples:
        | product_name |
        | Blue Shoes   |
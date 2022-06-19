@featureTag1
Feature: Sample Feature A
  As a customer of xyz app              ==> Represents ACTOR
  I want to add a product to the cart   ==> Represents ACTION that ACTOR need to perform
  So that I can purchase the product    ==> Represents OUTCOME of the ACTION done by the ACTOR

  @ruleCheckingTag1
  Rule: Sample Rule 1

  @scenarioCheckingTag1
  Scenario Outline: Sample Scenario #1
    Given I'm on the Store Page
    When I add "<product_name>" to the Cart
    Then I see 1 "<product_name>" in the Cart

    @QA_Tag
    Examples: In QA Environment
      | product_name |
      | Blue Shoes   |

    @Stage_Tag
    Examples:In Staging Environment
      | product_name |
      | Red Shoes    |

  Scenario Outline: Sample Scenario #2
    Given I'm on the Store Page
    When I add "<product_name>" to the Cart
    Then I see 1 "<product_name>" in the Cart

    Examples:
      | product_name |
      | Blue Shoes   |

  Rule: Sample Rule 2
    Scenario Outline: Sample Scenario #3
      Given I'm on the Store Page
      When I add "<product_name>" to the Cart
      Then I see 1 "<product_name>" in the Cart

      Examples:
        | product_name |
        | White Shoes  |
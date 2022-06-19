@featureTagX @featureTagY
Feature: Sample Feature
  As a customer of xyz app              ==> Represents ACTOR
  I want to add a product to the cart   ==> Represents ACTION that ACTOR need to perform
  So that I can purchase the product    ==> Represents OUTCOME of the ACTION done by the ACTOR

  @ruleTag1 @ruleTag2
  Rule: Sample Rule

  @scenarioTag1 @scenarioTag2
  Scenario Outline: Sample Scenario #1
    Given I'm in Page #1
    When I add "<product_name>" to the Cart
    Then I get Output #1

    @QAEnvironment @exampleTag1 @exampleTag2
    Examples:
      | product_name |
      | Blue Shoes   |
      | Red Shoes    |

    @StagingEnvironment @exampleTag3 @exampleTag4
    Examples:
      | product_name |
      | Blue Shoes   |
      | Red Shoes    |

    @ProdEnvironment @exampleTag5 @exampleTag2
    Examples:
      | product_name |
      | Blue Shoes   |
      | Red Shoes    |
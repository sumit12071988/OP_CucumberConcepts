Feature: To understand Scenario Outline

  Scenario: Sample Scenario #1
    Given my Account balance is $100
    When I withdraw $50
    Then the account balance should become $50

  Scenario: Sample Scenario #2
    Given my Account balance is $50
    When I withdraw $50
    Then the account balance should become $0

# --------------- USING SCENARIO OUTLINE -----------------------------
  Scenario Outline: Single Scenario to cover above two scenarios
    Given my Account balance is $<Opening Balance>
    When I withdraw $<Withdrawal Amount>
    Then the account balance should become $<Closing Balance>

    @QA
    Examples:
#    Adding Tag to an example is a good way to use different test data for different environments
      | Opening Balance | Withdrawal Amount | Closing Balance |
      | 100             | 50                | 50              |
      | 50              | 50                | 0               |
      | 90              | 10                | 80              |
      | 50              | 20                | 30              |

    @Staging
    Examples:
#    Adding Tag to an example is a good way to use different test data for different environments
      | Opening Balance | Withdrawal Amount | Closing Balance |
      | 100             | 50                | 50              |
      | 50              | 50                | 0               |
      | 90              | 10                | 80              |
      | 50              | 20                | 30              |
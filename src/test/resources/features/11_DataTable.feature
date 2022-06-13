@DataTableFeature
Feature: Understanding Data Tables

  Scenario: Single Row No Header
    Given I've single set of data to enter
      | John | John123 |

  Scenario: Multiple Row No Header
    Given I've multiple sets of data to validate
      | John | John123 |
      | Bill | Bill123 |

  Scenario: Single Row with No Header Data Table Type
    Given Single Row with No Header Data Table Type
      | John | John123 |

  Scenario: Multiple Rows with No Header Data Table Type
    Given Multiple Rows with No Header Data Table Type
      | John | John123 |
      | Bill | Bill123 |

  Scenario: Single Row with Header | List of List of Strings
    Given Single Row with Header using | List of List of Strings
      | username | password |
      | john     | john123  |
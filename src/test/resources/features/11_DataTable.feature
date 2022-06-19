@DataTableFeature
Feature: Understanding Data Tables

  Scenario: Single Row NO Header
    Given Single Row NO Header
      | John | John123 |

  Scenario: Multiple Rows NO Headers
    Given Multiple Rows NO Headers
      | John | John123 |
      | Bill | Bill123 |

  Scenario: Single Row WITH Header | List of List of Strings
    Given Single Row WITH Header | List of List of Strings
      | username | password |
      | john     | john123  |

  Scenario: Single Row WITH Header | List of Maps
    Given Single Row WITH Header | List of Maps
      | username | password |
      | john     | john123  |

  Scenario: Multiple Rows WITH Headers
    Given Multiple Rows WITH Headers
      | username | password |
      | john     | john123  |
      | bill     | bill123  |

  Scenario: Single Column with no Header
    Given Single Column with no Header
      | john    |
      | john123 |

  Scenario: Single Column WITH Header
    Given Single Column WITH Header
      | username |
      | john     |
      | bill     |

  Scenario: Single Column WITH SIDE Header
    Given Single Column WITH SIDE Header
      | username | john    |
      | password | john123 |

  Scenario: Data Table Type | Single Row NO Header
    Given Data Table Type | Single Row NO Header
      | John | John123 |

  Scenario: Data Table Type | Multiple Rows NO Header
    Given Data Table Type | Multiple Rows NO Header
      | John | John123 |
      | Bill | Bill123 |

  Scenario: Data Table Type | Single Row WITH Header
    Given Data Table Type | Single Row WITH Header
      | username | password |
      | john     | john123  |

  Scenario: Data Table Type | Multiple Rows WITH Header
    Given Data Table Type | Multiple Rows WITH Header
      | username | password |
      | John     | John123  |
      | Bill     | Bill123  |

  Scenario: Data Table Type | Single Column NO Header
    Given Data Table Type | Single Column NO Header
      | john    |
      | john123 |

  Scenario: Data Table Type | Single Column WITH SIDE Header
    Given Data Table Type | Single Column WITH SIDE Header
      | username | john    |
      | password | john123 |

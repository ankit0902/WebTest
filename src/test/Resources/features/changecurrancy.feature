Feature: User should able to change the currency and able to see all products price with changed currancy.

  Scenario: User should able to see product prices  with selected currency symbol.
    Given user is on  homepage
    When user selects Euro from currency drop down box.
    Then user should able to see product prices  with Euro symbol.
    When user selects US Dollar from currency drop down box.
    Then user should able to see product prices  with US Dollar  symbol.


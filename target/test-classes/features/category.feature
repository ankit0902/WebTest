Feature: User compare two product successfully

  Scenario: user should able to compare two product
    Given User should be on HomePage
    When click on Jwelery Button
    And click on add to compare list on first item
    And click on add to compare list on second item
    And click on product comparision from green navigational Bar
    Then user should able to navigate compare product page



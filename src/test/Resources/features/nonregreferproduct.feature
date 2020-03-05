Feature: Non Registered user should not able to refer product to friend

  Scenario: Non Registered user can not refer product to friend
    When User on HomePage
    And click on computer category
    And click on desktop from categories
    And click on item
    And click on email a friend button
    And enter friend's email address details
    And click on send email button
    Then user able to see error message



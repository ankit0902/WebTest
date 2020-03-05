Feature: User should be able to checkout successfully with all compulsory fields



  Scenario: User should be able to Checkout successfully
    Given user is already on  homepage
    When user clicks on Book link
    And user clicks on ADD TO CART button.
    And user clicks on Shopping cart.
    And user clicks on I agree terms and conditions checkbox.
    And user clicks on Checkout.
    And user clicks Checkout as guest button.
    And user enters Checkout Details
    Then user should able to see successful message



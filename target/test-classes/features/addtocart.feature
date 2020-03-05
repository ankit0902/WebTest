Feature: User should able to verify that Add to cart button is present on all homepage products.

  Scenario: User should able to see Add to cart button on all homepage products.
    Given user is already on  homepage of https://demo.nopcommerce.com/
    When user Checks Add to cart button is present on all homepage products.
    Then user should able to see Add to cart button on all homepage products.

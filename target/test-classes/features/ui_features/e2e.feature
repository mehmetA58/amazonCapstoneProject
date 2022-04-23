@UIE2e
Feature:UI E2E
  Scenario Outline: e2e
    Given User goes to url.
#    Then The user clicks the Sign-In button..
#    When User enters valid email.
#    And The user clicks the continue button.
#    When User enters valid password.
#    And The user clicks the Sign-In button.
    When User types the "<product name>" in the search box.
    And User selects first product in list
    Then User clicks Add the product to Cart
    And User goes to cart.
    And The user closes the page.
    Examples:
      | product name |
      | water|


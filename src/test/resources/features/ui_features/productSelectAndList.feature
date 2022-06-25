@Regression
  @smoke
  @product
Feature: product
  @us04
  Scenario Outline: US04_TC01 When the user searches for a product, all listed products must contain the searched word

    Given User goes to url.
    When User types the "<product name>" in the search box.
    Then User verifies that the "<product name>" he is looking for includes the products listed.
    And  The user closes the page.
    Examples:
      | product name |
      | mango |
      | nutella |
      | suite case |

  @us05
  Scenario Outline:US05_TC01 User should be able to use filters and sorting in product listing process

    Given User goes to url.
    When User types the "<product name>" in the search box.
    Then The user selects the appropriate filter to list the products he has listed.
    #And The user sees that the filtered products are listed.
    And The user closes the page.
    Examples:
      | product name |
      | macbook |
      | gaming mouse |


  Scenario Outline: US06_TC01 User should be able to choose random products and add to cart. You should see that the total price of the added products and the total in the basket are the same.
    Given User goes to url.
    When The user searches and lists the "<products>" he wants to buy in the search box
    Then The user chooses the products he wants to buy.
    And User goes to cart.
    And The user confirms that the selected products have been added to the cart.
    Then The user confirms that the total price of the selected products is the same as the total price in the basket.
  #And The user closes the page.
    Examples:
      | products |
      | macbook |
      | gaming mouse |

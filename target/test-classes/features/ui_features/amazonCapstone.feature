@Regression
Feature:US01
  Scenario:US01_TC01 User must be able to login to the Site with a valid URL
    Given User goes to url.
    Then The user verifies that at "https://www.amazon.com/".
    And  The user closes the page.


  Scenario: US02_TC01 The user should be able to login with valid information. (Positive Login)
    Given User goes to url.
    Then The user clicks the Sign-In button..
    When User enters valid email.
    Then The user clicks the continue button.
    When User enters valid password.
    Then The user clicks the Sign-In button.
    And The user sees the text "Hello,USER".
    Then User logs out of account
    And The user closes the page.

  Scenario: US02_TC02 The user should not be able to login with invalid information. (Negative Login)
    Given User goes to url.
    Then The user clicks the Sign-In button..
    When User enters valid email.
    Then The user clicks the continue button.
    When User enters invalid password.
    Then The user clicks the Sign-In button.
    And The user sees the Your password is incorrect.
    And The user closes the page.

  Scenario: US02_TC03 The user should not be able to login with invalid information. (Negative Login)
    Given User goes to url.
    Then The user clicks the Sign-In button..
    When User enters invalid email.
    Then The user clicks the continue button.
    When User enters valid password.
    Then The user clicks the Sign-In button.
    And The user sees "We cannot find an account with that email address"
    And The user closes the page.

  Scenario: US03_TC01 The user should be able to select any category from the ALL menu and see the subcategories listed.
    Given  User goes to url.
    When kullanici ALL butonuna tiklar
    Then kullanici "Electronics" Basligina Tiklar
    And The user should be able to see and click all the titles in the ALL menu.
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
  #And The user closes the page.
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

Scenario: US07_TC01 The user should make sure that the links in any row or column of the links at the bottom of the home page lead to the correct page.
  Given User goes to url.
  When User goes to FOOTER.
  Then The user clicks on a link.
  And The user verifies the title of the page he is directed to.
  And The user closes the page.



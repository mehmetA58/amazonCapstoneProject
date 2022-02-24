Feature:Create And Delete ShopingList

  Background:US_08_09
  Given User goes to url.
  Then The user clicks the Sign-In button..
  When User enters valid email.
  Then The user clicks the continue button.
  When User enters valid password.
  Then The user clicks the Sign-In button.
  And User hover-over Account &Lists.
  When The user clicks on the Create a List link.
  Then User clicks Create a List button.
  Then User enters List Name.
  And User clicks end of Create a List button.


   Scenario:US_08 User should be able to create and delete shoppingList.

     Given User verifies that the list is created.
     Then User goes to Manage list.
     And User clicks on Delete list button
     And The user confirms that the list has been deleted.
     And The user closes the page.



  Scenario Outline: US_09 User should be able to create and delete shoppingList.
      When User types the "<products>" in the search box.
      Then The user goes to the product page.
      And User clicks Add to List button.
      Then The user confirms that the selected product has been added to the list.
      And The user clicks the View Your List button and sees the List.
      Then The user clicks the Delete button and sees the Deleted alert.
      And The user closes the page.
     Examples:
     | products |
     | iphone 13 512|




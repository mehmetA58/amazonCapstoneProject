@Regression
Feature: All Menu

  Scenario: US03_TC01 The user should be able to select any category from the ALL menu and see the subcategories listed.
    Given  User goes to url.
    When kullanici ALL butonuna tiklar
    Then kullanici "Electronics" Basligina Tiklar ve daha sonra "Computers & Accessories"
    And assert titles for "Computers"
    And The user closes the page.
Feature: Trello Board Create

  Scenario: Create board

    Given Send request for create "AmazonCapStone" board

    And   Assert board name is "AmazonCapStone"

  Scenario: Create a New Card

    Given Send request for create "3/3/2022" card


  Scenario: Get a New Card


  Scenario: Delete Card


  Scenario: Delete Board
      Given Send request for delete "kk5RDIXS"
#      Then  Assert status code 200
      #And   Assert Deleting

Scenario: Create example
  Given birtane board create edelim.

  Scenario: Create a card
    Given birtane card create edelim
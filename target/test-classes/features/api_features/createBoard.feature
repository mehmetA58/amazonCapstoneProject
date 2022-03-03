Feature: Trello Board Create

  Scenario: Create board

    Given Send request for create "AmazonCapStone" board

    And   Assert board name is "AmazonCapStone"

  Scenario: Create a New Card

    Given Send request for create "3/3/2022" card


  Scenario: Get a New Card


  Scenario: Delete Card


  Scenario: Delete Board
      Given Send request for delete "M3Xtk3tb"
#      Then  Assert status code 200
      #And   Assert Deleting


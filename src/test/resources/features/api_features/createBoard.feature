Feature: Trello Board Create

  Scenario: Create board

    Given Send request for create "moon" board
    Then  Assert status code 200
    And   Assert board name is "moon"


    Scenario: Delete Board
      Given Send request for delete "621e8cfc78bc251c8c2b4f93"
      Then  Assert status code 200
      #And   Assert Deleting
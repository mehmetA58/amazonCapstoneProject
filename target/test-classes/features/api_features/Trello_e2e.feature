
Feature: Trello E2E Test
  @e2e
  Scenario: Create New Board POST
    Given Send request for create "amazonCapStoneTrelloProje" board
    Then Send request for create "Mehmet'sCard" card and "AhmetCard's"
    When Send request for update "Mehmet'sCard update edildi" board
    And Send request for delete card
    And Send request for delete board




      
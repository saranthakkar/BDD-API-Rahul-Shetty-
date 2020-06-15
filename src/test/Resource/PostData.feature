Feature:
  Scenario: users wants to add new location using POST method
    Given user is on baseURI
    When user create new location in the server using POST method
    Then user should be able to see correct location and correct status code
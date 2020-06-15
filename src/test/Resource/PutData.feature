Feature:
  Scenario: user wants to update an existing data by using PUT method
    Given user is on baseURI of website - Rahul Shetty
    When user uses PUT method with resources and query parameters
    Then user should be able to see new updated data
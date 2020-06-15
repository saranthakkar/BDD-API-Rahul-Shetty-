Feature:
  Scenario: user wants to get the data from server
    Given user is on baseURI of Rahul Shetty
    When user uses GET method and selects resources and query parameters
    Then user should be able to see correct response, correct status code with JSON Content type
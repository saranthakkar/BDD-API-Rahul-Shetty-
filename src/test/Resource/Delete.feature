Feature:
  Scenario: user wants to delete data - place ID from server
    Given user is on baseURI homepage
    When user uses DELETE method with resource and query parameters
    Then user should be ale to see that place ID has been successfully deleted
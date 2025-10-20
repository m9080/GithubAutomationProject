Feature: GitHub Login and Logout

  Scenario: Login with valid credentials and logout
    Given I launch the GitHub login page
    When I enter valid username and password
    And I click the login button
    Then I should be logged in successfully
    And I log out from GitHub
    And I clear browser cookies

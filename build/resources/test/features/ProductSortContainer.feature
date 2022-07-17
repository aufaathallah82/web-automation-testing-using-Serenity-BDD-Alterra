@Web
Feature: Product Sort Container

  @Login
  Scenario: Product Sort Container
    Given user input "standard_user" and "secret_sauce"
    And user click login button
    Then user success login
    Given user click Product Sort Container
    Then user can see the list
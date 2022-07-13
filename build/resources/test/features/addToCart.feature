@Web
Feature: Add To Cart

  @Login
  Scenario: Add To Cart
    Given user input "standard_user" and "secret_sauce"
    And user click login button
    Then user success login
    Given user click add to cart
    Then user can see the shopping cart added
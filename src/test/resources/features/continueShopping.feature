@Web
Feature: Remove Sauce Lab Backpack

  @Login
  Scenario: Remove Sauce Lab Backpack
    Given user input "standard_user" and "secret_sauce"
    And user click login button
    Then user success login
    Given user click add to cart
    Then user can see the shopping cart added
    Given user click the shopping cart
    Then user can see cart list
    Given user click continue shopping button
    Then  user can see page wrapper
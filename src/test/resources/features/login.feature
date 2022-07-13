@Web
Feature: login test examples data

  @Login
  Scenario Outline: Test Login
    Given User input "<username>" and "<password>"
    And User click button login
    Then User success login
    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |


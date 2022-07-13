@Web
  Feature: Login Feature

    @Login
    Scenario Outline: Login
      And user input "<username>" and "<password>"
      And user click login button
      Then user success login

      Examples:
      |username         |  password     |
      |standard_user    | secret_sauce  |
#      |locked_out_user  | secret_sauce  |
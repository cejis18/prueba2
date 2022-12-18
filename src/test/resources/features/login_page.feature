Feature: I as a user want to log in to serenity

  Background:
    Given The user enters the serenity.io page

  Scenario: Me as a user Sign in to the application with a registered user
    When The user enters the correct username and password
      | userName | password |
      | admin    | serenity |
    Then The user sees the home page admin


  Scenario: I as a user want to enter incorrect credentials
    When The user enters the correct username and password
      | userName | password |
      | noexiste | noexiste |
    Then The user displays an alert with the message Usuario o contraseña invalido!

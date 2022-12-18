Feature: Help  
  Scenario:  client want help about something
  Given the client is signed in
    When client want any help  
    Then the client call the admin
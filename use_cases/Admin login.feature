Feature: search for a client

  Scenario:  employee logs in succesfully
    Given the correct password is 123 and correct id is 222
    When user fills id with 222 and password with 123
    Then give admin authorities and go to admin page

 Scenario:  employee has the wrong password
    When  user fills id with 11 and password with 22
    Then  don't give admin authorities
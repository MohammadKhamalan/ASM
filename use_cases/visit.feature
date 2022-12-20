Feature: client visit

  Scenario:  client visit done succesfully
    Given the client is logged in to his account
    When the client want to visit bank to do any services and this time is available
    Then Reservation is done successfully
    
    

 Scenario:  another visit program on this time
    When  time the client want to visit is unavailable
    Then  give error message thet "Reservation not available in this time"
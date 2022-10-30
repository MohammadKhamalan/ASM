Feature: update appointment visit

  Scenario:  client update done succesfully
    Given the client already made resevartion
    When the client want to change appointment visit bank to another appointment and the new appointment is available
    Then update Reservation is done successfully
    
     Scenario:  client update failed
    Given the client already made resevartion
    When the client want to change appointment visit bank to another appointment and the new appointment is unavailable
    Then Reservation is failed and given error message
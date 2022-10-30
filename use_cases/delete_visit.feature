Feature: Delete appointment visit

  Scenario:  client delete done succesfully
    Given the client already made resevartion
    When the client want to delete appointment visit bank 
    Then Delete Reservation is done successfully
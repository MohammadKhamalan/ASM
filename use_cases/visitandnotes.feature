Feature: Is visit and add notes

  Scenario:  Not visited yet
    Given the client already made resevartion
      When the client not comming to the bank 
    Then the client is not visited the bank
    
     Scenario: the visitor has done his visit
    Given the client already made resevartion
    When the client comming to the bank 
     Then the visitor has done his visit and may add his notes
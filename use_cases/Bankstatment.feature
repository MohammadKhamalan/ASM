Feature: check money 
  Scenario:  client is exsist and have the money he want to check
    Given that the client is signed in his account 
    When user fills id with 222 and password with 222
    And determine the amount that he owns in his account
    Then accept client authorities

 Scenario:  client have money and he is not signed in his account  
 Given that the client is not signed in
	When user fills check his money on the bank
	Then don't accept client authorities and the error message "client singed required" is given
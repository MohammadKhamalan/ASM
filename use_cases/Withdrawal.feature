Feature: withdrawal money 
  Scenario:  client is exsist and want to withdrawal the money from his account
    Given that the client is signed in his account 
    When user fills id with 222 and password with 222
    And determine the available amount that he want to withdrawal 
    Then accept client authorities
    
    
    Scenario:  client is exsist and want to withdrawal the money that is not available in balance in his account
    Given that the client is signed in his account 
    When user fills id with 222 and password with 222
    And determine the  amount that is not available in the account withdrawal 
	Then don't accept client authorities and the error message "amount is not available in account !" is given    

 Scenario:  client isnt signed and want to withdrawal the money 
 Given that the client is not signed in
	When user fills amount of money to withdrawal
	Then don't accept client authorities and the error message "client singed required !" is given

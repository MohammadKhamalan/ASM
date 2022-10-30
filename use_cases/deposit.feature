Feature: deposite money 
  Scenario:  client is exsist and have the money he want to add
    Given that the client is signed in his account 
    When user fills id with 222 and password with 222
    And determine the amount to be deposited and and send
    Then accept client authorities

 Scenario:  client add money and he is not signed in his account  
 Given that the client is not signed in
	When user fills amount of money to add
	Then don't accept client authorities and the error message "client singed required" is given
Feature: give invoice  
  Scenario:  client has successfully received the invoice 
  Given the client is signed in and the employee logged in
    When client went to visit the bank
    Then the employee give invoice to the client

  
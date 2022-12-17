Feature: sign up client
	 Actors: employee
	
Scenario: sign up client  when the employee is not logged in 
	Given that The admin is logged in 
  And there is a client whith ID "11941518" , NAME "shareef " , Email "shareef@gmail.com" , address "Nablus street" ,post code "H3H1T5" ,Entered money=50,city "Nablus"
	When the user is signed in to his account
	Then the client whith ID "11941518" , NAME "shareef " , Email "shareef@gmail.com" , address "Nablus street" ,post code "H3H1T5" ,Entered money=50,city "Nablus" is registered in the system
	
Scenario: sign up client  when the employee is not logged in 
	Given that the admin is not logged in
        And there is a client whith ID "11941518" , NAME "shareef " , Email "shareef@gmail.com" , address "Nablus street" ,post code "H3H1T5" ,Entered money=50,city "Nablus"
	When the user is signed in to his account
	Then the error message "employee login is required" is given
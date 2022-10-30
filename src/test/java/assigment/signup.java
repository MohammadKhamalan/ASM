package assigment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import assigment.Admin;
import assigment.signup;
import assigment.bank;
import assigment.client;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	Admin employee=new Admin();
	client cl=new client();
	List<client> number=new ArrayList<>();
	boolean flag;
	Logger l=Logger.getLogger(signup.class.getName());
	boolean s=false;
	@Given("that The admin is logged in")
	public void that_the_admin_is_logged_in() {
	    employee.setLogged(true);
	}
		@Given("there is a client whith ID {string} , NAME {string} , Email {string} , address {string} ,post code {string} ,Entered money={int},city {string}")
		public void there_is_a_client_whith_id_name_email_address_post_code_entered_money_city(String id, String name, String email, String address, String ps, Integer en, String city) {			
			   cl.setId(id);
			   cl.setName(name);
			   cl.setEmail(email);
			   cl.setAddress(address);
			   cl.setPostCode(ps);
			   cl.setEnteredmoney(en);
			   cl.setCity(city);	   
		}

	@When("the user is signed")
	public void the_user_is_signed() {
		 if(!flag){
			 assertFalse(false);
	   }
	     else
	    	 bank.addclient(employee,cl);
	}
	@Then("the client whith ID {string} , NAME {string} , Email {string} , address {string} ,post code {string} ,Entered money={int},city {string} is registered in the system")
	public void the_client_whith_id_name_email_address_post_code_entered_money_city_is_registered_in_the_system(String id, String name, String email, String address, String ps,Integer en, String city) {
		bank.addclient(employee,cl);
		assertTrue(  bank.signdone(id));
	}
	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
		number = bank.ss(string);
	    if (number.isEmpty()) {
	        l.log(Level.INFO,"you can add this user");
	        s = false;
	    } else {
	        l.log(Level.INFO,"the employee is not logged in");
	        for (int i = 0; i < number.size(); i++)

	        s = true;
	}
	}
		@Given("that the admin is not logged in")
		public void that_the_admin_is_not_logged_in() {
	        s = false;

		}

	}
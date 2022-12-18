package assigment;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RateBank {
	client cl=new client();
boolean rate=cl.isLogged();
	@Given("the client is signed in")
	public void the_client_is_signed_in() {
		rate=true;
		the_client_give_rate_to_the_bank();
	    
	}

	@Then("the client give rate to the bank")
	public void the_client_give_rate_to_the_bank() {
		   System.out.print("you can rate our system now !");

	}

}

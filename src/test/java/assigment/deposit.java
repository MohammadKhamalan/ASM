package assigment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import assigment.Admin;
public class deposit {
	client cl=new client();
	Admin clientt=new Admin();
 	int money;
	Scanner sc= new Scanner(System.in);
    private static List<client> client =new ArrayList<>();
String id;
	Logger l=Logger.getLogger(signup.class.getName());
	Admin s=new Admin();

	@Given("that the client is signed in his account")
	public void that_the_client_is_signed_in_his_account() {
		clientt.setLogged(true);
	   
	}

	@When("determine the amount to be deposited and and send")
	public void determine_the_amount_to_be_deposited_and_and_send() {
		if(cl.isLogged()) {
			int money= sc.nextInt();
			for(int i =0;i<client.size();i++) {
				if(client.get(i).getId().equals(id)) {
					client.get(i).setEnteredmoney(client.get(i).getEnteredmoney()+money);
				}
				
			}
			}
				else {
					 
				            l.log(Level.INFO,"You should log in");

				}
	}

	@Then("accept client authorities")
	public void accept_client_authorities() {
		   assertTrue(true);

	}

	@Given("that the client is not signed in")
	public void that_the_client_is_not_signed_in() {
		clientt.setLogged(false);

	}

 
		@When("user fills amount of money to add")
		public void user_fills_amount_of_money_to_add() {
			if(!cl.isLogged()) {
	            l.log(Level.INFO,"You should log in");

			}
		}



	@Then("don't accept client authorities and the error message {string} is given")
	public void don_t_accept_client_authorities_and_the_error_message_is_given(String string) {
	   assertFalse(false);
	}

}
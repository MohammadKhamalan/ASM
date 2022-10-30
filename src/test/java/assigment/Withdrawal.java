package assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.When;

public class Withdrawal {
	Logger l=Logger.getLogger(signup.class.getName());

	Admin employee=new Admin();
	client cl=new client();
	bank b=new bank();
	String id;
int amount;
private static List<client> client =new ArrayList<>();

Scanner  sc=new Scanner(System.in);

	@When("determine the available amount that he want to withdrawal")
	public void determine_the_available_amount_that_he_want_to_withdrawal() {
		if(cl.isLogged()) {
			
		
	  amount=sc.nextInt();
	  
	  for(int i=0;i<client.size();i++) {
		if(client.get(i).getId().equals(id)) {
			client.get(i).setEnteredmoney(client.get(i).getEnteredmoney()-amount);
		}
	  }}
		else
		 l.log(Level.INFO,"You should log in");
	}

	@When("determine the  amount that is not available in the account withdrawal")
	public void determine_the_amount_that_is_not_available_in_the_account_withdrawal() {
		if(cl.isLogged()) {
			 amount=sc.nextInt();
			  for(int i=0;i<client.size();i++) {
					if(client.get(i).getId().equals(id)) {
			 if(client.get(i).getEnteredmoney()<amount) {
				 
				 l.log(Level.INFO,"You dont have this amount want to Withdrawal");
			 }
		}
			  }}}

	@When("user fills amount of money to withdrawal")
	public void user_fills_amount_of_money_to_withdrawal() {
if(!cl.isLogged()) {
	 l.log(Level.INFO,"You have to sign in to your account !");

}
	}
}

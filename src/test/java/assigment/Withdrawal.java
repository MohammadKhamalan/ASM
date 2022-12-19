package assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Withdrawal {
	Logger l=Logger.getLogger(signup.class.getName());

	Admin cl=new Admin();
	client k=new client();
	bank b=new bank();
	visits v=new visits();
	String id;
int amount;
private static List<client> client =new ArrayList<>();
List <bank> bb=new ArrayList<>();
List <visits> vv=new ArrayList<>();
List <Admin> ad=new ArrayList<>();

Scanner  sc=new Scanner(System.in);

	@When("determine the available amount that he want to withdrawal")
	public void determine_the_available_amount_that_he_want_to_withdrawal() {
		boolean b1=cl.isLogged();
		b1=true;
		  amount=500;

		if(cl.isLogged()) {
			
		
	  
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
		boolean w=cl.isLogged();
		w=true;
		 amount=10;

		if(cl.isLogged()) {
			  for(int i=0;i<client.size();i++) {
					if(client.get(i).getId().equals(id)) {
			 if(client.get(i).getEnteredmoney()<amount) {
				 
				 l.log(Level.INFO,"You dont have this amount want to Withdrawal");
			 }
		}
			  }}} 


	
}

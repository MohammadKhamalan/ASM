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
public class Bankstatment {

	client cl=new client();
	Admin clientt=new Admin();
 	int money;
	Scanner sc= new Scanner(System.in);
    private static List<client> client =new ArrayList<>();
String id;
	Logger l=Logger.getLogger(signup.class.getName());
	Admin s=new Admin();
	

@When("determine the amount that he owns in his account")
public void determine_the_amount_that_he_owns_in_his_account() {
    
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

@When("user fills check his money on the bank")
public void user_fills_check_his_money_on_the_bank() {
	if(!cl.isLogged()) {
        l.log(Level.INFO,"You should log in");

	}
}

	
}


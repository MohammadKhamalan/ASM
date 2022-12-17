package assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invoice {
	String h;
	Scanner sc=new Scanner(System.in);
	client cl=new client();
	Admin employee=new Admin();
	visits v=new visits();
	deposit d=new deposit();
	Withdrawal w=new Withdrawal();
	List<client> c=new ArrayList<>();
	String g;
	@Given("the client is signed in and the employee logged in")
	public void the_client_is_signed_in_and_the_employee_logged_in() {
	   
	    		if(cl.isLogged()&& employee.isLogged()) {
	    			client_went_to_visit_the_bank();
	    		}
	    	}
	    
	

	@When("client went to visit the bank")
	public void client_went_to_visit_the_bank() {
	
		the_employee_give_invoice_to_the_client();
}
	
	@Then("the employee give invoice to the client")
	public void the_employee_give_invoice_to_the_client() {
	   System.out.print("client ID:"+cl.getId()+"client name :"+cl.getName()+"the operation of visit is deposit"+" your balanced: "+cl.getEnteredmoney());
		
	}

	
}

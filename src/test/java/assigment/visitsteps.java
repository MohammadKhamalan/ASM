package assigment;

import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class visitsteps {
	client cl=new client();
	visits v=new visits();
	Admin cll=new Admin();
	bank b=new bank();
	String id;
	String g;
	List <client> c=new ArrayList<>();
	List <bank> bb=new ArrayList<>();
	List <visits> vv=new ArrayList<>();
	List <Admin> ad=new ArrayList<>();

Scanner sc=new Scanner(System.in);
List <visits> vi=new ArrayList<>();
	@Given("the client is logged in to his account")
	public void the_client_is_logged_in_to_his_account() {
		//for(int i=0;i<c.size();i++) {
			
		//if(c.get(i).getId().equals(cl.getId())) {
		
	   if(cl.isLogged()) {
		   the_client_want_to_visit_bank_to_do_any_services_and_this_time_is_available();
	   }
	   else {
		   the_client_is_not_logged_in_to_his_account();
	   }
	}

	@When("the client want to visit bank to do any services and this time is available")
	public void the_client_want_to_visit_bank_to_do_any_services_and_this_time_is_available() {
	    for(int i=0;i<vi.size();i++) {
	    	
	    	if(vi.get(i).getdate().equals(v.getdate())) {
		    	if(vi.get(i).time.equals(v.gettime())) {
		    		System.out.print("this appointment is already book");
		    	}
		    	else if(!vi.get(i).time.equals(v.gettime())) {
		    		
		    		reservation_is_done_successfully();
		    	}
		    	else {
		    		
		    		reservation_is_done_successfully();

		    	}
	    	}
	    }
	}

	@Then("Reservation is done successfully")
	public void reservation_is_done_successfully() {
		vi.add(v);
System.out.print("reservation done in "+v.getdate()+"at "+v.gettime()+"for client that has id:"+v.getid());	    
	}
	@Given("the client is not logged in to his account")
	public void the_client_is_not_logged_in_to_his_account() {
		reservation_is_failed();
	}

	@Then("Reservation is failed")
	public void reservation_is_failed() {
	   System.out.print("Reservation is failed,please log in !");
	}



	@When("time the client want to visit is unavailable")
	public void time_the_client_want_to_visit_is_unavailable() {
		 for(int i=0;i<vi.size();i++) {
		    	
		    	if(vi.get(i).date.equals(v.getdate())) {
			    	if(vi.get(i).time.equals(v.gettime())) {
			    		System.out.print("this appointment is already book");
			    	}
			    	
		    	}
		    }
	}

	@Then("give error message thet {string}")
	public void give_error_message_thet(String string) {
		   System.out.print("Reservation is failed,please choose another appointment !");

	}
}

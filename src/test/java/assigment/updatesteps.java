package assigment;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class updatesteps {
client cl=new client();
List <visits> vi=new ArrayList<>();
visits v=new visits();
	@Given("the client already made resevartion")
	public void the_client_already_made_resevartion() {
	 for(int i=0;i<vi.size();i++) {
		 if(vi.get(i).getid().equals(cl.getId())) {
			 change();
		 }
	 }
	}
public void change() {
	 for(int i=0;i<vi.size();i++) {
	    	
	    	if(vi.get(i).date.equals(v.getdate())) {
		    	if(vi.get(i).time.equals(v.gettime())) {
		    		the_client_want_to_change_appointment_visit_bank_to_another_appointment_and_the_new_appointment_is_unavailable();
		    	}
		    	else if(!vi.get(i).time.equals(v.gettime())) {
		    		the_client_want_to_change_appointment_visit_bank_to_another_appointment_and_the_new_appointment_is_available();
		    	}
		    	else {
		    		the_client_want_to_change_appointment_visit_bank_to_another_appointment_and_the_new_appointment_is_available();
		    	}
}
	 }}
	@When("the client want to change appointment visit bank to another appointment and the new appointment is available")
	public void the_client_want_to_change_appointment_visit_bank_to_another_appointment_and_the_new_appointment_is_available() {
	   vi.add(v);
	   update_reservation_is_done_successfully();
	}

	@Then("update Reservation is done successfully")
	public void update_reservation_is_done_successfully() {
		System.out.print("your new reservation done in "+v.getdate()+"at "+v.gettime()+"for client that has id:"+v.getid());	    
	}

	@When("the client want to change appointment visit bank to another appointment and the new appointment is unavailable")
	public void the_client_want_to_change_appointment_visit_bank_to_another_appointment_and_the_new_appointment_is_unavailable() {
		reservation_is_failed_and_given_error_message();
	}

	@Then("Reservation is failed and given error message")
	public void reservation_is_failed_and_given_error_message() {
		   System.out.print("Update Reservation is failed,please choose another appointment !");

	}

}

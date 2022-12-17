package assigment;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class delete_steps {
	client cl=new client();
	visits v=new visits();
	List<visits> vi=new ArrayList<>();
	List<client> c=new ArrayList<>();

	@When("the client want to delete appointment visit bank")
	public void the_client_want_to_delete_appointment_visit_bank() {
		//for(int i=0;i<c.size();i++) {
			
			//if(c.get(i).getId().equals(cl.getId())) {
			
				for(int k=0;k<vi.size();k++) {
if(vi.get(k).gettime().equals(((visits) vi).gettime())) {
	vi.remove(k);
	

}		   }
		delete_reservation_is_done_successfully();
}

	@Then("Delete Reservation is done successfully")
	public void delete_reservation_is_done_successfully() {
	   System.out.print("your appointment is deleted");
	}
}

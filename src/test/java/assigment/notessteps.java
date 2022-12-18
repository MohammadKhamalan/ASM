package assigment;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class notessteps {
 visits v=new visits();
 List <visits> vi=new ArrayList<>();
client cl=new client();
Admin employee=new Admin();
List <bank> bb=new ArrayList<>();
List <client> cc=new ArrayList<>();
List <Admin> ad=new ArrayList<>();
bank b=new bank();
boolean want;
 String note;
	@Then("the client is not visited the bank")
	public void the_client_is_not_visited_the_bank() {
		assertFalse(cl.logged);
	}
	@When("the client not comming to the bank")
	public void the_client_not_comming_to_the_bank() {
		// v.p=false;
		
				v.p=false;
		

	}

	@When("the client comming to the bank")
	public void the_client_comming_to_the_bank() {
		
			v.p=true;
			the_visitor_has_done_his_visit_and_may_add_his_notes();
		
	}

	@Then("the visitor has done his visit and may add his notes")
	public void the_visitor_has_done_his_visit_and_may_add_his_notes() {
	 for(int i=0;i<vi.size();i++) {
		
			 
				 vi.get(i).setnotes(note);
			 
		
		 }
		 
	 }
	}








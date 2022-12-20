package assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Help {
	List<client> c=new ArrayList<>();
	List <bank> bb=new ArrayList<>();
	List <visits> vv=new ArrayList<>();
	List <Admin> ad=new ArrayList<>();
	Admin employee=new Admin();
	visits v=new visits();
	Logger l=Logger.getLogger(Help.class.getName());

	@When("client want any help")
	public void client_want_any_help() {
		the_client_call_the_admin();
	}

	@Then("the client call the admin")
	public void the_client_call_the_admin() {
        l.log(Level.INFO,"you can call any available admin now !");

	  
	}
}

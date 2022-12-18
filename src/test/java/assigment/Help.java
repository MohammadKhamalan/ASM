package assigment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Help {
	
	@When("client want any help")
	public void client_want_any_help() {
		the_client_call_the_admin();
	}

	@Then("the client call the admin")
	public void the_client_call_the_admin() {
	   System.out.print("you can call any available admin now !");
	}
}

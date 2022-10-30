package assigment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import assigment.Admin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	  Admin ad=new Admin();

	     @Given("the correct password is {int} and correct id is {int}")
	    public void theCorrectPasswordIsAndCorrectIdIs(int arg0, int arg1) {
	        ad.setPass(arg0);
	        ad.setId(arg1);
	    }
	    @When("user fills id with {int} and password with {int}")
	    public void userFillsIdWithAndPasswordWith(int int1, int int2) {
	         ad.login(int1,int2);
	    }

	    @Then("give admin authorities and go to admin page")
	    public void give_admin_authorities_and_go_to_admin_page() {
	        assertTrue(ad.isLogged());
	    }

	   @Then("don't give admin authorities")
	    public void don_t_give_admin_authorities() {
	        assertFalse(ad.isLogged());
	    }

}
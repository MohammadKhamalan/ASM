package assigment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.logging.*;
public class logoutsteps {
    Logger l = Logger.getLogger(logoutsteps.class.getName());
    Admin employee =new Admin();
    @Given("admin is logged in")
    public void admin_is_logged_in() {
        employee.setLogged(true);
    }

    @When("admin logs out")
    public void admin_logs_out() {
        employee.setLogged(false);
    }

    @Then("remove admin authorities")
    public void remove_admin_authorities() {
        assertFalse(employee.isLogged());
        l.log(Level.INFO,"logged Out");
    }
}
/*package test.postride.glue;

import junit.framework.TestCase;
import postride.Ride;
import postride.RideBLL;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestPostRideStep extends TestCase{
	String submitButton;
	@Given("^employee enter all the data$")
	public void employee_enter_all_the_data() throws Throwable {
		// Express the Regexp above with the code you wish you had
		Ride rideObj = new Ride();
		rideObj.setAvailableSeats(4);
		rideObj.setDestination("Infospace");
		rideObj.setSource("Dwarka");
		rideObj.setStarttime("11:30");
		rideObj.setName("Vishal");
	}

	@When("^Click on submit$")
	public void Click_on_submit() throws Throwable {
		// Express the Regexp above with the code you wish you had
		submitButton = "Submit";
	}

	@Then("^System display message \"([^\"]*)\"$")
	public void System_display_message(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		RideBLL rideBll = new RideBLL();
		String returnVal = rideBll.process(submitButton);
		assertEquals(arg1,returnVal);
	}

	@When("^Click on Reset$")
	public void Click_on_Reset() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Then("^All the entered data should be cleared$")
	public void All_the_entered_data_should_be_cleared() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}
	
	
	@Given("^employee Name : \"([^\"]*)\" , Source : \"([^\"]*)\" , Destination : \"([^\"]*)\", Time : \"([^\"]*)\"$")
	public void employee_Name_Source_Destination_Time_(String arg1,
			String arg2, String arg3, String arg4) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Given("^Employee give name as \"([^\"]*)\"$")
	public void Employee_give_name_as(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Given("^Employee is logged in on portal$")
	public void Employee_is_logged_in_on_portal() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Given("^employee enters incomplete data Source is missing$")
	public void employee_enters_incomplete_data_Source_is_missing()
			throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Then("^data should be displayed on the top in display screen$")
	public void data_should_be_displayed_on_the_top_in_display_screen()
			throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}
}
*/
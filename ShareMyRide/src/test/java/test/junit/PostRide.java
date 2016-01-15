//package test.junit;
//
//import postride.Ride;
//import postride.RideBLL;
//import junit.framework.TestCase;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class PostRide extends TestCase {
//	String submitButton;
//
//	@Given("^employee enter all the data$")
//	public void employee_enter_all_the_data() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		Ride rideObj = new Ride();
//		rideObj.setAvailableSeats(4);
//		rideObj.setDestination("Infospace");
//		rideObj.setSource("Dwarka");
//		rideObj.setStarttime("11:30");
//		rideObj.setName("Vishal");
//	}
//
//	@When("^Click on submit$")
//	public void Click_on_submit() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		submitButton = "Submit";
//	}
//
//	@Then("^System display message \"([^\"]*)\"$")
//	public void System_display_message(String arg1) throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		RideBLL rideBll = new RideBLL();
//		String returnVal = rideBll.process(submitButton);
//		assertEquals(arg1,returnVal);
//	}
//}

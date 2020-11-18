package stepDefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        //navigating to the login page
    	System.out.println("navigating to the login page");
    }

    @When("^User login into application entering username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_entering_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        if(strArg1.equals("akhil")) {
        	System.out.println("in case of input Akhil, card details should be displayed");
        }
        else if(strArg1.equals("akhil_no")) {
        	System.out.println("in case of input Akhil_no, card details should not be displayed");
        }
    }

    @Then("^Home page should appear$")
    public void home_page_should_appear() throws Throwable {
        //appearing of home page
    	System.out.println("appearing of home page");
    }
    
    @Then("^Cards information is not populated$")
    public void cards_information_is_not_populated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("not displaying information of cards");
    }

    @And("^Cards information is populated$")
    public void cards_information_is_populated() throws Throwable {
        //displaying information of cards
    	System.out.println("displaying information of cards");
    }

}
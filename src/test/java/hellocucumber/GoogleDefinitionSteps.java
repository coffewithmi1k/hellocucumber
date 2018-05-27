package hellocucumber;

import Pages.HomePage;
import Pages.PageNavigator;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleDefinitionSteps {

    PageNavigator pagenav = new PageNavigator();
    HomePage onHomePage = new HomePage();

    @When("^I open google$")
    public void i_open_google() {
        pagenav.openGooglePage();

    }

    @Then("^I verify google page is opened$")
    public void i_verify_google_page_is_opened() {
        onHomePage.verifyGooglePageOpened();
    }
}

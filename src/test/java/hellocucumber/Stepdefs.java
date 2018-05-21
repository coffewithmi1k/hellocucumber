package hellocucumber;

import Config.MyConfig;
import Pages.HomePage;
import Pages.PageNavigator;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Stepdefs extends MyConfig {
    @Before
            public void setup(){
        driver = new ChromeDriver();
    }

    @After
            public void tearDown(){
        driver.quit();
    }

    PageNavigator pagenav = new PageNavigator();
    HomePage onHomePage = new HomePage();

    @When("^I open google$")
    public void i_open_google() throws Exception {
        pagenav.openGooglePage();

    }

    @Then("^I verify google page is opened$")
    public void i_verify_google_page_is_opened() {
        onHomePage.verifyGooglePageOpened();
    }

}
package hellocucumber;

import Config.MyConfig;
import Pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class HomePageDefinitionSteps extends MyConfig {
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
    LoginPage onLoginPage = new LoginPage();
    MyAccountPage onMyAccountPage = new MyAccountPage();
    RegisterPage onRegisterPage = new RegisterPage();

    @When("^I open google$")
    public void i_open_google()  {
        pagenav.openGooglePage();

    }

    @Then("^I verify google page is opened$")
    public void i_verify_google_page_is_opened() {
        onHomePage.verifyGooglePageOpened();
    }

    @Given("^user opens Home Page$")
    public void i_open_Home_Page() throws Exception {
        pagenav.openLogoWebsite();
    }

    @Then("^verify HomePage is Opened$")
    public void verify_HomePage_is_Opened() throws Exception {
        onHomePage.verifyHomePageOpened();
    }
    @Given("^click on Log In link$")
    public void click_on_Log_In_link() throws Exception {
        onHomePage.clickLoginButton();
    }




}
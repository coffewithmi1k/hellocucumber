package hellocucumber;

import Config.MyConfig;
import Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPageDefinitionSteps extends MyConfig {

    LoginPage onLoginPage = new LoginPage();

    @Then("^verify Log in Page Opened$")
    public void verify_Log_in_Page_Opened() throws Exception {
        onLoginPage.verifyLoginPageOpened();
    }

    @Given("^Fills Log in form with valid creds$")
    public void fills_Log_in_form_with_valid_creds() throws Exception {
        onLoginPage.fillLoginFormWithValidCreds();

    }
    @Given("^clicks on the Log In button$")
    public void clicks_on_the_Log_In_button() throws Exception {
        onLoginPage.clickLoginButton();
    }
    @Given("^enters valid email address$")
    public void enters_valid_email_address() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    //Register Form
    @Given("^Fills the register personal data form$")
    public void fills_the_register_personal_data_form() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    //Register Form
    @Given("^Clicks register$")
    public void clicks_register() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

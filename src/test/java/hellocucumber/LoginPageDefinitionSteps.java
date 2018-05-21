package hellocucumber;

import Config.MyConfig;
import Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginPageDefinitionSteps extends MyConfig {

    LoginPage onLoginPage = new LoginPage();

    @Then("^verify Log in Page Opened$")
    public void verify_Log_in_Page_Opened() throws Exception {
        onLoginPage.verifyLoginPageOpened();
    }
}

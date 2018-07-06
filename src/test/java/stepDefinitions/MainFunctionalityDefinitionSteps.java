package stepDefinitions;

import Config.MyConfig;
import Pages.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainFunctionalityDefinitionSteps extends MyConfig {

    PageNavigator pagenav = new PageNavigator();
    HomePage onHomePage = new HomePage();
    LoginPage onLoginPage = new LoginPage();
    MyAccountPage onMyAccountPage = new MyAccountPage();
    RegisterPage onRegisterPage = new RegisterPage();


    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    //1
    @Given("^user opens Home Page$")
    public void i_open_Home_Page() throws InterruptedException{
        pagenav.openLogoWebsite();
    }

    @Then("^verify HomePage is Opened$")
    public void verify_HomePage_is_Opened()throws InterruptedException {
        onHomePage.verifyHomePageOpened();
    }

    //2
    @Given("^click on Log In link$")
    public void click_on_Log_In_link() throws InterruptedException {
        onHomePage.clickLoginButton();
    }


    @Then("^verify Log in Page Opened$")
    public void verify_Log_in_Page_Opened() throws InterruptedException {
        onLoginPage.verifyLoginPageOpened();
    }

    @Given("^Fills Log in form with valid creds$")
    public void fills_Log_in_form_with_valid_creds()throws InterruptedException {
        onLoginPage.fillLoginFormWithValidCreds();
    }

    @Then("^verifies that user is logged In$")
    public void verifies_that_user_is_logged_In()throws InterruptedException {
        Assert.assertTrue(onMyAccountPage.verifyUserIsLoggedInSuccessfully().getText().contains("MY ACCOUNT"));

    }


    @Given("^clicks on the Log In button$")
    public void clicks_on_the_Log_In_button()throws InterruptedException {
        onLoginPage.clickLoginButton();
    }

    @Given("^enters valid email address$")
    public void enters_valid_email_address() throws InterruptedException{
        onLoginPage.fillRegisterFormwithValidEmail();
    }

    @Given("^clicks Create an account button$")
    public void clicks_Create_an_account_button() throws InterruptedException {
        onLoginPage.clickCreateAnAccountButton();
    }


    @Given("^Fills the register personal data form$")
    public void fills_the_register_personal_data_form() throws InterruptedException {
        onRegisterPage.fillPersonalDataFormWithValidData();
    }


    @Given("^Clicks register$")
    public void clicks_register() {
        onRegisterPage.clickRegisterButton();
    }


}
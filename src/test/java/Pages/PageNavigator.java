package Pages;

import Config.MyConfig;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class PageNavigator extends MyConfig {

    public HomePage openGooglePage() {
driver.get("Https:google.com");
        return new HomePage();
    }
    public HomePage openLogoWebsite(){
        driver.get("http://automationpractice.com/index.php");
        return new HomePage();
    }
}

package Pages;

import Config.MyConfig;
import org.junit.Assert;

public class HomePage extends MyConfig {

    public void verifyGooglePageOpened(){
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
}

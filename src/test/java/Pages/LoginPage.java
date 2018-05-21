package Pages;

import Config.MyConfig;
import org.junit.Assert;

public class LoginPage extends MyConfig {

    public void verifyLoginPageOpened() throws InterruptedException {
        Assert.assertTrue(driver.getTitle().contains("Login - My Store"));
        Thread.sleep(5000);
    }
}

package Pages;

import Config.MyConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends MyConfig {

    public WebElement verifyUserIsLoggedInSuccessfully() {
        return
driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
    }
}

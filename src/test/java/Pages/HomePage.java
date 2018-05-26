package Pages;

import Config.MyConfig;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends MyConfig {

    public void verifyGooglePageOpened(){
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
    public void verifyHomePageOpened(){
        Assert.assertTrue(driver.getTitle().contains("My Store"));
    }
    public LoginPage clickLoginButton(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        return new LoginPage();
    }


}

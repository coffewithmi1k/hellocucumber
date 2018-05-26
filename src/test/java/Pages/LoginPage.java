package Pages;

import Config.MyConfig;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends MyConfig {

    public void verifyLoginPageOpened() throws InterruptedException {
        Assert.assertTrue(driver.getTitle().contains("Login - My Store"));
        Thread.sleep(5000);
    }

    public void fillLoginFormWithValidCreds(){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("coffeacc2@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("qwe1156q");

    }
    public void clickLoginButton(){
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }

    public void fillRegisterFormwithValidEmail(){
        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("myEmailnumber"+
                ((int)Math.random()*100)+"@mail.com");

    }
    public RegisterPage clickCreateAnAccountButton(){
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        return  new RegisterPage();
    }
}

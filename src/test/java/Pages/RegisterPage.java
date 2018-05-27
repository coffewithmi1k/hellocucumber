package Pages;

import Config.MyConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends MyConfig {


    public void fillPersonalDataFormWithValidData()  {
//First Name
        driver.findElement(By.id("customer_firstname")).sendKeys("Jack");
//Last Name
        driver.findElement(By.id("customer_lastname")).sendKeys("Reacher");
//Email
       // driver.findElement(By.id("email")).sendKeys("Myemail"+((int)Math.random()*100)+"@gmaill.com");
//Password
        driver.findElement(By.id("passwd")).sendKeys("qwe1156q");
//First Name Address
     //   driver.findElement(By.id("firstname")).sendKeys("Park Avenue 10 2");
//Last Name address
       // driver.findElement(By.id("lastname")).sendKeys("what ever");
//Address
        driver.findElement(By.id("address1")).sendKeys("random address");
//City
        driver.findElement(By.id("city")).sendKeys("Kyiv");
//Zip code
        driver.findElement(By.id("postcode")).sendKeys("80316");
//Mobile Phone
        driver.findElement(By.id("phone_mobile")).sendKeys("0930070021");

//select Mr, ms
        driver.findElement(By.id("id_gender1")).click();
        //Checkboxes for dob , state
        Select checkbox = new Select(driver.findElement(By.id("days")));
        Select checkbox2 = new Select(driver.findElement(By.id("months")));
        Select checkbox3 = new Select(driver.findElement(By.id("years")));
        checkbox.selectByValue("13");
        checkbox2.selectByValue("2");
        checkbox3.selectByValue("1992");
        //state checkbox
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByValue("1");
        driver.findElement(By.id("alias")).sendKeys("AssignedAddress");

    }

    public MyAccountPage clickRegisterButton(){
        driver.findElement(By.id("submitAccount")).click();
        return new MyAccountPage();
    }
}

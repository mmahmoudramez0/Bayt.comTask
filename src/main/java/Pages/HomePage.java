package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By registrationClassName = By.className("ico-register");

    public  HomePage(WebDriver driver){
        this.driver = driver;
    }
    public RegisterationPage clickRegister(){
        driver.findElement(registrationClassName).click();
        return new RegisterationPage(driver);
    }
}

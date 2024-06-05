package Pages;

import Utility.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegisterationPage {
    public CSVReader csvReader = new CSVReader("./resources/Book1.csv");
    private WebDriver driver;
    public RegisterationPage(WebDriver driver){

        this.driver = driver;
    }
    Random random = new Random();


    private By dateOfBirthDay = By.xpath("//select[contains(@name , 'DateOfBirthDay')]");

    private By dateOfBirthMonth = By.xpath("//select[contains(@name , 'DateOfBirthMonth')]");

    private By dateOfBirthYear = By.xpath("//select[contains(@name , 'DateOfBirthYear')]");


    private By maleGenderRadioButton = By.id("gender-male");
    private By femaleGenderRadioButton = By.id("gender-female");
    private By firstNameTextBox = By.id("FirstName");
    private By lastNameTextBox = By.id("LastName");

    private By emailTextBox = By.id("Email");
    private By companyTextBox = By.id("Company");

    private By newsLetterCheckBox = By.id("Newsletter");
    private By passwordTextBox = By.id("Password");

    private By confirmPasswordTextBox = By.id("ConfirmPassword");

    public void setFirstName (){
        driver.findElement(firstNameTextBox).sendKeys(csvReader.readValue("firstname"));

    }
    public void setLastName (){
        driver.findElement(lastNameTextBox).sendKeys(csvReader.readValue("lastname"));

    }

    public void setEmail (){
        int randomNumber = random.nextInt();
        driver.findElement(emailTextBox).sendKeys(randomNumber+csvReader.readValue("email"));

    }

    public void setCompany (){
        driver.findElement(companyTextBox).sendKeys(csvReader.readValue("company"));

    }
    public void setPassword (){
        driver.findElement(passwordTextBox).sendKeys(csvReader.readValue("password"));

    }
    public void setConfirmPassword (){
        driver.findElement(confirmPasswordTextBox).sendKeys(csvReader.readValue("password"));

    }
    public void selectFromDayDropDown (){
        Select dropDownElement = new Select(driver.findElement(dateOfBirthDay));
        dropDownElement.selectByValue(csvReader.readValue("dayofbirth"));
    }
    public void selectFromMonthDropDown (){
        Select dropDownElement = new Select(driver.findElement(dateOfBirthMonth));
        dropDownElement.selectByValue(csvReader.readValue("monthofbirth"));
    }

    public void selectFromYearDropDown (){
        Select dropDownElement = new Select(driver.findElement(dateOfBirthYear));
        dropDownElement.selectByValue(csvReader.readValue("yearofbirth"));
    }

    private By registerButton = By.id("register-button");

    public RegisterationCompletedPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new RegisterationCompletedPage(driver);
    }

}

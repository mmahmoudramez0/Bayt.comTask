package Base;

import Pages.HomePage;
import Pages.RegisterationPage;
import Utility.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        CSVReader csvReader = new CSVReader("./resources/Book1.csv");
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
//        RegisterationPage RegisterationPage = Homepage.clickRegister();
//        RegisterationPage.selectFromDayDropDown(csvReader.readValue("dayofbirth"));
//        System.out.println(driver.getTitle());

    }
    @AfterClass
    public void tearDown(){
        driver.quit();

 }
    public static void main(String args[]){

        BaseTests test = new BaseTests();
        test.setUp();
    }
}

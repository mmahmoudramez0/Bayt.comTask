package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationCompletedPage {

    private WebDriver driver;
    public RegisterationCompletedPage(WebDriver driver) {
        this.driver = driver;
    }

    //a[@class='create-cv-box import-from-bayt-option']
    //a[@class='create-cv-box']

    //a[@class='underline font-16']


    //<i class="i_16_item i_edit"></i>
    //QA Engineer
    //this is a test
    //<option value="eg,0,0">Egypt</option>
    //<input type="checkbox" name="employment_type" value="3" class="checkbox  " data-gtm-form-interact-field-id="2">
    //<input type="checkbox" name="job_status" value="2" class="checkbox " data-gtm-form-interact-field-id="4">
    //<input type="text" name="trgt_job_salary_value" value="0" maxlength="10" class="number tooltip_down" style="width:20%;" data-tooltip="Specify your preferred salary and currency for your target job to help employers decide if you are a suitable candidate for their vacancies. Write the figure you believe you deserve but also be reasonable." data-gtm-form-interact-field-id="5">
    //<option value="3">Management</option>
    //<option value="60">3 months or less</option>
    //<input type="text" name="last_salary_value" value="0" maxlength="10" class="number tooltip_down" style="width:20%;" data-tooltip="Last Monthly Salary per full-time month of Employment" data-gtm-form-interact-field-id="8">


    //<span class="select2-selection__rendered" id="select2-id-citizen-container" title="- Select one -">- Select one -</span>

    //<select name="citizen" id="id-citizen" class="req autocomplete_dropdown select2-hidden-accessible" tabindex="-1" aria-hidden="true">

    //<option value="ae">United Arab Emirates</option>

    private By successMessage = By.cssSelector("div.result");

    public String getAlertText (){
        return driver.findElement(successMessage).getText();

    }
}

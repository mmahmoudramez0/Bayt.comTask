package Registeration;

import Base.BaseTests;
import Pages.*;
import Utility.CSVReader;
import com.beust.ah.A;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;
public class RegisterTest extends BaseTests {


    @Test
   public void testSuccessfulRegister() throws InterruptedException {
      AboutUsPage aboutUsPage = homePage.clickAboutUs();
       CareersPage careersPage = aboutUsPage.clickCareers();
//       aboutUsPage.getHandle();
//       aboutUsPage.switchToTempMail();
//
//       aboutUsPage.getTempMail();
//       aboutUsPage.switchBack();

       JobPage jobPage = careersPage.clickQAEngineer();
        LoginPage loginPage = jobPage.clickApplyNow();
        RegisterationPage registerationPage = loginPage.clickCreateANewAccountButton();
       registerationPage.setFirstName();
       registerationPage.setLastName();
      registerationPage.selectFromDayDropDown();
      registerationPage.selectFromMonthDropDown();
      registerationPage.selectFromYearDropDown();
       registerationPage.setEmail();
       registerationPage.selectFromHowDidYouHearAboutUsDropDown();
       registerationPage.setPassword();
       registerationPage.acceptCookies();
       registerationPage.clickTermsCheckBox();

       myCVPage myCVPage = registerationPage.clickRegisterButton();

        myCVPage.clickFillMyCV();
        myCVPage.clickEditTargetJob();
        myCVPage.setTargetJobTitleTextBox();
        myCVPage.setTargetJobLocationDropDown();
        myCVPage.setCareerLevelDropDown();
        myCVPage.clickSaveTargetJob();
        myCVPage.implicitWait();
        myCVPage.clickEditPersonalInformationJob();
        myCVPage.setNationalityDropDown();
        myCVPage.implicitWait();
        myCVPage.clickSavePersonalInformation();
        myCVPage.implicitWait();
        myCVPage.clickEditContactInformationJob();
        myCVPage.setPhoneNoTextBox("100 123 4567");
        myCVPage.setCountryDropDown();
        myCVPage.setCityDropDown();
        myCVPage.clickSaveContactInformation();
        myCVPage.implicitWait();
        myCVPage.clickAddExperince();
        myCVPage.setMonthStartDateDropDown();
        myCVPage.setMonthEndDateDropDown();
        myCVPage.setYearEndDateDropDown();
        myCVPage.setYearStartDateDropDown();
        myCVPage.setLocationDropDown();
        myCVPage.setCompanyNameTextBox();
        myCVPage.setCompanyIndustryDropDown();
        myCVPage.setJobRoleDropDown();
        myCVPage.setPositionInCompanyTextBox();
        myCVPage.setWorkDescriptionTextBox();
        myCVPage.clickSaveExperince();
        myCVPage.implicitWait();
        myCVPage.clickAddEducation();
        myCVPage.setInstitutionTextBox();
        myCVPage.setEducationCountryDropDown();
        myCVPage.setMonthCompleteDateDropDown();
        myCVPage.setYearCompleteDateDropDown();
        myCVPage.clickAddEducation();

   }
        @Test
        public void testUnSuccessfulRegister() throws InterruptedException {
        AboutUsPage aboutUsPage = homePage.clickAboutUs();
        CareersPage careersPage = aboutUsPage.clickCareers();
        JobPage jobPage = careersPage.clickQAEngineer();
        LoginPage loginPage = jobPage.clickApplyNow();
        RegisterationPage registerationPage = loginPage.clickCreateANewAccountButton();
        registerationPage.setFirstName();
        registerationPage.setLastName();
        registerationPage.selectFromDayDropDown();
        registerationPage.selectFromMonthDropDown();
        registerationPage.selectFromYearDropDown();
        registerationPage.setSavedEmail();
        registerationPage.selectFromHowDidYouHearAboutUsDropDown();
        registerationPage.setPassword();
        registerationPage.clickTermsCheckBox();
        registerationPage.assertError();



    }
}

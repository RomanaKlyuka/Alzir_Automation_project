package com.erp.step_definitions;

import com.erp.pages.Expenses_RomanaK;
import com.erp.pages.LoginPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_8_stepDefs_Romana {


    LoginPage loginPage = new LoginPage();
    Expenses_RomanaK eRK = new Expenses_RomanaK();
    List<WebElement> listOfModules =eRK.modulesRK;






    @Given("the user logged in with email as email and password as password")
    public void the_user_logged_in_with_email_as_email_and_password_as_password() {
        loginPage.login(ConfigurationReader.getProperty("expenses_manager_email"), ConfigurationReader.getProperty("expenses_manager_password"));

    }
    @Given("the user should  access to all twelve modules")
    public void the_user_should_access_to_all_twelve_modules() {
        BrowserUtils.sleep(5);
        for (WebElement each : eRK.modulesRK) {
            Assert.assertTrue(each.isEnabled());


        }
    }



    @Given("the user should see {int} modules on the page")
    public void theUserShouldSeeModulesOnThePage(int expectedNumberOfModules) {
        BrowserUtils.sleep(5);
        for (WebElement listOfModule : listOfModules) {
            Assert.assertEquals(expectedNumberOfModules,listOfModules.size());
        }

    }
}
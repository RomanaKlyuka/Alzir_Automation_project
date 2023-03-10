package com.erp.step_definitions;

import com.erp.pages.Locator_OK;
import com.erp.pages.LoginPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_03_stepDefs_Oksana {

    LoginPage loginPage = new LoginPage();
    Locator_OK locator = new Locator_OK();
    List<WebElement> listOfModules = locator.modulesOK;

    @Given("the user logged in with email and password")
    public void the_user_logged_in_with_email_and_password() {
       loginPage.login("posmanager50@info.com", "posmanager");


    }
    @Given("the user should see {int} modules on the page")
    public void the_user_should_see_modules_on_the_page(int expectedNumberOfModules) {
        BrowserUtils.sleep(5);
        for (WebElement listOfModule : listOfModules) {
            Assert.assertEquals(expectedNumberOfModules, listOfModules.size());
        }

    }
    @Given("the user should  access to all twenty modules")
    public void the_user_should_access_to_all_twenty_modules() {
        BrowserUtils.sleep(5);
        for (WebElement each : locator.modulesOK) {
            Assert.assertTrue(each.isEnabled());


        }
    }

    }







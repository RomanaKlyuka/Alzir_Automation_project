package com.erp.step_definitions;

import com.erp.pages.InventoryPageK;
import com.erp.pages.LoginPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryKN_StepDefintion {

    LoginPage loginPage = new LoginPage();
    InventoryPageK inventoryPage = new InventoryPageK();
    List<WebElement> modules_16 = inventoryPage.listOfModulesKN;


    @Given("user is logged in with valid credentials username {string} and password {string}")
    public void user_is_logged_in_with_valid_credentials_username_and_password(String email, String password) {
        loginPage.login(email, password);

    }


    @Then("user should see {int} modules on the page")
    public void userShouldSeeModulesOnThePage ( int expected){

        BrowserUtils.sleep(5);

        Assert.assertEquals(expected, modules_16.size());

    }


    @Then("user should be able to have access to all modules")
    public void userShouldBeAbleToHaveAccessToAllModules () {
        BrowserUtils.sleep(5);


        for (WebElement eachModule : modules_16) {
            Assert.assertTrue(eachModule.isEnabled());
        }


    }



}

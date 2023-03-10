package com.erp.step_definitions;


import com.erp.pages.LoginPage;
import com.erp.pages.ModulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;

public class Modules_step_definitions {

    ModulePage modulePage = new ModulePage();
    LoginPage loginPage = new LoginPage();
    List<WebElement> modules = modulePage.listOfModulesKN;

    @Given("user is logged in with valid credentials username {string} and password {string}")
    public void user_is_logged_in_with_valid_credentials_username_and_password(String string, String string2) {
        loginPage.login(string,string2);
    }
    @Then("user should see {int} modules on the page")
    public void user_should_see_modules_on_the_page(int int1) {
        Assert.assertEquals(int1,modules.size());
    }
    @Then("user should be able to have access to all modules")
    public void user_should_be_able_to_have_access_to_all_modules() {
        for (WebElement eachModule : modules) {
            Assert.assertTrue(eachModule.isEnabled());
        }
    }
}

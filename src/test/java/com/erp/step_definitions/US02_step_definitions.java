package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.pages.US02Page;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_step_definitions {

    US02Page us02Page = new US02Page();
    LoginPage loginPage = new LoginPage();

    @Given("users is logged in as POS or sales manager {string} and {string}")
    public void usersIsLoggedInAsPOSOrSalesManagerAnd(String email, String password) {
        loginPage.login(email,password);
    }



    @When("user click's on repairs")
    public void user_click_s_on_repairs() {
       us02Page.repairBtn.click();

        BrowserUtils.sleep(2);
    }


    @Then("use should see {int} checkbox and {int} columns")
    public void useShouldSeeCheckboxAndColumns(int checkbox, int expectedColumns) {

        int total = checkbox + expectedColumns;

        Assert.assertEquals(total,us02Page.repairColumns.size());


        BrowserUtils.sleep(2);

    }


}

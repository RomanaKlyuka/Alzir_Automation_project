package com.erp.step_definitions;


import com.erp.pages.LoginPage;
import com.erp.pages.SalesPageModules_OR;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US01StepDefinitions{
    // added this
    SalesPageModules_OR salesPage=new SalesPageModules_OR();
    LoginPage loginPage=new LoginPage();

    List<WebElement> list = new ArrayList<>(Arrays.asList(salesPage.number,
            salesPage.date,salesPage.customer, salesPage.salesperson,
            salesPage.total, salesPage.status));

    @Given("user enters  {string}  and {string}")
    public void user_enters_and(String email, String password) {
        Driver.getDriver().get("https://qa.briteerp.com/web/login");
        loginPage.login(email,password);
    }
    @Given("Then user clicks on sale")
    public void then_user_clicks_on_sale() {
        salesPage.salesButton.click();
    }
    @Then("user should see {int} columns")
    public void user_should_see_columns(int expected) {
        Assert.assertEquals(expected,list.size());
    }
}
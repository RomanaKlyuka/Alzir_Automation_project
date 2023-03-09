package com.erp.step_definitions;


import com.erp.pages.MainModulesPage_YA;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_StepDefs_YA {



    MainModulesPage_YA modules = new MainModulesPage_YA();


    @When("the user clicks on Point of sales link")
    public void the_user_clicks_on_point_of_sales_link() {
        modules.point_of_sale_YA.click();

    }
    @Then("the user should see orders on page")
    public void the_user_should_see_orders_on_page() {
        String expectedText = "Orders";
        String actualText = modules.order_link_YA.getText();

        Assert.assertTrue(expectedText.contains(actualText));

        }


    @Then("the user clicks on Orders link")
    public void the_user_clicks_on_orders_link() {
        modules.order_link_YA.click();
    }
    @Then("user should be able to view the order list on Point of Sale page")
    public void user_should_be_able_to_view_the_order_list_on_point_of_sale_page() {

        Assert.assertTrue(modules.orderList_YA.isDisplayed());

    }
    @Then("user should be able to click on checkboxes of each order")
    public void user_should_be_able_to_click_on_checkboxes_of_each_order() {

        modules.check_box_for_all_YA.click();
        BrowserUtils.sleep(1);
    }
    @Then("the user should be able to see the Action dropdown box after clicking on checboxes")
    public void the_user_should_be_able_to_see_the_action_dropdown_box_after_clicking_on_checboxes() {

        Assert.assertTrue(modules.dropdownButton_YA.isDisplayed());
        BrowserUtils.sleep(1);

    }
    @Then("user should be able to click on the Action dropdown box")
    public void user_should_be_able_to_click_on_the_action_dropdown_box() {
        modules.dropdownButton_YA.click();
        BrowserUtils.sleep(1);

    }
    @Then("user should be able to see the three options : Import, Export, Delete")
    public void user_should_be_able_to_see_the_options_import_export_delete() {

       MainModulesPage_YA.options(Driver.getDriver(),"0");
        BrowserUtils.sleep(1);
        MainModulesPage_YA.options(Driver.getDriver(),"1");
        BrowserUtils.sleep(1);
        MainModulesPage_YA.options(Driver.getDriver(),"2");


    }



}

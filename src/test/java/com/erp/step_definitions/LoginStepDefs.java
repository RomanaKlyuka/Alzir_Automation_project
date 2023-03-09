package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");

    }
    @Given("the user logged in as {string}")

    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String email = null;
        String password = null;

        if (userType.equalsIgnoreCase("pos")) {
            email = ConfigurationReader.getProperty("pos_manager_email");
            password = ConfigurationReader.getProperty("pos_manager_password");
        } else if (userType.equalsIgnoreCase("crm manager")) {
            email = ConfigurationReader.getProperty("CRM_manager_email");
            password = ConfigurationReader.getProperty("CRM_manager_password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            email = ConfigurationReader.getProperty("sales_manager_email");
            password = ConfigurationReader.getProperty("sales_manager_password");
        } else if (userType.equalsIgnoreCase("inventory_manager")) {
            email = ConfigurationReader.getProperty("inventory_manager_email");
            password = ConfigurationReader.getProperty("inventory_manager_password");
        } else if (userType.equalsIgnoreCase("expenses_manager")) {
            email = ConfigurationReader.getProperty("expenses_manager_email");
            password = ConfigurationReader.getProperty("expenses_manager_password");
            //send email and password and login

        }
        new LoginPage().login(email, password);

    }


    @Given("the user logged in with email as {string} and password as {string}")
    public void the_user_logged_in_with_email_as_and_password_as(String email, String password) {

        LoginPage loginPage= new LoginPage();
        loginPage.login(email,password);

    }


}

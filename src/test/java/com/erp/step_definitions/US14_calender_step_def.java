package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.LoginPage;
import com.erp.pages.US14_CalendarPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_calender_step_def extends BasePage {
    US14_CalendarPage calendarPage = new US14_CalendarPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user logged in as pos")
    public void theUserLoggedInAsPos() {
        loginPage.login("posmanager5@info.com","posmanager");
    }
    @When("user on the calendar page")
    public void user_on_the_calendar_page() {
        BrowserUtils.sleep(2);
        calendarPage.CalendarButton.click();
        //Assert.assertTrue(Driver.getDriver().getTitle().contains("Meetings"));
        Assert.assertTrue(calendarPage.calenderOnRightSide.isDisplayed());

    }
    @Then("verify the time starts with {string}")
    public void verifyTheTimeStartsWith(String startW) {
        Assert.assertTrue(calendarPage.timeStartsWithZero.getText().equals(startW));
    }

    @When("time increase by one hour")
    public void time_increase_by_one_hour() {

       List<String> list = new ArrayList<>();

      for (WebElement eachHour : calendarPage.hours){
          list.add(eachHour.getText());
      }

        for (int i = 1; i < calendarPage.hours.size(); i++) {

            Assert.assertTrue(list.get(i).equals((i-1)+":00"));
        }
    }



    @Then("verify the time ends with {string}")
    public void verifyTheTimeEndsWith(String endW) {
        Assert.assertTrue(calendarPage.timeEndsWith.getText().equals(endW));
    }


}

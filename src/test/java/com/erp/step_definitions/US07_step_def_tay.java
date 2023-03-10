package com.erp.step_definitions;

import com.erp.pages.EventsPage_tay;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US07_step_def_tay {

    EventsPage_tay eventsPageTay= new EventsPage_tay();

    @Then("user sees {int} modules")
    public void user_sees_modules(int expected15) {
        List<WebElement> fifteen=eventsPageTay.mainmenu;
        BrowserUtils.sleep(1);
        int count=0;
        for (WebElement e : fifteen) {
            count++;
            System.out.println(count+" "+e.getText());
        }
        Assert.assertEquals(expected15,fifteen.size());

    }
    @Then("user should have access to modules")
    public void user_should_have_access_to_modules() {
        List<WebElement> fifteen=eventsPageTay.mainmenu;
        for (WebElement each : fifteen) {
            BrowserUtils.sleep(1);
            Assert.assertTrue(each.isEnabled());

        }
    }
}

package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Expenses_RomanaK {

public Expenses_RomanaK(){
    PageFactory.initElements(Driver.getDriver(),this);
}

/*
@FindBy(xpath = "//a[@href='/web#menu_id=115&action=120']")
    public WebElement discussModule_RK;


    @FindBy(xpath = "//a[@href='/web#menu_id=120&action=136']")
    public WebElement calendarModule_RK;

    @FindBy(xpath = "//a[@href='/web#menu_id=194&action=220']")
    public WebElement notesModule_RK;

    @FindBy(xpath = "//a[@href='/web#menu_id=68&action=']")
    public WebElement contactsModule_RK;

    @FindBy(xpath = "//a[@href='/web#menu_id=382&action=']")
    public WebElement websiteModule_RK;

    @FindBy(xpath = "//a[@href='/web#menu_id=124&action=']")
    public WebElement eventsModule_RK;

    @FindBy(xpath = "//a[@href='/web#menu_id=157&action=']")
    public WebElement employeeModule_RK;
    @FindBy(xpath = "//a[@href='/web#menu_id=388&action=']")
    public WebElement expensesModule_RK;
    @FindBy(xpath = "//a[@href='/web#menu_id=94&action=']")
    public WebElement lunchModule_RK;
    @FindBy(xpath = "//a[@href='/web#menu_id=165&action=']")
    public WebElement maintenanceModule_RK;
    @FindBy(xpath = "//a[@href='/web#menu_id=1&action=']")
    public WebElement dashboardModule_RK;
*/

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a/span")
    public List<WebElement> modulesRK;

}

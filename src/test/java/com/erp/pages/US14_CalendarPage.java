package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US14_CalendarPage {

    public US14_CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[contains(text(),'Calendar')]")
    public WebElement CalendarButton;

    @FindBy(xpath = "//span[normalize-space()='0:00']")
    public WebElement timeStartsWithZero;


    @FindBy(xpath = "//span[normalize-space()='23:00']")
    public WebElement timeEndsWith;


    @FindBy(xpath = "//td[@class='fc-widget-content']//span")
    public List<WebElement> hours;





    @FindBy(xpath ="//table[@class='ui-datepicker-calendar']")
    public WebElement calenderOnRightSide;



}

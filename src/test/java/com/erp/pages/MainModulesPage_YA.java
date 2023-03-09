package com.erp.pages;

import com.erp.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage_YA {



    public MainModulesPage_YA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//a[@href='/web#menu_id=484&action=']")
    public WebElement point_of_sale_YA;



    @FindBy(xpath = "//a[@href='/web#menu_id=489&action=663']")
    public WebElement order_link_YA;

    @FindBy(xpath ="//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement check_box_for_all_YA;


    @FindBy(tagName = "table")
    public WebElement orderList_YA;

    @FindBy(xpath = "//button[normalize-space()='Action']")
    public WebElement dropdownButton_YA;


    public static void options(WebDriver driver, String element){ //created this method for reusability instead of finding element 3 different times, we use this to veritfy if the index is visible or not
        //this is void because we did not need a return but wanted an assert if the text is visible or not
     WebElement actualString = Driver.getDriver().findElement(By.xpath("//a[@data-index='"+element+"']"));
        Assert.assertTrue(actualString.isDisplayed());

    }




}

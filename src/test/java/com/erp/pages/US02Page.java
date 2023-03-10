package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US02Page {

    public US02Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@href='/web#menu_id=535&action=723']")
    public WebElement repairBtn; // Dmitri , my WebElement!

    @FindBy(xpath = "//div[@class='table-responsive']//th")
    public List<WebElement> repairColumns;


}

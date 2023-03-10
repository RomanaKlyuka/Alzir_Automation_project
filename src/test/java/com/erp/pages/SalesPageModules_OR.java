package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPageModules_OR {
    public SalesPageModules_OR(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> columnsSale;

    @FindBy(xpath = "//span[normalize-space()='Sales']")
    public WebElement salesButton;

    @FindBy(id ="login")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;



    @FindBy(xpath = "//th[normalize-space()='Quotation Number']")
    public WebElement number;

    @FindBy(xpath = "//th[normalize-space()='Quotation Date']")
    public WebElement date;

    @FindBy(xpath = "//th[normalize-space()='Customer']")
    public WebElement customer;

    @FindBy(xpath = "//th[normalize-space()='Salesperson']")
    public WebElement salesperson;

    @FindBy(xpath = "//th[normalize-space()='Total']")
    public WebElement total;

    @FindBy(xpath = "//th[normalize-space()='Status']")
    public WebElement status;
}

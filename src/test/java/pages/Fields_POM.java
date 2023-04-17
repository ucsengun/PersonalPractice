package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Fields_POM extends MyMethods {
    public Fields_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath= "//span[normalize-space()='Fields']")
    private WebElement fieldsButton;

    @FindBy(xpath= "(//*[name()='svg'][@class='svg-inline--fa fa-plus'])[1]")
    private WebElement addFieldsButton;

    @FindBy(xpath= "(//input[@id='ms-text-field-15'])[1]")
    private WebElement fillNameFields;

    @FindBy(xpath= "(//input[@id='ms-text-field-16'])[1]")
    private WebElement codeNameFields;

    @FindBy(xpath= "(//div[@class='mat-select-arrow ng-tns-c88-394'])[1]")
    private WebElement fieldTypeFields;

    @FindBy(xpath= "(//span[@class='mat-option-text'][normalize-space()='Date'])")
    private WebElement chooseFieldTypeFields;

    @FindBy(xpath= "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-button-base ng-star-inserted mat-raised-button']")
    private WebElement saveFieldTypeFields;

    @FindBy(xpath= " ")
    private WebElement editSuccessMessage;

    public WebElement getFieldsButton() {
        return fieldsButton;
    }

    public WebElement getAddFieldsButton() {
        return addFieldsButton;
    }

    public WebElement getFillNameFields() { return fillNameFields;}

    public WebElement getCodeNameFields() { return codeNameFields;}

    public WebElement getFieldTypeFields() { return fieldTypeFields;}

    public WebElement getChooseFieldTypeFields() { return chooseFieldTypeFields;}

    public WebElement getSaveFieldTypeFields() { return saveFieldTypeFields;}

    public WebElement getEditSuccessMessage(){ return editSuccessMessage;}
    }

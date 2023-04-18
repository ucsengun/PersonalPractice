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

    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    private WebElement fieldsButton;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addFieldsButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement fillNameFields;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement codeNameFields;

    @FindBy(css = "div[id='mat-select-4-panel']")
    private WebElement fieldTypeFields;

    @FindBy(xpath = "//span[text()=' Logical ']")
    private WebElement chooseFieldTypeFields;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveFieldTypeFields;

    @FindBy(xpath = "//div[text()='Field successfully updated']")
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

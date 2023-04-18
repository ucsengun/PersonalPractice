package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Discounts_POM extends MyMethods {
    public Discounts_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersButton;
    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discountsButton;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[11]")
    private WebElement editDiscountsButton;


    @FindBy(xpath= "(//input[@id='ms-text-field-9'])[1]")
    private WebElement editDescriptionField;

    @FindBy(xpath= "//input[@id='ms-text-field-12']")
    private WebElement editIntegrationCodeField;

    @FindBy(xpath= "(//input[@id='ms-integer-field-1'])[1]")
    private WebElement editPriorityField;

    @FindBy(xpath= "//span[contains(text(),'Save')]")
    private WebElement editSaveButton;

    @FindBy(xpath= " ")
    private WebElement successEditMessage;

    public WebElement getParametersButton() {
        return parametersButton;
    }

    public WebElement getDiscountsButton() {
        return discountsButton;
    }

    public WebElement getEditDiscountsButton() {
        return editDiscountsButton;}

    public WebElement getEditDescriptionField() {return editDescriptionField;}

    public WebElement getEditIntegrationCodeField() {return editIntegrationCodeField;}

    public WebElement getEditPriorityField() {
        return editPriorityField;
    }

    public WebElement getEditSaveButton() {
        return editSaveButton;
    }

    public WebElement getSuccessEditMessage() {
        return successEditMessage;
    }
}
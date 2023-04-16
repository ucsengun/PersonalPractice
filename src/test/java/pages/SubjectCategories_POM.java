package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class SubjectCategories_POM extends MyMethods {
    public SubjectCategories_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath= "//span[text()='Education']")
    private WebElement educationButton;

    @FindBy(xpath= "//span[text()='Setup']")
    private WebElement educationSetupButton;

    @FindBy(xpath= "//span[normalize-space()='Subject Categories']")
    private WebElement subjectCategoriesButton;

    @FindBy(xpath= "(//*[name()='svg'][@class='svg-inline--fa fa-plus'])[1]")
    private WebElement addSubjectCategoriesButton;

    @FindBy(xpath= "//input[@id='ms-text-field-2']")
    private WebElement subjectCategoriesNameField;

    @FindBy(xpath= "(//input[@id='ms-text-field-3'])[1]")
    private WebElement subjectCategoriesCodeField;

    @FindBy(xpath= "(//mat-error[@id='mat-error-4'])[1]")
    private WebElement subjectCategoriesNameError;

    public WebElement getEducationButton() {
        return educationButton;
    }

    public WebElement getEducationSetupButton() {return educationSetupButton;}

    public WebElement getSubjectCategoriesButton() {
        return subjectCategoriesButton;
    }

    public WebElement getAddSubjectCategoriesButton() {
        return addSubjectCategoriesButton;
    }

    public WebElement getSubjectCategoriesNameField(){ return  subjectCategoriesNameField;}

    public WebElement getSubjectCategoriesCodeField() {
        return subjectCategoriesCodeField;}

    public WebElement getSubjectCategoriesNameError() {
        return subjectCategoriesNameError;
    }
}
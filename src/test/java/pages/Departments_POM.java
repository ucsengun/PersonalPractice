package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Departments_POM extends MyMethods {
    public Departments_POM(){
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath= "//span[contains(text(), 'Human Resources')]")
    private WebElement humanResourcesButton;

    @FindBy(xpath = "(//span[normalize-space()='Departments'])[1]")
    private WebElement departmentsButton;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addSchoolDepartmentButton;

    @FindBy(xpath = "//input[@data-placeholder= 'Name']")
    private WebElement nameSpace;

    @FindBy(xpath = "//input[@data-placeholder= 'Code']")
    private WebElement codeSpace;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    public WebElement getHumanResourcesButton() {
        return humanResourcesButton;
    }

    public WebElement getDepartmentsButton() {
        return departmentsButton;
    }

    public WebElement getAddSchoolDepartmentButton() {
        return addSchoolDepartmentButton;
    }

    public WebElement getNameSpace() {
        return nameSpace;
    }

    public WebElement getCodeSpace() {
        return codeSpace;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}

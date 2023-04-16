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


    public WebElement getHumanResourcesButton() {
        return humanResourcesButton;
    }

    public WebElement getDepartmentsButton() {
        return departmentsButton;
    }
}

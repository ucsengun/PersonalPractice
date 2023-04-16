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


    public WebElement getFieldsButton() {
        return fieldsButton;
    }
}
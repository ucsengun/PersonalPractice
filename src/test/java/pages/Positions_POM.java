package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Positions_POM extends MyMethods {
    public Positions_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath= "//span[contains(text(), 'Human Resources')]")
    private WebElement humanResourcesButton;

    @FindBy(xpath= "//span[contains(text(), 'Setup']")
    private WebElement setupHumanResourcesButton;

    @FindBy(xpath= "//tbody/tr[1]/td[5]/div[1]/ms-delete-button[1]/button[1]/span[1]/fa-icon[1]//*[name()='svg']")
    private WebElement ;

    @FindBy(xpath= "//button[@type='submit']")
    private WebElement deletePositionsButton;

    public WebElement getHumanResourcesButton() {
        return humanResourcesButton;
    }

    public WebElement getSetupHumanResourcesButton() {
        return setupHumanResourcesButton;
    }

    public WebElement get() { return ; }

    public WebElement getDeletePositionsButton() {
        return deletePositionsButton;
    }


}

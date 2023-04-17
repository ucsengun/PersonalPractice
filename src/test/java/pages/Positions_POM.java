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

    @FindBy(xpath= "//span[normalize-space()='Positions']")
    private WebElement positionsButton;

    @FindBy(xpath= "//button[@mat-icon-button][@color='warn']")
    private WebElement positionsTrashButton;

    @FindBy(xpath= "//button[@type='submit']")
    private WebElement deletePositionsButton;

    @FindBy(xpath= "")
    private WebElement deleteSuccessMessage;

    public WebElement getHumanResourcesButton() {
        return humanResourcesButton;
    }

    public WebElement getSetupHumanResourcesButton() {
        return setupHumanResourcesButton;
    }

    public WebElement getPositionsButton() { return positionsButton; }

    public WebElement getPositionsTrashButton() {
        return positionsTrashButton;
    }

    public WebElement getDeletePositionsButton() {
        return deletePositionsButton;
    }

    public WebElement getDeleteSuccessMessage() {
        return deleteSuccessMessage;
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Attestations_POM extends MyMethods {
    public Attestations_POM() { PageFactory.initElements(DriverClass.getDriver(), this);}

    @FindBy (xpath= "//span[contains(text(), 'Human Resources')]")
    private WebElement humanResourcesButton;

    @FindBy (xpath = "//span[text()='Attestations']")
    private WebElement attestationsButton;

    @FindBy (xpath= "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-badge mat-icon-button mat-button-base mat-badge-accent mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']//fa-icon[@class='ng-fa-icon']//*[name()='svg']")
    private WebElement addAttestationsButton;

    @FindBy (xpath= "(//input[@id='ms-text-field-5'])[1]")
    private WebElement attestationsNameField;

    @FindBy (xpath= "//span[contains(text(),'Save')]")
    private WebElement saveNewAttestations;

    @FindBy (xpath= "")
    private WebElement successMessageNewAttestations;

    public WebElement getHumanResourcesButton() {
        return humanResourcesButton;
    }

    public WebElement getAttestationsButton() {
        return humanResourcesButton;
    }

    public WebElement getAddAttestationsButton() {
        return humanResourcesButton;
    }

    public WebElement getAttestationsNameField() {
        return attestationsNameField;
    }

    public WebElement getSaveNewAttestations() { return  saveNewAttestations; }

    public WebElement getSuccessMessageNewAttestations() {
        return successMessageNewAttestations;
    }
}


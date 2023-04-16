package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class SchoolLocations_POM extends MyMethods {
    public SchoolLocations_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement usernameInputArea;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordInputArea;

    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupButton;

    @FindBy(xpath = "(//span[@class='nav-link-title ng-tns-c111-9 ng-star-inserted'])[1]")
    private WebElement schoolSetupButton;
    @FindBy(xpath = "//span[normalize-space()='Locations']")
    private WebElement locationsButton;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-badge mat-icon-button mat-button-base mat-badge-accent mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']//fa-icon[@class='ng-fa-icon']//*[name()='svg']")       //(//span[@class='mat-button-wrapper'])[9]
    private WebElement addLocationsButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement addSaveButton;
    @FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/ms-edit-button[1]/button[1]/span[1]/fa-icon[1]")
    private WebElement editLocationsButton;

    @FindBy(xpath = "//button[contains(span, 'Save')]")
    private WebElement editSaveLocationButton;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement locationNameArea;


    @FindBy(xpath = "//input[@id='ms-text-field-1']")
    private WebElement locationShortNameArea;

    @FindBy(xpath = "//input[@id='ms-integer-field-0']")
    private WebElement locationCapacityArea;

    @FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']//div[@class='mat-select-arrow']\n")
    private WebElement locationTypeArea;

    @FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/ms-delete-button[1]/button[1]/span[1]/fa-icon[1]")
    private WebElement deleteLocationsButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement sureDeleteLocationButton;

    @FindBy(xpath = "//mat-error[@id='mat-error-42']")
    private WebElement emptyNameError;



    @FindBy(xpath = "//input[@data-placeholder='Capacity']")
    private WebElement editCapacity;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement editLocationName;

    @FindBy(xpath = "(//div[contains(text(),'Location successfully deleted')])")
    private WebElement deleteSuccessMessage;

    @FindBy(xpath = "(//div[@role='status'])[1]")
    private WebElement editSuccessMessage;

    @FindBy(xpath = "//mat-error[contains(text(),'This field cannot be left blank!')]\n")
    private WebElement locationNameError;

    @FindBy(xpath = "//div[@class='cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing']")
    private WebElement locationCapacityError;

    public WebElement getUsernameInputArea() {
        return usernameInputArea;
    }

    public WebElement getPasswordInputArea() {
        return passwordInputArea;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getSetupButton() {
        return setupButton;
    }

    public WebElement getSchoolSetupButton() {
        return schoolSetupButton;
    }

    public WebElement getLocationsButton() {
        return locationsButton;
    }

    public WebElement getAddLocationsButton() {
        return addLocationsButton;
    }

    public WebElement getAddSaveButton(){ return addSaveButton; }

    public WebElement getEditLocationsButton() {
        return editLocationsButton;
    }

    public WebElement getEditSaveLocationButton() {
        return editSaveLocationButton;
    }

    public WebElement getLocationNameArea(){return locationNameArea; }

    public WebElement getDeleteLocationsButton() {
        return deleteLocationsButton;
    }

    public WebElement getSureDeleteLocationButton() {
        return sureDeleteLocationButton;
    }

    public WebElement getLocationShortNameArea(){return locationShortNameArea;}

    public WebElement getLocationCapacityArea(){return locationCapacityArea;}

    public WebElement getLocationTypeArea(){return locationTypeArea;}

    public WebElement getEmptyNameError(){return emptyNameError;}


    public WebElement getEditCapacity(){return editCapacity;}

    public WebElement getEditLocationName(){return editLocationName;}

    public WebElement getDeleteSuccessMessage(){return deleteSuccessMessage;}

    public WebElement getEditSuccessMessage(){return editSuccessMessage;}

    public WebElement getLocationNameError(){return locationNameError;}

    public WebElement getLocationCapacityError(){return locationCapacityError;}
}

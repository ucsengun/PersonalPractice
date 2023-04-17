package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class GradeLevels_POM extends MyMethods {
    public GradeLevels_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath= "//span[normalize-space()='Grade Levels']")
    private WebElement gradeLevelsButton;

    @FindBy(xpath= "//button[@class='mat-focus-indicator mat-menu-trigger mat-icon-button mat-button-base']//fa-icon[@class='ng-fa-icon']//*[name()='svg']")
    private WebElement hamburgerMenu;

    @FindBy(xpath= "//span[normalize-space()='Grade Levels']")
    private WebElement gradeLevelsButtonCheckBox;

    @FindBy(xpath= "//div[@id='cdk-drop-list-2']//div[1]")
    private WebElement successCheckBox;
    public WebElement getGradeLevelsButton() {
        return gradeLevelsButton;
    }

    public WebElement getHamburgerMenu(){
        return hamburgerMenu;
    }

    public WebElement getGradeLevelsButtonCheckBox(){
        return gradeLevelsButtonCheckBox;
    }

    public WebElement getSuccessCheckBox() {
        return successCheckBox;
    }
}
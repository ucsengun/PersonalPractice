package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class PositionsCategories_POM extends MyMethods {
    public PositionsCategories_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath= "//span[contains(text(), 'Human Resources')]")
    private WebElement humanResourcesButton;


    @FindBy(xpath= "//span[normalize-space()='Position Categories']")
    private WebElement positionCategoriesButton;

    @FindBy(xpath= "//tbody/tr[1]/td[3]/div[1]/ms-edit-button[1]/button[1]/span[1]/fa-icon[1]//*[name()='svg']")
    private WebElement editPositionCategoriesButton;



    public WebElement getHumanResourcesButton() {
        return humanResourcesButton;
    }

    public WebElement getPositionCategoriesButton() {
        return positionCategoriesButton;
    }

    public WebElement getEditPositionCategoriesButton() {
        return editPositionCategoriesButton;
    }
}
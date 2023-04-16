package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Nationalities_POM extends MyMethods {
    public Nationalities_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Nationalities']")
    private WebElement nationalitiesButton;

    @FindBy(xpath = "//input[starts-with(@id, 'ms-text-field-')]")
    private WebElement nationalitiesSearchBox;


    @FindBy(xpath = "//button[@class='mat-raised-button']")
    private WebElement clickSearchButtonNationalities;

    public WebElement getNationalitiesButton() {
        return nationalitiesButton;}

    public WebElement getNationalitiesSearchBox() {
        return nationalitiesSearchBox;}

    public WebElement getClickSearchButtonNationalities() {
        return clickSearchButtonNationalities;
        }
    }


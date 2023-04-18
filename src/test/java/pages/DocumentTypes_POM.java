package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class DocumentTypes_POM extends MyMethods {
    public DocumentTypes_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypesButton;

    @FindBy(css = "svg[data-icon='trash-can']")
    private WebElement documentTypesTrashButton;

    @FindBy(xpath= "//button[@type='submit']")
    private WebElement documentTypesDeleteButton;

    @FindBy(xpath = "(//div[contains(text(),'Location successfully deleted')])")
    private WebElement documentTypesDeleteSuccessMessage;

    public WebElement getDocumentTypesButton() {
        return documentTypesButton;}

    public WebElement getDocumentTypesTrashButton() {
        return documentTypesTrashButton;}

    public WebElement getDocumentTypesDeleteButton() {
        return documentTypesDeleteButton;}

    public WebElement getDocumentTypesDeleteSuccessMessage() {
        return documentTypesDeleteSuccessMessage;}
}
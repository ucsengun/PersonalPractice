package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class DocumentTypes_POM extends MyMethods {
    public DocumentTypes_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
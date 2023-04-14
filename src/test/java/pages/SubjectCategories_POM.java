package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class SubjectCategories_POM extends MyMethods {
    public SubjectCategories_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
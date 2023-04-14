package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class SchoolLocations_POM extends MyMethods {
    public SchoolLocations_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}

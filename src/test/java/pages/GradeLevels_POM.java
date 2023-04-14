package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class GradeLevels_POM extends MyMethods {
    public GradeLevels_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
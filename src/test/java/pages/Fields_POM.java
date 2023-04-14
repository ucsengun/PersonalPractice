package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Fields_POM extends MyMethods {
    public Fields_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
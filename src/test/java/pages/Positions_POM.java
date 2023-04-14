package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Positions_POM extends MyMethods {
    public Positions_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}

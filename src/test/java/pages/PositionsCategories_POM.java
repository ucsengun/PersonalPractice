package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class PositionsCategories_POM extends MyMethods {
    public PositionsCategories_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
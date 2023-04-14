package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Discounts_POM extends MyMethods {
    public Discounts_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
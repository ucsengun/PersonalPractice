package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Departments_POM extends MyMethods {
    public Departments_POM(){
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}

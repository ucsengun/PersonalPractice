package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Attestations_POM extends MyMethods {
    public Attestations_POM() { PageFactory.initElements(DriverClass.getDriver(), this);
        }
    }


package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

    public class BankAccounts_POM extends MyMethods {
        public BankAccounts_POM() {
            PageFactory.initElements(DriverClass.getDriver(), this);
        }
    }


package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

    public class BankAccounts_POM extends MyMethods {
        public BankAccounts_POM() {
            PageFactory.initElements(DriverClass.getDriver(), this);
        }

        @FindBy(xpath= "//span[normalize-space()='Bank Accounts']")
        private WebElement bankAccountsButton;

        @FindBy(xpath= "//tbody/tr[1]/td[7]/div[1]/ms-delete-button[1]/button[1]/span[1]/fa-icon[1]//*[name()='svg']")
        private WebElement bankAccountsTrashButton;

        @FindBy(xpath= "//button[@type='submit']")
        private WebElement deleteBankAccountsButton;

        public WebElement getBankAccountsButton() {
            return bankAccountsButton;
        }

        public WebElement getBankAccountsTrashButton() {
            return bankAccountsTrashButton;
        }

        public WebElement getDeleteBankAccountsButton() {
            return deleteBankAccountsButton;
        }
    }


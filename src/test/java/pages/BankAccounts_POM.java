package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

import java.util.List;

public class BankAccounts_POM extends MyMethods {
        public BankAccounts_POM() {
            PageFactory.initElements(DriverClass.getDriver(), this);
        }

        @FindBy(xpath = "//span[text()='Bank Accounts']")
        private WebElement bankAccountsButton;

        @FindBy(xpath = "//ms-delete-button//button//span//fa-icon")
        private WebElement bankAccountsTrashButton;

        @FindBy(xpath= "//button[@type='submit']")
        private List<WebElement> deleteBankAccountsButton;

//        @FindBy(xpath= " ")
 //       private WebElement deleteSuccessMessage;

        public WebElement getBankAccountsButton() {
            return bankAccountsButton;
        }

        public WebElement getBankAccountsTrashButton() {
            return bankAccountsTrashButton;
        }

     //   public WebElement getDeleteBankAccountsButton() {
    //        return deleteBankAccountsButton;
        }

      //  public WebElement getDeleteSuccessMessage() {
     //       return deleteSuccessMessage;
      //  }
   // }


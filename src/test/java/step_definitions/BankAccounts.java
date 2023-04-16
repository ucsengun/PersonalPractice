package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BankAccounts_POM;

public class BankAccounts {

    BankAccounts_POM bu = new BankAccounts_POM();
    @And("click setup from left frame")
    public void clickSetupFromLeftFrame() {
        bu.
    }

    @And("click bank accounts")
    public void clickBankAccounts() {
        bu.
    }

    @And("click trash button")
    public void clickTrashButton() {
        bu.
    }

    @And("click delete bank accounts button")
    public void clickDeleteBankAccountsButton() {
        bu.
    }

    @Then("see success message for deleting bank account")
    public void seeSuccessMessageForDeletingBankAccount() {
       bu.
    }
}

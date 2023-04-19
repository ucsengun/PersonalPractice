package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BankAccounts_POM;
import pages.Departments_POM;
import pages.Discounts_POM;

public class BankAccounts {

    BankAccounts_POM bu = new BankAccounts_POM();

    Discounts_POM diu = new Discounts_POM();

    Departments_POM du = new Departments_POM();
    @And("click setup from left frame")
    public void clickSetupFromLeftFrame() {
        du.clickMethod(du.getSetupButton());
    }

    @And("click parameters for bank accounts")
    public void clickParametersForBankAccounts() {
        diu.clickMethod(diu.getParametersButton());
    }

    @And("click bank accounts")
    public void clickBankAccounts() {
        bu.clickMethod(bu.getBankAccountsButton());
    }

    @And("click trash button")
    public void clickTrashButton() {
        bu.clickMethod(bu.getBankAccountsTrashButton());
    }

    @And("click delete bank accounts button")
    public void clickDeleteBankAccountsButton() {
       // bu.clickMethod(bu.getDel());
    }

    @Then("see success message for deleting bank account")
    public void seeSuccessMessageForDeletingBankAccount() {
       //bu.clickMethod(bu.getDeleteSuccessMessage());
    }

}

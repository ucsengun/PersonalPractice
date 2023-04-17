package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Discounts_POM;

public class Discounts {

    Discounts_POM diu = new Discounts_POM();
    @And("click parameters")
    public void clickParameters() {
        diu.clickMethod(diu.getParametersButton());
    }

    @And("click discounts")
    public void clickDiscounts() {
      diu.clickMethod(diu.getDiscountsButton());
    }

    @And("click edit discounts")
    public void clickEditDiscounts() {
        diu.clickMethod(diu.getEditDiscountsButton());
    }

    @And("fill form again")
    public void fillFormAgain() {
        diu.sendKeysMethod(diu.getEditDescriptionField(), "bbb");
        diu.sendKeysMethod(diu.getEditIntegrationCodeField(), "ddd");
        diu.sendKeysMethod(diu.getEditPriorityField(), "eee");
    }

    @And("click save button for discount")
    public void clickSaveButtonForDiscount() {
        diu.clickMethod(diu.getEditSaveButton());
    }

    @Then("see success message for editing discount")
    public void seeSuccessMessageForEditingDiscount() {

    }
}

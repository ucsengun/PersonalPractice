package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Discounts_POM;

public class Discounts {

    Discounts_POM diu = new Discounts_POM();
    @And("click parameters")
    public void clickParameters() {

    }

    @And("click discounts")
    public void clickDiscounts() {
      //  diu.clickMethod(diu.get);
    }

    @And("click edit discounts")
    public void clickEditDiscounts() {
        
    }

    @And("fill form again")
    public void fillFormAgain() {
        
    }

    @And("click save button for discount")
    public void clickSaveButtonForDiscount() {
        
    }

    @Then("see success message for editing discount")
    public void seeSuccessMessageForEditingDiscount() {

    }
}

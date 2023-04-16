package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Fields_POM;

public class Fields {

    Fields_POM fu = new Fields_POM();
    @And("click fields")
    public void clickFields() {
        fu.clickMethod(fu.getFieldsButton());
    }

    @And("click add new fields")
    public void clickAddNewFields() {
        fu.clickMethod(fu.getAddFieldsButton());
    }

    @And("fill fields form")
    public void fillFieldsForm() {
        fu.clickMethod(fu.getFillNameFields());
    }

    @And("click save button for new fields")
    public void clickSaveButtonForNewFields() {
        fu.clickMethod(fu.getSaveFieldTypeFields());
    }

    @Then("see success message for new fields")
    public void seeSuccessMessageForNewFields() {

    }
}

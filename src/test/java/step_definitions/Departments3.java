package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Departments_POM;

public class Departments3 {

    Departments_POM du = new Departments_POM();
    @And("click edit school department button")
    public void clickEditSchoolDepartmentButton() {
        du.clickMethod(du.getEditButtonForDepartments());

    }

    @And("click edit and click save button for school department")
    public void clickEditAndClickSaveButtonForSchoolDepartment() {
        du.sendKeysMethod(du.getNameSpace(), "Abcdef");
        du.clickMethod(du.getSaveButton());
    }

    @Then("Success message with text School Department successfully updated is displayed")
    public void successMessageWithTextSchoolDepartmentSuccessfullyUpdatedIsDisplayed() {
        Assert.assertTrue(du.verifyIsDisplayedMethod(du.getSuccessMessage()));

    }
}

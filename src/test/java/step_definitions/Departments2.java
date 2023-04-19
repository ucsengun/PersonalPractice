package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Departments_POM;

public class Departments2 {

    Departments_POM du = new Departments_POM();

    @And("click delete department button")
    public void clickDeleteDepartmentButton() {
        du.clickMethod(du.getDeleteDepartmentButton());

    }

    @And("click delete option for department")
    public void clickDeleteOptionForDepartment() {
        du.clickMethod(du.getDeleteOptionInDeletePage());

    }

    @Then("see success message for deleting department")
    public void seeSuccessMessageForDeletingDepartment() {
        Assert.assertTrue(du.verifyIsDisplayedMethod(du.getDeleteDepartmentSuccessMessage()));

    }
}

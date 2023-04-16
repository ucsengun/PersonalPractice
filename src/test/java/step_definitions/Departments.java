package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Departments_POM;

public class Departments {

    Departments_POM du = new Departments_POM();
    @And("click setup")
    public void clickSetup() {
        //du.clickMethod();
    }

    @And("click school setup")
    public void clickSchoolSetup() {

    }

    @And("click departments")
    public void clickDepartments() {
        du.clickMethod(du.getDepartmentsButton());
    }


    @And("click Add new school department")
    public void clickAddNewSchoolDepartment() {
        du.clickMethod(du.getAddSchoolDepartmentButton());
    }

    @And("fill form except school code")
    public void fillFormExceptSchoolCode() {
        du.getNameSpace();
        du.getCodeSpace();
    }

    @Then("see error message for school code")
    public void seeErrorMessageForSchoolCode() {
       // du.
    }
}

package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SchoolLocations_POM;
import pages.SubjectCategories_POM;

public class SubjectCategories {

    SchoolLocations_POM su = new SchoolLocations_POM();

    SubjectCategories_POM sc = new SubjectCategories_POM();
    @And("click education")
    public void clickEducation() {
        sc.clickMethod(sc.getEducationButton());
    }

    @And("click education setup")
    public void clickEducationSetup() {
        sc.clickMethod(sc.getEducationSetupButton());
    }

    @And("click subject categories")
    public void clickSubjectCategories() {
        sc.clickMethod(sc.getSubjectCategoriesButton());
    }

    @And("click add button for subject categories")
    public void clickAddButtonForSubjectCategories() {
        sc.clickMethod(sc.getAddSubjectCategoriesButton());
    }

    @And("fill form except subject category name")
    public void fillFormExceptSubjectCategoryName() {
        sc.sendKeysMethod(sc.getSubjectCategoriesNameField(), "");
        sc.sendKeysMethod(sc.getSubjectCategoriesCodeField(), "uuuuuu");

    }

    @Then("see error message for subject category name")
    public void seeErrorMessageForSubjectCategoryName() {
        Assert.assertTrue(sc.verifyIsDisplayedMethod(sc.getSubjectCategoriesNameError()));
    }
}

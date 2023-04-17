package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GradeLevels_POM;

public class GradeLevels {

    GradeLevels_POM gu = new GradeLevels_POM();
    @And("click grade levels")
    public void clickGradeLevels() {
        gu.clickMethod(gu.getGradeLevelsButton());
    }

    @And("click hamburger menu")
    public void clickHamburgerMenu() {
        gu.clickMethod(gu.getHamburgerMenu());
    }

    @And("click checkbox of id")
    public void clickCheckboxOfId() {
        gu.clickMethod(gu.getGradeLevelsButtonCheckBox());
    }

    @Then("verify id checkbox")
    public void verifyIdCheckbox() {
       Assert.assertTrue(gu.verifyIsDisplayedMethod(gu.getSuccessCheckBox()));
    }
}

package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.SchoolLocations_POM;

public class SchoolLocations3 {

    SchoolLocations_POM slu = new SchoolLocations_POM();

    @And("Click Edit School Location button")
    public void clickEditSchoolLocationButton() {
        slu.clickMethod(slu.getEditLocationsButton());

    }

    @And("Change Name of school location")
    public void changeNameOfSchoolLocation() throws InterruptedException {
        synchronized (slu) {
            slu.wait(5000);
        }

        slu.clickMethod(slu.getEditLocationName());
        slu.getEditLocationName().sendKeys(Keys.BACK_SPACE);
        slu.sendKeysMethod(slu.getEditLocationName(), "1000");
        
    }

    @And("Click save for name")
    public void clickSaveForName() {
        slu.clickMethod(slu.getEditSaveLocationButton());

    }

    @Then("See success message for editing location name")
    public void seeSuccessMessageForEditingLocationName() {
        Assert.assertTrue(slu.verifyIsDisplayedMethod(slu.getEditSuccessMessage()));

    }
}

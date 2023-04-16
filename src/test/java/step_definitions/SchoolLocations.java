package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.SchoolLocations_POM;

public class SchoolLocations {

    SchoolLocations_POM sl = new SchoolLocations_POM();

    @And("Click on Setup from the menu on the left")
    public void clickOnSetupFromTheMenuOnTheLeft() {
        {
            sl.clickMethod(sl.getSetupButton());

        }


    }

    @And("Click School Setup")
    public void clickSchoolSetup() {
        sl.clickMethod(sl.getSchoolSetupButton());
    }

    @And("Click Locations")
    public void clickLocations() {
        sl.clickMethod(sl.getLocationsButton());
    }

    @And("Click Add School Location button")
    public void clickAddSchoolLocationButton() {
        sl.clickMethod(sl.getAddLocationsButton());
    }

    @And("Fill all of them except location capacity area")
    public void fillAllOfThemExceptLocationCapacityArea() {
        sl.sendKeysMethod(sl.getLocationNameArea(), "abcde");
        sl.sendKeysMethod(sl.getLocationShortNameArea(), "abc");
        sl.getEditCapacity().sendKeys(Keys.BACK_SPACE);
        sl.sendKeysMethod(sl.getEditCapacity(), " ");
    }

    @Then("See error message for location capacity")
    public void seeErrorMessageForLocationCapacity() {
        String error = sl.getLocationCapacityError().getText();
        Assert.assertTrue(error.contains("This field cannot be left blank!"));
    }
}

    
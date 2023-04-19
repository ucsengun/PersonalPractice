package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SchoolLocations_POM;

public class SchoolLocations2 {

    SchoolLocations_POM slu = new SchoolLocations_POM();
    @And("Fill except school location name")
    public void fillExceptSchoolLocationName() {
        slu.sendKeysMethod(slu.getLocationShortNameArea(), "defghj");
        slu.sendKeysMethod(slu.getLocationCapacityArea(), "100");
    }

    @Then("See error message for school location name")
    public void seeErrorMessageForSchoolLocationName() {

    }
}

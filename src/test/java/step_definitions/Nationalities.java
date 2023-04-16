package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Nationalities_POM;

public class Nationalities {

    Nationalities_POM nu = new Nationalities_POM();

    @And("click nationalities")
    public void clickNationalities() {
        nu.clickMethod(nu.getNationalitiesButton());
    }

    @And("type anything to search box")
    public void typeAnythingToSearchBox() {
        nu.clickMethod(nu.getNationalitiesSearchBox());
        nu.sendKeysMethod(nu.getNationalitiesSearchBox(), "eee");
    }

    @Then("click search button for nationalities")
    public void clickSearchButtonForNationalities() {
        nu.clickMethod(nu.getClickSearchButtonNationalities());
    }
}

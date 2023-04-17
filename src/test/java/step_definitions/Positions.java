package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Positions_POM;

public class Positions {

    Positions_POM pu = new Positions_POM();
    @And("click setup in human resources")
    public void clickSetupInHumanResources() {
        pu.clickMethod(pu.getHumanResourcesButton());
    }

    @And("click positions")
    public void clickPositions() {
        pu.clickMethod(pu.getPositionsButton());
    }

    @And("click trash button for positions")
    public void clickTrashButtonForPositions() {
        pu.clickMethod(pu.getPositionsTrashButton());
    }

    @And("click delete positions button")
    public void clickDeletePositionsButton() {
        pu.clickMethod(pu.getDeletePositionsButton());
    }

    @Then("see success message for deleting position")
    public void seeSuccessMessageForDeletingPosition() {

    }
}

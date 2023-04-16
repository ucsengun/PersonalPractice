package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.PositionsCategories_POM;

public class PositionCategories {

    PositionsCategories_POM pou = new PositionsCategories_POM();
    @And("click human resources")
    public void clickHumanResources() {
        pou.clickMethod(pou.getHumanResourcesButton());
    }

    @And("click position categories")
    public void clickPositionCategories() {
        pou.clickMethod(pou.getPositionCategoriesButton());
    }

    @And("click edit button for position categories")
    public void clickEditButtonForPositionCategories() {
        pou.clickMethod(pou.getEditPositionCategoriesButton());
    }

    @And("edit name position categories")
    public void editNamePositionCategories() {
        // Action
    }

    @Then("click save button for position categories")
    public void clickSaveButtonForPositionCategories() {
        pou.clickMethod(pou.getEditPositionCategoriesSaveButton());
    }
}

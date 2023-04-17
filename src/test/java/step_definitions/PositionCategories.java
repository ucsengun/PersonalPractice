package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.PositionsCategories_POM;
import utilities.DriverClass;

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
        pou.clickMethod(pou.getEditPositionCategoriesName());
        Actions actions = new Actions(DriverClass.getDriver());
        Action doubleClickPriority = actions.moveToElement(pou.getEditPositionCategoriesName()).doubleClick().build();
        doubleClickPriority.perform();

        Action deletePriority = actions.sendKeys(pou.getEditPositionCategoriesName(), Keys.DELETE).build();
        deletePriority.perform();

        pou.sendKeysMethod(pou.getEditPositionCategoriesName(), "1000");

        pou.clickMethod(pou.getedi());
        Actions actions = new Actions(DriverClass.getDriver());
        Action doubleClickPriority = actions.moveToElement(pou.getEditPositionCategoriesName()).doubleClick().build();
        doubleClickPriority.perform();

        Action deletePriority = actions.sendKeys(pou.getEditPositionCategoriesName(), Keys.DELETE).build();
        deletePriority.perform();

        pou.sendKeysMethod(pou.getEditPositionCategoriesName(), "1000");

        pou.clickMethod(pou.getEditPositionCategoriesName());
        Actions actions = new Actions(DriverClass.getDriver());
        Action doubleClickPriority = actions.moveToElement(pou.getEditPositionCategoriesName()).doubleClick().build();
        doubleClickPriority.perform();

        Action deletePriority = actions.sendKeys(pou.getEditPositionCategoriesName(), Keys.DELETE).build();
        deletePriority.perform();

        pou.sendKeysMethod(pou.getEditPositionCategoriesName(), "1000");
    }

    @Then("click save button for position categories")
    public void clickSaveButtonForPositionCategories() {
        pou.clickMethod(pou.getEditPositionCategoriesSaveButton());
    }
}

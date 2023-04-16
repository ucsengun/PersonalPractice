package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Attestations_POM;
import pages.Login_POM;

import static utilities.DriverClass.getDriver;

public class Attestations {

    Login_POM ul = new Login_POM();

    Attestations_POM au = new Attestations_POM();

    @Given("navigate to website")
    public void navigateToWebsite() {
        getDriver().get("https://test.mersys.io/");

    }

    @When("login")
    public void login() {
        ul.sendKeysMethod(ul.getUsernameInputArea(), "turkeyts");
        ul.sendKeysMethod(ul.getPasswordInputArea(), "TechnoStudy123");
        ul.clickMethod(ul.getLoginButton());
    }

    @And("click setup button for attestations")
    public void clickSetupButtonForAttestations() {
        au.clickMethod(au.getHumanResourcesButton());
    }

    @And("click attestations")
    public void clickAttestations() {

    }

    @And("click add attestations")
    public void clickAddAttestations() {
        
    }

    @And("fill attestations name")
    public void fillAttestationsName() {
        
    }

    @And("click save button for new attestations")
    public void clickSaveButtonForNewAttestations() {
        
    }

    @Then("success message for attestations")
    public void successMessageForAttestations() {

    }
}

package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.DocumentTypes_POM;

public class DocumentTypes {

    DocumentTypes_POM dtu = new DocumentTypes_POM();
    @And("click document types")
    public void clickDocumentTypes() {
        dtu.clickMethod(dtu.getDocumentTypesButton());
    }

    @And("click trash button for document types")
    public void clickTrashButtonForDocumentTypes() {
        dtu.clickMethod(dtu.getDocumentTypesTrashButton());
    }

    @And("click delete document types button")
    public void clickDeleteDocumentTypesButton() {
        dtu.clickMethod(dtu.getDocumentTypesDeleteButton());
    }

    @Then("see success message for deleting document types")
    public void seeSuccessMessageForDeletingDocumentTypes() {

    }
}

package stepdefs;

import io.cucumber.java.en.Then;
import pages.SuccessRegistrationPage;

public class SuccessRegistrationPageStepdefs {
    SuccessRegistrationPage successRegistrationPage = new SuccessRegistrationPage();

    @Then("I see message {string} appears")
    public void iSeeMessageYourAccountHasBeenCreatedAppears(String successMessage) {
        successRegistrationPage.getSuccessMessage(successMessage);

    }
}

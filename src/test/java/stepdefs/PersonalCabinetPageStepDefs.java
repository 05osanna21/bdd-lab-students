package stepdefs;

import io.cucumber.java.en.Then;
import pages.PersonalCabinetPage;

public class PersonalCabinetPageStepDefs {
    PersonalCabinetPage personalCabinetPage = new PersonalCabinetPage();

    @Then("I see {string} in the Personal Cabinet Page")
    public void iSeeMyAccountInThePersonalCabinetPage(String title) {
        personalCabinetPage.findTitle(title);
    }
}

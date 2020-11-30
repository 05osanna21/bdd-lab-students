package stepdefs;

import config.RandomEmail;
import config.UserConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.RegistrationPage;

public class RegistrationPageStepDefs {
    RegistrationPage registrationPage = new RegistrationPage();
    RandomEmail randomEmail = new RandomEmail();

    @Then("I fill form with valid values")
    public void iFillFormWithValidValues() {
        registrationPage.setFirstNameField(UserConfig.USER_NAME);
        registrationPage.setLastNameField(UserConfig.USER_LAST_NAME);
        registrationPage.setEmail(UserConfig.USER_EMAIL_RANDOM);
        registrationPage.setTelephoneField(UserConfig.USER_TELEPHONE);
        registrationPage.setPasswordField(UserConfig.USER_PASSWORD);
        registrationPage.setConfirmPasswordField(UserConfig.USER_PASSWORD);
        registrationPage.clickCheckbox();
        registrationPage.clickContinueButton();
    }
// test2
    @And("I fill all fields except First Name")
    public void iFillAllFieldsExceptFirstName() {
        registrationPage.setLastNameField(UserConfig.USER_LAST_NAME);
        registrationPage.setEmail(UserConfig.USER_EMAIL_RANDOM);
        registrationPage.setTelephoneField(UserConfig.USER_TELEPHONE);
        registrationPage.setPasswordField(UserConfig.USER_PASSWORD);
        registrationPage.setConfirmPasswordField(UserConfig.USER_PASSWORD);
        registrationPage.clickCheckbox();
        registrationPage.clickContinueButton();
    }

    @Then("I see that message {string} appears")
    public void iSeeThatMessageFirstNameMustBeBetweenAndCharactersAppears(String errorMessage) {
        registrationPage.getEmptyFirstNameFieldError(errorMessage);
    }
}

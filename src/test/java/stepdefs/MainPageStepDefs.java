package stepdefs;

import components.TopBar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageStepDefs {
    MainPage mainPage = new MainPage();
    TopBar topBar = new TopBar();

    @Given("I open Main page")
    public void i_open_main_page() {
        mainPage.openMainPage();
        topBar.clickIconMyAccount();
    }

    @When("I select {string} on the TopBar Menu")
    public void iSelectRegisterOnTheTopBarMenu( String registerLink) {
        topBar.selectRegister();
    }
}

package stepdefs;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageStepDefs {
    MainPage mainPage = new MainPage();

    @Given("I am open Main page")
    public void i_am_open_main_page() {
        System.out.println(6);
        mainPage.openMainPage();
        mainPage.clickIconMyAccount();
    }

}

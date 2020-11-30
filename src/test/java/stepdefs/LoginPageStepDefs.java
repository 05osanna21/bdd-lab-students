package stepdefs;

import components.TopBar;
import config.UserConfig;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();
    TopBar topBar = new TopBar();


    @When("I open the demoOpenCart login page")
    public void i_open_the_demo_open_cart_login_page() {
        topBar.clickLogin();
    }

    @When("I enter {string} into  email field")
    public void i_enter_into_email_field(String email) {
        loginPage.setEmailAdress(UserConfig.USER_EMAIL);
    }

    @When("I enter {string} into  password field")
    public void i_enter_into_password_field(String password) {
        loginPage.setPassword(UserConfig.USER_PASSWORD);
    }

    @When("I click on the Login button")
    public void i_click_on_the_button() {
        loginPage.clickLoginButton();
    }

    @When("I login to the site")
    public void iLoginToTheSite() {
       topBar.clickLogin();
        loginPage.setEmailAdress(UserConfig.USER_EMAIL);
        loginPage.setPassword(UserConfig.USER_PASSWORD);
        loginPage.clickLoginButton();
    }
}



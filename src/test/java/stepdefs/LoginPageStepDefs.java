package stepdefs;

import components.TopBar;
import config.UserConfig;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import pages.LoginPage;

@Slf4j
public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();
    TopBar topBar = new TopBar();


    @When("I open the demoOpenCart login page")
    public void i_open_the_demo_open_cart_login_page() {
        log.info("Opening Login Page");
        topBar.clickLogin();
    }

    @When("I enter {string} into  email field")
    public void i_enter_into_email_field(String email) {
        log.info("Filling email field");
        loginPage.setEmailAdress(UserConfig.USER_EMAIL);
    }

    @When("I enter {string} into  password field")
    public void i_enter_into_password_field(String password) {
        log.info("Filling password field");
        loginPage.setPassword(UserConfig.USER_PASSWORD);
    }

    @When("I click on the Login button")
    public void i_click_on_the_button() {
        log.info("Clicking on the login button");
        loginPage.clickLoginButton();
    }

    @When("I login to the site")
    public void iLoginToTheSite() {
        log.info("Log in on tne site");
        topBar.clickLogin();
        loginPage.setEmailAdress(UserConfig.USER_EMAIL);
        loginPage.setPassword(UserConfig.USER_PASSWORD);
        loginPage.clickLoginButton();
    }
}



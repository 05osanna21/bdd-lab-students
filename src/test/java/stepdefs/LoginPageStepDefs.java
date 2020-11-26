package stepdefs;

import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.LoginPage;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();


    @When("I am open the demoOpenCart login page")
    public void i_open_the_demo_open_cart_login_page() {
        System.out.println(1);
        loginPage.clickLogin();
    }

    @When("I enter {string} into  email field")
    public void i_enter_into_email_field(String email) {
        System.out.println(2);
        loginPage.setEmailAdress(email);
    }

    @When("I enter {string} into  password field")
    public void i_enter_into_password_field(String password) {
        System.out.println(3);
        loginPage.setPassword(password);
    }

    @When("I click on the Login button")
    public void i_click_on_the_button() {
        System.out.println(4);
        loginPage.clickLoginButton();
    }
}



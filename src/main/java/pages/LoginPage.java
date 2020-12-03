package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.Screenshots.makeScreenshot;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@class='form-group']//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;


    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @Step
    public void setEmailAdress(String email) {
        waitUntilVisible(emailField, 5).sendKeys(email);
    }

    @Step("Password")
    public void setPassword(String password) {
        waitUntilVisible(passwordField,5).sendKeys(password);
        makeScreenshot();

    }

    @Step
    public void clickLoginButton() {
        waitUntilClickable(loginButton,5).click();
    }
}

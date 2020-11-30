package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void setEmailAdress(String email) {
        waitUntilVisible(emailField, 5).sendKeys(email);
    }

    public void setPassword(String password) {
        waitUntilVisible(passwordField,5).sendKeys(password);

    }

    public void clickLoginButton() {
        waitUntilClickable(loginButton,5).click();
    }
}

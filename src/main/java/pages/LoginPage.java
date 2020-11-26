package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//div[@id='search']//input[@type='text']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@class='form-group']//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;
    @FindBy(xpath = "//li//a[text()='Login']")
    private WebElement login;

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
    public void clickLogin() {
        waitUntilVisible(login,5).click();
    }
}

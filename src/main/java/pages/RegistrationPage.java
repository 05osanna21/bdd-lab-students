package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage{

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement telephoneField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='confirm']")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='input-firstname']/following-sibling::div ")
    private WebElement errorEmptyFirstName;

    public RegistrationPage() {
        PageFactory.initElements(getDriver(), this);
    }
    public void setFirstNameField(String userName) {
        waitUntilVisible(firstNameField, 5).sendKeys(userName);
    }
    public void setLastNameField(String lastName) {
        waitUntilVisible(lastNameField, 5).sendKeys(lastName);
    }
    public void setEmail(String email) {
        waitUntilVisible(emailField, 5).sendKeys(email);
    }
    public void setTelephoneField(String telephone) {
        waitUntilVisible(telephoneField, 5).sendKeys(telephone);
    }
    public void setPasswordField(String password) {
        waitUntilVisible(passwordField, 5).sendKeys(password);
    }
    public void setConfirmPasswordField(String confirmPassword) {
        waitUntilVisible(confirmPasswordField, 5).sendKeys(confirmPassword);
    }
    public void clickCheckbox() {
        waitUntilClickable(checkbox,5).click();
    }
    public BasePage clickContinueButton(){
        waitUntilClickable(continueButton,5).click();
        if(getDriver().getCurrentUrl().contains("register")){
            return new RegistrationPage();
        } else {
            return new PersonalCabinetPage();

        }
    }
    public void getEmptyFirstNameFieldError(String errorMessage){
        waitUntilVisible(errorEmptyFirstName,5).getText();

    }

}

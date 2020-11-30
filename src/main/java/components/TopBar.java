package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class TopBar extends BasePage {
    private WebDriver webDriver;
    private WebDriverWait wait;
    private Actions actions;

    public TopBar(WebDriver driver) {
        webDriver = driver;
        wait = new WebDriverWait(webDriver,5);
        actions = new Actions(webDriver);
    }

    public TopBar() {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath = "//span[@ class='hidden-xs hidden-sm hidden-md' and text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//li//a[text()='Login']")
    private WebElement login;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerLink;

    public void clickIconMyAccount() {
        waitUntilVisible(myAccount, 5).click();
}
    public void clickLogin() {
        waitUntilVisible(login,5).click();
    }
    public void selectRegister(){
        waitUntilVisible(registerLink,5).click();
    }
}

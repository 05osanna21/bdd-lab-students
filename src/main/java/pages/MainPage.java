package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class MainPage extends BasePage {

    public MainPage() {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath = "//span[@ class='hidden-xs hidden-sm hidden-md' and text()='My Account']")
    private WebElement myAccount;


    public void openMainPage() {
        getDriver().get("https://demo.opencart.com/");
    }

    public void clickIconMyAccount() {
        waitUntilVisible(myAccount, 5).click();

    }
}
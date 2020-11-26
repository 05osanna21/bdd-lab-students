package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement myAccount;


    public String findAccountPage() {
         return (myAccount).getText();

    }
}

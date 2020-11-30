package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessRegistrationPage extends BasePage{

    @FindBy(xpath = "//div[@id='content']//h1")
    private WebElement successMessage;

    public SuccessRegistrationPage() {
        PageFactory.initElements(getDriver(), this);
    }
    public void getSuccessMessage(String successMessage){
        waitUntilVisible(this.successMessage,5);
    }

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalCabinetPage extends BasePage {



    @FindBy(xpath = "//div[@id='content']//h2[1]")
    private WebElement myAccount;

    public PersonalCabinetPage() {
        PageFactory.initElements(getDriver(), this);
    }
    public String findTitle(String title) {
        return (myAccount).getText();

    }

}

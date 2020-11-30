package pages;

import lombok.Getter;

@Getter
public class MainPage extends BasePage {


    public void openMainPage() {
        getDriver().get("https://demo.opencart.com/");
    }

}
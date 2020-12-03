package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public class MainPage extends BasePage {

    public void openMainPage() {
    log.info("Opening Main Page");
        getDriver().get("https://demo.opencart.com/");
    }

}
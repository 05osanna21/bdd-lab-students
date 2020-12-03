package config;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public final class Screenshots {
    @Attachment(value = "step_scr", type = "image/png")
    public static byte[] makeScreenshot(){
        return ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}

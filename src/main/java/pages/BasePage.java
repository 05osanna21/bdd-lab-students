package pages;

import components.TopMenu;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public abstract class BasePage {

    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public static void setDriverThreadLocal(WebDriver webDriver) {
        DRIVER_THREAD_LOCAL.set(webDriver);
    }

    public static WebDriver getDriver() {
        return DRIVER_THREAD_LOCAL.get();
    }

    private TopMenu topMenu;

    public BasePage() {
        topMenu = new TopMenu(getDriver());
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }

    public WebElement waitUntilVisible(WebElement element, int time) {
        return new WebDriverWait(getDriver(), time)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitUntilVisible(By locator, int time) {
        return new WebDriverWait(getDriver(), time)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitUntilClickable(WebElement element, int time) {
        return new WebDriverWait(getDriver(), time)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void moveToElement(WebElement element) {
        new Actions(getDriver()).moveToElement(element).build().perform();
    }

    public void clickWithJs(WebElement webElement) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", webElement);
    }

    public boolean waitUntilTextWillPresent(By locator, int time, String text) {
        return new WebDriverWait(getDriver(), time)
                .until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public boolean waitInvisibilityOf(By locator, int time) {
        return new WebDriverWait(getDriver(), time)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

}

package pages;

import components.TopBar;
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

  private TopMenu topMenu;

  public BasePage(){
    topMenu = new TopMenu(driver);
  }

  public TopMenu getTopMenu() {
    return topMenu;
  }

  protected static WebDriver driver;

  public static void setDriver(WebDriver webDriver) {
    driver = webDriver;
  }

  public static WebDriver getDriver() {
    return driver;
  }

  public WebElement waitUntilVisible(WebElement element, int time) {
    return new WebDriverWait(driver, time)
        .until(ExpectedConditions.visibilityOf(element));
  }
  public WebElement waitUntilVisible(By locator, int time) {
    return new WebDriverWait(driver, time)
            .until(ExpectedConditions.visibilityOfElementLocated(locator));
  }

  public WebElement waitUntilClickable(WebElement element, int time) {
    return new WebDriverWait(driver, time)
        .until(ExpectedConditions.elementToBeClickable(element));
  }
  public void moveToElement(WebElement element) {
    new Actions(driver).moveToElement(element).build().perform();
  }
  public void clickWithJs(WebElement webElement) {
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();", webElement);
  }
  public boolean waitUntilTextWillPresent(By locator, int time, String text) {
    return new WebDriverWait(driver, time)
            .until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
  }
  public boolean waitInvisibilityOf(By locator, int time) {
    return new WebDriverWait(driver, time)
            .until(ExpectedConditions.invisibilityOfElementLocated(locator));
  }

}

package components;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.ProductsPage;

public class TopMenu  {
    private WebDriver webDriver;

    public TopMenu(WebDriver driver) {
        webDriver = driver;
    }
    //navbarMenu
    private By desktopsMenu = By.xpath("//a[text()='Desktops']");
    private By laptopsNotebooksMenu = By.xpath("//li[@class='dropdown']//a[text()= 'Laptops & Notebooks']");
    private By componentsMenu = By.xpath("//li[@class='dropdown']//a[text()='Components']");
    private By tablesMenu = By.xpath("//li//a[text()='Tablets']");
    private By softwareMenu = By.xpath("//li//a[text()='Software']");
    private By phonesPdasMenu = By.xpath("//ul[@class='nav navbar-nav']//li//a[text()='Phones & PDAs']");
    private By camerasMenu = By.xpath("//ul[@class='nav navbar-nav']//li//a[text()='Cameras']");
    private By mp_3PlayersMenu = By.xpath("//ul[@class='nav navbar-nav']//li//a[text()='MP3 Players']");

    //subNavbarMenuCompnents
    private By miceTrackballs = By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Mice and Trackballs')]");
    private By monitors = By.xpath("//a[contains(text(),'Monitors')]");
    private By printers = By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Printers')]");
    private By scanners = By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Scanners')]");
    private By webCameras = By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Web Cameras')]");
    private By showAllComponents = By.xpath("//div[@class=\"dropdown-menu\"]//a[text()= 'Show All Components']");

    public void hoverMouseOnComponents(NavbarMenu category) {
        Actions actions = new Actions(webDriver);
        switch (category) {
            case DESKTOPS:
                actions.moveToElement(webDriver.findElement(desktopsMenu)).build().perform();
                break;
            case LAPTOP_AND_NOTEBOOKS:
                actions.moveToElement(webDriver.findElement(laptopsNotebooksMenu)).build().perform();
                break;
            case COMPONENTS:
                actions.moveToElement(webDriver.findElement(componentsMenu)).build().perform();
                break;
            case TABLETS:
                actions.moveToElement(webDriver.findElement(tablesMenu)).build().perform();
                break;
            case SOFTWARE:
                actions.moveToElement(webDriver.findElement(softwareMenu)).build().perform();
                break;
            case PHONE_AND_PDAS:
                actions.moveToElement(webDriver.findElement(phonesPdasMenu)).build().perform();
                break;
            case CAMERAS:
                actions.moveToElement(webDriver.findElement(camerasMenu)).build().perform();
                break;
            case MP3_PLAYERS:
                actions.moveToElement(webDriver.findElement(mp_3PlayersMenu)).build().perform();
                break;
            default:
                throw new IllegalStateException("Unexpected value:" + category);
        }
        actions.build().perform();
    }

    public void selectSubNavbarMenuСomponents(SubNavbarMenuСomponents subcategories){
        WebDriverWait wait = new WebDriverWait(webDriver,5);
        switch (subcategories){
            case MICE_AND_TRACKBALLS:
                wait.until(ExpectedConditions.visibilityOfElementLocated(miceTrackballs)).click();
                break;
            case MONITORS:
                wait.until(ExpectedConditions.visibilityOfElementLocated(monitors)).click();
                break;
            case PRINTERS:
                wait.until(ExpectedConditions.visibilityOfElementLocated(printers)).click();
                break;
            case SCANNERS:
                wait.until(ExpectedConditions.visibilityOfElementLocated(scanners)).click();
                break;
            case WEB_CAMERAS:
                wait.until(ExpectedConditions.visibilityOfElementLocated(webCameras)).click();
                break;
            case SHOW_ALL_COMPONENTS:
                wait.until(ExpectedConditions.visibilityOfElementLocated(showAllComponents)).click();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + subcategories);
        }
        new ProductsPage();
    }
}


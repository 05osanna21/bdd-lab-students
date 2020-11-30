package components;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static pages.BasePage.getDriver;

@Getter
public class ProductBox {
    private WebDriver webDriver;
    @FindBy(xpath = ".//h4//a")
    private String name;

    @FindBy(xpath = ".//div[@class='image']//a")
    private WebElement image;

    @FindBy(xpath = ".//div[@class='caption']//p[1]")
    private String description;

    @FindBy(xpath = ".//span[@class='price-tax']")
    private String price;

    @FindBy(xpath = ".//i[contains(@class,'fa-heart')]/parent::button")
    private WebElement addToCarButton;

    @FindBy(xpath = ".//i[contains(@class,'fa-shopping-cart')]/parent::button")
    private WebElement addToWishListButton;

    @FindBy(xpath = ".//i[contains(@class,'fa-exchange')]/parent::button")
    private WebElement compareButton;

    public ProductBox() {
        PageFactory.initElements((WebDriver) getDriver(), this);
    }


    public ProductBox(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ProductBox(WebElement image, String name, String description, String price, WebElement addToCarButton, WebElement addToWishButton, WebElement compareButton) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
        this.addToCarButton = addToCarButton;
        this.addToWishListButton = addToWishListButton;
        this.compareButton = compareButton;
    }



    public List<ProductBox> getAllItems(By boxContainers) {
        List<ProductBox> productBoxes = new ArrayList<>();
        List<WebElement> boxElements = webDriver.findElements(boxContainers);
        for (WebElement boxElement : boxElements) {
            String name = boxElement.getText();
            WebElement image = boxElement;
            String description = boxElement.getText();
            String price = boxElement.getText();
            WebElement addToWishListButton = boxElement;
            WebElement addToCartButton = boxElement;
            WebElement compareButton = boxElement;
            ProductBox productBox = new ProductBox(image, name, description, price, addToCartButton,
                    addToWishListButton, compareButton);
            productBoxes.add(productBox);
        }
        return productBoxes;
    }
}

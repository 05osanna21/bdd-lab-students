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

        private WebDriver driver;
        private WebElement image;
        private String name;
        private String description;
        private String price;
        private WebElement addToCarButton;
        private WebElement addToWishListButton;
        private WebElement compareButton;

        public ProductBox(WebDriver webDriver) {
            this.webDriver = webDriver;
        }

        public ProductBox(WebElement image, String name, String description, String price, WebElement addToCarButton, WebElement addToWishButton, WebElement compareButton) {
            this.image = image;
            this.name = name;
            this.description = description;
            this.price = price;
            this.addToCarButton = addToCarButton;
            this.addToWishListButton = addToWishButton;
            this.compareButton = compareButton;
        }


    public List<ProductBox> getAllItems(By boxContainers) {
            List<ProductBox> productBoxes = new ArrayList<>();
            List<WebElement> boxElements = webDriver.findElements(boxContainers);
            for (WebElement boxElement : boxElements) {
                String name = boxElement.findElement(By.xpath(".//h4//a")).getText();
                WebElement image = boxElement.findElement(By.xpath(".//div[@class='image']//a"));
                String description = boxElement.findElement(By.xpath(".//div[@class='caption']//p[1]")).getText();
                String price = boxElement.findElement(By.xpath(".//span[@class='price-tax']")).getText();
                WebElement addToWishListButton = boxElement.findElement(By.xpath(".//i[contains(@class,'fa-shopping-cart')]/parent::button"));
                WebElement addToCartButton = boxElement.findElement(By.xpath(".//i[contains(@class,'fa-heart')]/parent::button"));
                WebElement compareButton = boxElement.findElement(By.xpath(".//i[contains(@class,'fa-exchange')]/parent::button"));
                ProductBox productBox = new ProductBox(image, name, description, price, addToCartButton,
                        addToWishListButton, compareButton);
                productBoxes.add(productBox);
            }
            return productBoxes;
        }
    }

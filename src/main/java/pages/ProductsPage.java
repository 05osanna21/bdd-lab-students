package pages;

import components.ProductBox;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class ProductsPage extends BasePage {

   private ProductBox productBox;

    @FindBy(xpath = "//div[contains(@class,'alert-success')]//a[1]")
    private WebElement wishListSuccessAddMessage;

    @FindBy(xpath = "//button[@class='close']")
    private WebElement closeSuccessMessageButton;

    @FindBy(xpath = "//div[@class='product-thumb']")
    private WebElement boxContainers;

    public ProductsPage() {
        PageFactory.initElements(getDriver(), this);
    }



    public ProductsPage addToWishListFollowingProducts(String... productNames) {
        List<ProductBox> allProductBoxesFromPage = productBox.getAllItems((By) boxContainers);
        for (String productName : productNames) {
            for (ProductBox box : allProductBoxesFromPage) {
                if (box.getName().contains(productName)) {
                    moveToElement(box.getAddToWishListButton());
                    clickWithJs(box.getAddToWishListButton());
                    waitUntilVisible(wishListSuccessAddMessage, 10);
                    waitUntilTextWillPresent((By) wishListSuccessAddMessage, 10, box.getName());
                    (closeSuccessMessageButton).click();
                    waitInvisibilityOf((By) wishListSuccessAddMessage, 3);
                }
            }
        }
        return this;
    }
}

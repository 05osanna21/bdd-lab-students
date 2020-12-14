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
   public ProductsPage (){
       productBox = new ProductBox(getDriver());

   }


    public ProductsPage addToWishListFollowingProducts(String... productNames) {
        List<ProductBox> allProductBoxesFromPage = productBox.getAllItems(By.xpath("//div[@class='product-thumb']"));
        for (String productName : productNames) {
            for (ProductBox box : allProductBoxesFromPage) {
                if (box.getName().contains(productName)) {
                    moveToElement(box.getAddToWishListButton());
                    clickWithJs(box.getAddToWishListButton());
                    waitUntilVisible(By.xpath("//div[contains(@class,'alert-success')]//a[1]"), 10);
                    waitUntilTextWillPresent(By.xpath("//div[contains(@class,'alert-success')]//a[1]"), 10, box.getName());
                    getDriver().findElement(By.xpath("//button[@class='close']")).click();
                    waitInvisibilityOf(By.xpath("//div[contains(@class,'alert-success')]//a[1]"), 3);
                }
            }
        }
        return this;
    }
}

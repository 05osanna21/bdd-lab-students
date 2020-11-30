package pages;

import components.MyWishListItems;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WishListPage extends BasePage {

    private MyWishListItems myWishListItems;

    @FindBy(xpath = "//div[@class='table-responsive']//table//tbody")
    private WebElement myWishLIstTable;

    public WishListPage() {
        PageFactory.initElements(getDriver(), this);
    }



    public List<MyWishListItems> getAllItemsFromWishList() {
        return myWishListItems.getAllItems((By) myWishLIstTable);
    }

    public List<String> getNamesFromWishListItems() {
        List<MyWishListItems> allItemsFromWishList = getAllItemsFromWishList();
        List<String> names = new ArrayList<>();
        for (MyWishListItems wishListItem : allItemsFromWishList) {
            names.add(wishListItem.getProductName());
        }
        return names;
    }
    @FindBy(xpath = ".//i[contains(@class,'fa-shopping-cart')]/parent::button")
    private WebElement wishButton;

    public void clickAddToWishButton(){
        wishButton.click();
    }



}

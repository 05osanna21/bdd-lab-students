package stepdefs;

import components.NavbarMenu;
import components.SubNavbarMenuComponents;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pages.LoginPage;
import pages.ProductsPage;

import java.util.List;

public class WishListPageStepdefs {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage =new ProductsPage();

    @And("I hover mouse  over for top menu {string}")
    public void iHoverMouseOverForTopMenuComponents(String componentsMenu) {
        NavbarMenu navbarMenu = NavbarMenu.valueOf(componentsMenu);
        loginPage.getTopMenu().hoverMouseOnComponents(navbarMenu);
        System.out.println("1");
    }

    @And("I select {string} in SubNavbarMenu")
    public void iSelectMONITORSInSubNavbarMenu(String subMenu) {
        SubNavbarMenuComponents subNavbarMenuСomponents = SubNavbarMenuComponents.valueOf(subMenu);
        loginPage.getTopMenu().selectSubNavbarMenuСomponents(subNavbarMenuСomponents);
    }


    @And("I Click Add to Wish List button for")
    public void iClickAddToWishListButtonForAppleCinemaAndSamsungSyncMaster(DataTable dataTable) {
        List<String> strings = dataTable.asList();
        productsPage.addToWishListFollowingProducts(strings.toArray(new String[strings.size()]));
    }
}

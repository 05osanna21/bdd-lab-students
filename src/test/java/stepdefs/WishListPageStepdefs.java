package stepdefs;

import components.NavbarMenu;
import components.SubNavbarMenuСomponents;
import components.TopMenu;
import io.cucumber.java.en.And;

public class WishListPageStepdefs {
    TopMenu topMenu = new TopMenu();

    @And("I hover mouse  over for top menu {string}")
    public void iHoverMouseOverForTopMenuComponents(NavbarMenu componentsMenu)  {
        topMenu.hoverMouseOnComponents(componentsMenu);
        System.out.println("1");
    }

    @And("I select {string} in SubNavbarMenu")
    public void iSelectMONITORSInSubNavbarMenu() {
        topMenu.selectSubNavbarMenuСomponents(SubNavbarMenuСomponents.MONITORS);
    }
    
}

package stepdefs;

import components.NavbarMenu;
import components.TopMenu;
import io.cucumber.java.en.And;

public class ComponentsStepdefs {
    TopMenu topMenu =new TopMenu();

    @And("I hover mouse  over for top menu enum value {string}")
    public void iHoverMouseOverForTopMenuEnumValue(NavbarMenu arg0) throws Throwable {
    }
}

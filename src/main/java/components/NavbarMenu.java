package components;


public enum NavbarMenu {
    DESKTOPS("Desktop"),
    LAPTOP_AND_NOTEBOOKS("Laptop_and_notebooks"),
    COMPONENTS("Components"),
    TABLETS("Tablets"),
    SOFTWARE("Software"),
    PHONE_AND_PDAS("Phone_and_pdas"),
    CAMERAS("Cameras"),
    MP3_PLAYERS("Mp3_players");

    private String menu;

    public String getMenu() {
        return menu;
    }


    NavbarMenu(String menu) {
        this.menu = menu;
    }
}

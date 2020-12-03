package components;

public enum SubNavbarMenuComponents {
    MICE_AND_TRACKBALLS("Nice_and_trackballs"),
    MONITORS("Monitors"),
    PRINTERS("Printers"),
    SCANNERS("Scanners"),
    WEB_CAMERAS("Web_cameras"),
    SHOW_ALL_COMPONENTS("Show_all_components");

    private String subComponent;

    public String getsubComponent() {
        return subComponent;
    }

    SubNavbarMenuComponents(String menu) {
        this.subComponent = subComponent;
    }
}

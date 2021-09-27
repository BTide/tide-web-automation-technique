package tide.core.models.driver;

import static org.openqa.selenium.remote.BrowserType.*;

public enum DriverInformation {

    CHROME_LOCAL(BrowserEnvironment.LOCAL, CHROME, null),
    FIREFOX_LOCAL(BrowserEnvironment.LOCAL, FIREFOX, null),
    EDGE_LOCAL(BrowserEnvironment.LOCAL, EDGE, null);

    String browserEnvironment;
    String browserName;
    String gridUrl;

    DriverInformation(String browserEnvironment, String browserName, String gridUrl) {
        this.browserEnvironment = browserEnvironment;
        this.browserName = browserName;
        this.gridUrl = gridUrl;
    }

    public String getBrowserEnvironment() {
        return browserEnvironment;
    }

    public void setBrowserEnvironment(String browserEnvironment) {
        this.browserEnvironment = browserEnvironment;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String isGridUrl() {
        return gridUrl;
    }

    public void setGridUrl(String gridUrl) {
        this.gridUrl = gridUrl;
    }
}

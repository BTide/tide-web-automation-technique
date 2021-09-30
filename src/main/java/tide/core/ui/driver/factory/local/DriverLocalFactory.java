package tide.core.ui.driver.factory.local;

import org.openqa.selenium.WebDriver;
import tide.core.ui.driver.DriverInformation;

import static org.openqa.selenium.remote.BrowserType.*;

public class DriverLocalFactory  {
    public static WebDriver getDriver(String browserName) {
        WebDriver driver = null;
        switch (browserName) {
            case CHROME:
                driver = DriverChromeLocal.getDriver();
                break;
            case FIREFOX:
                driver = DriverFirefoxLocal.getDriver();
                break;
            case EDGE:
                driver = DriverEdgeLocal.getDriver();
                break;
            case SAFARI:
                driver = DriverSafariLocal.getDriver();
                break;
        }

        return driver;
    }
}

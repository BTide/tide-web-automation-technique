package tide.core.driver.local;

import org.openqa.selenium.WebDriver;
import tide.core.models.driver.DriverInformation;

import static org.openqa.selenium.remote.BrowserType.*;

public class DriverLocalFactory  {
    public static WebDriver getDriver(DriverInformation driverInformation) {
        WebDriver driver = null;
        switch (driverInformation.getBrowserName()) {
            case CHROME:
                driver = DriverChromeLocal.getDriver(driverInformation);
                break;
            case FIREFOX:
                driver = DriverFirefoxLocal.getDriver(driverInformation);
                break;
            case EDGE:
                driver = DriverEdgeLocal.getDriver(driverInformation);
                break;
        }

        return driver;
    }
}

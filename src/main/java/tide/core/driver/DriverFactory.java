package tide.core.driver;

import org.openqa.selenium.WebDriver;
import tide.core.driver.local.DriverLocalFactory;
import tide.core.models.driver.BrowserEnvironment;
import tide.core.models.driver.DriverInformation;


public class DriverFactory {
    public static WebDriver getDriver(DriverInformation browserInformation) {
        WebDriver driver = null;
        switch (browserInformation.getBrowserEnvironment()) {
            case BrowserEnvironment.LOCAL:
                driver = DriverLocalFactory.getDriver(browserInformation);
                break;
        }

        driver.manage().window().maximize();
        return driver;
    }

}

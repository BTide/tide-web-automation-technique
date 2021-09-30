package tide.core.ui.driver;

import org.openqa.selenium.WebDriver;
import tide.core.configuration.Configuration;
import tide.core.system.properties.driver.DriverPath;
import tide.core.ui.driver.factory.local.DriverLocalFactory;
import tide.core.system.properties.Property;

import java.util.Locale;
import java.util.Properties;


public class Driver {
    public static WebDriver getDriver() {
        WebDriver driver = null;

        Properties tideProperties = Configuration.getTideProperties();
        String browserEnvironment = tideProperties.getProperty("browser.environment").toLowerCase(Locale.ROOT);
        String browserName = tideProperties.getProperty("browser.name").toLowerCase(Locale.ROOT);

        switch (browserEnvironment) {
            case BrowserEnvironment.LOCAL:
                DriverPath.set(browserName);
                driver = DriverLocalFactory.getDriver(browserName);
                break;
        }

        assert driver != null;
        driver.manage().window().maximize();
        return driver;
    }

    public static DriverPath property(){
        return new Property().driverPath();
    }


}

package tide.core.ui.driver.factory.local;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tide.core.ui.driver.DriverInformation;

public class DriverFirefoxLocal {
    public static WebDriver getDriver(){
        return new FirefoxDriver();
    }
}

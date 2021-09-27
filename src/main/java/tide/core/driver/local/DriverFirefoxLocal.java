package tide.core.driver.local;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tide.core.models.driver.DriverInformation;

public class DriverFirefoxLocal {
    public static WebDriver getDriver(DriverInformation driverInformation){
        return new FirefoxDriver();
    }
}

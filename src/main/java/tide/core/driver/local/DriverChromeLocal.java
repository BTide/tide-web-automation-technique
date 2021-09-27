package tide.core.driver.local;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tide.core.models.driver.DriverInformation;

public class DriverChromeLocal  {
    public static WebDriver getDriver(DriverInformation driverInformation){
        return new ChromeDriver();
    }
}
